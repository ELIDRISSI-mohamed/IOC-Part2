package METIER;

import DAO.IntDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IntMetier {
    // ici oû je peux faire le traitement
    // Couplage faible

    /*
    @Autowired
    @Qualifier("dao2")*/
    private IntDao dao;

    public MetierImpl(IntDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp * 540/Math.cos(temp*Math.PI);
        return res;
    }

    /*
        Injecter dans la varible dao un objet d'une classe
        qui implémente l'interface IntDao
    */
    public void setDao(IntDao dao) {
        this.dao = dao;
    }
}
