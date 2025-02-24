package PRES;

import DAO.IDao;

import java.io.File;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao) cDao.getConstructor().newInstance();
            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            // equal to MetierImpl metier = new MetierImpl(d);
            // IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            // or

            //equal to MetierImpl metier = new MetierImpl();
            //         metier.setDao(d);
            //IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            //Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            //setDao.invoke(metier, dao) ;

            //System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
