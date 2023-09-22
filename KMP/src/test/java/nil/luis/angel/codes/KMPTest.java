package nil.luis.angel.codes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Unit test for KMP.
 */
public class KMPTest
    extends TestCase
{
    public KMPTest(String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( KMPTest.class );
    }

    public void testComputePrefixFn()
    {
        String P = "The Billie Jean is not my lover, The Billie Jean";
        P = " " + P;

        Integer[] actualII = KMP.computePrefixFn(P);
        Integer[] expectedII = (Integer[]) Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).toArray();

        System.out.println(Arrays.toString(actualII));
        System.out.println(Arrays.toString(expectedII));

        assertTrue( Arrays.toString(actualII).compareTo(Arrays.toString(expectedII))==0 );
    }


    public void testKMP()
    {
        String T = "So take my strong advice, just remember to always think twice (Do think twice, do think twice! uh!)";
        String P = "think twice";
        T = " " + T;
        P = " " + P;

        HashSet<Integer> actualIndexesFound = KMP.KMP_Matcher(T, P);
        HashSet<Integer> expectedIndexesFound = new HashSet<Integer>(Arrays.asList(51,67,83));

        assertTrue( actualIndexesFound.equals(expectedIndexesFound) );
    }
}
