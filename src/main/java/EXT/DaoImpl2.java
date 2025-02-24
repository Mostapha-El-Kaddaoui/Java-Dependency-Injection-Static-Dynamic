package EXT;

import DAO.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service");
        double t = 11;
        return t;
    }
}
