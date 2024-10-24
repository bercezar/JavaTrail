package pro.iphone.implementations;

import pro.iphone.interfaces.Ipod;
import pro.iphone.interfaces.Safari;
import pro.iphone.interfaces.Telephone;

public class IphoneSystem implements Safari, Telephone, Ipod{
    private String currentSong;
    private String currentNumber;
    private String currentPage;

    public String getCurrentSong(){
        return currentSong;
    }

    public void setCurrentSong(String currentSong){  // Ipod
        this.currentSong = currentSong;
    }

    public String getCurrentNumber(){
        return currentNumber;
    }

    public void setCurrentNumber(String currentNumber){  //Telephone
        this.currentNumber = currentNumber;
    }

    public String getCurrentPage(){
        return currentPage;
    }

    public void setCurrentPage(String currentPage){  // Safari
        this.currentPage = currentPage;
    }

    // Interface métodos


    // Telephone
    @Override
    public void call(String number) {
        setCurrentNumber(number);
        System.out.println("Chamando...");
    }

    @Override
    public void answer() {
        
    }

    @Override
    public void startVoicemail() {
        
    }

    // Ipod
    @Override
    public void play() {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void selectSong(String music) {
        setCurrentSong(music);
    }


    // Safari
    @Override
    public void displayPage(String pageWeb) {
        setCurrentPage(pageWeb);
    }

    @Override
    public void refreshPage() {
        
    }

    @Override
    public void addNewTab() {

    }
}
