package j_tutorial;

public class J_Shuffling {
	static int M = 3; 
	static int N = 2; 
	
	//
	public static void main(String[] args) {
		
		/*Declaration*/
		int n;
		int shuffle[][] = {{ 3, 1 }, 
                { 2, 1 }, 
                { 1, 2 }};
		
		
		/*Initialization*/
		n = 3; 
		
		//
		getIndex(n, shuffle); 
		
	}
	
	static void getIndex(int n, int shuffle[][]){
		for (int i = 0; i < 3; i++)  
	    {
			if (shuffle[i][0] == n) {
				n = shuffle[i][1]; 
			}else if (shuffle[i][1] == n) {
				n = shuffle[i][0]; 
			}
			
			//
			System.out.println (n); 
	    }
	}

}
