class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        String s1=a.replaceAll("[\\s]"," ");
        String s2=b.replaceAll("[\\s]"," ");
        boolean res=true;
        if(s1.length()!=s2.length()) res = false;
        else {
            char[] a1 = s1.toLowerCase().toCharArray();
            char[] b1 = s2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(b1);
            res = Arrays.equals(a1,b1);
        }
        return res;
    }
}
