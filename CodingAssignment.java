import java.util.*;
public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.create an array of int called ages that contains the following values: 3.9.23.64.2.8.28.93
		int[] ages = {3,9,23,64,2,8,28,93};
		
		//a. programmatically subtract the value of the first element in the array from the value in the last element of the array ( i.e. do not use ages[7] in your code). Print the result to the console.
		int newage = ages[ages.length-1]-ages[0];
		System.out.println("First element subtracted form the last element: " + newage);
		//b. add a new age to your array and repeat the step above to ensure it is dynamic( works for arrays of different lengths).
		int[] ages2 = {3,9,23,64,2,8,28,93,7};
		int newages = ages2[ages2.length-1]-ages2[0];
		System.out.println("First element subtracted form the last element: " + newages);
		//c. use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int result = 0;
		for ( int age : ages) {
			result += age;	
		}
		int finalResult = result/ages.length;
		System.out.println("Average age: " + finalResult);
		
		//2.create an array of String called names that contains the following values: "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob".
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		//a. use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sum = 0;
		for ( String name : names) {
			sum+=name.length();
		}
		int averageLetter = sum/names.length;
		System.out.println("Average number of letters per name: " + averageLetter);
		//b. use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatNames = "";
		for ( String name: names) {
			concatNames += name+ " ";
		}
		System.out.println("Names concatenated together: " + concatNames);
		
		//3.how do you access the last element of any array?
		/*To access the last element of any array, you can take the name of the array and then with square brackets, use the name 
		  of the array.length - 1, because the final element of any array is always one less than the total size of the array.
		 */
		
		//4. how do you access the first element of any array?
		/*To access the first element of any array, you can take the name of the array and then with square brackets, use 0 because the start of any
		 * array is always index 0.
		 */
		
		//5. Create a new array of int called nameLength. Write a loop to iterate over the previously created names array and add the length of each name to the nameLength array.
		int[] nameLength = new int[6];
		for (int i = 0; i<names.length ; i++) {
			int length = names[i].length();
			nameLength[i]= length;
		}
		
		//6. write a loop to iterate over the nameLength array and calculate the sum of all elements in the array. Print the result to the console.
		int sumName = 0;
		for ( int name : nameLength) {
			sumName+=name;
		}
		System.out.println("The sum of all lengths of names: " + sumName);	
		
		//7. Test Method
		System.out.println(concatString("Racecar", 4));
		
		//8. Test Method
		System.out.println(fullName("William","Czajkowski"));
		
		//9. Test Method
		System.out.println(isGreaterThan100(ages));
		
		//10. Test Method
		Double[] testArray1 = {3.2,4.5,1.1,8.2,9.9};
		System.out.println(averageDouble(testArray1));
		
		//11. Test Method
		Double[] testArray2 = {4.1,3.2,6.7,8.9,0.5};
		System.out.println(isAverageGreater(testArray1,testArray2));
		
		//12. Test Method
		System.out.println(willBuyDrink(true,11.75));
		
		//13. Test Method
		System.out.println(howManyElementsAreEven(ages));
	}
	//7. write a method that takes a String, word, and an int,n, as arguments and returns the word concatenated to itself n number of times (i.e. if I pass in "Hello" and 3, I expect the method to return "HelloHelloHello").
	public static String concatString( String word, int n) {
		String result = "";
		for (int i =0; i<n; i++) {
			result+=word;
		}
		return result;
	}
	//8. write a method that takes two Strings, firstName and lastName, and returns a full name( the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		String result = "";
		result= firstName + " " + lastName;
		return result;
	}
	//9.write a method that takes an array of int an returns true if the sam of all the ints in the array is greater than 100.
	public static boolean isGreaterThan100(int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		if (sum>100) { 
			return true;
		}
		else {
			return false;
		}
	}
	//10. write a method that takes an array of double and returns the average of all the elements in the array.
	public static double averageDouble(Double[] array) {
		double sum = 0;
		for ( double number : array) {
			sum += number;
		}
		return (sum/array.length);
	}
	//11. write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean isAverageGreater( Double[] array1, Double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for ( double number1 : array1) {
			sum1+=number1;
		}
		for ( double number2: array2) {
			sum2+=number2;
		}
		double average1 = sum1/array1.length;
		double average2 = sum2/array2.length;
		if ( average1>average2) {
			return true;
		}
		else {
			return false;
		}
	}
	//12. write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside=true && moneyInPocket>10.50 ) {
			return true;
		}
		else {
			return false;
		}
	}
	//13. create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	public static int howManyElementsAreEven(int[] array) {//the intent of this method is to find all the even elements in an array and provide a total to the user. It will help a user find all even numbers in a larger piece of data.
		int sum = 0;
		for ( int number : array) {
			if ( number%2==0) {
				sum++;
			}
		}
		return sum ;
	}
}
