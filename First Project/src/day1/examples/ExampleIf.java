package day1.examples;

public class ExampleIf {

	public static void main(String[] args) {

		
		int x = 20;
		int y = 20;
		
		if(x < y){
			System.out.println("X is less than Y"); 
		}
		
		if(x > y){
			System.out.println("X is higher than Y");
		}
		
		if(x == y){
			System.out.println("X is equal to Y");
		}
		
	/* inefficient way to write an program
	 * is checking all 3 steps - all 3 steps are running
	 */

		if(x < y){
			System.out.println("X is less than Y"); 
		}else if(x == y){
			System.out.println("X is equal to Y");
		}else if(x > y){
			System.out.println("X is higher than Y");
		}
	
	/* the program is now checking one step after the other
	 * the program is now more efficient
	 * The compiler is only checking the first 2 steps - not the 
	 * 3rd step
	 */
		
		int a = 21;
		int b = 20;
		
		if (a == b){
			System.out.println("A is equal to B");
		}
			else System.out.println("A is not equal to B");
		}
	
	/* Other Relation Operators
	 * 	==	equal to
	 * 	!=	not equal to
	 * 	>	greater than
	 * 	<	less than
	 * 	>=	greater than OR equal to
	 * 	<=	less than OR equal to 
	 */
		
	

}
