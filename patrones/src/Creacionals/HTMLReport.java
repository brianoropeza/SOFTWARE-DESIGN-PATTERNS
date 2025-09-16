/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creacionals;

/**
 *
 * @author brian
 */
public class HTMLReport extends Report {
    private String content;
    private String title;
    private String author;

    public HTMLReport(String content, String title, String author) {
        this.content = content;
        this.title = title;
        this.author = author;
    }

    @Override
    public void generateReport(String data) {
        System.out.println("Generating HTML report...");
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("content: " + content);
        
    }
}
