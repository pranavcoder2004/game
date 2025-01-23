import java.util.*;
class guessgame{
int userin;
int comp;


void user(){
	Scanner s=new Scanner(System.in);
	System.out.println("inter no");
    	userin=s.nextInt()
	 

}
 guessgame(){
	Random r=new Random();
	comp=r.nextInt(10);
	
}
 boolean guess(){
	if(userin==comp){
		System.out.printf("the no choosen by computer is=%d nochoosen by user%d",comp,userin);
		System.out.println("\n!!!!!!congratulation!!!!! you win");
		
		return true;
		
	}
	else if (userin>comp){
		System.out.println("thing somthing less");
		
		return false;
	}
	else {
		System.out.println("thing somthing greater");
		
		return false;
	}
	
	
}
public static void main(String arg[]){
	guessgame g=new guessgame();
	boolean b=false;
	
	while(!b){
		g.user();
		b=g.guess();
		
	}
}
}






