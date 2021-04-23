public class AnimalDriver{
  public static void printSound(Animal1 a){
    System.out.println(a.makeSound());
  }
  public static void main(String [] args){
    Dog1 d1 = new Dog1("bark");
    Cat1 c1 = new Cat1("meow");
    printSound(c1);
    printSound(d1);  
  }
}