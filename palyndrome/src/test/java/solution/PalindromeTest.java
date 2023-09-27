package solution;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PalindromeTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PalindromeTest.class );
    }

    /**
     * Test palyndrome short version
     */
    public void testPalyndromeShortVersion()
    {
        String input = "ana bana bobana fi fai fo bana bana";
        assertFalse(Solution.isPalindromeLinearShort(input));

        input = "A man, a plan, a canal: Panama";
        assertTrue(Solution.isPalindromeLinearShort(input));

        input = "A man, a plan, a         xcanal: Panama";
        assertFalse(Solution.isPalindromeLinearShort(input));

        input = "A man, a plan, a         cccanal: Panama";
        assertTrue(Solution.isPalindromeLinearShort(input));

        input = "Amanap lana ana bana bobana fi fai fo bana bana canalPanama";
        assertFalse(Solution.isPalindromeLinearShort(input));

        System.out.println("--");
        input = "  a  a";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "  a  a  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "a  a  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "aa  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "  aa  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "   aa";
        assertTrue(Solution.isPalindromeLinearShort(input));


        input = "  a  b";
        assertFalse(Solution.isPalindromeLinearShort(input));
        input = "  a  b  ";
        assertFalse(Solution.isPalindromeLinearShort(input));
        input = "a  b  ";
        assertFalse(Solution.isPalindromeLinearShort(input));
        input = "ab  ";
        assertFalse(Solution.isPalindromeLinearShort(input));
        input = "  ab  ";
        assertFalse(Solution.isPalindromeLinearShort(input));
        input = "   ab";
        assertFalse(Solution.isPalindromeLinearShort(input));


        input = "$  a . a$";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = " // a//  a///  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "a//  a //// ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "aa //// ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = " // aa // ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "  /// aa////";
        assertTrue(Solution.isPalindromeLinearShort(input));



        input = "b$  a . ab$";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = " /b/ a//  a//b/  ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "ba//  a ///b/ ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "baa //b// ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = " /b/ aa //b ";
        assertTrue(Solution.isPalindromeLinearShort(input));
        input = "  b/// aa////b";
        assertTrue(Solution.isPalindromeLinearShort(input));



    }

    /**
     * Test palyndrome optimized version
     */
    public void testPalyndromeOptimizedVersion()
    {
        String input = "ana bana bobana fi fai fo bana bana";
        assertFalse(Solution.isPalindromeLinearOptimized(input));

        input = "A man, a plan, a canal: Panama";
        assertTrue(Solution.isPalindromeLinearOptimized(input));

        input = "A man, a plan, a         xcanal: Panama";
        //String input = "AmanaplanacanalPanama";
        assertFalse(Solution.isPalindromeLinearOptimized(input));

        input = "A man, a plan, a         cccanal: Panama";
        //String input = "AmanaplanacanalPanama";
        assertTrue(Solution.isPalindromeLinearOptimized(input));

        input = "Amanap lana ana bana bobana fi fai fo bana bana canalPanama";
        assertFalse(Solution.isPalindromeLinearOptimized(input));

        System.out.println("--");
        input = "  a  a";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "  a  a  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "a  a  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "aa  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "  aa  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "   aa";
        assertTrue(Solution.isPalindromeLinearOptimized(input));


        input = "  a  b";
        assertFalse(Solution.isPalindromeLinearOptimized(input));
        input = "  a  b  ";
        assertFalse(Solution.isPalindromeLinearOptimized(input));
        input = "a  b  ";
        assertFalse(Solution.isPalindromeLinearOptimized(input));
        input = "ab  ";
        assertFalse(Solution.isPalindromeLinearOptimized(input));
        input = "  ab  ";
        assertFalse(Solution.isPalindromeLinearOptimized(input));
        input = "   ab";
        assertFalse(Solution.isPalindromeLinearOptimized(input));


        input = "$  a . a$";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = " // a//  a///  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "a//  a //// ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "aa //// ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = " // aa // ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "  /// aa////";
        assertTrue(Solution.isPalindromeLinearOptimized(input));



        input = "b$  a . ab$";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = " /b/ a//  a//b/  ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "ba//  a ///b/ ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "baa //b// ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = " /b/ aa //b ";
        assertTrue(Solution.isPalindromeLinearOptimized(input));
        input = "  b/// aa////b";
        assertTrue(Solution.isPalindromeLinearOptimized(input));


    }



}
