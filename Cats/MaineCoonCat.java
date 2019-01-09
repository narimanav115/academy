

public class MaineCoonCat extends Cat {
  public String jumpHeight;
  public String meow;
  MaineCoonCat(){
    super();
  }
  MaineCoonCat(String jumpHeight){
      super();
      this.jumpHeight = jumpHeight;
  }
    @Override
    public void purr(){
      System.out.println("MaineCoonCat purred");
    }
    public void meow() {
        System.out.println("MaineCoonCat meowed");
    }

    public void jump() {
        System.out.println("MaineCoonCat jumped "+jumpHeight);
    }
    @Override
    public void display() {

        System.out.println("Maine coon cat is displayed, it is very big");
    }
}
