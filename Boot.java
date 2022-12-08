/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructor */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }
    /*
     * TODO: Modify this method to print ASCII Art Boot
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.println("Left boot");
        } else if (this.direction.equals("right")) {
         System.out.println("||||______||||");
        } else {
          System.out.println("||||______||||");
          System.out.println("Left boot");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
