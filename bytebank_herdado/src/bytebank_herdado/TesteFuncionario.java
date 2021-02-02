package bytebank_herdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario nico = new Funcionario();

		nico.setNome("nico steppat");
		nico.setCpf("223344464-9");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}
}
