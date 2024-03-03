public class Account {
    private float balance;

    public void deposit(float amount){
        if(amount > 0){
            balance+= amount;
        }
    }
    public void withdraw(float amount){
        if(balance > amount){
            balance = balance - amount;
        }
    }
    public void setBalance(float balance){
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("Balance added successfully.");
        }
        else{
            System.out.println("Balance can't be negative");
        }
    }

    public void getBalance(){
        System.out.println(balance);
    }
}
