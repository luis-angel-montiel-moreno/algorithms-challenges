package com.affinipay.minuteadder

object MinuteAdder {

  /* Please don't change the signature of this method. */
  def addMinutes(time: String, minutes: Int): String = {
    val seps = Array(':', ' ')
    val toks = time.split(seps)

    var h = toks(0).toInt
    val m = toks(1).toInt
    val apm = toks(2)

    if ( apm=="PM") h = h + 12

    val totalMin = h*60 + m
    val newMin = totalMin + minutes

    var nh = (newMin/60)%24
    val nm = newMin%60
    val napm = if (nh<12) "AM" else "PM"
    nh = nh%12
    val nhs = if(napm=="PM" && nh ==0 ) "12" else if(napm=="AM" && nh ==0 ) "12" else nh.toString
    val nms = if(nm<10) "0" + nm else nm.toString
    nhs +":"+ nms +" "+ napm
  }

}