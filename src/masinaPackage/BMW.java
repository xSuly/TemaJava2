package masinaPackage;

public class BMW implements Masina {

    @Override
    public void model() {
        System.out.println("BMW Seria 5 reprezinta un model interesant!");
    }

    @Override
    public void viteza_maxima() {
        System.out.println("BMW Seria 5 atinge o viteza maxima de 250 km/h.");
    }
}

