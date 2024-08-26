package com.csc;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
  Scanner in = new Scanner(System.in);

  public String toPounds(double ounces) {

    if (ounces == 16) {
      double lbs = ounces / 16;
      DecimalFormat decimal = new DecimalFormat("0.0000");
      String output = decimal.format(lbs) + " lb";
      return output;
    } else {
      double lbs = ounces / 16;
      DecimalFormat decimal = new DecimalFormat("0.0000");
      String output = decimal.format(lbs) + " lbs";
      return output;
    }
  }

  public String toPoundsAndOunces(int ounces) {

    if (ounces>= 16 & ounces < 32) {
      int lbs = ounces / 16;
      int ozoutput = (ounces + 16) % 16;
      String output = lbs + " lb " + ozoutput + " oz";
      return output;
    }
   else {
    int lbs = ounces / 16;
    int ozoutput = (ounces + 16) % 16;
    String output = lbs + " lbs " + ozoutput + " oz";
    return output;
   }
  }


public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Please enter the number of ounces to convert to pounds: ");
  int ounces = in.nextInt();
  in.close();
  Converter converter = new Converter(); 
  System.out.println(converter.toPounds(ounces));
  System.out.println(converter.toPoundsAndOunces(ounces));
}
}

