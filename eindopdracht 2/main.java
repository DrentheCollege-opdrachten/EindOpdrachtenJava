
public class Main {
	
	public static void main(String[] args) {
		Cleanup Cleanup = new Cleanup();
		char[] weg = {'"','*', '?', '�'};
		String tekst =
				"Dit is een tekst met \" en ** en ?? "+
				"en allerlei andere niet wenselijke tekens zoals � etc. ";
		
		Cleanup.Cleaner(tekst, weg);
		
	}
}
