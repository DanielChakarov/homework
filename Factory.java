/**
 * class part of Factory template, implementing needed objects
 */

public class Factory {
    public static Toys getToys(String toyType){
        if(toyType == null){
            return null;
        }
        if(toyType.equalsIgnoreCase("DOLL")){
            return new Dolls();

        } else if(toyType.equalsIgnoreCase("BICYCLE")){
            return new Bicycles();

        }
        return null;
    }
}
