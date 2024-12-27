import java.util.Scanner;
public class Main
{
    static int sumbmission(int[] arr){
        int sum = 0;
        for(int num: arr){
            sum += num;
        }
        return sum;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of array....!");
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 System.out.println("enter the element in array : ");
		 for(int i = 0; i < n; i++){
		     arr[i] = sc.nextInt();
		 }
		 int result = sumbmission(arr);
		 System.out.println("output of array is : " + result);
	}
}
