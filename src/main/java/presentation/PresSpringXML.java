package presentation;

import metier.IntMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IntMetier metier = (IntMetier) context.getBean("metier");
        System.out.println("Résultat => "+metier.calcul());
    }
}
