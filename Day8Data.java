public class Day8Data {
    int value;
    // primitive
    // static void process(int a)
    // {
    //     System.out.println("hello process ");
    //     a++;
    //     System.out.println(a);
    // }

    //constructor function
    Day8Data(int value)
    {
        this.value = value;
    }
    //same object same reference
    // static void process(Day8Data data)
    // {
    //     data.value++;
    // }

     //different obj reference
     static void process2(Day8Data data)
     {
        data = new Day8Data(31);
     }

    public static void main(String[] args) {
        //primitive
        // int item = 10; 
        // process(item);

        // System.out.println("Item is "+item);

        //same object same reference
        // System.out.println("this is data " + data);
        // Day8Data data = new Day8Data(10); 
        // process(data); //overloading
    
        // System.out.println("this is data.value " + data.value);

        //different object
        Day8Data data2 = new Day8Data(21);
        System.out.println("data2 is " + data2);
        System.out.println("data2 value is " + data2.value);
        process2(data2);
        System.out.println("process2 data2 is " + data2);
        System.out.println("process2 data2 value is " + data2.value);
        //myNote  so, if data pf obj passed, is not true to change always... 

    }
}
