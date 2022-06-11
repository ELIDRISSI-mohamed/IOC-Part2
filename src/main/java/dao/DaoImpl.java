package DAO;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IntDao {
    @Override
    public double getData() {
         /*
            On suppose que nous avons déja connectée à la base de données
         */
         System.out.println("Version base de données");
         double temp = Math.random()*40; // prendre une valeur aléatoire entre 0 et 40
         return temp;
    }
}













