import java.util.Scanner;
public class switcshsf {
public static void main (String[] args) {
	int num1 = 0, num2 =0, result = 0;
	String op = "";	
	Scanner scan =new Scanner(System.in);
	System.out.println("*** 계산기 ***");	
	System.out.print("첫번째 정수를 입력하세요: ");
	num1 = scan.nextInt();
	System.out.print("두번째 정수를 입력하세요: ");
	num2 = scan.nextInt();
			
	System.out.print("연산 : ");
	op = scan.next(); 
				
	switch (op) {
	case "+":
		result = num1 + num2;
		break;	
	case "-":
		result = num1 + num2;
		break;
	case "*":
		result = num1 + num2;
		break;
	case "/0":
		result = num1 + num2;
		break;
	default:
		System.out.println("0으로 나눌수 없습니다!");
	}
	System.out.println("계산 결과 : " + result);
}
}
