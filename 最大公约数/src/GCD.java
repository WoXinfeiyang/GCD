import java.util.Scanner;

/**
 * 文件:最大公约数
 * 时间:2016-9-8 10:51
 * 说明:1、题目：一行代码求最大公约数。
 */
public class GCD {
	
	public static int getGCD(int max,int min){
		return min==0?max:getGCD(min, max%min);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int m=in.nextInt();
			int n=in.nextInt();
			int max=Math.max(m,n);
			int min=Math.min(m,n);
			System.out.println(getGCD(max,min));
		}
	}

}
