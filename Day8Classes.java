public class Day8Classes {
    // oop power
    int top = -1;
    int[] items = new int[10];
    
    void push(int item){
        this.items[++this.top] = item;
                  System.out.println("push "+top+" "+items[top]);
    }
    int pop(){
        return this.items[this.top--];
    }

    @Override
    public String toString() {
        return "Day8Classes{" + "top=" + top + ", items=" + items + '}';
    }
    
    public static void main(String[] args) {
        //Encapsulation Power
        Day8Classes stack1 = new Day8Classes();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println(stack1);
        System.out.println("Pop 1 "+ stack1.pop());
        System.out.println("Pop 2 "+ stack1.pop());
        System.out.println("Pop 3 "+ stack1.pop());
        System.out.println("Pop 4 "+ stack1.pop());
//        Day8Classes stack2 = new Day8Classes();
//        stack2.push(100);
    }
}
