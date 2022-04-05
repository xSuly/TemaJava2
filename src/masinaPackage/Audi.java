package masinaPackage;

public class Audi implements Masina {

    @Override
    public void model() {
        System.out.println("Audi A6 reprezinta un model interesant!");
    }

    @Override
    public void viteza_maxima() {
        System.out.println("Audi A6 atinge o viteza maxima de 250 km/h.");
    }
}
