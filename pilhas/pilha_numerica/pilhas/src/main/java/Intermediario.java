import java.util.ArrayList;
import java.util.Collections;
public class Intermediario{

  Pilha p1;
  Pilha p2;

  public Intermediario(Pilha p1, Pilha p2){
    this.p1=p1;
    this.p2=p2;
  }

  public Intermediario(Pilha p1){
    this.p1=p1;
  }
  //exercicio media, menor e maior
  public void calculos() { 

      Pilha p = this.p1; 

      int soma = 0; 

      int quantos = 0; 

      int menor = 0; // Inicialização incorreta 

      int maior = 0; 



      if (!p.estaVazia()) { 

          menor = p.pop(); // Inicializa menor com o primeiro elemento 

          quantos++; 

          soma += menor; 

          maior = menor; // Inicializa maior com o mesmo valor para a primeira iteração 

      } 



      while (!p.estaVazia()) { 

          int elemento = p.pop(); 

          soma += elemento; 

          quantos++; 



          if (elemento < menor) { 

              menor = elemento; 

          } 

          if (elemento > maior) { 

              maior = elemento; 

          } 

      } 



      double media = (double) soma / quantos; 



      System.out.println("media=" + media); 

      System.out.println("maior=" + maior); 

      System.out.println("menor=" + menor); 

  } 

  
  //exercicio inversão de pilha
  public Pilha inverter(){
      Pilha p_inverso = new Pilha();
      while(!p1.estaVazia()){
        int elemento = p1.pop();
        p_inverso.push(elemento);
        System.out.println("retirei: "+elemento);
      }

    this.p2=p_inverso;
    return p2;

  
  }

  public Pilha ordemCrescente(){
    Pilha p_crescente = new Pilha();
    ArrayList<Integer> lista = new ArrayList<Integer>();
    ArrayList<Integer> lista_ordenada = new ArrayList<Integer>();
    while(!p1.estaVazia()){
      int elemento = p1.pop();
      lista.add(elemento);
      
    }
    //colocar na ordem crescente

    Collections.sort(lista);
    lista_ordenada = lista;

    for (int numero : lista_ordenada) {
      p_crescente.push(numero);
    }
    return p_crescente;
  }
}