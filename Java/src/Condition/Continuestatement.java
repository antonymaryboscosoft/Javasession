package Condition;
/*The continue statement is used in loop control structure when you need to jump to
the next iteration of the loop immediately. It can be used with for loop or while loop.*/
public class Continuestatement {
	public static void main(String[] args) {  
	    //for loop  
	    for(int i=1;i<=10;i++){  
	        if(i==5){  
	            //using continue statement  
	            continue;//it will skip the rest statement  
	        }  
	        System.out.println(i);  
	    }  }
}
