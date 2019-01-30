
public class Cleanup {
	public void Cleaner(String tekst, char[] weg) {
		String[] Weg= new String[weg.length];
		for(int x=0; x<weg.length; x++) 
			Weg[x] = String.valueOf(weg[x]);
		

		for(int x=0; x<weg.length; x++) {
		tekst = tekst.replace(Weg[x], "");
		}
		
		System.out.println(tekst);
	}
}
