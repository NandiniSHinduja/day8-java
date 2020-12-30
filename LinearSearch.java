import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Linear Search.");
        System.out.println("Enter number of elements required for the array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(A[i]==a){
                System.out.println("The element " +n+ " is present at index " +i);
                break;
            }
        }
        sc.close();
    }
    
}
