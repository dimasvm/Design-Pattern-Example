/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author araym
 */
public class ScreencastCatalogAdapter implements CatalogAdapter {

    private Screencast cast;

    public ScreencastCatalogAdapter(Screencast cast) {
        this.cast = cast;
    }
    
    @Override
    public String getTitle() {
        return cast.getTitle() + " by " + cast.getAuthor();
    }
    
}
