interface A{
	void show(int i);
  }

public class LambdaDemo{ 
   public static void main(String[] args){
       A obj; //Object reference of Interface
       obj = (int i) -> System.out.println("hi " + i); //Providing implementation to the abstract method using lambda expression
            	 
                obj.show(8);
   }
}

