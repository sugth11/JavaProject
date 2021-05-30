package exceptionPackage;

import java.util.Scanner;

public class LowBalanceException extends Exception{
    public String toString(){
        return "Minimum deposit of rs.5000 is required for bank to get open your account";
    }
    public static class MoneyManagaement{
        int money;
        public int getMoney() {
            return money;
        }
        public void setMoney(int money) throws LowBalanceException {
            if(money<=5000){
                throw new LowBalanceException();
            }
            this.money = money;
            System.out.println("your money of Rs. "+this.money + " is deposited and your account is opened successfully!");
        }
        public void withdrawal(int withdrawMoney) throws LowBalanceException {
            this.money-= withdrawMoney;
            if(this.money<5000) {
                throw new LowBalanceException();
            }
        }
        public int showBalance() throws Exception{
            if(this.money<5000){
                throw new Exception("balance is lower than bank limit");
            }
            System.out.println(this.money);
            return this.money;
        }



    }
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.println("Please deposit money to get your account opened! ");
        int getMoney = money.nextInt();
        MoneyManagaement mony =new MoneyManagaement();
        try{mony.setMoney(getMoney);
            System.out.println("Do you want to with draw money?: yes/no");
           String is =  money.next();
            String s = "yes";
            if(is.equals(s)){
                System.out.println("Please enter the amount");
                int withdrawAmount = money.nextInt();
                try {
                    mony.withdrawal(withdrawAmount);
                    System.out.println("my balance amount is "+mony.showBalance());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else{
                try {
                    System.out.println("my balance amount is "+mony.showBalance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (LowBalanceException e) {
            e.printStackTrace();
        }


    }
}
