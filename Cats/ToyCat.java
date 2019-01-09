

public class ToyCat extends Cat {
    public String meow;
    ToyCat(){
      super();
    }
    ToyCat(String meow){
        super();
        this.meow = meow;
    }
    @Override
    public void display() {

        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void purr() {
        //do nothing

        System.out.println("This cat does not purr!");
    }
    @Override
    public void meow(){
      System.out.println("ToyCat "+meow);
    }
    @Override
    public void jump() {
        //do nothing

        System.out.println("This cat does not jump!");
    }
}
