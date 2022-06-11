package presentation;

import dao.Dao;
import metier.IntMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("Config.txt"));
        // la classe DAO
        String DaoClassName = scanner.nextLine(); 
        Class CDao = Class.forName(DaoClassName); 
        Dao ObjDao = (Dao) CDao.newInstance();

        // la classe Metier
        String MetierClassName = scanner.nextLine();
        Class CMetier = Class.forName(MetierClassName);
        IntMetier ObjMetier = (IntMetier) CMetier.newInstance();

        Method method = CMetier.getMethod("setDao",Dao.class);
        method.invoke(ObjMetier,ObjDao);
        System.out.println("Résultat => "+ObjMetier.calcul());
    }
}
