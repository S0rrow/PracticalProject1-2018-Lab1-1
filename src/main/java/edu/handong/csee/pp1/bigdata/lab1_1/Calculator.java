// This is an one line comment.
/*
 * This is a block comment. You can write comments in multiple lines.
 */
/* 
 * A package is a namespace where your related classes and interfaces are grouped.
 * When you share your program to other developers,
 * other developers can import the package and can use classes and interfaces in the package
 */
package edu.handong.csee.pp1.bigdata.lab1_1; 


/**
 * @author JC
 * We are defining a class which is a blueprint of our Calculator object.
 */
/**
 * @author jaech
 *
 */
public class Calculator {

	// An object has data and actions
	// Object data are any variables/constants in this area
	// (in 'class' definition but not in method definitions.)
	// We call all variables defined in this area as member variables or fields.

	// static decides how this variable can be accessed and maintained.
	// Static variables are shared by all objects crated by this class definition.
	static int countForAnyCompution = 0;
	// private member variable is used by only one object can can't be shared by other objects
	//

	private int localCount = 0;


	/**
	 * This is a main method, which is a special method where is the starting point of a program execution.
	 * This method is not an actual action of this object but just for starting our program.
	 * 'public' means this method can be called via this object in anywhere.
	 */
	public static void main(String[] args) {

		// Based on our class definition, we can create a real object!
		// classname objectname = new classname();
		Calculator myCalulator = new Calculator();

		// now we can do some action (method) in our object!
		myCalulator.execute(args[0], args[1]);
	}

	/**
	 * @param firstArg
	 * @param secondArg
	 * 
	 * This method (action) get two numbers in String type and various computations
	 * and call a method printing their results.
	 * 'private' means this method can be called only in this class.
	 * 
	 */
	private void execute(String firstArg, String secondArg) {
		int firstIntArg = Integer.parseInt(firstArg);
		int secondIntArg = Integer.parseInt(secondArg);

		countForAnyCompution=0;
		localCount = 0;
		System.out.println("input:"+firstArg+" "+ secondArg);
		print("SUM:" , sum(firstIntArg, secondIntArg));
		print("SUB:" , this.subtract(firstIntArg, secondIntArg));
		System.out.println("DV: " + divide(firstIntArg,secondIntArg));
		System.out.println("MOD: "+ mod(firstIntArg,secondIntArg));
		print("*:" , multiply(firstIntArg, secondIntArg));
	}

	
	/**
	 * @param prefix
	 * @param result
	 * This method prints out computation result.
	 */
	void print(String prefix, int result) {
		System.out.println(prefix + " " + result);
	}

	int sum(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first + second;
	}

	int subtract(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first - second;
	}

	int multiply(int first, int second) {
		countForAnyCompution++;
		localCount++;
		return first * second;
	}

	double divide(int first, int second) {
		double quot = Double.NaN;
		try {
			quot = first/second;
		} catch(ArithmeticException e) {
			System.out.println("Error:ArithmeticException " + e +"\n");
		}
		countForAnyCompution++;
		localCount++;
		return quot;
	}

	int mod(int first, int second) {
		int mod = (int)Double.NaN;
		try {
			mod = first%second;
		} catch (ArithmeticException e) {
			System.out.println("Error:ArithmeticExcpetion" + e + "\n");
		}
		countForAnyCompution++;
		localCount++;
		return mod;
	}

	static int getCount() {
		return countForAnyCompution;
	}

	int getLocalCount() {
		return localCount;
	}
}
