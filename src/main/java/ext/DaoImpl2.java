package EXT;

import DAO.IntDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IntDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp = 80;
        return temp;
    }
}
