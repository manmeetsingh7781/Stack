
// Int Stack
class Stack_Practice {
private int top, size;
private int[] stack;

    // Constructor
    private  Stack_Practice()
        {
            this.top = -1;
            this.size = 50;
            this.stack = new int[this.size];

        }

      // Constructor with Size 
    private  Stack_Practice(int size)
    {
        this.top = -1;
        this.size = size;
        this.stack = new int[this.size];

    }

    // Getting the Size, Top_Value
    private void getDetails()
        {
            System.out.println("The Size of stack: " + this.size + "\n" + "The Top value: " + this.stack[top]);
            System.out.println("====================================================================");
        }


    // Pushing the value and Decresing the Size and Increaing the Top
    private void push(int number) throws ArrayIndexOutOfBoundsException
        {
            if(!isFull()) {
                this.top++;
                this.size--;
                this.stack[top] = number;

            }

            }


    // Removing an last Element from an Array and Increasing the Space of the Stack
    private void pop()
        {
        this.size+=1;
            System.out.println(this.stack[ this.top-- ]);
        }
    
    // Set optional size of the Stack 
    private void set(int limit)
    {
        this.size = limit;
    }
  
    // Checks if the stack is full then we can add Elements else It will throw an error
    private boolean isFull(){
        return (this.size == 0);
    }
    
    // Get the currunt Size of the Stack
    private void getSize(){
        System.out.println(this.size);
    }
    public static void main(String[] args) {
        Stack_Practice me1 = new Stack_Practice(10);
        me1.push(10);
        me1.push(20);
        me1.getSize();
        me1.pop();
        me1.getSize();

    }

}
