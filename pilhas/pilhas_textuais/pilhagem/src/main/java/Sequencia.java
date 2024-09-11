

import java.util.ArrayList; 



public class Sequencia{ 

  String palavra; 



  public Sequencia(String palavra){ 

    this.palavra=palavra; 

  } 



  /*public int quantos_AB(){ 

    String p=this.palavra; 

    ArrayList a = new ArrayList(); 





    for (int i=0; i<p.length(); i++) { 

       char c = p.charAt(i); 

       a.add(c); 

    } 

    int contagem = 0; 



    for (Object item : a) { 

        if (item.equals('a')) { 

            contagem++; 

        } 

    } 



    return contagem; 





  }*/ 



  public int quantos_AB() { 

    String p = this.palavra; 

    int contagem = 0; 



    ArrayList<Character> a = new ArrayList<Character>(); 



    for (int i = 0; i < p.length(); i++) { 

            a.add(p.charAt(i)); 

        } 



    System.out.println(a); 



    for (int i = 0; i < a.size() - 1; i++) { 

          if (a.get(i) == 'a' && a.get(i + 1) == 'b') { 

              contagem++; 

          } 

    } 

    // motivo do uso: acesso pelos indices, pois  

    // o calculo necessita da ordem dos elementos 

    // "a" deve estar antes de "b", por isso foi 

    // usado arraylist 



     return contagem; 

  } 

} 