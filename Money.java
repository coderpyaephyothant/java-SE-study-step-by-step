public class Money {
    int amount; // if not given,value is zero
    //Constructor Overloading
    Money(){
        this.amount = 0;
    };
    Money(int amount){
        this.amount = amount;
    };
    //can also return object from Method
    Money add(Money another){
        return new Money(this.amount+another.amount);
    };
    public static void main(String[] args) {
        Money a = new Money(10);
        Money b = new Money(20);
        Money c = a.add(b);
        System.out.println("a "+a.amount);
        System.out.println("b "+b.amount);
        System.out.println("c "+c.amount);
    }

}
