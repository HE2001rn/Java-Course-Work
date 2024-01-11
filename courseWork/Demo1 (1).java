
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author hesha
 */
public class Demo1 {
    public static Scanner sc = new Scanner(System.in);
    
    public static double amount=0;
    public static int Qty=0;
    public static String Sz;
    public static String newOrderId;
    public static String phonenumber;
    
    public static String[] orderIds = new String[0];
    public static String[] customerIds = new String[0];
    public static String[] sizes = new String[0];
    public static int[] qty = new int[0];
    public static String[] status = new String[0];
    public static double[] total = new double[0];
    
    public static int[] qtyArray=new int[6];
    public static double[] NewAmount=new double[6];
    
    public static String[] Status = {"processing","delevering","deleverd"};
    public static String[] allSizes={"XS","S","M","L","XL","XXL"};
    
    public static int[] XS = new int[0];
    public static int[] S = new int[0];
    public static int[] M = new int[0];
    public static int[] L = new int[0];
    public static int[] XL = new int[0];
    public static int[] XXL = new int[0];
    
    public static final double xs = 600.00;
    public static final double s = 800.00;
    public static final double m = 900.00;
    public static final double l = 1000.00;
    public static final double xl = 1100.00;
    public static final double xxl = 1200.00;
    
    public static void extendArray(){
        String[] tempOrderID = new String[orderIds.length+1];
        String[] tempContact = new String[orderIds.length+1];
        String[] tempSize = new String[orderIds.length+1];
        int[] tempQTY = new int[orderIds.length+1];
        String[] tempStatus = new String[orderIds.length+1];
        double[] tempTotal = new double[orderIds.length+1];
        
        for (int i = 0; i < orderIds.length ; i++) {
            tempOrderID[i]=orderIds[i];
            tempContact[i]=customerIds[i];
            tempSize[i]=sizes[i];
            tempQTY[i]=qty[i];
            tempStatus[i]=status[i];
            tempTotal[i]=total[i];
        }
        
        orderIds=tempOrderID;
        customerIds=tempContact;
        sizes=tempSize;
        qty=tempQTY;
        status=tempStatus;
        total=tempTotal;
        
    }
    public static String[] extendStringArray(String[] sr){
		String[] temp = new String[sr.length+1];
		
		for (int i = 0; i < sr.length; i++){
			temp[i] = sr[i];
		}
		
		return temp;
	}

    public static void sort(int[] ar){
        for (int j = 0; j < ar.length-1; j++){
            for (int i = 0; i < (ar.length-1)-j; i++){
                if (ar[i]<ar[i+1]){
                    int temp = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = temp;
                }
//System.out.println(Arrays.toString(ar));
            }
        }
    }

    
    public static void print(){
    
        System.out.println("""
                           \t /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          
                           \t| $$_____/                | $$      |__/                           /$$__  $$| $$                          
                           \t| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ 
                           \t| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$
                           \t| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$
                           \t| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$
                           \t| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/
                           \t|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ 
                           \t                                                                                                | $$      
                           \t                                                                                                | $$      
                           \t                                                                                                |__/     
                           \t-----------------------------------------------------------------------------------------------------------
                           \t""");
        
        System.out.println("                [1] Place Order                                       [2] Search Customer ");
        System.out.println("                [3] Search Order                                      [4] View Reports ");
        System.out.println("                [5] Change Order Status                               [6] Delete Order ");
        System.out.println(" \t \t");
        
        System.out.print("Input Option : ");
        int input=sc.nextInt();
        
        switch(input){
            case 1:
                Place_Order();
                break;
            case 2:
                Search_Customer();
                break;
                
            case 3:
                Search_Order();
                break;  
               
            case 4:
                Reports();
                break;   
                
            case 5:
                Change_Order_Status();
                break;
                
            case 6:
                Delete_Order();
                break;
                
            default :
                System.out.println("                 Invalid input...");
                break;
        }
    }
    
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
                if (os.contains("Windows")) {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    }
            } 
            catch (final Exception e) {
                e.printStackTrace();
            }
        }

    
    public static String generateid(){
        if (orderIds.length > 0) {
            String ID = orderIds[orderIds.length-1];
            int lastNumber = Integer.parseInt(ID.split("#")[1]);
            lastNumber++;
            return String.format("ORD#%05d", lastNumber);
        }
        return "ORD#00001";
    }
    
    public static void Place_Order(){
        clearConsole();
        System.out.println("""
                            \t _____  _                   ____          _           
                            \t|  __ \\| |                 / __ \\        | |          
                            \t| |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ 
                            \t|  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                            \t| |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   
                            \t|_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|
                            \t
                            \t=========================================================                                                     
                                                                                  """);
        placeOrder:while(true){
            
        newOrderId=generateid();
        System.out.print("Enter Order ID : " + newOrderId);
        System.out.println();
        
        System.out.print("Enter Coustomer Phone Number : ");
            phonenumber = sc.next();
            
            if (phonenumber.charAt(0) !='0' || phonenumber.length() !=10) {
                System.out.println("\t\tInvalid Phone number.. Try again \n");
                L1:do{
                System.out.print("Do you want to enter phone number again? (y/n) :");
                char YN = sc.next().charAt(0);
                switch(YN){
                    case 'y'->{
                        continue placeOrder;
                    }
                    case 'n'->{
                        print();
                    }
                    default -> {
                        System.out.println("            Invalid Request....");
                        continue L1;
                    }
                }
                }while(true);
            }
            
        OUTER:
        do {
            System.out.print("Enter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
            Sz = sc.next();
            
            if (null == Sz) {
                System.out.println("          Invalid Size...");
                continue OUTER;
                
            } 
            else {
                
                switch (Sz) {
                    
                    case "XS":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        else{
                            amount=Qty*xs;
                            qtyArray[0]=Qty;
                            NewAmount[0]=amount;
                            for (int i = 0; i < XS.length; i++) {
                                XS[i] =Sz.length();
                            }
                        }
                        break OUTER;
                    case "S":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        amount=Qty*s;
                        qtyArray[1]=Qty;
                        NewAmount[1]=amount;
                        for (int i = 0; i < S.length; i++) {
                            S[i] =Sz.length();
                        }
                        break OUTER;
                    case "M":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        amount=Qty*m;
                        qtyArray[2]=Qty;
                        NewAmount[2]=amount;
                        for (int i = 0; i < M.length; i++) {
                            M[i] =Sz.length();
                        }
                        break OUTER;
                    case "L":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        amount=Qty*l;
                        qtyArray[3]=Qty;
                        NewAmount[3]=amount;
                        for (int i = 0; i < L.length; i++) {
                            L[i] =Sz.length();
                        }
                        break OUTER;
                    case "XL":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        amount=Qty*xl;
                        qtyArray[4]=Qty;
                        NewAmount[4]=amount;
                        for (int i = 0; i < XL.length; i++) {
                            XL[i] =Sz.length();
                        }
                        break OUTER;
                    case "XXL":
                        Quantity();
                        if (Qty <= 0) {
                            System.out.println("               Invalid quantity...");
                        }
                        amount=Qty*xxl;
                        qtyArray[5]=Qty;
                        NewAmount[5]=amount;
                        for (int i = 0; i < XXL.length; i++) {
                            XXL[i] =Sz.length();
                        }
                        break OUTER;
                }
            }
        } while (true);
        
                System.out.printf("\t amount : %.2f",amount);
                System.out.println(" ");
                
                placeorder();
                
                another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to place another order? (y/n) : ");
                String input2 = sc.next();
                if("y".equals(input2)){
                    continue placeOrder;
                    }
                
                else if("n".equals(input2)){
                    print();
                    }
                
                else if(!"y".equals(input2) || !"n".equals(input2)){
                    System.out.println("                   invalid input...!!!");
                    continue another;
                    }
                }
        }
    }
    
    public static void Search_Customer(){
        clearConsole();
        System.out.println("""
                            \t  _____                     _        _____          _                            
                            \t / ____|                   | |      / ____|        | |                           
                            \t| (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ 
                            \t \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|
                            \t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   
                            \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   
                            \t                                                                                
                            \t=======================================================================================
                           
                                                                                                                      """);
        searchcustomer:while(true){                                                                                                       
        System.out.print("Enter Coustomer Phone Number : ");
        String Phonenumber = sc.next();
        boolean found = false;
        
            if (Phonenumber.charAt(0) !='0' || Phonenumber.length() !=10) {
                System.out.println("\t\tInvalid Phone number.. Try again \n");
                L1:do{
                System.out.print("Do you want to enter phone number again? (y/n) :");
                char YN = sc.next().charAt(0);
                switch(YN){
                    case 'y'->{
                        continue searchcustomer;
                    }
                    case 'n'->{
                        System.out.println("\t\t");
                        print();
                    }
                    default -> {
                        System.out.println("            Invalid Request....");
                        continue L1;
                    }
                }
                }while(true);
            }
            
            for (int j = 0; j < customerIds.length; j++) {
                if (Phonenumber.equals(customerIds[j])) {
                    found = true;
                    extendArray();
                    
                    System.out.printf("\t+--------------------------------------+%n");
                    System.out.printf("\t| %-10s | %-10s | %-10s | %n","Size","QTY","Amount");
                    System.out.printf("\t+--------------------------------------+%n");
                    System.out.printf("\t| %-10s | %-10s | %-10s | %n",sizes[j],qty[j],total[j]);
                    System.out.printf("\t+--------------------------------------+%n");
                    System.out.printf("\t| %-23s |%-11s |  %n"," Total Amount",total[j]);
                    System.out.printf("\t+--------------------------------------+%n");
                
                    break;
                }
                }
            if(!found){
                    System.out.println("                   No valid customer in this number...!!!");
                    System.out.println("\t\t");
                    print();
            }
            another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to search another customer order? (y/n) : ");
                String Input = sc.next();
                if("y".equals(Input)){
                    continue searchcustomer;
                    }
                
                else if("n".equals(Input)){
                    System.out.println("\t\t");
                    print();
                    }
                
                else if(!"y".equals(Input) || !"n".equals(Input)){
                    System.out.println("                   invalid input...!!!");
                    continue another;
                    }
                break;
                }
            
        }
        
    }
     
    public static int Quantity(){
        QtY:do{
        System.out.print("Enter QTY : ");
        Qty = sc.nextInt();
        if (Qty<=0) {
            System.out.println("          Invalid input...!!!");
            continue QtY;
        }break;
        
        }while(true);
        return Qty;
    }
    
    public static void placeorder(){
        clearConsole();
        placeo:do{
        System.out.print("Do you want to place this order? (y/n) : ");
                String input1 = sc.next();
                
                if("y".equals(input1)){
                        extendArray();
                        orderIds[orderIds.length-1]=newOrderId;
                        customerIds[customerIds.length-1]=phonenumber;
                        sizes[sizes.length-1]=Sz;
                        qty[qty.length-1]=Qty;
                        total[total.length-1]=amount;
                        status[status.length - 1] = "delevering";
                        
                        System.out.println("                   Order placed...!!!");
                        break;
                    }
                
                else if("n".equals(input1)){
                        System.out.println("                   No Order placed...!!!");
                        break;
                    }
                
                else if(!"y".equals(input1) || !"n".equals(input1)){
                        System.out.println("                   invalid input...!!!");
                        continue placeo;
                    }
                }while(true);
            }
    
    public static void Search_Order(){
        clearConsole();
        System.out.println("""
                           \t   _____                     _        ____          _           
                           \t  / ____|                   | |      / __ \\        | |          
                           \t | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ 
                           \t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|
                           \t  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   
                           \t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   
                                                                                           
                                                                                           """);
        
        
        X:do{
        System.out.print("Enter order ID : ");
        String Sc = sc.next();
        boolean found = false;
        
        for (int i = 0; i < orderIds.length; i++) {
            if (Sc.equals(orderIds[i])) {
                found = true;
                System.out.println("Order Details for Order ID: " + Sc);
                System.out.println("Phone number : "+customerIds[i]);
                System.out.println("Size : "+sizes[i]);
                System.out.println("QTY : "+qty[i]);
                System.out.println("Amount : "+total[i]);
                System.out.println("Status : "+status[i]);
                
             break;
            }
        }
          
        if(!found){
            System.out.println("                 No order...!!!");
            
            another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to enter order ID again? (y/n) : ");
                String Input1 = sc.next();
                if("y".equals(Input1)){
                    Search_Order();
                    break;
                    }
                
                else if("n".equals(Input1)){
                    print();
                    }
                
                else if(!"y".equals(Input1) || !"n".equals(Input1)){
                    System.out.println("                   invalid input...!!!");
                    continue another;
                    }
                }
            break;
            }
        
            Another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to search another order? (y/n) : ");
                String Input11 = sc.next();
                if("y".equals(Input11)){
                    continue X;
                    }
                
                else if("n".equals(Input11)){
                    print();
                    }
                
                else if(!"y".equals(Input11) || !"n".equals(Input11)){
                    System.out.println("                   invalid input...!!!");
                    continue Another;
                    }
                }
         
        }while(true);
        
    }
    
    public static void Reports(){
    clearConsole();
    System.out.println("""
                           \t  _____                       _       
                           \t |  __ \\                     | |      
                           \t | |__) |___ _ __   ___  _ __| |_ ___ 
                           \t |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                           \t | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                           \t |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                           \t            | |                       
                           \t            |_|                       """);
    
        System.out.println("                [1] Customer Reports      ");
        System.out.println("                [2] Item Reports          ");
        System.out.println("                [3] Order Reports         ");
        System.out.println(" \t \t");
        
        System.out.print("Enter Option : ");
        int input=sc.nextInt();
        
        switch(input){
            case 1:
                Customer_Reports();
                break;
            case 2:
                Item_Reports();
                break;
                
            case 3:
                Order_Reports();
                break;  
                
            default :
                System.out.println("                 Invalid input...");
                break;
        }
    }
    
    public static void Customer_Reports(){
        clearConsole();
        System.out.println("""
                           \t   _____          _                              _____                       _       
                           \t  / ____|        | |                            |  __ \\                     | |      
                           \t | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ 
                           \t | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                           \t | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                           \t  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                           \t                                                           | |                       
                           \t                                                           |_|                       """);
        
        System.out.println("                [1] Best in Customers      ");
        System.out.println("                [2] View Customers          ");
        System.out.println("                [3] All Customer Reports         ");
        System.out.println(" \t \t");
        
        System.out.print("Enter Option : ");
        int input=sc.nextInt();
        
        switch(input){
            case 1:
                Best_in_Customers();
                break;
            case 2:
                View_Customers();
                break;
                
            case 3:
                All_Customer_Reports();
                break;  
                
            default :
                System.out.println("                 Invalid input...");
                break;
        }
    }
    
    public static void Best_in_Customers(){
        clearConsole();
        System.out.println("""
                           \t  ____            _     _____          _____          _                                
                           \t |  _ \\          | |   |_   _|        / ____|        | |                               
                           \t | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ 
                           \t |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|
                           \t | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\
                           \t |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/
                                                                                                                  
                                                                                                                  """);
        
        if (customerIds.length>0){
            String[] customers = new String[0];
			
		L1:for (int i = 0; i < customerIds.length; i++){
                    for (int j = 0; j < customers.length ; j++){
			if (customers[j].equals(customerIds[i])){
                            continue L1;
			}
                    }
				
                customers = extendStringArray(customers);
                customers[customers.length-1] = customerIds[i];
				
		}
                
		System.out.println("\t\t+---------------+---------+---------------+");
		System.out.printf("\t\t|%-15s|%-7s|%-15s|%n"," Phone Number","  All QTY"," Total Amount");
		System.out.println("\t\t+---------------+---------+---------------+");
			
		for (int i = 0; i < customers.length; i++){
                    int[] tempQtys = new int[6];
                    int totalcount = 0;
				
                    for (int j = 0; j < customerIds.length; j++){
			if (customers[i].equals(customerIds[j])){
                            switch (sizes[j]){
				case "XS": tempQtys[0]+=qty[j];break;
				case "S": tempQtys[1]+=qty[j];break;
				case "M": tempQtys[2]+=qty[j];break;
				case "L": tempQtys[3]+=qty[j];break;
				case "XL": tempQtys[4]+=qty[j];break;
				case "XXL": tempQtys[5]+=qty[j];break;
                            }
                            totalcount += qty[j];
			}
                    }
				
                        float total = 0;
				
                            total += (tempQtys[0]*xs);
                            total += (tempQtys[1]*s);
                            total += (tempQtys[2]*m);
                            total += (tempQtys[3]*l);
                            total += (tempQtys[4]*xl);
                            total += (tempQtys[5]*xxl);
				
                            System.out.printf("\t\t|%-14s |%-8s |%13f  |%n",customers[i],totalcount,total);
			}
		System.out.println("\t\t+---------------+---------+---------------+");
			
        Another:while(true){
                System.out.println(" ");
                System.out.print("To access the Main Menu, please enter 0 : ");
                int Input0 = sc.nextInt();
                if(Input0==0){
                    print();
                    System.out.println("\t\t");
                    }
                else {
                    System.out.println("                   invalid input...!!!");
                    continue Another;
                    }
            }
        }
        else{
            System.out.println("                   No valid customer...!!!");
            print();
        }
        
    }
    
    public static void View_Customers(){
    clearConsole();
        System.out.println("""
                           \t __      ___                  _____          _                                
                           \t \\ \\    / (_)                / ____|        | |                               
                           \t  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ 
                           \t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|
                           \t    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\
                           \t     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/
                                                                                                         
                                                                                                         """);
        
        if (customerIds.length>0){
            String[] customers = new String[0];
			
		L1:for (int i = 0; i < customerIds.length; i++){
                    for (int j = 0; j < customers.length ; j++){
			if (customers[j].equals(customerIds[i])){
                            continue L1;
			}
                    }
				
                customers = extendStringArray(customers);
                customers[customers.length-1] = customerIds[i];
				
		}
                
		System.out.println("\t\t+---------------+---------+---------------+");
		System.out.printf("\t\t|%-15s|%-7s|%-15s|%n"," Phone Number","  All QTY"," Total Amount");
		System.out.println("\t\t+---------------+---------+---------------+");
			
		for (int i = 0; i < customers.length; i++){
                    int[] tempQtys = new int[6];
                    int totalcount = 0;
				
                    for (int j = 0; j < customerIds.length; j++){
			if (customers[i].equals(customerIds[j])){
                            switch (sizes[j]){
				case "XS": tempQtys[0]+=qty[j];break;
				case "S": tempQtys[1]+=qty[j];break;
				case "M": tempQtys[2]+=qty[j];break;
				case "L": tempQtys[3]+=qty[j];break;
				case "XL": tempQtys[4]+=qty[j];break;
				case "XXL": tempQtys[5]+=qty[j];break;
                            }
                            totalcount += qty[j];
			}
                    }
				
                        float total = 0;
				
                            total += (tempQtys[0]*xs);
                            total += (tempQtys[1]*s);
                            total += (tempQtys[2]*m);
                            total += (tempQtys[3]*l);
                            total += (tempQtys[4]*xl);
                            total += (tempQtys[5]*xxl);
				
                            sort(tempQtys);
                            System.out.printf("\t\t|%-14s |%-8s |%13f  |%n",customers[i],totalcount,total);
			}
		System.out.println("\t\t+---------------+---------+---------------+");
			
        Another:while(true){
                System.out.println(" ");
                System.out.print("To access the Main Menu, please enter 0 : ");
                int Input0 = sc.nextInt();
                if(Input0==0){
                    print();
                    System.out.println("\t\t");
                    }
                else {
                    System.out.println("                   invalid input...!!!");
                    continue Another;
                    }
            }
        }
        else{
            System.out.println("                   No valid customer...!!!");
            print();
        }
        
    }
    
    public static void All_Customer_Reports(){
    clearConsole();
        System.out.println("""
                           \t           _ _    _____          _                                  _____                       _   
                           \t     /\\   | | |  / ____|        | |                                |  __ \\                     | |  
                           \t    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___  | |__) |___ _ __   ___  _ __| |_ 
                           \t   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __| |  _  // _ \\ '_ \\ / _ \\| '__| __|
                           \t  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\ | | \\ \\  __/ |_) | (_) | |  | |_ 
                           \t /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/ |_|  \\_\\___| .__/ \\___/|_|   \\__|
                           \t                                                                              | |                   
                           \t                                                                              |_|                   """);
        
        if (customerIds.length>0){
            String[] customers = new String[0];
			
		L1:for (int i = 0; i < customerIds.length; i++){
                    for (int j = 0; j < customers.length ; j++){
			if (customers[j].equals(customerIds[i])){
                            continue L1;
			}
                    }
				
                customers = extendStringArray(customers);
                customers[customers.length-1] = customerIds[i];
				
		}
                
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
		System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%-15s|%n"," Phone Number","  XS","   S","   M","   L","  XL","  XXL"," Total Amount");
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
			
		for (int i = 0; i < customers.length; i++){
                    int[] tempQtys = new int[6];
				
                    for (int j = 0; j < customerIds.length; j++){
			if (customers[i].equals(customerIds[j])){
                            switch (sizes[j]){
				case "XS": tempQtys[0]+=qty[j];break;
				case "S": tempQtys[1]+=qty[j];break;
				case "M": tempQtys[2]+=qty[j];break;
				case "L": tempQtys[3]+=qty[j];break;
				case "XL": tempQtys[4]+=qty[j];break;
				case "XXL": tempQtys[5]+=qty[j];break;
                            }
			}
                    }
				
                        double total = 0;
				
                            total += (tempQtys[0]*xs);
                            total += (tempQtys[1]*s);
                            total += (tempQtys[2]*m);
                            total += (tempQtys[3]*l);
                            total += (tempQtys[4]*xl);
                            total += (tempQtys[5]*xxl);
				
                            System.out.printf("\t\t|%15s|%7s|%7s|%7s|%7s|%7s|%7s|%15s|%n","","","","","","","","");
                            System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%13.2f  |%n",customers[i],"  "+tempQtys[0],"  "+tempQtys[1],"  "+tempQtys[2],"  "+tempQtys[3],"  "+tempQtys[4],"  "+tempQtys[5],total);
			}
		System.out.println("\t\t+---------------+-------+-------+-------+-------+-------+-------+---------------+");
			
        Another:while(true){
                System.out.println(" ");
                System.out.print("To access the Main Menu, please enter 0 : ");
                int Input0 = sc.nextInt();
                if(Input0==0){
                    print();
                    System.out.println("\t\t");
                    }
                else {
                    System.out.println("                   invalid input...!!!");
                    continue Another;
                    }
            }
        }
        else{
            System.out.println("                   No valid customer...!!!");
            print();
        }
    }
    
    public static void Item_Reports(){
        clearConsole();
        System.out.println("""
                           \t  _____ _                   _____                       _   
                           \t |_   _| |                 |  __ \\                     | |  
                           \t   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ 
                           \t   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __|
                           \t  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_ 
                           \t |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|
                           \t                                      | |                   
                           \t                                      |_|                   """);
        
        System.out.println("                [1] Best Selling Categories Sorted by QTY      ");
        System.out.println("                [2] Best Selling Categories Sorted by Amount          ");
        System.out.println(" \t \t");
        
        System.out.print("Enter Option : ");
        int input=sc.nextInt();
        
        switch(input){
            case 1:
                Best_Selling_Categories_Sorted_by_QTY();
                break;
            case 2:
                Best_Selling_Categories_Sorted_by_Amount();
                break;
            default :
                System.out.println("                 Invalid input...");
                break;
        }
        
    }
    
    public static void Best_Selling_Categories_Sorted_by_QTY(){
    clearConsole();
        System.out.println("""
                           \t   _____            _           _   ____           ____ _________     __
                           \t  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /
                           \t | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ / 
                           \t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /  
                           \t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |   
                           \t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|   
                           \t                                           __/ |                        
                           \t                                          |___/                         """);
        
        if (customerIds.length > 0) {
        String[] Sz = {"XS", "S", "M", "L", "XL", "XXL"};

        String[] sortedSizes = new String[Sz.length];
        int[] sortedQtys = new int[Sz.length];

        for (int i = 0; i < Sz.length; i++) {
            int totalQty = 0;

            for (int j = 0; j < sizes.length; j++) {
                if (Sz[i].equals(sizes[j])) {
                    totalQty += qty[j];
                }
            }

            sortedSizes[i] = Sz[i];
            sortedQtys[i] = totalQty;
        }

        for (int i = 0; i < sortedSizes.length - 1; i++) {
            for (int j = i + 1; j < sortedSizes.length; j++) {
                if (sortedQtys[i] < sortedQtys[j]) {
                    
                    String tempSize = sortedSizes[i];
                    sortedSizes[i] = sortedSizes[j];
                    sortedSizes[j] = tempSize;

                    int tempQty = sortedQtys[i];
                    sortedQtys[i] = sortedQtys[j];
                    sortedQtys[j] = tempQty;
                }
            }
        }

        System.out.println("\t\t+---------------+---------+---------------+");
        System.out.printf("\t\t|%-15s|%-9s|%-15s|%n", " Sizes", " QTY", " Total Amount");
        System.out.println("\t\t+---------------+---------+---------------+");

        for (int i = 0; i < sortedSizes.length; i++) {
            int totalcount = sortedQtys[i];
            float total = 0;

            for (int j = 0; j < sizes.length; j++) {
                if (sortedSizes[i].equals(sizes[j])) {
                    switch (sizes[j]) {
                        case "XS":total += qty[j] * xs;break;
                        case "S":total += qty[j] * s;break;
                        case "M":total += qty[j] * m;break;
                        case "L":total += qty[j] * l;break;
                        case "XL":total += qty[j] * xl;break;
                        case "XXL":total += qty[j] * xxl;break;
                    }
                }
            }

            System.out.printf("\t\t|%-14s |%-8d |%13f  |%n", sortedSizes[i], totalcount, total);
            System.out.println("\t\t+---------------+---------+---------------+");
        }

        Another: while (true) {
            System.out.println(" ");
            System.out.print("To access the Main Menu, please enter 0 : ");
            int Input0 = sc.nextInt();
            if (Input0 == 0) {
                print();
                System.out.println("\t\t");
            } else {
                System.out.println("                   invalid input...!!!");
                continue Another;
            }
        }
    } 
        else {
        System.out.println("                   No valid customer...!!!");
        print();
        }
    }
    
    public static void Best_Selling_Categories_Sorted_by_Amount(){
    clearConsole();
        System.out.println("""
                           \t   _____            _           _   ____                                               _   
                           \t  / ____|          | |         | | |  _ \\            /\\                               | |  
                           \t | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ 
                           \t  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|
                           \t  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ 
                           \t |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|
                           \t                                           __/ |                                           
                           \t                                          |___/                                            """);
        
        if (customerIds.length > 0) {
        String[] Sz = {"XS", "S", "M", "L", "XL", "XXL"};

        String[] sortedSizes = new String[Sz.length];
        float[] sortedAmounts = new float[Sz.length];

        for (int i = 0; i < Sz.length; i++) {
            float totalAmount = 0;

            for (int j = 0; j < sizes.length; j++) {
                if (Sz[i].equals(sizes[j])) {
                    switch (sizes[j]) {
                        case "XS":totalAmount += qty[j] * xs;break;
                        case "S":totalAmount += qty[j] * s;break;
                        case "M":totalAmount += qty[j] * m;break;
                        case "L":totalAmount += qty[j] * l;break;
                        case "XL":totalAmount += qty[j] * xl;break;
                        case "XXL":totalAmount += qty[j] * xxl;break;
                    }
                }
            }

            sortedSizes[i] = Sz[i];
            sortedAmounts[i] = totalAmount;
        }

        for (int i = 0; i < sortedSizes.length - 1; i++) {
            for (int j = i + 1; j < sortedSizes.length; j++) {
                if (sortedAmounts[i] < sortedAmounts[j]) {
                    String tempSize = sortedSizes[i];
                    sortedSizes[i] = sortedSizes[j];
                    sortedSizes[j] = tempSize;

                    float tempAmount = sortedAmounts[i];
                    sortedAmounts[i] = sortedAmounts[j];
                    sortedAmounts[j] = tempAmount;
                }
            }
        }

        System.out.println("\t\t+---------------+---------+---------------+");
        System.out.printf("\t\t|%-15s|%-9s|%-15s|%n", " Sizes", " QTY", " Total Amount");
        System.out.println("\t\t+---------------+---------+---------------+");

        for (int i = 0; i < sortedSizes.length; i++) {
            float totalAmount = sortedAmounts[i];
            int totalQty = 0;

            for (int j = 0; j < sizes.length; j++) {
                if (sortedSizes[i].equals(sizes[j])) {
                    totalQty += qty[j];
                }
            }

            System.out.printf("\t\t|%-14s |%-8d |%13f  |%n", sortedSizes[i], totalQty, totalAmount);
            System.out.println("\t\t+---------------+---------+---------------+");
        }

        Another: while (true) {
            System.out.println(" ");
            System.out.print("To access the Main Menu, please enter 0 : ");
            int Input0 = sc.nextInt();
            if (Input0 == 0) {
                print();
                System.out.println("\t\t");
            } else {
                System.out.println("                   invalid input...!!!");
                continue Another;
            }
        }
    } else {
        System.out.println("                   No valid customer...!!!");
        print();
        }
    }
    
    public static void Order_Reports(){
    clearConsole();
        System.out.println("""
                           \t   ____          _             _____                       _       
                           \t  / __ \\        | |           |  __ \\                     | |      
                           \t | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ 
                           \t | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|
                           \t | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\
                           \t  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/
                           \t                                         | |                       
                           \t                                         |_|                       """);
        
        System.out.println("                [1] All Orders      ");
        System.out.println("                [2] Orders By Amount          ");
        System.out.println(" \t \t");
        
        System.out.print("Enter Option : ");
        int input=sc.nextInt();
        
        switch(input){
            case 1:
                All_Orders();
                break;
            case 2:
                Orders_By_Amount();
                break;
            default :
                System.out.println("                 Invalid input...");
                break;
        }
        
    }
    
    public static void All_Orders(){
    clearConsole();
        System.out.println("""
                           \t __      ___                  ____          _               
                           \t \\ \\    / (_)                / __ \\        | |              
                           \t  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ 
                           \t   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|
                           \t    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\
                           \t     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/
                                                                                       
                                                                                       """);
        
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");
        System.out.printf("\t\t|%-16s|%-15s|%-7s|%-11s|%-15s|%-15s|%n", " Order Number", " Customer ID", " Size", " QTY","Amount","Status");
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");

        
        for (int i = orderIds.length-1 ; i>=0 ; i--) {
            System.out.printf("\t\t|%-16s|%-15s|%-7s|%-11d|%-15s|%-15s|%n", orderIds[i], customerIds[i], sizes[i], qty[i],total[i],Status[i]);
        }
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");
        
        Another: while (true) {
            System.out.println(" ");
            System.out.print("To access the Main Menu, please enter 0 : ");
            int Input0 = sc.nextInt();
            if (Input0 == 0) {
                print();
                System.out.println("\t\t");
            } else {
                System.out.println("                   invalid input...!!!");
                continue Another;
            }
        }
        
    }
    
    public static void Orders_By_Amount(){
        clearConsole();
        System.out.println("""
                           \t   ____          _                 ____                                               _   
                           \t  / __ \\        | |               |  _ \\            /\\                               | |  
                           \t | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ 
                           \t | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|
                           \t | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ 
                           \t  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|
                           \t                                          __/ |                                           
                           \t                                         |___/                                            """);
        
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");
        System.out.printf("\t\t|%-16s|%-15s|%-7s|%-11s|%-15s|%-15s|%n", " Order Number", " Customer ID", " Size", " QTY","Amount","Status");
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");

        for (int i = 0; i < total.length - 1; i++) {
            for (int j = i + 1; j < total.length; j++) {
                if (total[i] < total[j]) {
                    double tempOrderNumber = total[i];
                    total[i] = total[j];
                    total[j] = tempOrderNumber;
                }
            }
        }
        
        for (int i = 0; i < orderIds.length; i++) {
            System.out.printf("\t\t|%-16s|%-15s|%-7s|%-11d|%-15s|%-15s|%n", orderIds[i], customerIds[i], sizes[i], qty[i],total[i],Status[i]);
        }
        System.out.println("\t\t+----------------+---------------+-------+-----------+---------------+---------------+");
        
        Another: while (true) {
            System.out.println(" ");
            System.out.print("To access the Main Menu, please enter 0 : ");
            int Input0 = sc.nextInt();
            if (Input0 == 0) {
                print();
                System.out.println("\t\t");
            } else {
                System.out.println("                   invalid input...!!!");
                continue Another;
            }
        }
    }
    
    public static void Change_Order_Status(){
        clearConsole();
        System.out.println("""
                           \t   ____      _              _____ _        _             
                           \t  / __ \\    | |            / ____| |      | |            
                           \t | |  | | __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ 
                           \t | |  | |/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|
                           \t | |__| | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\
                           \t  \\____/ \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/
                                                                                    
                                                                                    """);
        
        X:do{
        System.out.print("Enter order ID : ");
        String Sc = sc.next();
        boolean found = false;
        
        for (int i = 0; i < orderIds.length; i++) {
            if (Sc.equals(orderIds[i])) {
                found = true;
                System.out.println("Order Details for Order ID: " + Sc);
                System.out.println("Phone number : "+customerIds[i]);
                System.out.println("Size : "+sizes[i]);
                System.out.println("QTY : "+qty[i]);
                System.out.println("Amount : "+total[i]);
                System.out.println("Status : "+Status[0]);
                
                Another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to change this order status? (y/n) : ");
                String Input = sc.next();
                if("y".equals(Input)){
                    
                    System.out.println("         [1] Order Delivering");
                    System.out.println("         [2] Order Delivered");
                    System.out.printf("Enter option : ");
                    int No = sc.nextInt();
                    
                    switch(No){
                    
                        case 1:
                            System.out.println("Order Details for Order ID: " + Sc);
                            System.out.println("Phone number : "+customerIds[i]);
                            System.out.println("Size : "+sizes[i]);
                            System.out.println("QTY : "+qty[i]);
                            System.out.println("Amount : "+total[i]);
                            System.out.println("Status : "+Status[1]);
                        
                            Another1:while(true){
                                System.out.println(" ");
                                System.out.print("Do you want to change this order status? (y/n) : ");
                                String Input1 = sc.next();
                                if("y".equals(Input1)){
                    
                                    System.out.println("         [1] Order Delivered");
                                    System.out.printf("Enter option : ");
                                    int No1 = sc.nextInt();
                                    
                                    switch(No1){
                    
                                        case 1:
                                            System.out.println("Order Details for Order ID: " + Sc);
                                            System.out.println("Phone number : "+customerIds[i]);
                                            System.out.println("Size : "+sizes[i]);
                                            System.out.println("QTY : "+qty[i]);
                                            System.out.println("Amount : "+total[i]);
                                            System.out.println("Status : "+Status[2]);
                        
                                            System.out.println(" ");
                                            System.out.println("                  Can't change this order status, Order already delivered..! ");
                        
                                        AnotherX:while(true){
                                            System.out.println(" ");
                                            System.out.print("Do you want to change another order status? (y/n) : ");
                                            String Input11 = sc.next();
                                            if("y".equals(Input11)){
                                                Change_Order_Status();
                                            }
                
                                            else if("n".equals(Input11)){
                                                print();
                                            }
                
                                            else if(!"y".equals(Input11) || !"n".equals(Input11)){
                                                System.out.println("                   invalid input...!!!");
                                                continue Another;
                                            }
                                            break;
                                        }
                                            
                                        default:
                                            System.out.println("         Invalid input...!!!");
                                            continue Another1;
                                    }
                                }
                                else if("n".equals(Input1)){
                                    print();
                                }
                
                                else if(!"y".equals(Input1) || !"n".equals(Input1)){
                                    System.out.println("                   invalid input...!!!");
                                    continue Another1;
                                }
                                break;
                            }
                            
                        case 2:
                            System.out.println("Order Details for Order ID: " + Sc);
                            System.out.println("Phone number : "+customerIds[i]);
                            System.out.println("Size : "+sizes[i]);
                            System.out.println("QTY : "+qty[i]);
                            System.out.println("Amount : "+total[i]);
                            System.out.println("Status : "+Status[2]);
                            
                            System.out.println(" ");
                            System.out.println("                  Can't change this order status, Order already delivered..! ");
                        
                            
                        AnotherX:while(true){
                            System.out.println(" ");
                            System.out.print("Do you want to change another order status? (y/n) : ");
                            String Input11 = sc.next();
                                if("y".equals(Input11)){
                                    Change_Order_Status();
                                }
                
                                else if("n".equals(Input11)){
                                    print();
                                }
                
                                else if(!"y".equals(Input11) || !"n".equals(Input11)){
                                    System.out.println("                   invalid input...!!!");
                                    continue Another;
                                }  
                        } 
                    }
                }
                
                else if("n".equals(Input)){
                    print();
                    }
                
                else if(!"y".equals(Input) || !"n".equals(Input)){
                    System.out.println("                   invalid input...!!!");
                    continue Another;
                    }
                }
            }
        }
          
        if(!found){
            System.out.println("                 No order...!!!");
            
            another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to enter order ID again? (y/n) : ");
                String Input1 = sc.next();
                if("y".equals(Input1)){
                    Search_Order();
                    break;
                    }
                
                else if("n".equals(Input1)){
                    print();
                    }
                
                else if(!"y".equals(Input1) || !"n".equals(Input1)){
                    System.out.println("                   invalid input...!!!");
                    continue another;
                    }
                }
            break;
            }
        
         
        }while(true);
        
    }
    
    public static void Delete_Order(){
        clearConsole();
        System.out.println("""
                           \t  _____       _      _          ____          _           
                           \t |  __ \\     | |    | |        / __ \\        | |          
                           \t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ 
                           \t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|
                           \t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   
                           \t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   
                                                                                     
                                                                                     """);
        
        X:do{
        System.out.print("Enter order ID : ");
        String Sc = sc.next();
        boolean found = false;
        
        for (int i = 0; i < orderIds.length; i++) {
            if (Sc.equals(orderIds[i])) {
                found = true;
                System.out.println("Order Details for Order ID: " + Sc);
                System.out.println("Phone number : "+customerIds[i]);
                System.out.println("Size : "+sizes[i]);
                System.out.println("QTY : "+qty[i]);
                System.out.println("Amount : "+total[i]);
                System.out.println("Status : "+Status[0]);
            }
            else if(!Sc.equals(orderIds[i])){
                System.out.println("             Invalid ID..");
                another1:while(true){
                        System.out.println(" ");
                        System.out.print("Do you want to delete another order? (y/n) : ");
                        String Input2 = sc.next();
                        if("y".equals(Input2)){
                            Delete_Order();
                            break;
                        }
                
                        else if("n".equals(Input2)){
                            print();
                        }
                
                        else if(!"y".equals(Input2) || !"n".equals(Input2)){
                            System.out.println("                   invalid input...!!!");
                            continue another1;
                        }
                    }
                    break;
            }
        }
        
        another:while(true){
                System.out.println(" ");
                System.out.print("Do you want to delete this order? (y/n) : ");
                String Input1 = sc.next();
                if("y".equals(Input1)){
                    deleteorder();
                    System.out.println("                Order Deleted..!");
                    
                    another1:while(true){
                        System.out.println(" ");
                        System.out.print("Do you want to delete another order? (y/n) : ");
                        String Input2 = sc.next();
                        if("y".equals(Input2)){
                            Delete_Order();
                            break;
                        }
                
                        else if("n".equals(Input2)){
                            print();
                        }
                
                        else if(!"y".equals(Input2) || !"n".equals(Input2)){
                            System.out.println("                   invalid input...!!!");
                            continue another1;
                        }
                    }
                    break;
                }
                
                else if("n".equals(Input1)){
                    print();
                    }
                
                else if(!"y".equals(Input1) || !"n".equals(Input1)){
                    System.out.println("                   invalid input...!!!");
                    continue another;
                    }
                }
        
        }while(true);  
    }
    
    public static void deleteorder(){
        customerIds=null;
        sizes=null;
        qty=null;
        status=null;
        total=null;
    }
    
    public static void main(String[] args) {
        Demo1 h = new Demo1();
        h.print();
    }
}
        



