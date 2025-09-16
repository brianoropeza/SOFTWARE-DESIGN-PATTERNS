/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public class PDFReport extends Report {
    private String document;
    private String title;
    private String author;

    public PDFReport(String document, String title, String author) {
        this.document = document;
        this.title = title;
        this.author = author;
    }

    @Override
    public void generateReport(String data) {
        System.out.println("Generating PDF report");
        System.out.println("document: " + document);
        System.out.println("title: " + title);
        System.out.println("author: " + author);
    }
}
