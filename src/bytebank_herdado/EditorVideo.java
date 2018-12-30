package bytebank_herdado;

//Editor de Video eh um Funcionario, entao herda da class Funcionario
public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de video");
        return 150;
    }

}
