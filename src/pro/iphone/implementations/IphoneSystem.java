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
        if(number != null)
            System.out.println(String.format("Tel: %s\nChamando...", number));
    }

    @Override
    public void answer() {
        if(getCurrentNumber() != null)
            System.out.println(String.format("Chamada ativa: %s", getCurrentNumber()));
        else
            System.out.println("Sem chamada no momento");
    }

    @Override
    public void hangUp() {
        System.out.println("Chamada encerrada.");
    }

    // Ipod
    @Override
    public void play() {
        if(getCurrentSong() != null)
            System.out.println(String.format("Tocando: %s", getCurrentSong()));
        else
            System.out.println("Música não selecioanda");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
        
    }

    @Override
    public void selectSong(String music) {
        setCurrentSong(music);
    }


    // Safari
    @Override
    public void displayPage(String pageWeb) {
        setCurrentPage(pageWeb);
        System.out.println(String.format("https://www.%s.com/", pageWeb));
    }
}
