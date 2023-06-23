public class Tamaguchi {
    String nome;
    int fome = 10;
    int saude = 10;
    int idade = 0;

    public Tamaguchi(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void alterarNome(String novoNome){
        nome = novoNome;
    }

    public String mostrarNome(){
        return nome;
    }

    public void alimentar(int quantidadeDeAlimento){
        if(quantidadeDeAlimento > 10){
            quantidadeDeAlimento = 10;
        }
        fome = quantidadeDeAlimento;
    }
    
    public int mostrarFome(){
        return fome;
    }

    public void brincar(int tempoBrincando){
        if(tempoBrincando > 10){
            tempoBrincando = 10;
        }
        saude = tempoBrincando;
    }

    public int mostrarSaude(){
        return saude;
    }

    public void alterarIdade(int novaIdade){
        idade = novaIdade;
    }

    public int mostrarIdade(){
        return idade;
    }

    public String mostrarHumor(){
        int humor = (fome + saude) / 2;
        if(humor >= 10){
            return "Feliz!";
        }
        else if(humor >=5 && humor < 10){
            return "Normal";
        }
        else{
            return "Triste!";
        }
    }

    // Exercicio 16
    public String  portaEscondida(){
        String informacoes =  "Nome: " + mostrarNome() + "\n" + "Idade: "+ String.valueOf(mostrarIdade()) + "\n" + "Nível de fome: " +  String.valueOf(mostrarFome()) + "\n" + "Saúde: " + String.valueOf(mostrarSaude()) + "\n" + "Humor: " + mostrarHumor();
        return informacoes;
    }

    
}

