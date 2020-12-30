import java.util.*;
public class ndivide{
    public static void main(String[] args) {
        System.out.println("Divinding the string into N equal parts.");
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        char ch;
        System.out.println("This is the divided string:");
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            if(i%n==0){
                System.out.print(" ");
            }
            System.out.print(ch);
        }
        sc.close();
    }
}