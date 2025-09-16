/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public class EXCELReport extends Report {
    private String workbook;
    private String sheet;

    public EXCELReport(String workbook, String sheet) {
        this.workbook = workbook;
        this.sheet = sheet;
    }

    @Override 
    public void generateReport(String data) {
        System.out.println("Generando reporte EXCEL...");
        System.out.println("Workbook: " + workbook);
        System.out.println("sheet: " + sheet);
        
    }
}
