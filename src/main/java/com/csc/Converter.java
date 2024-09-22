package com.csc;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
  Scanner in = new Scanner(System.in);

  //Additional overload function
  public String toPounds() {
    double lbs = 0;
    DecimalFormat decimal = new DecimalFormat("0.0000");
    String output = decimal.format(lbs) + " lbs";
    return output;
  }

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

  // Additional overload function
  public String toPoundsAndOunces() {
    int lbs = 0;
    int ozoutput = 0;
    String output = lbs + " lbs " + ozoutput + " oz";
    return output;
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

  //Additional opposite way converter
  public String toOunces(int pounds, int ounces) {
    int ozoutput = pounds * 16 + ounces;
    String output;
    if (ozoutput == 1) {
      output = ozoutput + " ounce";
    }
    else {
      output = ozoutput + " ounces";
    }
    return output;
  }


public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("Please enter the number of ounces to convert to pounds: ");
  int ounces = in.nextInt();
  Converter converter = new Converter(); 
  System.out.println(converter.toPounds(ounces));
  System.out.println(converter.toPoundsAndOunces(ounces));

  //Additional outputs for default methods 
  //toPounds and toPoundsAndOunces
  System.out.println("default: " + converter.toPounds());
  System.out.println("default: " + converter.toPoundsAndOunces());

  //Additional prints and inputs for the toOunces method
  System.out.println("Please enter the number of pounds and then ounces to convert to ounces");
  System.out.print("Pounds: ");
  int lbs = in.nextInt();
  System.out.print("Ounces: ");
  int oz = in.nextInt();
  in.close();
  System.out.println(converter.toOunces(lbs, oz));
  }
}
