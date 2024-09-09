
public class List {

	private Node head;
	private Node lastNode;
	private int totalDeElementos = 0;
	private final String NAO_EXISTE = "Posição não existe.";
  private final String LISTA_VAZIA = "Lista está vazia.";
	private final String FORA_INDICE = "O numero ultrapassa o tamanho da lista";
	
	public void addIni(Double value) {
		//1 - Inserir no início da lista
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;

		if (totalDeElementos == 0) {
			lastNode = head;
		}
		totalDeElementos++;
	}

	public void addFim(Double value) {
		//2 - Inserir no final da lista
        if (totalDeElementos == 0) {
			addIni(value);
		} else {
			Node node = new Node();
			node.setValue(value);
			lastNode.setNext(node);
			lastNode = node;
			totalDeElementos++;
		}
	}

	public void addPosicao(int posicao, Double value) {
		//3 - Inserir em posição específica
		if (posicao == 0) { //está pedindo para adicionar na primeira posição
			addIni(value);
		} else if (posicao == totalDeElementos) { //está pedindo para adicionar no fim
			addFim(value);
		} else { //adicionar no meio
			Node nodeAnterior = buscaNoPosicao(posicao - 1);
			Node nodeNovo     = new Node();
			nodeNovo.setValue(value);
			nodeNovo.setNext(nodeAnterior.getNext());
			nodeAnterior.setNext(nodeNovo);
			totalDeElementos++;
		}
	}

	public int tamanho() {
		//4 - Quantidade de nós (tamanho)
		return totalDeElementos;
	}

	@Override
	public String toString() {    
		//5 - Percorrer a lista (Imprimir)
		
		//Aqui estamos utilizando a classe StringBuffer 
		//que é muito útil para otimizar a construção de Strings potencialmente grandes
		StringBuffer sb = new StringBuffer(); 
		sb.append("[");
		
		Node p = head;
		while (p != null) {
			sb.append(p.getValue() + " ");
			p = p.getNext();
		}
		
		sb.append("]");
		return sb.toString();
	}

	public Node buscaNoPosicao(int posicao) {
		//6 - Pesquisar um nó ou uma posição específica
		if (!(posicao >= 0 && posicao <= totalDeElementos)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        Node noAtual = head;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getNext();
        }
        return noAtual;
	}

	public void removeInicio() {
		//7 - Remover do início da lista		
		if (totalDeElementos == 0) {
            throw new RuntimeException(LISTA_VAZIA);
        }
        head = head.getNext();
        totalDeElementos--;

        if (totalDeElementos == 0) {
            lastNode = null;
        }
	}

	public void removeFinal() {
 		//8 - Remover do final da lista		
		if (totalDeElementos == 0) {
        	throw new RuntimeException(LISTA_VAZIA);
        }
       if (totalDeElementos == 1) {
            removeInicio();
        } else {
			Node nodepenultimo = buscaNoPosicao(totalDeElementos - 2);
			nodepenultimo.setNext(null);
			lastNode = nodepenultimo;
			totalDeElementos--;
		}
    }

    public void removePosicao(int posicao) {
		//9 - Remover de uma posição específica
		if (!(posicao >= 0 && posicao <= totalDeElementos)) {
            throw new IllegalArgumentException(NAO_EXISTE);
        }
        if (posicao == 0) {
            removeInicio();
        }
        if (posicao == totalDeElementos - 1) {
            removeFinal();
        } else {
			Node noAnterior = buscaNoPosicao(posicao - 1);
			Node atual = noAnterior.getNext();
			Node proximo = atual.getNext();
			noAnterior.setNext(proximo);
			atual.setNext(null);
			totalDeElementos--;
		}
    }

	public void ParesImpares(){
		List pares = new List();
		List impares = new List();

		//percorrer a lista principal

		Node p = head;
		while (p != null) {
			
			int n = p.getValue().intValue();
			p = p.getNext();
			if(n%2 == 0){
				pares.addIni(Double.valueOf(n));
			} else{
				impares.addIni(Double.valueOf(n));
			}
			
		}

		System.out.println("pares:"+ pares.toString());
    
		System.out.println("impares"+ impares.toString());
		

		

		
	}

	public Integer QuantasVezesNumero(int num){
		//List pares = new List();
		//List impares = new List();

		//percorrer a lista principal
		int vezes=0;
		Node p = head;
		while (p != null) {

			int n = p.getValue().intValue();
			p = p.getNext();
			if (n == num){
				vezes++;
			}

		}

		return vezes;
  }

	public Integer SomaImpares(){
		int soma=0;
		Node p = head;
		while (p != null) {

			int n = p.getValue().intValue();
			p = p.getNext();
			if (n%2 != 0){
				soma= soma+n;
			}

		}

		return soma;
	}

	public Integer VezesEntreValores(int valor_minimo, int valor_maximo){
		int vezes=0;
		Node p = head;
		while (p != null) {

			int n = p.getValue().intValue();
			p = p.getNext();
			if (n >= valor_minimo && n <= valor_maximo){
				vezes++;
			}

		}

		return vezes;
	}

	public void removerPrimeiros(int quantos){
		if (totalDeElementos<quantos){
			throw new RuntimeException(FORA_INDICE);
		} else{
			for (int i = 0; i < quantos; i++){
				removeInicio();
			}
			System.out.println("elementos removidos");
		}
	}

	public void AlterarElementoNaPosicao(int posicao, int novo_valor){
		Node p = head;
		int pos= -1;
		while (p != null) {

			int n = p.getValue().intValue();
			
			pos++;
			if (pos == posicao){
				p.setValue(Double.valueOf(novo_valor));
				System.out.println("alterado com sucesso!");
				break;
				
			} else{
				p = p.getNext();
			}
		

		}
	}

	/*public void inverter(){

		System.out.println("antes:");
		System.out.println(toString());
		
		
		//int pegar_ultimo = tamanho()-1;
    int i =0;
		while (i<totalDeElementos) {
			//Node node_last = buscaNoPosicao(pegar_ultimo);
			//Double last = node_last.getValue();
			//int laster = Integer.valueOf(last);
      //Double last_double = Double.valueOf(last);
			//removeFinal();
			//addIni(last_double);

			Node n = buscaNoPosicao(totalDeElementos-1);
			Double valor = n.getValue();
      addIni(valor);
			removeFinal();
			
			i=i+1;
			
   }

	  System.out.println("conferindo inversão");
		System.out.println(toString());
		
	}*/

	public void inverter() {
			Node prev = null;
			Node next = null;
			Node current = head;
			while (current != null) {
					next = current.getNext();
					current.setNext(prev);
					prev = current;
					current = next;
			}
			head = prev;
	}

	public int buscarMenorValor(){
		//identificar o menor
		int indice=0;
	  int maximo= Integer.MAX_VALUE;
		int minimo = Integer.MIN_VALUE;
		Node p = head;
		int menor = p.getValue().intValue();
		while (p != null) {
			int num = p.getValue().intValue();
			p = p.getNext();
			if (num < menor){
				menor = num;
			}
		}

		return menor;
		

		

		
	}

	public void inserirElementoNoComeco(int num){
		Node p = head;
		int pos=0;
		//int menor = p.getValue().intValue();
		while (p != null) {
			int num2 = p.getValue().intValue();
			p = p.getNext();
			if (num2==num){
				removePosicao(pos);
				addIni(Double.valueOf(num2));
			} else{
				pos++;
			}
	  }
	}

	public static int buscaMenorValor(int[] lista) {
					int menor = lista[0]; // Assume que o primeiro elemento é o menor
					for (int i = 1; i < lista.length; i++) {
							if (lista[i] < menor) {
									menor = lista[i]; // Atualiza o menor valor
							}
					}
					return menor;
			}
	

	
}