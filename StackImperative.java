public class StackImperative {
    //no oop
    // call this paradigm -> Imperative
    static int push(int []stack, int top, int item){
        stack[++top] =item;
        System.out.println("topp"+ top); // 0 1
        return top;
      };
    public static void main(String[] args) {
        //Imperative
        int top = -1;
        int stack[] = new int[10];
        System.out.println("top"+top);//-1
        top = push(stack,top,100); //0
        System.out.println("top"+top); //0

        System.out.println("top"+top); //0
        top = push(stack,top,500); //1
        System.out.println("top"+top); //1

    }
}
