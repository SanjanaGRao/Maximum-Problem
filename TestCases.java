
public class TestCases {
	
	public static void main(String[] args)
	{
		int firstInt=30, secondInt=55,thirdInt=21;
		new TestMaximum(firstInt,secondInt,thirdInt).maximumValue(firstInt,secondInt,thirdInt);
		double firstFloat=300.75, secondFloat=300.25,thirdFloat=300.95;
		new TestMaximum(firstFloat,secondFloat,thirdFloat).maximumValue(firstFloat,secondFloat,thirdFloat);
		String firstWord= "Apple", secondWord= "Peach",thirdWord= "Banana";
		new TestMaximum(firstWord,secondWord,thirdWord).maximumValue(firstWord,secondWord,thirdWord);
	}

}
