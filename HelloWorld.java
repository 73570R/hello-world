public class HelloWorld
{
  public static void main(String[] args)
  {
    int count;
    final int leet = 1337;
    boolean isThisTheRealWorld = true;
    
    while(isThisTheRealWorld)
    { 
      System.out.print("Hello World! ");
      ++count;
      
      if(count == leet)
      {
        System.out.println("Bye World!");
        break;
      }
      
    }
  }
}
