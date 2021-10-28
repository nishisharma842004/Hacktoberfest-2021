import java.util.Scanner;

public class diagonal_traversal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        for(int m=0;m<n;m++){
            for(int j=0,k=m;k<n;k++,j++){
                System.out.println(a[j][k]);
            }
        }
	}

}
