package solution

import org.apache.spark.sql.functions.col
import org.apache.spark.sql.{DataFrame, SparkSession}

object RemoveDuplicates {
  
  def main(args : Array[String]) {
    val spark: SparkSession = SparkSession.builder()
      .master("local[*]")
      .appName("remove-duplicates")
      .getOrCreate()
    import spark.sqlContext.implicits._


    val df = Seq(
      ("d1", "2018-09-20 09:00:00", "d1a"),
      ("d1", "2018-09-20 10:01:00", "d1c"),
      ("d1", "2018-09-20 10:00:00", "d1b"),
      ("d2", "2018-09-20 09:00:00", "d2c"),
      ("d2", "2018-09-20 08:00:00", "d2b"),
      ("d2", "2018-09-20 07:00:00", "d2a"),
      ("d3", "2018-09-20 09:01:00", "d3b"),
      ("d3", "2018-09-20 10:02:00", "d3c"),
      ("d3", "2018-09-20 10:03:00", "d3e"),
      ("d3", "2018-09-20 09:00:00", "d3a"),
      ("d3", "2018-09-20 10:07:00", "d3f"),
      ("d3", "2018-09-20 10:02:00", "d3d"),
    ).toDF("documentId", "timestamp", "anotherField")

    removeDuplicatesByWindow(df,spark)
    removeDuplicatesByGroupBy(df,spark)

  }


  def removeDuplicatesByWindow(df: DataFrame, spark: SparkSession) : Unit = {
    import spark.sqlContext.implicits._

    import org.apache.spark.sql.functions.row_number
    import org.apache.spark.sql.expressions.Window

    val w = Window.partitionBy($"documentId").orderBy($"timestamp".desc)
    val df2 = df.withColumn("rownum", row_number.over(w))

    df2.show()

    val df3 = df2.where($"rownum" === 1).drop("rownum")

    df3.show()
  }


  def removeDuplicatesByGroupBy(df: DataFrame, spark: SparkSession): Unit = {
    import spark.sqlContext.implicits._

    import org.apache.spark.sql.functions.row_number
    import org.apache.spark.sql.expressions.Window


    val df2 = df
      .withColumn("ttimestamp", $"timestamp".cast("timestamp"))
      .withColumn("epoch_seconds", $"ttimestamp".cast("long"))
      .where("timestamp != ''")
      .groupBy("documentId").max( "epoch_seconds")

    df2.foreach(r=> println(r))

  }


}
