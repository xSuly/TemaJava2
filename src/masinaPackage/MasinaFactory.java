package masinaPackage;

public class MasinaFactory {

    public Masina getMasina(String brandMasina){
        if(brandMasina == null || brandMasina.isEmpty()){
            return null;
        }
        if(brandMasina.equalsIgnoreCase("AUDI")){
            return new Audi();
        } else if(brandMasina.equalsIgnoreCase("BMW"))
        {
            return new BMW();
        } else if(brandMasina.equalsIgnoreCase("MERCEDESBENZ"))
        {
            return new MercedesBenz();
        }
        else {
            throw new IllegalArgumentException("Brand producator necunoscut " + brandMasina);
        }
    }
}

