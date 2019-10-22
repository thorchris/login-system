package lommeregner;


public class Lommeregner {

    //Metoden accepterer kun positive heltal
    public int sum(int tal1, int tal2) throws UgyldigtInputException {
        
        if (tal1 < 1 || tal2 < 1) {
            
            throw new UgyldigtInputException("forkert spasser");
        }
        return tal1 + tal2; 
        
    }

}
