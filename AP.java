import java.util.*;
public class AP {
    public static void main(String[] args) {
        System.out.println("Arithmetic Progression.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the starting term:");
        int a=sc.nextInt();
        System.out.println("Enter the difference:");
        int d=sc.nextInt();
        System.out.println("Enter the number of terms:");
        float n=sc.nextInt();
        int t;
        
        for(int i=1;i<=n;i++){
            t=a+(i-1)*d;
            System.out.print(t+",");
        }
        float sum=(n/2)*((2*a)+((n-1)*d));
        System.out.println("The sum of the AP is: " +sum);
        sc.close();
    }
    
}
