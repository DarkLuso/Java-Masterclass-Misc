import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        InputChallenge.printTheSum();
//        MinAndMax.minAndMaxInput();
//        Bank bank = new Bank();
//        bank.setBalance(699.99);
//        bank.setAccountNumber("123");
//        bank.setCustomerName("rob");
//        bank.deposit(0.01,"rob","123");
//        System.out.println(bank.getBalance());
//        bank.withdraw(100,"bob","123");
//        System.out.println(bank.getBalance());
//        VipCostumer vip = new VipCostumer("bob",2000);
//        System.out.println(vip.getName());
//        System.out.println(vip.getCreditLimit());
//        System.out.println(vip.getEmail());
//        Burger x = new Burger("milho","bacon",5.40,"FLAVIO'S FURY");
//        x.addAdditional(true,true,true,false);
//        x.getPrice();
//        HealthyBurger healthyBurger = new HealthyBurger("Chicken",4.50);
//        healthyBurger.addAdditional(false,true,false,false,true,false);
//        healthyBurger.getPrice();
//        DeluxeBurger sas = new DeluxeBurger();
//        sas.addAdditional(true,true,true,true);
//        sas.getPrice();
//        ArraysChallenge array = new  ArraysChallenge();
//        array.printArray();
//        array.getIntegers(8);
//        array.printArray();
//        array.sortIntegers();
//        array.printArray();
//        int[] array = MinimumChallenge.readIntegers(9);
//        System.out.println(MinimumChallenge.findMin(array));
//        MobilePhone myPhone = new MobilePhone();
//        myPhone.addContact("Johnny","51 999223478");
//        myPhone.addContact("CJ","51 997788345");
//        myPhone.addContact("Johnny","51 999223478");
//        MobilePhone myPhone = new MobilePhone();
//        myPhone.startPhone();
//        LinkedList<String> myLinkedList = new LinkedList<>();
//        myLinkedList.add("1");
//        myLinkedList.add("3");
//        myLinkedList.add("4");
//        myLinkedList.add("5");
//        myLinkedList.add("6");
//
//
//        Iterator<String> myIterator = myLinkedList.iterator();
//
//        while (myIterator.hasNext()){
//            System.out.println(myIterator.next());
//        }
//
//        myLinkedList.add(1,"2");
//
//        for (String s : myLinkedList){
//            System.out.println(s);
//
//
//        }
//        Player jack = new Player("Jack",13,12);
//        saveObject(jack);
//        System.out.println(jack.toString());
//        loadObject(jack);
//        saveObject(jack);
//        MyLinkedList myLinkedList = new MyLinkedList(null);
//        myLinkedList.traverse(myLinkedList.getRoot());
//        int number = 5;
//        System.out.println(series.fibonacci(number));
//        System.out.println(series.factorial(number));
//        System.out.println(series.nSum(number));

        X.x(X.x());

   }


   public static ArrayList<String> readValues (){

        ArrayList<String> values = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
       boolean quit = false;
       int index = 0;
       System.out.println("Chose \n" +
               "Press 1 to enter a String \n" +
               "Press 2 to quit");
       while (!quit){
           System.out.println("Chose a Option ");
           int choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice){
               case 1:
                   System.out.println("Enter a string: ");
                   String stringInput = scanner.nextLine();
                   values.add(index, stringInput);
                   index++;
                   break;
               case 2:
                   quit = true;
                   break;
           }
       }

       return values;

   }

   public static void saveObject (ISaveable objectToSave){
        for (int i = 0; i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
   }

   public static void loadObject (ISaveable objectToLoad){
        ArrayList<String> value = readValues();
        objectToLoad.read(value);

   }

}
