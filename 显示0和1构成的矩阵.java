package 第二次作业;
//P206 6.17显示0和1构成的矩阵
import java.util.Scanner;

public class 显示0和1构成的矩阵 {
	//方法printMatrix(n):打印元素由0和1构成的n阶矩阵
	public static void printMatrix(int n) {
		//生成矩阵并将元素赋值为0或1
		int[][] Matrix = new int[n][n];
		for(int i = 0; i < Matrix.length ; i++) {
			for(int j = 0; j < Matrix[i].length; j++) {
				//将(math.random()*2)强制转换成整型，并给元素赋值
				Matrix[i][j] = (int) (Math.random()*2);
				//打印元素
				System.out.print(Matrix[i][j] + " ");
			}
			//换行
			System.out.println();
		}
	}
	//主函数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入矩阵的阶数");
		int n = scanner.nextInt();
		printMatrix(n);
		scanner.close();
	}
		
	

}
