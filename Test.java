import java.util.Scanner;

class CheckDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int t = scn.nextInt();

		scn.nextLine();

		while( t > 0) {
			String sA = scn.nextLine();  // reading one line at one time 
			String sB = scn.nextLine();  // reading one line at one time 
			
			/*System.out.println(sA);
			System.out.println(sB);*/

	        int[] hashA = new int[26];

			for(int i=0;i<26;i++)
				hashA[i] = 0;
		        
	        for(int i=0;i<sA.length();i++){

	        	if(sA.charAt(i)>= 97 && sA.charAt(i)<= 122)
					hashA[sA.charAt(i)-97]++;
	        }

	         int[] hashB = new int[26];

			for(int i=0;i<26;i++)
				hashB[i] = 0;
		        
	        for(int i=0;i<sB.length();i++){
	        	if(sB.charAt(i)>= 97 && sB.charAt(i)<= 122)
					hashB[sB.charAt(i)-97]++;
	        }
	        
	         
	       
	        

	        for(int i=0;i<26;i++){
	            int diff = hashA[i] - hashB[i];
	            if(diff > 0)
	                hashB[i]=0;
	            else if( diff < 0)
	                hashA[i]=0;
	            else if(diff == 0){
	                hashA[i]=0;
	                hashB[i]=0;
	            }
	            
	        }

	        int countA=0;
	        int countB=0;
	        
	        for(int i=0;i<26;i++){
	            if(hashA[i]!=0)
	                countA++;
	            if(hashB[i]!=0)
	                countB++;
	        }
	        
	      

	        if( countA == 0 && countB !=0)
	            System.out.println("You lose some.");
	        else if( countA != 0 && countB ==0)
	            System.out.println("You win some.");
	        else
	            System.out.println("You draw some.");


			
			t--;

			
		}
		
		scn.close();

	}

}
