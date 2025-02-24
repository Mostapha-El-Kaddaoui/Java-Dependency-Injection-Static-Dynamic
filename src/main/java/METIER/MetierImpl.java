package METIER;

import DAO.DaoImpl;
import DAO.IDao;

public class MetierImpl implements IMetier{
    //Couplage Faible
    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public  MetierImpl(){

    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*3;
        return res;
    }

    // Injecter dans Dao un objet d'une classe qui implement l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
