package ss;
import java.util.Arrays;
public class Daily2_matrix {
public static void main(String args[]) {
	int[][] a= {{1,2,3,4},{1,2,3,4},{1,1,1,1}};
	int[][] b= {{1,1,1,1},{2,2,2,2},{3,3,3,3}};
	int row= a.length;
	int col=a[0].length;
	int sum[][]=new int[row][col];
	for(int c=0;c<row;c++) {
		for(int d=0;d<col;d++) {
			sum[c][d]=a[c][d]+b[c][d];
		}
	}
	for(int k[]:sum) {
	System.out.println(Arrays.toString(k));
	}
}
}
