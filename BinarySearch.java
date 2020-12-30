import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int a=sc.nextInt();
        int mid=n/2;
        if(a>mid){
            for(int i=mid+1;i<n;i++){
                if(A[i]==a){
                    System.out.println("The element " +a+ " is present at index " +i);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<=mid;i++){
                if(A[i]==a){
                    System.out.println("The element " +a+ " is present at index " +i);
                    break;
                }
            }
        }
        sc.close();

    }
    
}
