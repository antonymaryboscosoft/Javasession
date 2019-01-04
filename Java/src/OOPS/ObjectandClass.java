package OOPS;
//An entity that has state and behavior is known as an object 
/*A class is a group of objects which have common properties. It is a template 
or blueprint from which objects are created.(contain field,method,constructor,block,interface)
*/// a method is like a function which is used to expose the behavior of an object.
public class ObjectandClass {
	//Defining a Student class.   
	 //defining fields  
	 int id;//field or data member or instance variable  
	 String name;  
	 //creating main method inside the Student class  
	 public static void main(String args[]){  
	  //Creating an object or instance  
		 ObjectandClass s1=new ObjectandClass();//creating an object of Student  
	  //Printing values of the object  
	  System.out.println(s1.id);//accessing member through reference variable  
	  System.out.println(s1.name);  
	 }  
	}  

