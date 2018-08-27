
public class Trinosaur 
{
	float height = 105.10f;
	String colorofTrinosaur = "Florouscent green";
	float weight = 5000;
	byte noOfLegs = 6;
	boolean isVeggie = true;
	int age = 156;
	
	void jump(){
		System.out.println("Jumping japang japang");
	}
	void fly(){
		System.out.println("Fly high");
	}
	void swim(){
		System.out.println("Swimiiiiiiiiiii..");
	}
	void cry (){
		System.out.println("Woooooooooooooooooooo");
	}
	void sleep(){
		System.out.println("zzzzzzzzzzz");
	}
	void eat(){
		System.out.println("Yummy noodles");
	}
	void talk(){
		System.out.println("I am trinosaur");
	}
	void whatsApp(){
		System.out.println("Hey! Buddy");
	}
	
	public static void main(String[] args) {
		Trinosaur tino1 = new Trinosaur();
		tino1.talk();
		tino1.eat();
		tino1.cry();
		System.out.println(tino1.height +" "+tino1.weight);
	
	Trinosaur bino = new Trinosaur();
	
	Trinosaur bamBino = new Trinosaur();
	
	tino1.talk();
	bino.talk();
	}
}

