package facadePackage;

import java.util.Scanner;

public class SportAplicatie {
    public static void main(String[] args) {
        System.out.println("Bun venit la aplicatia de prezentare a sporturilor. Pentru a selecta un sport" +
                " trebuie sa introduceti numele acestuia (fotbal, alergat sau wrestling)" +
                " iar pentru fiecare se prezinta cate o informatie (comanda print + numele sportului)." +
                " Dupa fiecare comanda se apasa tasta Enter," +
                " pentru a cauta alta informatie introduceti Urmatorul" +
                " iar pentru a iesi din aplicatie tastati Exit.");
        Scanner scanner = new Scanner(System.in);
        SportMaker sportMaker = new SportMaker();
        System.out.println("Introduceti sportul: ");
        String input = scanner.nextLine();
        while(!input.equalsIgnoreCase("Exit")){

            if(input==null)
            {
                System.out.println("Sport necunoscut! Incercati din nou!");
                input = scanner.nextLine();
                continue;
            }
            while(!input.equalsIgnoreCase("Urmatorul")) {
                switch (input)
                {
                    case "fotbal" -> sportMaker.printFotbal();
                    case "wrestling" -> sportMaker.printWrestling();
                    case "alergat" -> sportMaker.printAlergat();
                    case "Exit" -> {
                        System.out.println("Multumim pentru folosirea aplicatiei!");
                        return;
                    }
                    default -> System.out.println("Sport necunoscut! Incercati din nou!");
                }
                input = scanner.nextLine();
            }
            System.out.println("Scrieti urmatorul sport: ");
            input = scanner.nextLine();
        }
        System.out.println("Multumim pentru folosirea aplicatiei!");
    }
}
