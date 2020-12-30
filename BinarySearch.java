import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search.");
        System.out.println("Enter the number of elements required:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of the array in ascending order:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int a=sc.nextInt();
        int mid;
        int beg=0;
        int end=n-1;
        int isthere=0;
        while(beg<=end){
            mid=(beg+end)/2;
            if(a>A[mid]){
                beg=mid+1;
            }
            else if(a<A[mid]){
                end=mid-1;
            }
            else{
                isthere=1;
                System.out.println("The element " +a+ " is at position " +(mid+1));
                break;
            }
           
        }   
        if(isthere==0){
            System.out.println("The element that you have entered is not present in the array.");
        }
        sc.close();
    }
}
