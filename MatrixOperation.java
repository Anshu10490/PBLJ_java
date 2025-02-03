import java.util.*;
public class matrixx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int c=sc.nextInt();
		int arr1[][]=new int[r][c];
		int arr2[][]=new int[r][c];
		int sum[][]=new int [r][c];
		int sub[][]=new int [r][c];
		int mul[][]=new int [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
				sub[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				for(int k=0;k<r; k++) {
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}
			}
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(sub[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
