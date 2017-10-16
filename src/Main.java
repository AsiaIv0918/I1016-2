import java.util.*;
public class Main {
//中文轉萬國碼
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	char a=in.next().charAt(0);

	//這行很重要
	System.out.println(Integer.toHexString(a)) ;
    }
}
