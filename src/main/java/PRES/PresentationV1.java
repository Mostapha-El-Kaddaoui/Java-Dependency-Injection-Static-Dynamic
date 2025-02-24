package PRES;

import DAO.DaoImpl;
import METIER.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //NullPointerException => au moment de l'execusion un appel d'un objet null est fait
        /*
        Injection des dependances par instanciation statique

        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println(metier.calcul());
        */

        /* Injection via constructeur
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());

         */

    }

}
