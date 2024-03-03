
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

        
        // // Encapsulation
        // var account = new Account();
        // account.deposit(50);
        // account.withdraw(30);
        // account.getBalance();


        // // Abstraction: Reduce complexity by hiding unnecessary details
        // var mailService = new MailService();
        // mailService.sendEmail();


        // // Inheritance: is the mechanism that allows us to reuse code across our classes
        // var textBox = new TextBox();
        // textBox.enable();


        // Polymorphism: poly mean many, morph mean form. Many forms: Ability of an object to take many forms
        drawUiControl(new TextBox());
        drawUiControl(new CheckBox());


    }

    // // Interface
    // public static AhmedRazaShef getAhmedRazaShef(){
    //     return new AhmedRazaShef();
    // }

    // public static AliAhmedShef getAliAhmedShef(){
    //     return new AliAhmedShef();
    // }


    // Polymorphism
    public static void drawUiControl(UiControl control){
        control.draw();
    }
}
