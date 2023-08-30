package chandriki2;
import java.util.Scanner;
public class string_rev {

	public static void main(String[] args) {
		Scanner p=new Scanner(System.in);
        char s[]=p.next().toCharArray();
	  Solution t=new Solution();
      t.reverseString(s);
	}
}
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
         for(int i=0;i<n;i++)
        {
          temp=s[i];
          s[i]=s[n-1];
          s[n-1]=temp;
         
          n--;      }
}
}
