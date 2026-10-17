public class Pessoa {
    private int id; 
    private String nome;
    private int idade;



    public void setId(int id) {
        this.id = id;
    }
    public void setIdade(int idade) {
        if(idade <= 0){
            idade = 0;
        }
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
//get
    public int getId() {
        return id;
    }

    public int getIdade() {


        return idade;
    } public String getNome() {
        return nome;
    }

}


