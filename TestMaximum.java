
public class TestMaximum<T extends Comparable<T>> {
	
	T first,second,third,fourth,fifth;
	
	//Constructor when user wants 3 parameters
	public TestMaximum(T first,T second,T third) {
		this.first=first;
		this.second=second;
		this.third=third;
	}
	
	//Constructor when user wants 4 parameters
	public TestMaximum(T first,T second,T third,T fourth) {
			this.first=first;
			this.second=second;
			this.third=third;
			this.fourth=fourth;
		}
	
	//Constructor when user wants 3 parameter
	public TestMaximum(T first,T second,T third,T fourth,T fifth) {
			this.first=first;
			this.second=second;
			this.third=third;
			this.fourth=fourth;
			this.fifth=fifth;
		}
	/*Generic method using compareTo to find out the maximum of Integers
	 * @param max is used to assume first is maximum then compare with second and third
	 * Refactoring: To create Generic Class to take in 3 variables of Generic Type
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
	 
	 /*Generic method using compareTo to find out the maximum of Integers
		 * @param max is used to assume first is maximum then compare with second, third and fourth
		 * Refactoring: To create Generic Class to take in 4 variables of Generic Type
		 */
	public static <T extends Comparable<T>> T maximumValue(T first,T second,T third,T fourth) {
				T max = first;  
				if(second.compareTo(max)>0) {
					max=second;
				}
				if(third.compareTo(max)>0) {
					max=third;
				}
				if(fourth.compareTo(max)>0) {
					max=fourth;
				}
				printMax(first,second,third,fourth,max);
				return max;
			}
	
	 /*Generic method using compareTo to find out the maximum of Integers
	 * @param max is used to assume first is maximum then compare with second, third, fourth and fifth
	 * Refactoring: To create Generic Class to take in 5 variables of Generic Type
	 */
	public static <T extends Comparable<T>> T maximumValue(T first,T second,T third,T fourth,T fifth) {
				T max = first;  
				if(second.compareTo(max)>0) {
					max=second;
				}
				if(third.compareTo(max)>0) {
					max=third;
				}
				if(fourth.compareTo(max)>0) {
					max=fourth;
				}
				if(fifth.compareTo(max)>0) {
					max=fifth;
				}
				printMax(first,second,third,fourth,fifth,max);
				return max;
			}
	 
	 //Method to print the maximum Value for 3 parameters.
	 public static <T> void printMax(T first,T second,T third,T max)
		{
			System.out.printf("Maximum of %s, %s and %s is %s .\n",first,second,third,max);
		}
	//Method to print the maximum Value for 4 parameters.
	 public static <T> void printMax(T first,T second,T third,T fourth,T max)
			{
				System.out.printf("Maximum of %s, %s, %s and %s is %s .\n",first,second,third,fourth,max);
			}
	//Method to print the maximum Value for 5 parameters.
	public static <T> void printMax(T first,T second,T third,T fourth,T fifth,T max)
			{
				System.out.printf("Maximum of %s, %s, %s, %s and %s is %s .\n",first,second,third,fourth,fifth,max);
			}

}
