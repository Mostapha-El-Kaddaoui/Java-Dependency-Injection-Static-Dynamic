package DAO;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de Donnees");
        double temp = 23;
        return temp;
    }
}
