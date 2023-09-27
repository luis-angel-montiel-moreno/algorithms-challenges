package solution;

public class Solution
{

    public static boolean isPalindromeLinearShort(String s) {
        String sl = s.toLowerCase();
        String sc = "";
        for(int i =0; i < sl.length(); i ++ ){
            if(Character.isAlphabetic(sl.charAt(i)) ||
               Character.isDigit(sl.charAt(i)))
                sc = sc + sl.charAt(i);
        }
        StringBuffer sb = new StringBuffer(sc);
        return sb.reverse().toString().compareTo(sc)==0;
    }


    public static boolean isPalindromeLinearOptimized(String s){
        int i = 0;
        int j = s.length()-1;
        int c = 0;

        boolean isPaly = true;
        while(c<s.length()){
            while (!Character.isAlphabetic(s.charAt(i)) &&
                    !Character.isDigit(s.charAt(i))){
                i++;
                c++;
            }
            while (!Character.isAlphabetic(s.charAt(j)) &&
                    !Character.isDigit(s.charAt(j))){
                j--;
                c++;
            }

            if(i<=j && Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))) {
                isPaly = true;
                i++;
                j--;
                c+=2;
                if (c==s.length()) return true;
                continue;
            } else{
                if(i>j) return true;
                isPaly = false;
                System.out.println(i);
                System.out.println(j);
                System.out.println(s.charAt(i));
                System.out.println(s.charAt(j));
                return false;
            }
        }
        return isPaly;
    }

    public static void main( String[] args )
    {
        String input1 = "Hello World!";

        System.out.println(Solution.isPalindromeLinearShort(input1));
                       //012345678901234567890123456789
        String input2 = "A man, a plan, a canal: Panama";

        System.out.println(Solution.isPalindromeLinearShort(input2));

        System.out.println(Solution.isPalindromeLinearOptimized(input1));
        System.out.println(Solution.isPalindromeLinearOptimized(input2));

    }
}
