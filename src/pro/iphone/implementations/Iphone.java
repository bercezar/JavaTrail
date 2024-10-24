package pro.iphone.implementations;
import java.util.Scanner;

public class Iphone extends IphoneSystem{
    public boolean wifi;
    public boolean airPlane;
    public boolean onOff;

    public Iphone(boolean wifi, boolean airPlane, boolean onOff){
        this.wifi = wifi;
        this.airPlane = airPlane;
        this.onOff = onOff;
    }

    public void setOnOff(boolean var){
        onOff = var;
    }

    public void setWifi(boolean var){
        wifi = var;
    }

    public void setAirPlane(boolean var){
        airPlane = var;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone(false, false, false);

        iphone.setOnOff(true);
        iphone.setWifi(true);
        iphone.setAirPlane(false);

        // Para acessar todas as funções o iphone precisa estar ligado.
        // Atender ligação ou realizar ligação, modo avião deve estar desligado.
        // Pórem, posso estar com a telefone no modo avião ou não e ouvir música. Assim como   'devo estar com o modo avião desligado e acessar a internet.


        // Telefone
        if (iphone.onOff){
            String hangup;
            if(!iphone.airPlane){
                iphone.call("4002-8922");
                System.out.print("Deseja encerrar esta ligação ([S]im / [N]ão): ");
                hangup = sc.nextLine().toLowerCase();
                if(hangup.equals("s")){
                    iphone.call(null);
                    iphone.hangUp();
                }
                else
                    iphone.answer();
            }
            else{
                System.out.println("Telefone se encontra em modo avião");
            }
        }else{
            System.out.println("Telefone desligado");
        }

        // Ipod
        if(iphone.onOff){
            String music;
            String input;
            boolean pause = true;
            System.out.println("Informe a música: ");
            music = sc.nextLine();
            iphone.selectSong(music);
            iphone.play();
            while (pause){
                System.out.print("Deseja tocar ([S]im / [N]ão): ");
                input = sc.nextLine().toLowerCase();
                if(input.equals("s"))
                    iphone.pause();
                else{
                    iphone.play();
                    pause = false;
                }
            }
        }else{
            System.out.println("Telefone desligado");
        }

        // Internet
        if(iphone.onOff){
            String browser;
            if(iphone.wifi && !iphone.airPlane){
                System.out.println("Site: ");
                browser = sc.nextLine();
                iphone.displayPage(browser);
            }
            else
                System.out.println("Verifique suas conexões");
        }else{
            System.out.println("Telefone desligado");
        }


        sc.close();
    }

}

