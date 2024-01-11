/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Sri Lanka
 */
public class Coursework5part1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        L1:do{
            
        System.out.println("                                              __  ______  ________ _________        ");
        System.out.println("                                             |  \\/      \\|        |         \\    ");
        System.out.println("                                              \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$      ");
        System.out.println("                                             |  | $$   \\$| $$__      | $$          ");
        System.out.println("                                             | $| $$     | $$  \\     | $$          ");
        System.out.println("                                             | $| $$   __| $$$$$     | $$           ");
        System.out.println("                                             | $| $$__/  | $$_____   | $$           ");
        System.out.println("                                             | $$\\$$    $| $$     \\  | $$         ");
        System.out.println("                                              \\$$ \\$$$$$$ \\$$$$$$$$   \\$$       ");
        
        System.out.println(" ");
        
        System.out.println("   ______           __    __     _____            _        _____  _    _  _                _______   _____   _____                     ");
        System.out.println("  |__  __|    /\\    \\ \\  / /    / ____|    /\\    | |      / ____|| |  | || |         /\\   |__   __| / ___ \\ |  __ \\             ");
        System.out.println("     | |     /  \\    \\ \\/ /    | |        /  \\   | |     | |     | |  | || |        /  \\     | |   | |   | || |__) |              ");
        System.out.println("     | |    / /\\ \\    >  <     | |       / /\\ \\  | |     | |     | |  | || |       / /\\ \\    | |   | |   | ||  _  /              ");
        System.out.println("     | |   / ____ \\  / /\\ \\    | |____  / ____ \\ | |____ | |____ | |__| || |____  / ____ \\   | |   | |___| || | \\ \\             ");
        System.out.println("     |_|  /_/    \\_\\/_/  \\_\\    \\_____|/_/    \\_\\|______| \\_____| \\____/ |______|/_/    \\_\\  |_|    \\_____/ |_|  \\_\\     ");
        
        System.out.println(" ");
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("[1] Withholding Tax");
        System.out.println("[2] Payable Tax");
        System.out.println("[3] Income Tax");
        System.out.println("[4] Social Security Contribution levy (SSCL) Tax");
        System.out.println("[5] Leasing Payment");
        System.out.println("[6] Exit");
        
        System.out.println(" ");
        
        do{

        System.out.print("Enter an option to continue -> ");
        int num = input.nextInt();
        
        if(num == 1){
            Scanner sc1 = new Scanner(System.in);
            
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            System.out.println("|                                                            WITHHOLDING TAX                                                               |");
            System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            
            System.out.println(" ");
            
            System.out.println("[1] Rent Tax ");
            System.out.println("[2] Bank Interest Tax ");
            System.out.println("[3] Dividend Tax ");
            System.out.println("[4] Exit ");
            
            System.out.println(" ");
            
            WithHoldingLoop:do{
            
            System.out.print("Enter an option to continue -> ");
            int num1 = sc1.nextInt();
            
            if(num1==1){
                    Scanner one = new Scanner(System.in);
                    System.out.println(" ");
                    
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                                                               RENT TAX                                                                   |");
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println(" ");
                    
                    Rent:do{
                    
                    System.out.print("Enter your rent : ");
                    double rent = one.nextDouble();
                    System.out.println(" ");
                    
                    if(rent >= 100000){
                        double RentTax = (((rent - 100000)*10)/100);
                        System.out.println("You have to pay Payble Tax per month : " + RentTax);
                        }
                    else if(rent < 100000 && rent >=0){
                        System.out.println("             You don't have to pay Payble Tax...");
                        }
                    else if(rent <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Rent;
                                            }
                                            case "y" -> {
                                                continue Rent;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue Rent;
                            }
                            case "y" -> {
                                continue Rent;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
                    
                    }while(true);
            
            }
            
            else if(num1==2){
                    Scanner two = new Scanner(System.in);
                    System.out.println(" ");
                    
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                                                           BANK INTEREST TAX                                                              |");
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println(" ");
                    
                    BankInterest:do{
                    
                        System.out.print("Enter your bank interest per year            : ");
                        double bank = two.nextDouble();
                        System.out.println(" ");
                        
                        if(bank >= 0){
                            double BankTax =(bank * 5) / 100;
                            System.out.print("You have to pay bank interest Tax per year   : " + BankTax);
                            }
                        else if(bank <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue BankInterest;
                                            }
                                            case "y" -> {
                                                continue BankInterest;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                        
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue BankInterest;
                            }
                            case "y" -> {
                                continue BankInterest;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
                        
                    }while(true);
            }
            
            else if(num1==3){
                    Scanner three = new Scanner(System.in);
                    System.out.println(" ");
                    
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                                                              DIVIDEND TAX                                                                |");
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println(" ");
                    
                    Dividend:do{
                    
                        System.out.print("Enter your total dividend per year        : ");
                        double devidend = three.nextDouble();
                        System.out.println(" ");
                        
                        if(devidend >= 100000){
                            double DividendTax = ((devidend-100000)*14)/100;
                            System.out.print("You have to pay Dividend Tax per year     : " + DividendTax);
                        }
                        else if(devidend < 100000 && devidend >=0){
                            System.out.println("            You don't have to pay Dividend Tax... ");
                        }
                        else if(devidend <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Dividend;
                                            }
                                            case "y" -> {
                                                continue Dividend;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                        
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue Dividend;
                            }
                            case "y" -> {
                                continue Dividend;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
                        
                    }while(true);
            }
            
            else if(num1==4){
                    System.out.println(" ");
                    System.out.println("              Thank you!!!");
                    }
            
            else if(num1!=-1){
                System.out.println("            Invalid input...");
            }
                System.out.println("      Invalid Input...");
        }while(true);
        }  
        
        else if(num==2){
        Scanner sc2 = new Scanner(System.in);
        
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                              PAYABLE TAX                                                                 |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            
        System.out.println(" ");
        
        Payable:do{
        
        System.out.print("Enter your employee payment per month : ");
        double payment = sc2.nextDouble();
        System.out.println("  ");
        
            if (payment >= 1000000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (100000*36)/100;
            double Tax8 = (100000*36)/100;
            double Tax9 = (100000*36)/100;
            double Tax10 = (100000*36)/100;
            double Tax11 = (100000*36)/100;
            double Tax12 = (((payment - 308333)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7+Tax8+Tax9+Tax10+Tax11+Tax12));
        }
        else if(payment >= 900000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (100000*36)/100;
            double Tax8 = (100000*36)/100;
            double Tax9 = (100000*36)/100;
            double Tax10 = (150000*36)/100;
            double Tax11 = (((payment - 900000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7+Tax8+Tax9+Tax10+Tax11));
        }
        else if(payment >= 750000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (100000*36)/100;
            double Tax8 = (100000*36)/100;
            double Tax9 = (100000*36)/100;
            double Tax10 = (((payment - 750000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7+Tax8+Tax9+Tax10));
        }
        else if(payment >= 650000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (100000*36)/100;
            double Tax8 = (100000*36)/100;
            double Tax9 = (((payment - 650000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7+Tax8+Tax9));
        }
        else if(payment >= 550000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (100000*36)/100;
            double Tax8 = (((payment - 550000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7+Tax8));
        }
        else if(payment >= 450000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (100000*36)/100;
            double Tax7 = (((payment - 450000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6+Tax7));
        }
        else if(payment >= 350000){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (41667*36)/100;
            double Tax6 = (((payment - 350000)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5+Tax6));
        }
        else if(payment >= 308333){
            double Tax = (41667*6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (41667*30)/100;
            double Tax5 = (((payment - 308333)*36)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4+Tax5));
        }
        else if(payment >= 266667){
            double Tax = (41667 *6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (41667*24)/100;
            double Tax4 = (((payment - 266667)*30)/100)+0.1;
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3+Tax4));
        }
        else if(payment >= 225000){
            double Tax = (41667 *6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (41667*18)/100;
            double Tax3 = (((payment - 225000)*24)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2+Tax3));
        }
        else if(payment >= 183333){
            double Tax = (41667 *6)/100;
            double Tax1 = (41667*12)/100;
            double Tax2 = (((payment - 183333)*18)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1+Tax2));
        }
        else if(payment >= 141667){
            double Tax = (41667 *6)/100;
            double Tax1 = (((payment - 141667)*12)/100);
            System.out.println("You have to pay Payble Tax per month : " + (Tax+Tax1));
        }
        else if(payment >= 100000){
            double Tax = (((payment - 100000)*6)/100);
            System.out.println("You have to pay Payble Tax per month : " + Tax);
        }
        else if(payment < 100000 && payment >=0){
            System.out.println("            You don't have to pay Payble Tax...");
        }
            
            else if(payment <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Payable;
                                            }
                                            case "y" -> {
                                                continue Payable;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                        
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue Payable;
                            }
                            case "y" -> {
                                continue Payable;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
            
        }while(true);
        }
        else if(num==3){ 
            Scanner sc3 = new Scanner(System.in);
        
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                               INCOME TAX                                                                 |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            
        System.out.println(" ");
        
        Income:do{
        
        System.out.print("Enter your total income per year     : ");
        double income = sc3.nextDouble();
        System.out.println("  ");
        
        if(income >= 3700000){
            double tax1 = (500000*6)/100;
            double tax2 = (500000*12)/100;
            double tax3 = (500000*18)/100;
            double tax4 = (500000*24)/100;
            double tax5 = (500000*30)/100;
            double tax6 = ((income - 3700000)*36)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1+tax2+tax3+tax4+tax5+tax6));
        }
        else if(income >= 3200000){
            double tax1 = (500000*6)/100;
            double tax2 = (500000*12)/100;
            double tax3 = (500000*18)/100;
            double tax4 = (500000*24)/100;
            double tax5 = ((income - 3200000)*30)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1+tax2+tax3+tax4+tax5));
        }
        else if(income >= 2700000){
            double tax1 = (500000*6)/100;
            double tax2 = (500000*12)/100;
            double tax3 = (500000*18)/100;
            double tax4 = ((income - 2700000)*24)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1+tax2+tax3+tax4));
        }
        else if(income >= 2200000){
            double tax1 = (500000*6)/100;
            double tax2 = (500000*12)/100;
            double tax3 = ((income - 2200000)*18)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1+tax2+tax3));
        }
        else if(income >= 1700000){
            double tax1 = (500000*6)/100;
            double tax2 = ((income - 1700000)*12)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1+tax2));
        }
        else if(income >= 1200000){
            double tax1 = ((income - 1200000)*6)/100;
            System.out.println("You have to pay Income Tax per year  : " + (tax1));
        }
        else if(income < 1200000 && income >=0){
            System.out.println("          You don't have to pay Income Tax... " );
        }
        
        else if(income <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Income;
                                            }
                                            case "y" -> {
                                                continue Income;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                        
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
                        System.out.println(" ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue Income;
                            }
                            case "y" -> {
                                continue Income;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
        
        }while(true);
                }
        else if(num==4){
            Scanner sc4 = new Scanner(System.in);
        
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                             SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX                                                 |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            
        System.out.println(" ");
        
        SocialLevy:do{
        
        System.out.print("Enter value of Good or Service  : ");
        double sscl = sc4.nextDouble();
        System.out.println("  ");
        
        if(sscl >= 0){
            //Step1
            double saletax = (sscl*2.5)/100;
            double valueofgoods = sscl + saletax;
            //Step2
            double vat = (valueofgoods*15)/100;
            double total = vat + saletax;
            System.out.println("You have to pay SSCL Tax        : " + total);
        }
        
        else if(sscl <0){
                            
                            do{
                                System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue SocialLevy;
                                            }
                                            case "y" -> {
                                                continue SocialLevy;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                            }while(true);
                        }
                        
                    do{
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
                        String YNyn = input.next();
                        switch (YNyn) {
                            case "Y" -> {
                                continue SocialLevy;
                            }
                            case "y" -> {
                                continue SocialLevy;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
        
        }while(true);
                }
        else if(num==5){
            Scanner sc5 = new Scanner(System.in);
        
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                             Leasing Payment                                                              |");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
            
        LeasingPayment:do{
        
        System.out.println(" ");
        
            System.out.println("[1] Calculate Monthly Installment ");
            System.out.println("[2] Search Leasing Category ");
            System.out.println("[3] Find Leasing Amount ");
            System.out.println("[4] Exit ");
            
            System.out.println(" ");
            
            System.out.print("Enter an option to continue -> ");
            int num2 = sc5.nextInt();
            
            if(num2==1){ 
                    Scanner One = new Scanner(System.in);
                    System.out.println(" ");
                    
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                                                          Calculate Leasing Payment                                                       |");
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println(" ");
                    
                    double A1=0;
                    double i1=0;
                    double n1=0;
                    
                    Payment:do{
                    
                    System.out.print("Enter lease amount         : ");
                    A1 = One.nextDouble();
                    
                    if(A1<0){
                         do{
                        System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Payment;
                                            }
                                            case "y" -> {
                                                continue Payment;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                    
                    Interest:do{
                        
                    System.out.println(" ");    
                    System.out.print("Enter annual interest rate : ");
                    double intrate1 = One.nextDouble();
                    if(intrate1>=0){
                        i1 = intrate1/1200;
                    }
                    else if(intrate1<0){
                         do{
                        System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Interest;
                                            }
                                            case "y" -> {
                                                continue Interest;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                    
                    Year:do{
                    
                    System.out.println(" ");
                    System.out.print("Enter number of year       : ");
                    double year = One.nextDouble();
                    
                    if(year<0 || year>5){
                         do{
                        System.out.println("      Invalid number of year...Enter the correct value again... ");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Year;
                                            }
                                            case "y" -> {
                                                continue Year;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                    
                    else if(year>=0 && year<=5){
                       n1 = year*12;
                    }
                    
                    
                    System.out.println(" ");
                    double MonthlyInstallment = A1*i1/(1-(1/Math.pow((1+i1),n1)));
                    
                    System.out.print("Your monthly instalment    : " + MonthlyInstallment);
                    
                    do{
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
                        String YNyn = input.next();
                        
                        System.out.println(" ");
                        switch (YNyn) {
                            case "Y" -> {
                                continue Payment;
                            }
                            case "y" -> {
                                continue Payment;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
                    
                    }while(true);
                    }while(true);
                    }while(true);
                    }
                    
                    
            else if(num2==2){
                    Scanner Two = new Scanner(System.in);
                    System.out.println(" ");
                    
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println("|                                                           Search Leasing Category                                                        |");
                    System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                    System.out.println(" ");
                    
                    double A2=0;
                    double i2=0;
                    
                    Category:do{
                    
                    System.out.print("Enter lease amount         : ");
                    A2 = Two.nextDouble();
                    System.out.println(" ");
                    
                    if(A2<0){
                         do{
                        System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Category;
                                            }
                                            case "y" -> {
                                                continue Category;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                    
                    Interest1:do{
                    
                    System.out.print("Enter annual interest rate : ");
                    double intrate2 = Two.nextDouble();
                    if(intrate2>=0){    
                        i2 = intrate2/1200;
                        }
                        else if(intrate2<0){
                         do{
                        System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Interest1;
                                            }
                                            case "y" -> {
                                                continue Interest1;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                    
                    System.out.println(" ");
                            double n2 = 3*12;
                            double n21 = 4*12;
                            double n22 = 5*12;
                    
                            double MonthlyInstallment1 = A2*i2/(1-(1/Math.pow((1+i2),n2)));
                            double MonthlyInstallment2 = A2*i2/(1-(1/Math.pow((1+i2),n21)));
                            double MonthlyInstallment3 = A2*i2/(1-(1/Math.pow((1+i2),n22)));
                    
                            System.out.println("Your monthly instalment for 3 year leasing plan - " + MonthlyInstallment1);
                            System.out.println("Your monthly instalment for 4 year leasing plan - " + MonthlyInstallment2);
                            System.out.println("Your monthly instalment for 5 year leasing plan - " + MonthlyInstallment3);
                    
                    do{
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another Leasing Category (Y/N) : ");
                        String YNyn = input.next();
                        
                        System.out.println(" ");
                        switch (YNyn) {
                            case "Y" -> {
                                continue Category;
                            }
                            case "y" -> {
                                continue Category;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                    }while(true);
                    }while(true);
                    }while(true);
                    }
                    
            else if(num2==3){
                        Scanner Three = new Scanner(System.in);
                        System.out.println(" ");
                        
                        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                        System.out.println("|                                                            Find Leasing Amount                                                           |");
                        System.out.println("+------------------------------------------------------------------------------------------------------------------------------------------+");
                        System.out.println(" ");
                        
                        double A3=0;
                        double n3=0;
                        double i3=0;
                        
                        Amount:do{
                        
                        System.out.print("Enter the monthly lease payment amount you can afford         : ");
                        A3 = Three.nextDouble();
                        System.out.println(" ");
                        
                        if(A3<0){
                         do{
                        System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Amount;
                                            }
                                            case "y" -> {
                                                continue Amount;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                    }
                        
                        Year3:do{
                        
                        System.out.println(" ");
                        System.out.print("Enter number of year                                          : ");
                        double Year = Three.nextDouble();
                        
                        if(Year<0 || Year>5){
                            do{
                        System.out.println("      Invalid number of year...Enter the correct value again... ");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Year3;
                                            }
                                            case "y" -> {
                                                continue Year3;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                            
                        }
                        
                        else if(Year>=0 || Year<=5){
                            n3 = Year*12;
                        }
                        System.out.println(" ");
                        
                        Interest2:do{
                        
                        System.out.print("Enter annual interest rate                                    : ");
                        double intrate3 = Three.nextDouble();
                        if(intrate3>=0){
                            i3 = intrate3/1200;
                            System.out.println(" ");
                        } 
                        else if(intrate3<0){
                           do{ 
                            System.out.println("      Invalid Input...");
                                System.out.println(" ");
                                System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    String YNyn = input.next();
                                        switch (YNyn) {
                                            case "Y" -> {
                                                continue Interest2;
                                            }
                                            case "y" -> {
                                                continue Interest2;
                                            }
                                            case "N" -> {
                                                continue L1;
                                            }
                                            case "n" -> {
                                                continue L1;
                                            }
                                            default -> System.out.println("      Invalid Input...");
                                        }
                        }while(true);
                        }
                        
                        double ttotal1 = Math.pow((1+i3),n3);
                        double ttotal2 = (1/ttotal1);
                        double ttotal3 = (1-ttotal2);
                        double ttotal4 = (A3*ttotal3);
                        double MonthlyInstallment33 = (ttotal4 / i3)+0.3;
                        
                        System.out.print("You can get Lease Amount                                      : " + MonthlyInstallment33);
                        
                        do{
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.print("Do you want to calculate another monthly instalment (Y/N) : ");
                        String YNyn = input.next();
                        
                        System.out.println(" ");
                        switch (YNyn) {
                            case "Y" -> {
                                continue Amount;
                            }
                            case "y" -> {
                                continue Amount;
                            }
                            case "N" -> {
                                continue L1;
                            }
                            case "n" -> {
                                continue L1;
                            }
                            default -> System.out.println("      Invalid Input...");
                        }
                         
                        }while(true);
                     
                        }while(true);
                        }while(true);
                    }while(true);
                   }
                    
            else if(num2==4){ 
                System.out.println("        Thank you!!!");
                }
            }while(true);
            
        }
        else if(num==6){
            System.out.println("     Thank you!!!...");
            System.exit(0);
            
        }
            System.out.println("        Invalid Input...");
        } while(true);
        
        }while(true);
        }
    }

