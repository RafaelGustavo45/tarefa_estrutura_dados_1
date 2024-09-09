
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List list = new List();

    int op;
    do {
      showMenu();
      op = sc.nextInt();

      switch (op) {
        case 1: {
          System.out.println("Digite o valor a ser inserido no início da lista: ");
          Double value = sc.nextDouble(); // le o numero informado
          list.addIni(value);
          break;
        }
        case 2: {
          System.out.println("Digite o valor a ser inserido no final da lista: ");
          Double value = sc.nextDouble(); // le o numero informado
          list.addFim(value);
          break;
        }
        case 3: {
          System.out.println("Digite a posição que você quer inserir o valor: ");
          int posicao = sc.nextInt(); // le o numero informado
          System.out.println("Digite o valor a ser inserido na posição: ");
          Double value = sc.nextDouble(); // le o numero informado
          list.addPosicao(posicao, value);
          break;
        }
        case 4: {
          System.out.println("O número de elementos da lista é: "+list.tamanho());
          break;
        }
        case 5: {
          System.out.println(list.toString());
          break;
        }
        case 6: {
          System.out.println("Digite a posição que você quer buscar o valor: ");
          int posicao = sc.nextInt(); // le o numero informado
          System.out.println("O valor armazenado na posição:"+posicao+ " é: "+list.buscaNoPosicao(posicao).getValue());
          break;
        }
        case 7: {
          list.removeInicio();
          System.out.println("Remoção do início efetuada com sucesso!");
          break;
        }
        case 8: {
          list.removeFinal();
          System.out.println("Remoção do final efetuada com sucesso!");
          break;
        }
        case 9: {
          System.out.println("Digite o valor da posição a ser removida: ");
          int posicao = sc.nextInt(); // le o numero informado
          list.removePosicao(posicao);
          break;
        }
        case 10: {
            System.out.println("Buscando impares e pares");
            list.ParesImpares();
            break;
          }
        case 11: {
            System.out.println("informar o numero");
            int num = sc.nextInt();
            System.out.println("apareceu: "+ list.QuantasVezesNumero(num) +" vezes");
            break;
          }

        case 12: {
            
            System.out.println("a soma dos impares é: "+ list.SomaImpares());
            break;
          }

        case 13: {
          System.out.println("informar quantos:");
          int quantidade = sc.nextInt();
          list.removerPrimeiros(quantidade);
          break;
          }
        case 14: {
            System.out.println("informar posicao:");
            int posi = sc.nextInt();
            System.out.println("informar valor:");
            int valor = sc.nextInt();
            list.AlterarElementoNaPosicao(posi, valor);
            break;
            }
        case 15: {
            System.out.println("invertendo a lista");
            list.inverter();
            System.out.println("inverteu:" +list.toString());
            break;
            }
        case 16: {
            System.out.println("colocando o menor no começo");
            int n = list.buscarMenorValor();
            System.out.println("menor valor: "+ n);
            list.inserirElementoNoComeco(n);
            break;
            }
        case 17: {
            System.out.println("digite o menor valor");
            int menor = sc.nextInt();
            System.out.println("digite o maior valor");
            int maior = sc.nextInt();
            System.out.println("entre "+maior+" e "+menor+" há:");
            System.out.println(list.VezesEntreValores(menor,maior)+" elementos");
            break;
            }
        case 18: {
          System.out.println("Programa Encerrado!");
          break;
        }
        default: {
          System.out.println("Opção inválida");
        }
      }
    } while (op != 18);

    sc.close();
  }

  public static void showMenu() {
    System.out.println("1 - Inserir no início da lista");
    System.out.println("2 - Inserir no final da lista");
    System.out.println("3 - Inserir na posição N da lista");
    System.out.println("4 - Quantidade de nós (tamanho)");
    System.out.println("5 - Percorrer a lista");
    System.out.println("6 - Pesquisar um nó ou uma posição específica");
    System.out.println("7 - Remover do início da lista");
    System.out.println("8 - Remover do final da lista");
    System.out.println("9 - Remover da posição N da lista");
    System.out.println("10- buscar impares e pares");
    System.out.println("11- quantidade de um numero na lista");
    System.out.println("12- somar os impares");
    System.out.println("13- remover quantos pelo inicio");
    System.out.println("14- alterar elemento na posição");
    System.out.println("15- inverter a lista");
    System.out.println("16- colocar o menor elemento no começo");
    System.out.println("17- contas quantos elementos há entre x e y");
    System.out.println("18- Sair");
  }

}
