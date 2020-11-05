import java.util.ArrayList;
import java.util.Scanner;


public class Arraylist排序 {
	 public static void sort(ArrayList<Number> list) {
	    	//用冒泡排序法按照升序排列
	        for (int i = 0; i < list.size()-1; i++) { 
	            for (int j = 0; j < list.size()-i-1; j++) {
	                if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
	                    double temp = list.get(j).doubleValue();
	                    list.set(j, list.get(j+1).doubleValue());
	                    list.set(j+1, temp);
	                }
	            }
	        }
	 }
	                    
	//主函数                   
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<Number>();
		System.out.println("请输入list中元素的个数");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n;i++) {
			int cout = i+1;
			System.out.println("请输入第"+ cout +"个元素");
			list.add(sc.nextDouble());
		}
		sort(list);
		System.out.println("排序后：");
		for(int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j).doubleValue());
		}
		sc.close();
	}

}

