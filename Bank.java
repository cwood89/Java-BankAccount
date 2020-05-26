import java.util.LinkedList;
import java.util.List;

public class Bank {
  public static void main(String[] args) {
    // Checking check1 = new Checking("Chris Wood", "234952340", 30000);
    // Savings savings1 = new Savings("Leia Wood", "162026693", 15000);
    // check1.showInfo();
    // System.out.println("**************");
    // savings1.showInfo();
    // savings1.deposit(5000);
    // savings1.withdraw(2500);
    // savings1.transfer("Brokerage", 2500);
    // savings1.compound();

    // read csv files and create accounts based on that data

    List<Account> accounts = new LinkedList<Account>();

    String file = "/home/chris/Documents/javaBankAccount/original.csv";
    List<String[]> newAccountHolders = utilities.CSV.read(file);
    for (String[] accountHolder : newAccountHolders) {
      String name = accountHolder[0];
      String ssn = accountHolder[1];
      String accountType = accountHolder[2];
      double deposit = Double.parseDouble(accountHolder[3]);
      // System.out.println(name + " " + ssn + " " + accountType + " " + deposit);
      if (accountType.equals("Checking")) {
        accounts.add(new Checking(name, ssn, deposit));
      } else if (accountType.equals("Savings")) {
        accounts.add(new Savings(name, ssn, deposit));
      } else {
        System.out.println("Invalid account type.");
      }
      for (Account acc : accounts) {
        acc.showInfo();
        System.out.println("\n");
      }
    }

  }
}