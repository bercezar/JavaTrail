import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num_1 = scanner.nextInt();
        System.out.println("Informe outro número inteiro: ");
        int num_2 = scanner.nextInt();

        try{
            contador(num_1,num_2);
        }
        catch(ParametrosInvalidosException Exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //Exceção capturada pelo try/catch
        }
        scanner.close();
    }
    public static void contador(int num_1, int num_2) throws ParametrosInvalidosException{
        if(num_1 >= num_2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            //Caso entre no laço condicional, "ParametrosInvalidosException" é lançada com a mensagem.
        }

        int cont = num_2 - num_1;

        for(int i = 0; i<cont;i++){
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}

class ParametrosInvalidosException extends Exception{
    //Definição de classe "ParametrosInvalidosException" para tratamento de erros
    //Herança de "Exception"
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); //Construtor da classe pai Exception com mensagem fornecida


        // throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

    }
}