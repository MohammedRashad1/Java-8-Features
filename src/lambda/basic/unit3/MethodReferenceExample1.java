package lambda.basic.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t = new  Thread(MethodReferenceExample1::printMessage);
//		Thread t1 = new  Thread(()->printMessage());
//		t1.start();
		t.start();

	}
	public static void printMessage(){
		System.out.println("Hello");
	}

}
