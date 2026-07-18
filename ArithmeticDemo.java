public class ArithmeticDemo {
    //Add Method for Integer
    int add(int a, int b){
                System.out.println("call 1");
    return a+b;
    }
    
    //Add Method for floats
    float add(float a, float b){
                System.out.println("call 2");
        return a+b;
    }
    
    public static void main(String[] args) {
        ArithmeticDemo ArithmeticObj = new ArithmeticDemo();
        //for integer add 
        int result = ArithmeticObj.add(10,50);
        System.out.println("Add Method INT Result " + result);
        float resultB = ArithmeticObj.add(1.3F, 2.2F);
        System.out.println("Add Method F Result " + resultB);
    }
}
