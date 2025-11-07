public class CalcPi {
	public static void main(String [] args) { 
		int counter = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double sum = 0;
		double denominator = 1;
		boolean operator = true;
		for(int i = 0; i < counter; i++) {
			double quotient = 1 / denominator;
			if(operator)  sum += quotient;
			else sum -= quotient;
			denominator += 2;
			operator = !operator;
		}
		sum *= 4;
		System.out.printf("pi, approximated:     " + sum);
	}
}