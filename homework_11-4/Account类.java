import java.util.Date;

class Account{
	//变量声明
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreate ;
	
	//无参构造函数
	Account(){
		
	}
	
	//有参构造函数
	Account(int id, double balance){
		this.id = id;
		this.balance = balance; 
		Date dateCreate = new Date();
	}
	
	//获取ID
	int getID(){
		return id;
	}
	
	//获取balance
	double getBalance() {
		return balance;
	}
	
	//获取年利率
	double getannualInterestRate() {
		return annualInterestRate;
	}
	
	//获取时间
	Date getDateCreate() {
		return dateCreate;
	}
	
	//返回月利率
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	//返回月利息
	double getMonthlyInteres() {
		return getMonthlyInterestRate()*balance;//月利率乘余额
	}
	
	//从账户提取指定额度value
	void withDraw(double value) {
		balance -= value;
	}
	
	//向账户存取指定额度value
	void deposit(double value) {
		balance += value;
	}
	
}
