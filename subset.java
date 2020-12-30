import java.util.*;
public class subset {
    public static void main(String[] args) {
        System.out.println("Substrings");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("These are the subsets of the given string:");
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            System.out.println(ch);
        }
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                char ch1=a.charAt(i);
                char ch2=a.charAt(j);
                String s1=String.valueOf(ch1);
                String s2=String.valueOf(ch2);
                String s3=s1+s2;
                System.out.println(s3);
            }
        }
        System.out.println(a);
        sc.close();
    }
    
}
