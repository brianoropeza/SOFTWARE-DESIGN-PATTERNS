/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */

public class HTMLReportCreator extends ReportCreator {
    private String outputPath;

    public HTMLReportCreator(String outputPath) {
        this.outputPath = outputPath;
    }

    @Override
    public Report createReport() {
        return new HTMLReport(outputPath, "Reporte HTML", "System");
    }
}
