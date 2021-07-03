import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		char operator;
		double num1,num2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an operator (+, -, *, /, ² )");
		operator = input.next().charAt(0);
		
		System.out.println("Enter two numbers");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		
		switch(operator) {
		case '+':
			System.out.print(num1+num2);
			break;
		case '-':
			System.out.print(num1-num2);
			break;
		case '*':
			System.out.print(num1*num2);
			break;
		case '/':
			System.out.print(num1/num2);
			break;
		case '²':
			System.out.print(num1*num1);
			break;
			
	    }

	}
}
