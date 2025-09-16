/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public abstract class ReportCreator {
    public abstract Report createReport();
    public void generateReport(String data) {
        Report report = createReport();
        report.generateReport(data);
    }
}
