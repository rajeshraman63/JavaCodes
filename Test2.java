import java.util.regex.*;
import java.util.*;

class Test{
	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);

		String sA  = scn.nextLine();

		int[] hashA = new int[26];

		for(int i=0;i<26;i++)
			hashA[i] = 0;
	        
        for(int i=0;i<sA.length();i++){

        	if(sA.charAt(i)>= 97 && sA.charAt(i)<= 122)

            hashA[sA.charAt(i)-97]++;
        }

        for(int i=0;i<26;i++)
        		System.out.println(hashA[i]);


		System.out.println(sA.length());

	}
}