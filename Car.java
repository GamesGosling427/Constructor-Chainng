package constructor_chaining;

public class Car {

	public static void main(String[] args) {
	}
	int hp;
	String name;
	int price;
	
	
	Car(){
		System.out.println("car is created");
	}
	Car(int hp){
		this();
		this.hp=hp;
	}
	Car(int hp,String name){
		this(hp);
		this.name=name;
		}
	Car(int hp,String name,int price){
		this(hp,name);
		this.price=price;
	}
	
		public void displaycar() {
			System.out.println("hp is:"+hp);
			System.out.println("name is:"+name);
			System.out.println("price is :"+price);
		}
		
}


