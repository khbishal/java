Zpublic class App {
    public static void main(String[] args) throws Exception {
        int i, fact = 1;
        int num = 7;

        for(i=1; i<=num; i++){
            fact=fact*i;
        }
            System.out.println("Factorial of"+num+" is:" +fact);
    }
}
