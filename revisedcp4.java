package revisedcp4;

import java.util.Arrays;

public class revisedcp4 {
	public static <stringBuilder> void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console. 
		System.out.println(ages[ages.length - 1] - ages[0]);
		// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		// i. Make sure that there are 9 elements of type int in this new array.  
		
		int[] ages2 = {58, 71, 93, 79, 50, 23, 14, 11, 6};
		
		// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
		
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		// c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		double sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		double average = sum / ages.length;
        System.out.println("The average is: " + average);
		
		// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
        
        int totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double nameAvg = totalLetters / names.length;
		System.out.println("The average of all the letters in the names array is: " + nameAvg);
		
		// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatenatedNames = " "; 
		   for (String name : names) {
			   concatenatedNames += name + " ";
		   }
			System.out.println("The result of all the names concatenated together: " + concatenatedNames.trim());
		
		// 3. How do you access the last element of any array?
			
			 System.out.println(names[names.length - 1]);
		
		// 4. How do you access the first element of any array?
			
			 System.out.println(names[0]);
		
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
			 int[] nameLengths = new int[names.length];
			 for (int i = 0; i < names.length; i++) {
					nameLengths[i] = names[i].length();
			 }
			 System.out.println(Arrays.toString(nameLengths));
			 
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
				
				int lengthSum = 0;
				for (int i = 0; i < nameLengths.length; i++)
				{
					lengthSum += nameLengths[i];
				}
				System.out.println("The sum of nameLengths is " + lengthSum);
				
				
		// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
				String word = "Eclipse";
				int n = 3;
				System.out.println(solution7(word, n));
				
		// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
				String firstName = "Shannon";
				String lastName = "Hornberger";
				
				System.out.println(solution8(firstName, lastName));
		
		// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
				double[] numbers = {21, 2, 86, 34, 90, 24, 63};
		System.out.println("The answer to solution 9 is: " + solution9(numbers));
				
		// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		System.out.println("The answer to solution 10 is: " + solution10(numbers));
		
		// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		double[] numbers2 = {23, 41, 3, 7, 78, 22};
		System.out.println("The answer to solution 11 is: " + solution11(numbers, numbers2));
		
		// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = false;
		int temp = 78;
		double moneyInPocket = 15.0;
		
		if (temp >= 75) {
			isHotOutside = true;
		} else {
			isHotOutside = false;
		}
		System.out.println("The answer to solution willBuyDrink is: " + willBuyDrink(isHotOutside, moneyInPocket));
		
		// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			double bodyTemp = 101.5;
			boolean sick = false;
			
			if (bodyTemp > 101.0) {
				sick = true;
			} else {
				sick = false;
			}
		System.out.println("The answer to should I go to the Doctor is: " + goToDoctor(sick, bodyTemp));
		
			
	}//****************************************END*OF*MAIN*****************************************************************************

	// method 7
	
public static String solution7 (String word, int n) {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n; i++) {
		sb.append(word);
	}
	String repeatedString = sb.toString();
	
	return repeatedString;
}
	// method 8

public static String solution8 (String firstName, String lastName) {
	
	return firstName + " " + lastName;
	
}
	// method 9
public static boolean solution9 (double[] numbers) {
	double arraySum = 0;
	for (double number : numbers) {
		arraySum += number;
	}
	
	return arraySum > 100;
}
	// method 10
public static double solution10 (double[] numbers) {
	double avgSum = 0.0;
	for (double number : numbers) {
		avgSum += number;
	} 
	double numResult = avgSum / numbers.length;
	
	return numResult;
}
	// method 11
public static boolean solution11 (double[] numbers, double[] numbers2) {
	double firstSum = 0.0;
	for (double number : numbers) {
		firstSum += number;
	} 
	double avgResult = firstSum / numbers.length;
	
	double secondSum = 0.0;
	for (double number2 : numbers2) {
		secondSum += number2;
	} 
	double avgResult2 = secondSum / numbers2.length;
	
	return avgResult >= avgResult2;
}
	// method 12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	
	return isHotOutside && moneyInPocket > 10.50;
	
} 
	// method 13
public static boolean goToDoctor(boolean sick, double bodyTemp) {
	
	return sick && bodyTemp > 101.0;
}




	
	
	
	
	
	
	
	
	
	
	
	
	
} 

