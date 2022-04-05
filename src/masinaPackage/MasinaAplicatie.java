package masinaPackage;

import java.util.Scanner;

public class MasinaAplicatie {
    public static void main(String[] args) {
        System.out.println("Bun venit la aplicatia de prezentare a masinilor. Pentru a selecta o masina" +
                " trebuie sa introduceti numele brand-ului producator (Audi, BMW sau MercedesBenz)" +
                " iar pentru fiecare se prezinta cate un model (comanda model) dar si viteza maxima" +
                " pe care masina o poate atinge(vitezamax). Dupa fiecare comanda se apasa tasta Enter," +
                " pentru a cauta alta masina introduceti Urmatorul" +
                " iar pentru a iesi din aplicatie tastati Exit.");
        Scanner scanner = new Scanner(System.in);
        MasinaFactory masinaFactory = new MasinaFactory();
        System.out.println("Introduceti brand-ul producator: ");
        String brand = scanner.nextLine();
        while(!brand.equalsIgnoreCase("Exit")){
            Masina masina = masinaFactory.getMasina(brand);
            if(masina==null)
            {
                System.out.println("Brand necunoscut, incercati din nou!");
                brand = scanner.nextLine();
                continue;
            }
            System.out.println("Model sau viteza maxima?");
            String comanda = scanner.nextLine();
            while(!comanda.equalsIgnoreCase("Urmatorul")) {
                switch (comanda)
                {
                    case "model" -> masina.model();
                    case "vitezamax" -> masina.viteza_maxima();
                    case "Exit" -> {
                        System.out.println("Multumim pentru folosirea aplicatiei!");
                        return;
                    }
                    default -> System.out.println("Brand necunoscut, incercati din nou!");
                }
                comanda = scanner.nextLine();
            }
            System.out.println("Scrieti urmatorul producator: ");
            brand = scanner.nextLine();
        }
        System.out.println("Multumim pentru folosirea aplicatiei!");
    }
}
