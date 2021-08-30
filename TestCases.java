import java.util.Scanner;

public class TestCases {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of parameters you want (btw 3 - 5): ");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 3: {
			int firstInt=30, secondInt=55,thirdInt=21;
			new TestMaximum(firstInt,secondInt,thirdInt).maximumValue(firstInt,secondInt,thirdInt);
			double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95;
			new TestMaximum(firstFloat,secondFloat,thirdFloat).maximumValue(firstFloat,secondFloat,thirdFloat);		
			String firstWord= "Apple", secondWord= "Peach",thirdWord= "Banana";
			new TestMaximum(firstWord,secondWord,thirdWord).maximumValue(firstWord,secondWord,thirdWord);
			break;
		}
		case 4: {
			int firstInt=30, secondInt=55,thirdInt=21, fourthInt=45;
			new TestMaximum(firstInt,secondInt,thirdInt,fourthInt).maximumValue(firstInt,secondInt,thirdInt,fourthInt);
			double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95, fourthFloat=300.00;
			new TestMaximum(firstFloat,secondFloat,thirdFloat,fourthFloat).maximumValue(firstFloat,secondFloat,thirdFloat,fourthFloat);		
			String firstWord= "Apple", secondWord= "Peach",thirdWord= "Banana", fourthWord="Strawberry";
			new TestMaximum(firstWord,secondWord,thirdWord,fourthWord).maximumValue(firstWord,secondWord,thirdWord,fourthWord);
			break;
		}
		case 5: {
			int firstInt=30, secondInt=55,thirdInt=21, fourthInt=45, fifthInt=3;
			new TestMaximum(firstInt,secondInt,thirdInt,fourthInt,fifthInt).maximumValue(firstInt,secondInt,thirdInt,fourthInt,fifthInt);
			double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95, fourthFloat=300.00, fifthFloat= 407;
			new TestMaximum(firstFloat,secondFloat,thirdFloat,fourthFloat,fifthFloat).maximumValue(firstFloat,secondFloat,thirdFloat,fourthFloat,fifthFloat);		
			String firstWord= "Apple", secondWord= "Peach",thirdWord= "Banana", fourthWord="Strawberry", fifthWord = "Pear";
			new TestMaximum(firstWord,secondWord,thirdWord,fourthWord,fifthWord).maximumValue(firstWord,secondWord,thirdWord,fourthWord,fifthWord);
			break;
		}
		default: System.out.println("Invalid option.");
		}// end of switch case	
		sc.close();
	}

}
