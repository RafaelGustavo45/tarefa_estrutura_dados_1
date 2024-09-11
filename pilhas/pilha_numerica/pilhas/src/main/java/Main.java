// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Pilha p = new Pilha();
    //inversão de pilha
    p.push(5);
    p.push(1);
    p.push(3);
    p.push(7);
    Intermediario it = new Intermediario(p);
    
    it.inverter(); 

    //calculo media, menor e maior

    Pilha p2 = new Pilha();
    p2.push(8);
    p2.push(4);
    p2.push(6);
    p2.push(13);

    Intermediario it2 = new Intermediario(p2);

    it2.calculos();

    //ordenando Pilha
     Pilha p3 = new Pilha();
     p3.push(1);
     p3.push(8);
     p3.push(3);
     p3.push(10);

    Intermediario it3 = new Intermediario(p3);

    Pilha p_ordem = it3.ordemCrescente();

    while (!p_ordem.estaVazia()) {
      System.out.println("retirei: "+ p_ordem.pop());
    }
    
    

    
    
    

    
    
}


  
  
}