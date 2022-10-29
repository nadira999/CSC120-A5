/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * TODO: Uncomment remaining parts as you implement each class
     */
    private Pumpkin head;
    // private Shirt body;
    // private Pants legs;
    // private Hat hat;
    // private Boot leftFoot;
    // private Boot rightFoot;
    // private Banner sign;
    private String message;

    /* Constructor
     * TODO: initialize remaining parts
     */
    public Scarecrow(Pumpkin h) {
        head = h;
    }

    /* Displays the Scarecrow 
     * TODO: call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
        head.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {
        System.out.println("hi");
        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin());

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
        }

        myScarecrow.display();
    }

}
