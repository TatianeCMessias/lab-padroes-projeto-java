package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String sobrenome, String cep, String idade, String cpf, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(cpf);
		System.out.println(cep);
		System.out.println(idade);
		System.out.println(cidade);
		System.out.println(estado);
	}
}
