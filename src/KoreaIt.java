import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface IBankAccount {
    void deposit(String accountNumber, double amount);
    void withdraw(String accountNumber, double amount);
}

class BankAccount implements IBankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        if (this.accountNumber.equals(accountNumber)){
            balance += amount;
            System.out.println("결과: 예금이 성공되었습니다.");
        }
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        if (this.accountNumber.equals(accountNumber)) {
            balance -= amount;
            System.out.println("결과: 출금이 성공되었습니다.");
        }
    }

    @Override
    public String toString() {
        return "계좌 번호: " + accountNumber + " / 계좌 소유주 이름: " + accountHolder + " / 현재 잔액: " + balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(String accountNumber, double amount) {
        super.deposit(accountNumber, amount);
        if (getAccountNumber().equals(accountNumber)) {
            double interest = amount * interestRate;
            super.deposit(accountNumber, interest);
        }
    }
}

class CheckingAccount extends BankAccount {
    private double chargeRate;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double chargeRate) {
        super(accountNumber, accountHolder, balance);
        this.chargeRate = chargeRate;
    }

    @Override
    public void withdraw(String accountNumber, double amount) {
        super.withdraw(accountNumber, amount);
        if (getAccountNumber().equals(accountNumber)) {
            double charge = amount * chargeRate;
            super.withdraw(accountNumber, charge);
        }
    }
}

public class KoreaIt {
    private static Map<String, BankAccount> accountMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.조회 | 6.종료");
            System.out.println("---------------------------------------------------------");
            System.out.print("선택> ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createrAcccount();
                    break;
                case 2:
                    viewAccountList();
                    break;
                case 3:
                    increaseBalance();
                    break;
                case 4:
                    decreaseBalance();
                    break;
                case 5:
                    viewAccount();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        } while (choice != 6);
    }

    private static void createrAcccount() {
        System.out.println("-------------------");
        System.out.println("계좌생성");
        System.out.println("-------------------");
        System.out.print("계좌종류: (1: 예금계좌, 2: 대출계좌): ");
        int accountType = scanner.nextInt();
        scanner.nextLine();

        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();

        if (accountMap.containsKey(accountNumber)) {
            System.out.println(accountNumber + "는 사용중인 계좌가 있습니다.");
            return;
        }

        System.out.print("계좌주: ");
        String accountHolder = scanner.nextLine();

        if (accountType == 1) {
            System.out.print("이자율: ");
            double interestRate = scanner.nextDouble();
            System.out.print("초기입금액: ");
            double initialDeposit = scanner.nextDouble();

            SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, initialDeposit, interestRate);
            accountMap.put(accountNumber, savingsAccount);
        } else if (accountType == 2) {
            System.out.print("수수료율: ");
            double chargeRate = scanner.nextDouble();
            System.out.print("초기대출액: ");
            double initialLoan = scanner.nextDouble();

            CheckingAccount checkingAccount = new CheckingAccount(accountNumber, accountHolder, initialLoan, chargeRate);
            accountMap.put(accountNumber, checkingAccount);
        }
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void viewAccountList() {
        System.out.println("----------------");
        System.out.println("계좌목록");
        System.out.println("----------------");
        for (BankAccount account : accountMap.values()) {
            System.out.println(account.toString());
        }
    }

    private static void increaseBalance() {
        System.out.println("-----------------");
        System.out.println("예금");
        System.out.println("-----------------");
        System.out.println("계좌번호: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("예금액: ");
            double amount = scanner.nextDouble();
            account.deposit(accountNumber, amount);
        }
    }

    private static void decreaseBalance() {
        System.out.println("----------------------");
        System.out.println("출금");
        System.out.println("----------------------");
        System.out.println("계좌번호: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("출금액: ");
            double amount = scanner.nextDouble();
            account.withdraw(accountNumber, amount);
        }
    }

    private static void viewAccount() {
        System.out.println("----------------------");
        System.out.println("조회");
        System.out.println("----------------------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            System.out.println(account.toString());
        }
    }

    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountMap.values()) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("해당하는 계좌를 찾을 수 없습니다.");
        return null;
    }
}