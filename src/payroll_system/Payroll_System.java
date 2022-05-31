/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll_system;
import java.util.Scanner;
//*****************************************************************
// G.T. BALLESTEROS
// 05-31-2022
// 
// Payroll System
//*****************************************************************
public class Payroll_System 
{
    public static void main(String[] args) 
    {
        char response, reply;
        int days;
        int pagIbig, philHealth, sss, gsis;
        int tax = 0;
        int totalDec = 0;
        int withoutP = 0;
        int netPay = 0;
        Scanner keyboard = new Scanner (System.in);
        do
        {
            payrollHeader();
            System.out.print("Select employment status: ");
            response = keyboard.next().charAt(0);
            System.out.println("************************************");
            System.out.print("Enter no.of days attended: ");
            days = keyboard.nextInt();
                
            switch(response)
           {
                case 'A': case 'a':
                    System.out.println("*********BENEFITS DEDUCTION*********");
                    System.out.println();
                    System.out.print("PAG-IBIG: ");
                    pagIbig = keyboard.nextInt();
                    System.out.print("PHILHEALTH: ");
                    philHealth = keyboard.nextInt();
                    System.out.print("SSS: ");
                    sss = keyboard.nextInt();
                    System.out.print("GSIS: ");
                    gsis = keyboard.nextInt();
                    taxFormulaP(tax, days);
                    System.out.println("************************************");
                    totalDec = pagIbig + philHealth + sss + gsis;
                    System.out.print("TOTAL DEDUCTION: ");
                    System.out.println(totalDec);
                    woDeductionP(days, withoutP, netPay, totalDec);
                    break;
            
                    case 'B': case 'b':
                    System.out.println("*********BENEFITS DEDUCTION*********");
                    System.out.println();
                    System.out.print("PAG-IBIG: ");
                    pagIbig = keyboard.nextInt();
                    System.out.print("PHILHEALTH: ");
                    philHealth = keyboard.nextInt();
                    System.out.print("SSS: ");
                    sss = keyboard.nextInt();
                    System.out.print("GSIS: ");
                    gsis = keyboard.nextInt();
                    taxFormulaC(tax, days);
                    System.out.println("************************************");
                    totalDec = pagIbig + philHealth + sss + gsis;
                    System.out.print("TOTAL DEDUCTION: ");
                    System.out.println(totalDec);
                    woDeductionC(days, withoutP, netPay, totalDec);
                    break;
                
                case 'C': case 'c':
                    System.out.println("*********BENEFITS DEDUCTION*********");
                    System.out.println();
                    System.out.print("PAG-IBIG: ");
                    pagIbig = keyboard.nextInt();
                    System.out.print("PHILHEALTH: ");
                    philHealth = keyboard.nextInt();
                    System.out.print("SSS: ");
                    sss = keyboard.nextInt();
                    System.out.print("GSIS: ");
                    gsis = keyboard.nextInt();
                    taxFormulaJ(tax, days);
                    System.out.println("************************************");
                    totalDec = pagIbig + philHealth + sss + gsis;
                    System.out.print("TOTAL DEDUCTION: ");
                    System.out.println(totalDec);
                    woDeductionJ(days, withoutP, netPay, totalDec);
                    break;
                
                default: System.out.println("Invalid Input!");
            }
            System.out.println();
            System.out.print("ANOTHER TRANSACTION? [y/n]  ");
            reply = keyboard.next().charAt(0);
            System.out.println();
            System.out.println();
        } while (reply == 'Y' || reply == 'y');
    }
    
    static void payrollHeader()
    {
        System.out.println("***********PAYROLL SYSTEM***********");
        System.out.println();
        System.out.println("\t   [A]PERMANENT");
        System.out.println("\t   [B]CASUAL");
        System.out.println("\t   [C]JOB-ORDER");
        System.out.println();
        System.out.println("************************************");
    }
    
    static void taxFormulaP(int tax, int days)
    {
        final int PERMANENT = 1000;
        tax = (int) ((PERMANENT * days) * 0.10);
        System.out.println();
        System.out.print("TAX: ");
        System.out.println(tax);
    }
    
    static void taxFormulaJ(int tax, int days)
    {
        final int JOBORDER = 600;
        tax = (int) ((JOBORDER * days) * 0.10);
        System.out.println();
        System.out.print("TAX: ");
        System.out.println(tax);
    }
    
     static void taxFormulaC(int tax, int days)
    {
        final int CASUAL = 850;
        tax = (int) ((CASUAL * days) * 0.10);
        System.out.println();
        System.out.print("TAX: ");
        System.out.println(tax);
    }
 
    static void woDeductionP(int days, int withoutP, int netPay, int totalDec)
    {
        final int PERMANENT = 1000;
        withoutP = PERMANENT * days;
        System.out.print("Without deduction is: ");
        System.out.println(withoutP);
        netPay = withoutP - totalDec;
        System.out.print("NET-PAY: ");
        System.out.println(netPay);
    }
    
    static void woDeductionC(int days, int withoutP, int netPay, int totalDec)
    {
        final int CASUAL = 850;
        withoutP = CASUAL * days;
        System.out.print("Without deduction is: ");
        System.out.println(withoutP);
        netPay = withoutP - totalDec;
        System.out.print("NET-PAY: ");
        System.out.println(netPay);
    }
    
    static void woDeductionJ(int days, int withoutP, int netPay, int totalDec)
    {
        final int JOBORDER = 600;
        withoutP = JOBORDER * days;
        System.out.print("Without deduction is: ");
        System.out.println(withoutP);
        netPay = withoutP - totalDec;
        System.out.print("NET-PAY: ");
        System.out.println(netPay);
    }
}
