import static org.junit.Assert.*;
import java.lang.String;
import java.util.Arrays; 

public class Part2{

	public static boolean isStringPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false; 
		}

		boolean isPerm = false; 
		int count = 0; //number of times isPerm has been assigned to true; 

		for(int i = 0; i < s1.length(); i++){
			
			char m = s1.charAt(i);

			for(int j = 0; j < s2.length(); i++){
				if(m == s2.charAt(j)){
					isPerm = true; 
					count++; 
				}
			}
		}

		if(count != s1.length()){
			isPerm = false; 
		}

		return isPerm; 

	}


	public static int[][] pairsThatEqualSum(int arr[], int target){

		int len = arr.length; 

		int pairs[][] = new int[len][2]; //the array of pairs will at most be as long as arr

		while (i < len){
			int elt = arr[i]; 

			for(int j = 0; j < len; j++){
				int tmp = arr[j]; 
				if(elt + arr[j] == target){
					pairs[i][j] = {elt, tmp}; 
				}
			}
			i++; 
		}

		return pairs; 
	}


	public static final void main(String[] args){

		//testing first function

		String str_1 = "hello"; 
		String str_2 = "elloh"; 

		assertTrue(isStringPermutation(str_1, str_2)); 
		assertFalse(isStringPermutatio(str_1, "horimbere"));


		//testing 2nd function
		

		int arr[] = {5, 4, 2, 1, 8, 9, 6, 5, 3, 0}; 
		int expcted[][] = {{5, 5},{4, 6}, {2 8}, {1, 9}};

		int output[][] = pairsThatEqualSum(arr, 10); 

		System.out.println(Arrays.toString(output)); 

		//check if equal

		System.out.println(Arrays.toString(output)); 

	}
}
