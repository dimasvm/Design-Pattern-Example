/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author araym
 */
public class BookCatalogAdapter implements CatalogAdapter {

    private Book book;

    public BookCatalogAdapter(Book book) {
        this.book = book;
    }
    
    
    @Override
    public String getTitle() {
        return book.getTitle() + " by " + book.getAuthor();
    }
    
}
