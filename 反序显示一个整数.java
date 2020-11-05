package 第二次作业;
import java.util.Scanner;

//P203 6.4反转一个整数
public class 反序显示一个整数 {
	//reverse方法：反转一个整数
	public static void reverse(int number) {
		System.out.print("反序后：");
		while(number > 0) {
			System.out.print(number%10);
			number /= 10; 
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number  = scanner.nextInt();
		reverse(number);
		scanner.close();//关闭输入流，节约内存
	}
}
