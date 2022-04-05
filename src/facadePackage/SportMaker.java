package facadePackage;

public class SportMaker {
    private Sporturi fotbal;
    private Sporturi alergat;
    private Sporturi wrestling;

    public SportMaker() {
        fotbal = new Fotbal();
        alergat = new Alergat();
        wrestling = new Wrestling();
    }

    public void printFotbal(){
        fotbal.print();
    }

    public void printAlergat(){
        alergat.print();
    }

    public void printWrestling(){
        wrestling.print();
    }

}
