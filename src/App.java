
public class App {
    public static void main(String[] args) throws Exception {
        // // Classes
        // User user = new User("ali ahmed");
        // user.sayHello();


        // // Interface: An interface is a contract that specifies the capabilities that a class shoud provide. With interfaces we can build loosely coupled applications
        // AhmedRazaShef ahmedRaza = getAhmedRazaShef();
        // ahmedRaza.ratting();

        // AliAhmedShef aliahmed = getAliAhmedShef();
        // aliahmed.ratting();

        
        // Encapsulation
        var account = new Account();
        account.deposit(50);
        account.withdraw(30);
        account.getBalance();
    }

    // // Interface
    // public static AhmedRazaShef getAhmedRazaShef(){
    //     return new AhmedRazaShef();
    // }

    // public static AliAhmedShef getAliAhmedShef(){
    //     return new AliAhmedShef();
    // }
}
