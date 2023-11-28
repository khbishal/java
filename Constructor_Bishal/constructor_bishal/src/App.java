public class App {
    public static void main(String[] args) throws Exception {
        AddTwoDigits defaultAdder = new AddTwoDigits();
        defaultAdder.calculateSum();
        defaultAdder.displaySum();

        AddTwoDigits paramAdder = new AddTwoDigits(10, 20);
        paramAdder.calculateSum();
        paramAdder.displaySum();
}
} 
class AddTwoDigits {
        private int num1;
        private int num2;
        private int sum;

    public AddTwoDigits() {
        num1 = 0;
        num2 = 0;
    }

   
    public AddTwoDigits(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculateSum() {
        sum = num1 + num2;
    }

    public void displaySum() {
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

    

