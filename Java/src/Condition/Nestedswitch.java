package Condition;

public class Nestedswitch {
public static void main(String[] args){
	//
	char Dept = 'C';
	int year = 2;
	switch(year)
	{
	case 1:
		System.out.println("Eng, Maths,Sec");
		break;
	
	case 2:
		switch(Dept)
		{
		case 'C':
		System.out.println("Os, java, Db");
		break;
		case 'E':
			System.out.println("MP, logical Theory");
			break;
		case 'M':
			System.out.println("Drawing,Manufacture mechines");
			break;
		}
		break;
	case 3:
		switch(Dept){
		case 'C':
			System.out.println("computer organization, Multimedia");
			break;
		case 'E':
			System.out.println("fundamental of logical electronic, Microelectronic");
			break;
		case 'M':
			System.out.println("Internal combusion engin,mechanical vibration");
			break;
		}
		break;
	case 4:
		switch(Dept){
		case 'C':
			System.out.println("data communication and networking,multimedia");
			break;
		case 'E':
			System.out.println("embedded system, image processing");
			break;
		case 'M':
			System.out.println("production technologies, engineering theory");
			break;
		}
		break;
}
}}
