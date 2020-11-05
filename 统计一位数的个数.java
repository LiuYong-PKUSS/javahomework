package 第二次作业;
//P241 7.7统计个位数的数目
//编写一个程序生成0和9之间的100个随机整数，然后显示每一个数出现的次数
public class 统计一位数的个数 {
	//方法：生成0和9之间的100个随机整数，然后显示每一个数出现的次数
	public static void Number_Statistics() {
		int[] counts = new int[10];
		//生成一个含有100个元素的一维数组用于存放100个随机数
		int[] box = new int[100];
		for (int i = 0; i < 100; i++) {
			box[i] = (int)(Math.random()*10);
			//打印生成的随机数
			System.out.printf("第%d个随机数为：",i);
			System.out.println(box[i] + " ");
			//当该随机数生成时，counts的对应元素加一
			counts[box[i]]++;
		}
		//打印每个数出现的次数
		for(int j = 0; j < counts.length; j++) {
			System.out.printf("数字%d出现的次数为：%d",j,counts[j]);
			System.out.println();
		}
	}
	
	//主函数
	public static void main(String[] args) {
		Number_Statistics();
	}

}
