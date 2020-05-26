import java.util.List;

import javax.swing.text.Utilities;

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

    String file = "/home/chris/Documents/javaBankAccount/original.csv";
    List<String[]> newAccountHolders = utilities.CSV.read(file);
    for (String[] accountHolder : newAccountHolders) {

    }

  }
}