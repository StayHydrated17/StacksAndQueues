import java.util.Arrays;

//This program demonstrates stacks and queues
//Stack: allows access to just 1 item; last item put into the stack/ like an array.
//Queue: provides access to just 1 item, first item is the first item pulled out
//@author github.com/StayHydrated17
//@date 3/15/2021
//To-Do: add user-input integration

public class StackQueue 
{

    private String[] stackArray;
    //String array named stackArray

    private int stackSize;
    //used to monitor the size of the array

    private int topOfStack = -1;
    //used to monitor the top of the stack; since stacks get the last item for the first item


    //StackQueue method
    //parameter: size chosen by user for the stack
    //this method creates the stack, using the stackSize variable to determine
    //how big the stack should be
    StackQueue(int Size)
    {
        stackSize = Size;
        //setting the stackSize to the Size parameter that is passed

        stackArray = new String[Size];
        //setting our stackArray array to the length of the Size

        Arrays.fill(stackArray, "-1");
        //this Array.fill function fills our array with pre-set strings
        //would need to import Array.fill library
        
    }

    //this method displays our stack and goes through our stackArray array
    //creating spaces and creating a visibly appealing output of our array
    //Param: none
    //Return: none
    public void displayStack()
    {
        //this for loop lays out the format of the table
        for(int i = 0; i < 61; i++)
        {
            System.out.print("-");
            
        }
        System.out.println();
        
        //this for loop also helps format the table to display our array
        for(int i = 0; i < stackSize; i++)
        {
            System.out.format("| %2s " + " ", i);
            //formating each line with a pipe symbol
        }
        System.out.println("|");
        
        //whenever the value in our stackArray array is equal to -1, we display a pipe
        for(int i = 0; i < stackSize; i++)
        {
            if(stackArray[i].equals("-1"))
            {
                System.out.print("|     ");
            }
            else
            {
                System.out.print(String.format("| %2s" + " ", stackArray[i]));
            }
        }
        System.out.println();

        //this for loop finishes the bottom of the display table
        for(int i = 0; i < 61; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }
    //displayStack method

    //in order to put items onto our stack, we need to push on a value
    //this method pushes a string onto the stack
    public void push(String input)
    {
        if(topOfStack + 1 < stackSize)
        //checks to ensure there is room in the array
        {
            topOfStack++;
            //incrementing our topOfStack variable since we checked to see if there was room
            //in our stackSize of the array
            stackArray[topOfStack] = input;
            //whenever the push method is called, a new index will be used to store the value that was pushed
            //onto the stack
        }

        else
        {
            System.out.print("No room in the stack");
        }


        displayStack();
        System.out.print("PUSH: " + input + " was added to the stack\n");
        //telling the user what was pushed onto the stack
    }
    //push method

    //The concept of popping the last item that was added to a stack
    //Is to remove said item from the stack, this method demonstrates that
    //Param: none
    //Return: string 
    public String pop()
    {
        if(topOfStack >= 0)
        {
            //Since we're checking our array it starts at 0


            System.out.println("POP: " + stackArray[topOfStack] + " Was popped from the stack\n");
            
            stackArray[topOfStack] = "-1";
            displayStack();

            return stackArray[topOfStack--];
            
        }
        else
        {
            return "-1";
        }
    }
    //pop method


    //the concept of peeking at a stack is to view the top value without popping it or altering it
    //param: none
    //return: string;

    public String peek()
    {
        displayStack();

        System.out.println("PEEK: " + stackArray[topOfStack] + " is at the top of the array\n");
        return stackArray[topOfStack];
    }
    //peek method


    public static void main(String[] args)
    {
        StackQueue myStack = new StackQueue(10);
        //creating the myStack object from the StackQueue class
        //with the StackQueue parameter set to 10, which will set the
        //size of the array to 10

        myStack.push("10");
        //calling the .push method using our myStack object using 10 as the string to
        //add onto the stack
        myStack.push("15");
        myStack.peek();
        myStack.pop();


    }
    //main
    
}
//StackQueue 
