/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

import java.util.Scanner;

/**
 *
 * @author brian
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("REPORT GENERATOR");
        System.out.println("1. PDF");
        System.out.println("2. EXCEL");
        System.out.println("3. HTML");
        System.out.print("Choose an option: ");
        int opcion = sc.nextInt();

        ReportCreator creator = null;

        if (opcion == 1) {
            creator = new PDFReportCreator("archive.pdf");
        } else if (opcion == 2) {
            creator = new EXCELReportCreator("archive.xlsx", "sheet1");
        } else if (opcion == 3) {
            creator = new HTMLReportCreator("archive.html");
        } else {
            System.out.println("Invalid option.");
            return;
        }
        String data = "";
        creator.generateReport(data);
    }
}

