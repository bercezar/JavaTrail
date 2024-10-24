package pro.iphone.implementations;

public class Iphone extends IphoneSystem{
    public boolean wifi;
    public boolean airPlane;
    public boolean onOff;

    public Iphone(boolean wifi, boolean airPlane, boolean onOff){
        this.wifi = wifi;
        this.airPlane = airPlane;
        this.onOff = onOff;
    }

    public void SetOnOff(boolean var){
        onOff = var;
    }

    public void SetWifi(boolean var){
        wifi = var;
    }

    public void SetAirPlane(boolean var){
        airPlane = var;
    }


    public static void main (String[] args){
        Iphone iphone = new Iphone(false, false, false);

        iphone.SetOnOff(true);
        iphone.SetWifi(true);
        iphone.SetAirPlane(false);

        // Para acessar todas as funções o iphone precisa estar ligado.
        // Atender ligação ou realizar ligação, modo avião deve estar desligado. Assim como, ouvir música e acessar a internet deve estar ligada.
        // Pórem, posso estar com a telefone no modo avião e ouvir música. Assim como posso estar com a internet desligada e acessar a internet.

        if (iphone.onOff){
            if(!iphone.airPlane){
                iphone.call("4002-8922");
            }
            else{
                System.out.println("Telefone se ecnontra em modo avião");
            }
        }else{
            System.out.println("Telefone desligado");
        }

      
    }

}

