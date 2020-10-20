package 第二次作业;

import java.util.Scanner;

//P264 8.2求矩阵对角线元素的和
public class 求矩阵对角元素的和 {
	//sumMajorDiagonal方法：求矩阵对角线元素的和
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	
	//主函数
	public static void main(String[] args) {
		System.out.println("请输入矩阵的阶数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[][] m = new double[n][n];
		//随机生成n维数组中的元素
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = Math.random()*100;
				//打印生成的n阶随机矩阵
				System.out.print(m[i][j] + " \t");
			}
			System.out.println();	
		}
		System.out.println("***************************************");
		double sum = sumMajorDiagonal(m);
		System.out.println("对角线元素的和为：" + sum);
		sc.close();
	}

}
