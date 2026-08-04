public class StackOOP {
    int top = -1;
    int items[] = new int[10];
    void push(int item){
        this.items[++this.top]=item;
    };
    public static void main(String[] args) {
        //emcapsulation
        StackOOP stack1= new StackOOP();
        System.out.println("initial top " + stack1.top);
        stack1.push(1000);
        System.out.println("top " + stack1.top);
        
    }
}
