class Produto {

	int codigo;
	float valorUnitario, quantidade;
	String nome, unidade;

	public float valorTotal (){
		return this.quantidade * this.valorUnitario;
	}

}


class LerProdutos{

	public static void main(String[] args) throws Exception
	{	
		Produto p = new Produto ();
		float maior = 0, total = 0;

		System.out.println("===== LENDO PRODUTOS =====");

		System.out.print("Quantos produtos deseja cadastrar? ");
		Produto produtos [] = new Produto [JUtil.readInt()];
		
		for (int i = 0; i < produtos.length; i++ ){

			produtos [i] = new Produto ();

			
			System.out.println("Digite o codigo do produto " + i);
				produtos[i].codigo = JUtil.readInt ();
			System.out.println("Digite o nome do produto " + i);
				produtos[i].nome = JUtil.readString ();
			System.out.println("Digite a quantidade desse produto " + i);
				produtos[i].quantidade = JUtil.readFloat ();
			System.out.println("Digite a unidade desse produto " + i);
				produtos[i].unidade = JUtil.readString ();
			System.out.println("Qual o preco do produto " + i);
				produtos[i].valorUnitario = JUtil.readFloat ();
				
		}
		
		for (int i = 0; i < produtos.length; i++){

			maior = produtos[i].valorTotal();

			if( maior > produtos[i].valorTotal()){
				maior = produtos[i].valorTotal();
			}

			
		
		}

		
		System.out.println("===== MOSTRANDO OS PRODUTOS =====");
		
		for (int i = 0; i < produtos.length; i++ ){

			System.out.println("Codigo: " + produtos[i].codigo);
			System.out.println(" - Nome do Prdouto: " + produtos[i].nome);
			System.out.println(" - Quantidade: " + produtos[i].quantidade);
			System.out.println(" - Unidade: " + produtos[i].unidade);
			System.out.println(" - Valor: " + produtos[i].valorUnitario);
			System.out.println(" - Total: " + produtos[i].valorTotal());
			
			

		}

		System.out.println("Soma de Produtos: " + total);
		System.out.println("O produto mais valioso " + maior);
	}
	
}

