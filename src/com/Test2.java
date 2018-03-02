package com;
import net.sourceforge.tess4j.*;
import java.io.*;
public class Test2 {
    public String getImgText(String imageLocation) {
      ITesseract instance = new Tesseract();
      try 
      {
         String imgText = instance.doOCR(new File(imageLocation));
         return imgText;
      } 
      catch (TesseractException e) 
      {
         e.getMessage();
         return "Error while reading image";
      }
   }
   public static void main ( String[] args)
   {
      Test2 Test2 = new Test2();
      System.out.println(Test2.getImgText("C:\\tc\\dev\\objects\\Logo.png"));
   }
}