# CSC120-A5: Bringing it All Together

## Outline
In this assignment, we'll explore Association by building a virtual Scarecrow using [ASCII Art](https://en.wikipedia.org/wiki/ASCII_art) (a technique that uses printed characters to "draw" images) like the one below:

```
   ****************************
 *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
*** ~  HAPPY FALL, EVERYONE! ~ ***
 *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
   ********************     ***
                      *******
              ___.      ***
           ___)__|_.   **  
      .-*'          '*-,
     /      /|   |\     \ 
    ;      /_|   |_\     ;
    ;   |\           /|  ;
    ;   | ''--...--'' |  ;
     \  ''---.....--''  /
     ''*-.,_______,.-*'  
        __,--./|.--,__
      .`   \ \ / /    `.
    .`      \ | /       `.
   /   /     ^|^      \   \
  /   / |     |o     | \   \
 /===/  |     |      |  \===\
/___/   |     |o     |   \___\
        |     |      |
        |     |o     |
        |_____/\_____|
        |   | \/  |  |
        |__/  ||  \__|
        |     ||     |
        |     ||     |
        |     ||     |
        |     ||     |
        |     ||     |
        |_____||_____|
       |______||______|
```

As before, all the files necessary for this assignment are contained within this repository. When you submit, please remember to include:

 - all files necessary to compile your program
 - `reflection.md` containing your reflections and notes
 - `rubric.md` where you document which elements of the assignment you have attempted and/or completed.
 
##  Program files
For this assignment, you'll be writing a whole bunch of (very simple) classes. Many of them represent individual parts of the scarecrow:

 - `Pumpkin.java` (complete example provided)
 - `Shirt.java`
 - `Pants.java`
 - `Boot.java`
 
Most of these classes will look very similar, containing just a single method to `display()` the corresponding part. Most don't even have an explictly-defined constructor! (Because these simple classes aren't storing any data and so don't have anything to initialize, we'll just rely on the default constructor that is inherited from the `Object` class - more on that after the midterm!)  For example, if we examine `Pumpkin.java` we'll find:

```
public class Pumpkin {
    
    /*
     * Prints ASCII art depicting a jack-o'-lantern to the console
     */
    public void display() {

        System.out.println("              ___");
        System.out.println("           ___)__|_");
        System.out.println("      .-*'          '*-,");
        System.out.println("     /      /|   |\\     \\ ");
        System.out.println("    ;      /_|   |_\\     ;");
        System.out.println("    ;   |\\           /|  ;");
        System.out.println("    ;   | ''--...--'' |  ;");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("     ''*-.,_______,.-*'  ");  

    }
}
```

### Step 1: Implementing individual parts.
Your **first task** is to implement the remaining "parts" - feel free to be creative with your ASCII art, or find some on the internet. Just don't forget to **escape** special characters like `\` by adding another `\` in front of them (so: `\\`) or they won't display properly. I've included a `main(...)` method in each of the starter files to simplify testing.

One tricky piece to consider is how you'll print your `Boot`s (since you need two of them). In this class, your constructor will take a `String` as a parameter which will take one of two values: `"left"` or `"right"`. We'll use this to signal whether we a drawing the left or right boot. 

_Hint 1: It's much more straightforward if each `Boot` only occupies a single line!_
_Hint 2: Remember the difference between `System.out.println(...)` and `System.out.print(...)`._

### Step 2: Assembling the Scarecrow.
Now that each part is working individually, assemble them together inside the `Scarecrow` class!

### Step 3: Adding the banner.
Once your Scarecrow is looking good, now it's time to add a decorative `Banner` that we can customize with a message. Unline the other classes representing parts of the `Scarecrow`, the `Banner` class **will** have a constructor which will take a `String` as a parameter that contains the message we want to print on the banner. You can stylize the banner however you like, but it should **resize** to fit the message. For example:

```
   ****************************
 *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
*** ~  HAPPY FALL, EVERYONE! ~ ***
 *** ~~~~~~~~~~~~~~~~~~~~~~~~ ***
   ********************     ***
                      *******
                      
               ****************
             *** ~~~~~~~~~~~~ ***
            *** ~  I <3 CSC! ~ ***
             *** ~~~~~~~~~~~~ ***
               ********     ***
                      *******
                      
                     **********
                   *** ~~~~~~ ***
                  *** ~  HI! ~ ***
                   *** ~~~~~~ ***
                     **     ***
                      *******
```

Note: if the "tail" on the speech bubble is giving you trouble, don't worry about it. A stylized regtangular banner is totally fine!

### Step 4: Command line arguments.
Now comes the fun part: remember all those times we ignored the `String[] args` that we passed into `main(...)`? We're finally going to put it to use! If you look inside the `main(...)` method of the `Scarecrow` class, you'll see something new:
```
if (args.length > 0) {
  // DO SOMETHING HERE
}
```
This says "Check to see if there's anything stored in the `args` array (i.e., if its length is > 0)". This array gets populated when someone masses in a **command line argument** when they run the program, like this:

```
> javac Scarecrow.java
> java Scarecrow "Happy fall, everyone!"
```
The `String` "Happy fall, everyone!" (which immediately follows the call to `java Scarecrow` on the command line) is passed into the call to `Scarecrow.main(...)` and is stored in the first position of the `String[] args` array. The code to retrieve this value is already present; just pass it into your `Banner` constructor, and you should then be able to generate custom ASCII Scarecrows from the command line to your heart's content!
