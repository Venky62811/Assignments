package Array;

public class Movieticket {

	public static void main(String[] args) {
	 int[][] arr=new int[3][4];
	 arr[1][2]=1;
	 for(int i=0;i<arr.length;i++)
	 {
		 for (int j=0;j<arr[i].length;j++)
		 {
			 System.out.print(arr[i][j] + " ");
		 }
		 System.out.println();
		 
	}
}
}
