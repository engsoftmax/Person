package Human;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
        private String nome;
        private LocalDate dataNascimento;
        private double altura;
        
        
	public static void main(String[] args) {
		// Exemplo de uso da classe Pessoa
        LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
        Pessoa pessoa = new Pessoa("Max1miliano", dataNascimento, 1.77);
        pessoa.imprimirDados();

		
	}
		

        public Pessoa(String nome, LocalDate dataNascimento, double altura) {
              this.nome = nome;
              this.dataNascimento = dataNascimento;
              this.altura = altura;
        }

         // Getter e Setter para o atributo 'nome'
         public String getNome() {
              return nome;
         }
  
         public void setNome(String nome) {
              this.nome = nome;
         }

         // Getter e Setter para o atributo 'dataNascimento'
         public LocalDate getDataNascimento() {
              return dataNascimento;
         }

         public void setDataNascimento(LocalDate dataNascimento) {
              this.dataNascimento = dataNascimento;
         }

         // Getter e Setter para o atributo 'altura'
         public double getAltura() {
              return altura;
         }

         public void setAltura(double altura) {
              this.altura = altura;
         }

         // Método para calcular a idade da pessoa
         public int calcularIdade() {
              LocalDate hoje = LocalDate.now();
              Period periodo = Period.between(dataNascimento, hoje);
              return periodo.getYears();
         }

         // Método para imprimir todos os dados da pessoa
         public void imprimirDados() {
              System.out.println("Nome: " + nome);
              System.out.println("Data de Nascimento: " + dataNascimento);
              System.out.println("Altura: " + altura);
              System.out.println("Idade: " + calcularIdade() + " anos");
         }


         public String formatarDados() {
             String dadosFormatados = "Nome: " + nome + "\n";
             dadosFormatados += "Data de Nascimento: " + dataNascimento + "\n";
             dadosFormatados += "Altura: " + altura + "\n";
             dadosFormatados += "Idade: " + calcularIdade() + " anos" + "\n";
             return dadosFormatados;
         }

        
}
