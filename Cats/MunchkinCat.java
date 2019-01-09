


public class MunchkinCat extends Cat {
    String jumpHeight;
    public String meow;
    MunchkinCat(){
      super();
    }
    MunchkinCat(String jumpHeight){
      super();
      this.jumpHeight = jumpHeight;
    }
    @Override
    public void display() {
        //display implementation

        System.out.println("Munchkin cat is displayed, he has small paws");
    }
    @Override
    public void meow(){
      System.out.println("MunchkinCat meowed");
    }
    @Override
    public void jump() {
        //jump implementation

        System.out.println("MunchkinCat jumps "+jumpHeight);
    }
}
