public class Person_data {
        private int top, size;
        
        // Here we are storing each Person as a Object in Array like we store [int, String, double, char]
        private Person[] stack;

        // Constructor
        private Person_data()
        {
            this.top = -1;
            this.size = 50;
            this.stack = new Person[this.size];

        }
        // Constructor with Parameter of size limit
        
        private  Person_data(int size)
        {
            this.top = -1;
            this.size = size;
            this.stack = new Person[this.size];

        }

        // Getting the Size, Top_Value
        private void getDetails()
        {
            System.out.println("The Size of stack: " + this.size + "\n" + "The Top value: " + this.stack[top]);
            System.out.println("====================================================================");
        }

    // Getting Person object with the Index like: Array[0]
        private Person getPerson(int num){
            return this.stack[num];
        }

        // Pushing the value and Decresing the Size and Increaing the Top
        private void push(Person data) throws ArrayIndexOutOfBoundsException
        {
            if(!isFull()) {
                this.top++;
                this.size--;
                this.stack[top] = data;
            }else{
                System.out.println("Stack is full");

            }

        }


        // Removing an last Element from an Array
        private void pop()
        {
            this.size+=1;
            System.out.println(this.stack[ this.top-- ].getData());
            if(this.top <= 0){
                System.out.println("No More elems to Pop");
            }
        }

        // Setting limit of the Array
        private void set(int limit)
        {
            this.size = limit;
        }


        // Checks if the stack is full
        private boolean isFull(){
            return (this.size == 0);
        }

        // Getting Size of the stack
        private void getSize(){
            System.out.println(this.size);
        }
        
        // Main Thread
        public static void main(String[] args) {
            Person_data stack = new Person_data();
            Person me = new Person("Name", 12);
            Person me2 = new Person("First Name" 45);
            stack.set(12);
            stack.push(me2);
            stack.push(me);
        }

    }
