
public class Main {


	public static void main(String[] args) {
		Person helga = new Person(45, "Hans", "Schmidt", "Maurer", "Weiblich", "Spanisch");
		Person hugo = new Person();
		
		
		hugo.setAlter(55);
		hugo.setVorname("Peter");
		hugo.setGeschlecht("Männlich");
		hugo.setNation("Spanisch");
		hugo.setNachname("Schmidt");
		
		hugo.vergleich(helga);
		
		
				

	}

}
