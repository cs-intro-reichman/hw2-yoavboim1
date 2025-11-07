public class CalcPi {
	public static void main(String[] args) { 
		int iterations = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		
		double piSum = 0;
		double denominator = 1;
		boolean addNextTerm = true;
		
		for (int i = 0; i < iterations; i++) {
			double term = 1 / denominator;
			
			if (addNextTerm)  
				piSum += term;
			else 
				piSum -= term;
			
			denominator += 2;
			addNextTerm = !addNextTerm;
		}
		
		piSum *= 4;
		System.out.printf("pi, approximated:     " + piSum);
	}
}
