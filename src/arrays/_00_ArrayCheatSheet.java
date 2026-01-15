package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random ran = new Random();
		int rand = ran.nextInt(100);
		String[] str = new String[6];
		str[1] = "My favorite song at the moment is a three way tie between";
		str[2]="Vanilla Twilight";
		str[3]="All eyes on me";
		str[4] = "and You'll be on my mind.";
		str[5] = "I also like splatoon music, but we're not getting into that right now";
		int smallest=100;
		for(int i =1; i<6; i++) {
			System.out.println(str[i]);
		}
		Integer[] toomany = new Integer[51];
		for (int i = 50;i>0; i--) {
			toomany[i] = rand;
			rand = ran.nextInt(1000);
			if(rand<smallest) {
				smallest=rand;
				toomany[i]=smallest;
			}
			System.out.println(toomany[i]);
		}
		System.out.println(smallest);
		//1. make an array of 5 Strings
		
		//2. print the third element in the array
		
		//3. set the third element to a different value
		
		//4. print the third element again
		
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
