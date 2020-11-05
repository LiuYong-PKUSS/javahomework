import java.util.Date;

public class 使用DATE类 {
	public static void main(String[] args) {
		for(int i = 0; i<8; i++) {		//一共循环8次
			//Date类的有参构造函数的参数是long型，用指数pow(10,i+4)表示对应毫秒数
			Date date1 = new Date((long) Math.pow(10,i+4));
			//输出结果
			System.out.println((long)Math.pow(10, i+4)+"秒对应的日期是"+date1.toString());
		}
	}
}
