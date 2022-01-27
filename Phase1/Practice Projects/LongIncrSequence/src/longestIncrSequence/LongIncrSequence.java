package longestIncrSequence;

public class LongIncrSequence {
	static int max_value; // stores the LIS

	static int lis_1(int array[], int n)
	{

		if (n == 1)
			return 1;

		int res, max_ending_here = 1;

		
		for (int i = 1; i < n; i++) {
			res = lis_1(array, i);
			if (array[i - 1] < array[n - 1]
				&& res + 1 > max_ending_here)
				max_ending_here = res + 1;
		}

		
		if (max_value < max_ending_here)
			max_value = max_ending_here;

		
		return max_ending_here;
	}

	
	static int lis(int arr[], int n)
	{
		
		max_value = 1;

		
		lis_1(arr, n);

		
		return max_value;
	}

	
	public static void main(String args[])
	{
		int array[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = array.length;
		System.out.println("Length of lis is " + lis(array, n)
						+ "\n");
	}
}
