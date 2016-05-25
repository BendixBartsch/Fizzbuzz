
public class threeorfive {

	public static void main(String[] args) {
		
		
		for(int b=0; b<100; b++){
			
			if((b%3==0) & (b%5==0)){System.out.println(b+ " Fizz Buzz");			
			}
			
			else if(b%3==0){
				System.out.println(b + " Fizz");
			}
		
			else if(b%5==0){
				System.out.println(b + " Buzz");
			} 
			else{ 
				System.out.println(b);
			}
		}
		
			
	}
	
}


	

