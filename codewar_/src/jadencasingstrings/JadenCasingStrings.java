package jadencasingstrings;

public class JadenCasingStrings {

	public String toJadenCase(String phrase) {
		  if(phrase == null || "".equals(phrase)) return null; 

				String[]  b = phrase.split(" ");
				String r = ""; 
			 
				for(String z: b){
					r += z.substring(0, 1).toUpperCase() + z.substring(1) + " ";
				 
				}
					
				return r.trim();
			}
}
