package presentation;

import metier.IntMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier","ext");
        IntMetier metier = context.getBean(IntMetier.class);
        System.out.println("Résultat => "+metier.calcul());
    }
}
