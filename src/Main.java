public class Main {

    public static void main(String[] args) {

       // InputChallenge.printTheSum();
       // MinAndMax.minAndMaxInput();
        Bank bank = new Bank();
        bank.setBalance(699.99);
        bank.setAccountNumber("123");
        bank.setCustomerName("rob");
        bank.deposit(0.01,"rob","123");
        System.out.println(bank.getBalance());
        bank.withdraw(100,"bob","123");
        System.out.println(bank.getBalance());

    }

}
