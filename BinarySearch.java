import java.util.Scanner;

//Write A program in java To Find the Binary Search Programm
public class BinarySearch {
    public static int binarysearch(int a[],int search){
        int start=0;
        int end=a.length-1;
        while(start <= end){
            int mid=(start+end)/2;
            if(search < a[mid]){
                end = mid-1;
            }
            else if(search>a[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
//        int a[]={1,2,4,6,8};
//        int search=4 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Size: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
           a[i] = sc.nextInt();
        }
        System.out.print("Enter Your Search Element: ");
        int search = sc.nextInt();
        int z=binarysearch(a,search);
        System.out.println(z);

    }
}





























