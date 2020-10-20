package 第二次作业;
//P242 7.10找出最小元素下标
import java.util.Scanner;

public class 找出最小元素下标 {
	//方法：找出数组中最小值的下标
	public static int indexOfSmallestElement(double[] array) {
		double min_value = array[0];
		int min_index = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min_value) {
				min_value = array[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
	//主函数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[10]; 
		System.out.println("请输入10个数字");
		for(int i = 1; i <= 10; i++) {
			System.out.printf("请输入第%d个数",i);
			array[i-1] = scanner.nextDouble();
		}
		int min_Index = indexOfSmallestElement(array);
		System.out.println("array的最小值所在下标为：" + min_Index);
		scanner.close();
	}

}
