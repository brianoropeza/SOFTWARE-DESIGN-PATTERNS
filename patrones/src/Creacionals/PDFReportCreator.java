/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public class PDFReportCreator extends ReportCreator {
    private String filename;

    public PDFReportCreator(String filename) {
        this.filename = filename;
    }

    @Override
    public Report createReport() {
        return new PDFReport(filename, "Reporte PDF", "System");
    }
}