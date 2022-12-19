import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * the math and output of the total rental hours, minutes, and total cost.
 * Kimberlee Robinson
 * `12/19/22
 */
public class CompanyMotto {
    //Global variable
    static int cHrs = 40;
    static int cMinutes = 1;
    static int cTotalMinutes, cTotalHrs, cTotalCost;
    static String iData, oTotalHrs, oTotalMinutes,oTotalCost;
    static DecimalFormat hrsDisplay, totalDisplay, minsDisplay;
    static Scanner inputMinutes;


    public static void main(String[]args){
        init();
        int totalCost = calc(inputMins(),inputHours() );
        Ch3Sunshine.output();
        output(totalCost);
    }
    public static void output(double totalCost){
        oTotalCost = totalDisplay.format(cTotalCost);
        oTotalHrs = hrsDisplay.format(cTotalHrs);
        oTotalMinutes = minsDisplay.format(cTotalMinutes);
        System.out.println( "Hours             Additional Minutes                Total Cost \n ");
        System.out.println( oTotalHrs + cTotalMinutes + oTotalCost);


    }

    private static int calc(int iMinutes, int iHrs) {
        cTotalHrs = iHrs * cHrs;
        cTotalMinutes = iMinutes * cMinutes;
        cTotalCost = cTotalHrs + cTotalMinutes;
        return cTotalCost;






    }

    private static int inputMins(){
        int iMinutes;
        System.out.println("please enter any additional minutes: ");
        String iData = inputMinutes.nextLine();
        try {
            return Integer.parseInt(iData);
        }
        catch(Exception e){
            System.out.println("ERROR!!! Please enter any additional minutes over 60 minutes. Must be numeric ");
            System.out.println("If no additional minutes, just ignore this message.");
            return  0;
        }


    }

    private static int inputHours() {
        int iHrs;
        System.out.println("Please enter the number of hours: ");
        String iData = inputMinutes.nextLine();
        try {
            return Integer.parseInt(iData);
        }
        catch(Exception e){
            System.out.println("ERROR!!!! Must be a numeric value.");
            System.out.println("Please try again. ");
            System.out.println("Minimum of 60 minutes. ");
            return 0;
        }




    }

    private static void init(){
        Ch3Sunshine.output();
        inputMinutes = new Scanner(System.in);
        totalDisplay = new DecimalFormat("$###0.00");
        minsDisplay = new DecimalFormat("##0");
        hrsDisplay = new DecimalFormat("##0");


    }
}
