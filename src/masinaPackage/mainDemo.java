package masinaPackage;

public class mainDemo {

    public static void main(String[] args) {
        MasinaFactory masinaFactory = new MasinaFactory();

        Masina masina1 = masinaFactory.getMasina("AuDI");
        masina1.model();
        masina1.viteza_maxima();

        Masina masina2 = masinaFactory.getMasina("bmW");
        masina2.model();
        masina2.viteza_maxima();

        Masina masina3 = masinaFactory.getMasina("MERCEDESBENZ");
        masina3.model();
        masina3.viteza_maxima();

        //Masina masina4 = masinaFactory.getMasina("JAguar");

    }
}
