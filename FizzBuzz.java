package fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		fizzBuzz(a, b);
	}
	
	public static void fizzBuzz(int a, int b) {
		for(int i = 1; i <= 100; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println("FizzBuzz!");
			} else if (i % a == 0) {
				System.out.println("Fizz");
			} else if (i % b == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static void fizzBuzzDifferently(int a, int b) {
		for(int i = 1; i <= 100; i++) {
			String s = "";
			if(i % a == 0)
				s += "Fizz";
			if(i % b == 0)
				s += "Buzz";
			if(s.isEmpty())
				s = Integer.toString(i);
			System.out.println(s);
		}
	}
	
	public static void fizzBuzzRecursive(int a, int b) {
		fizzBuzzRecursive(100, 1, a, b);
	}
	
	private static void fizzBuzzRecursive(int max, int i, int a, int b) {
		String s = "";
		if(i % a == 0)
			s += "Fizz";
		if(i % b == 0)
			s += "Buzz";
		if(s.isEmpty())
			s = Integer.toString(i);
		System.out.println(s);
		if(max > i)
			fizzBuzzRecursive(max, i+1, a, b);
	}
}
