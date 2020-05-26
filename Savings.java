public class Savings extends Account {
  // list specific properties
  private int safetyDepositBoxId, safetyDepositBoxKey;

  // constructor
  public Savings(String name, String ssn, double deposit) {
    super(name, ssn, deposit);
    accountNum = "2" + accountNum;
    setBoxNum();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() - .25;
  }

  // list specific methods

  private void setBoxNum() {
    safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
    safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
  }

  public void showInfo() {
    System.out.println("Account Type: Savings");
    super.showInfo();
    System.out.println("Your Savings Account features" + "\n  Safety Deposit Box ID: " + safetyDepositBoxId
        + "\n  Safety Deposit Box Key: " + safetyDepositBoxKey);
  }
}