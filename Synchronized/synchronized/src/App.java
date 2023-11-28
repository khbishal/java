public class App {
    public static void main(String[] args) throws Exception {
      Customer c=new Customer();
      Thread t1 = new Thread(){
        public void run(){
            c.withdraw(15000);
        }
      };
        t1.start();
      Thread t2 = new Thread(){
        public void run(){
            c.deposit(10000);
        }
      };
      t2.start();
    }
}
class Customer{
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw");
        if(this.amount<amount){
            System.out.println("less balance; waiting for deposite");
            try{
                wait();
            }catch(Exception e){
                this.amount-=amount;
                System.out.println("withdraw completed...");
            }
            synchronized void deposit(int amount){
                System.out.println("going to deposite");
                this.amount+=amount;
                System.out.println(deposite completed...);
                notify();
            }
        }
    }
}