package ext;

import DAO.Dao;

public class DaoImplVWS implements Dao {
    @Override
    public double getData() {
        System.out.println("Version Web Services");
        return 90;
    }
}
