package masinaPackage;

public class MercedesBenz implements Masina {

    @Override
    public void model() {
        System.out.println("Mercedes-Benz E Klasse reprezinta un model interesant!");
    }

    @Override
    public void viteza_maxima() {
        System.out.println("Mercedes-Benz E Klasse atinge o viteza maxima de 255 km/h.");
    }
}

