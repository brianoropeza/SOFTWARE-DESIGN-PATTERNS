/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public class EXCELReportCreator extends ReportCreator {
    private String filename;
    private String sheetType;

    public EXCELReportCreator(String filename, String sheetType) {
        this.filename = filename;
        this.sheetType = sheetType;
    }

    @Override
    public Report createReport() {
        return new EXCELReport(filename, sheetType);
    }
}
