import java.util.Scanner; 

class Prova {
    public static void main(String[] args) {
        System.out.println("Questao 1\n");
        System.out.println("\n_________________________________________________ \n");
        System.out.println("Quanto e 8 * 8: \n");
        
         System.out.println("\nA - 72\n");
          System.out.println("\nB - 64\n");
           System.out.println("\nC - 60\n");
            System.out.println("\nD - 16\n");
        try (Scanner teclado = new Scanner(System.in)) {

         String x = teclado.nextLine();
        
        if (x.equals("B")) {
         System.out.println("\nCorreta\n");
        } else { 
             System.out.println("\nIncorreta\n");
        }
   
    }
}