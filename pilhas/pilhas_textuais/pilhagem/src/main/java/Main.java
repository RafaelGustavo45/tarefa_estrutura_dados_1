

// import static org.junit.jupiter.api.Assertions.assertEquals; 



// import org.junit.jupiter.api.Test; 

import java.util.ArrayList; 

public class Main { 

  public static void main(String[] args) { 

    System.out.println("Hello world!"); 

    Pilha p = new Pilha(); 

    p.push(5); 

    p.push(1); 

    p.push(3); 

    p.push(7); 



    Sequencia seq_1 = new Sequencia("ab438r8");//1 

    Sequencia seq_2 = new Sequencia("438ufeh");//0 

    Sequencia seq_3 = new Sequencia("ab3409ab");//2 

    Sequencia seq_4 = new Sequencia("abababag");//3 



    System.out.println(seq_1.quantos_AB()); 

    System.out.println(seq_2.quantos_AB()); 

    System.out.println(seq_3.quantos_AB()); 

    System.out.println(seq_4.quantos_AB()); 

  } 
} 
    
    
    



  
  
