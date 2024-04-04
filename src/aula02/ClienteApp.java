package aula02;

public class ClienteApp {
    public static void main(String[] args) {
        ClientePF clientepf1 = new ClientePF("Brenon", "bairo tal", "1122345778");
        ClientePJ clientepj1 = new ClientePJ("Julia", "bairo oto", "112234");
        
        //System.out.println(("O nome do clientePF1 é: "+clientepf1.getNome()+" O endereço do clientePF1 é: "+clientepf1.getEndereco()));
        

        System.out.println(clientepf1.toString());
        System.out.println(clientepj1.toString());
    }
}
