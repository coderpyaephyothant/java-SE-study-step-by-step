public class CallSequence {
    void methodIchi(){
        System.out.println("Call MethodIchi");
         methodNi();
         System.out.println("Returned MethodIchi");
    };
    void methodNi(){
        System.out.println("Call MethodNi");
         methodSan();
         System.out.println("Returned MethodNi");
    };
    void methodSan(){
        System.out.println("Call MethodSan");
        System.out.println("Returned MethodSan");
    };

    public static void main(String[] args) {
        CallSequence seq = new CallSequence();
        System.out.println("始まります。!");
        seq.methodIchi();
    }
}
