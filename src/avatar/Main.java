package avatar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Bender> benders = new ArrayList<>();

        Bender aang = new Air("Aang");
        Bender zhang = new Fire("Zhang");
        Bender johnny = new Air("Johnny");

        aang.displayBender();
        zhang.displayBender();
        johnny.displayBender();

        benders.add(aang);
        benders.add(zhang);
        benders.add(johnny);

        System.out.println("\n===================================\n");
        for (Bender single : benders) {
            single.bend();
            System.out.println(single.number(100));
        }
        System.out.println("\n===================================\n");
    }

}
