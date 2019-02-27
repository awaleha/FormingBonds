public class Ionic{
	static Element f;
	static Element na;
	
	public static void main(String args[])
   	 {
   	 	f = new Element(9, "Fluorine", "F", "Halogen", false );
   	 	na = new Element(3, "Sodium", "Na", "Alkaline Metal", true );

   	 	ionicMethod(f, na);

   	 }

   	 public static void ionicMethod(Element first, Element second){
   	 	int firstOuterElectrons, secondOuterElectrons;
   	 	firstOuterElectrons = first.getOuterElectrons();
   	 	secondOuterElectrons = second.getOuterElectrons();

   	 	if (firstOuterElectrons + secondOuterElectrons == 8){
   	 		System.out.println("Ionic bond formed!");
   	 	}

   	 	else{
   	 		System.out.println("Requirments not met for Ionic bond formation.");
   	 	}

   	 }
}