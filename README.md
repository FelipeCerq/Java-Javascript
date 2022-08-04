## TESTE

import java.io.IOException;
import java.util.Scanner; // classe nova scanner 

class sala {
    
public static void main(String [] args)    {
 Scanner teclado = new Scanner(System.in);

var alunos = "30";
var cadeiras = "31";
//
String aluno1 = "thorondor";
String aluno2 = "thurgon ";
String aluno3 = "feanor";
//
int notamedia = 6;
//
int Nota1aluno1 = 9;
int Nota2aluno1 = 10;
//
int MediapAluno1 = (Nota1aluno1  +  Nota2aluno1)/2;
//
System.out.println("\nIniciar Programa\n");
System.out.println("Nome do Aluno:");

String x = teclado.nextLine();

if (x.length() > 3)  {
   System.err.println("\n ---------------- Dados Aluno (a) ---------------\n");
   System.out.println("Sala:");
  int Nr = teclado.nextInt(); 
   System.out.println("\n Nota 1: \n"); 
  int NtOne = teclado.nextInt(); 
   System.out.println("\n Nota 2: \n"); 
  int NtTwo = teclado.nextInt(); 
   System.out.println("\n ----------------------------------------------  \n");   
   
  int ntFinal = (NtOne + NtTwo)/2;  
   System.out.println("\n Nome: " + x + "\n"); 
   System.out.println("\n Sala: " + Nr + "\n"); 
   System.out.println("\n Nota 1:" + NtOne + " Nota 2:" + NtTwo + "\n"); 

if (ntFinal > notamedia) {
   System.out.println("\nAluno Aprovado \n");
   System.out.println("\nAluno acima da Media, nota media " + ntFinal + ".\n");
} else if (ntFinal == notamedia) {
    
   System.out.println("\n Aluno atingiu a nota media, nota " + ntFinal + ".\n");
   System.out.println("\nAprovar Aluno ?\n");
   System.out.println("\n Aperte 1 para sim e 2 para nao:");
     int confirmar = teclado.nextInt();
   
if (confirmar == 1) {
   System.out.println("\nAluno Aprovado pelo conselho!\n");
   
} else if(confirmar == 2) {
   System.out.println("\nAluno Reprovado pelo conselho!\n");
   
} else {
   System.out.println("\n Erro.\n");
   
}
} else if (ntFinal < notamedia) {
   System.out.println("\nAluno Reprovado.\n");
} else {
   System.err.println("\n ERROR \n");
}



} else {
   System.err.println("Nome invalido, nao prenchido ou Nome incorreto!");
}

 }
}
## Subir arquivos java 
### teste II


### Teste III



#### Teste IV

