import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
    
    }
    public static void Cadstro(){

       try {
           Scanner Scan = new Scanner(System.in);
           System.out.println("Digite o seu nome!");
           String nome = Scan.nextLine();
           System.out.println("Digite a sua senha!");
           String Senha = Scan.nextLine();
           if(nome.equals("") || Senha.equals("") ){
               System.out.println("Por favo preencha os campos!!");
           }else{
               System.out.println("Parabens!! Você foi registrado!!");
           }
       }catch (Exception e ){
           System.out.println("Ocorreu um erro!");
       }

    }
   public static void Excluir(){
       Scanner Scan = new Scanner(System.in);
       ArrayList<String>Alunos;
       ArrayList<Integer>senha;
       System.out.println("Entrou na exclusão de Cadastros!");
         Alunos.add("KAUE");//da erro que nao foi inicializada
         Alunos.add("Geovanna"); 
         Alunos.add("Cibele");  
         Alunos.add("Pitchula");
           senha.add(12344);//da erro que nao foi inicializada
           senha.add(425);
           senha.add(234);
           senha.add(200);
           
        System.out.println("Deseja excluir uma senha ou um Nome?");
        String escolha = Scan.nextLine();
        if (escolha.equals("Nome")){
            System.out.println(Alunos);
            System.out.println("Qual nome voce deseja excluir?");
            String escolha2 = Scan.nextLine();
             if (Alunos.contains(escolha2)){
                 System.out.println("Aluno excluido com sucesso!!");
                 System.out.println(Alunos);
             }
        }
   }


}