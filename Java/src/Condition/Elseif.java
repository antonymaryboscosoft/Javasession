package Condition;
//The if-else-if ladder statement executes one condition from multiple statements.
public class Elseif {
public static void main(String[] args){	
int mark = 60;
if(mark<50){
System.out.println("fail");	
}
else if(mark >=50 && mark<60){
	System.out.println("E grade");
}
else if (mark>=60 && mark<70){
	System.out.println("D grade");
}
else if(mark>=70 && mark<80){
	System.out.println("c grade");
}
else if (mark>=80 && mark<90){
	System.out.println("A grade");
}
else{
	System.out.println("in valide");
}
}
}
