
public class TestMaximum<T extends Comparable<T>> {
	
	T first,second,third;
	
	//Constructor
	public TestMaximum(T first,T second,T third) {
		this.first=first;
		this.second=second;
		this.third=third;
	}
	
	/*Generic method using compareTo to find out the maximum of Integers
	 * @param max is used to assume first is maximum then compare with second and third
	 */
	 public static <T extends Comparable<T>> T maximumValue(T first,T second,T third) {
			T max = first;  
			if(second.compareTo(max)>0) {
				max=second;
			}
			if(third.compareTo(max)>0) {
				max=third;
			}
			printMax(first,second,third,max);
			return max;
		}
	 
	 //Method to print the max Integer
	 public static <T> void printMax(T first,T second,T third,T max)
		{
			System.out.printf("Maximum of %s, %s and %s is %s .\n",first,second,third,max);
		}
	 
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
