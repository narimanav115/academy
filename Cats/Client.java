import java.util.*;



public class Client {

    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();
        cats.add(new MaineCoonCat("low"));
        cats.add(new MunchkinCat("high"));
        cats.add(new PiggyBankCat());
        cats.add(new ToyCat("meowed robotically"));

        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }
}
