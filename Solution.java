
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String s=new String();
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1;i>=0;i--){
            char ch=A.charAt(i);
            s=String.valueOf(ch);
            System.out.print(s);
            
        }
              
        if(s.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
        
    }
}




