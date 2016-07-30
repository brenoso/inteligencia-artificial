import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException {
		String matrizDeDados[][];

		LeituraDeDados leituraDeDados = new LeituraDeDados();
		matrizDeDados = leituraDeDados.getMatrizDeDados();

		System.out.println(
				"Tamanho inicial da matriz de dados: [" + matrizDeDados.length + "][" + matrizDeDados[0].length + "] ");
		System.out.println("Total de atributos: " + matrizDeDados.length * matrizDeDados[0].length + "\n");

		AnaliseDeAtributosErrados analiseAtributosErrados = new AnaliseDeAtributosErrados(matrizDeDados);
		ArrayList<String> paisesErrados = analiseAtributosErrados.getPaisesErrados();
		ArrayList<String> sexoErrado = analiseAtributosErrados.getSexoErrado();
		ArrayList<String> educacaoErrada = analiseAtributosErrados.getEducacaoErrado();
		ArrayList<String> etniaErrada = analiseAtributosErrados.getEtniaErrado();
		ArrayList<String> relacionamentoErrada = analiseAtributosErrados.getRelacionamentoErrado();
		ArrayList<String> estadoCivilErrada = analiseAtributosErrados.getEstadoCivilErrado();
		ArrayList<String> tipoDeTrabalhoErrada = analiseAtributosErrados.getTipoDeTrabalhoErrado();
		ArrayList<String> ocupacaoErrada = analiseAtributosErrados.getOcupacaoErrado();

		// Checa se existem dados errados
		for (int i = 0; i < paisesErrados.size(); i++)
			System.out.println("paises errados: " + paisesErrados.get(i));

		for (int i = 0; i < sexoErrado.size(); i++)
			System.out.println("sexos errados: " + sexoErrado.get(i));

		for (int i = 0; i < educacaoErrada.size(); i++)
			System.out.println("educacao errada: " + educacaoErrada.get(i));

		for (int i = 0; i < etniaErrada.size(); i++)
			System.out.println("etnia errada: " + etniaErrada.get(i));

		for (int i = 0; i < relacionamentoErrada.size(); i++)
			System.out.println("relacionamento errada: " + relacionamentoErrada.get(i));

		for (int i = 0; i < estadoCivilErrada.size(); i++)
			System.out.println("estadoCivil errada: " + estadoCivilErrada.get(i));

		for (int i = 0; i < tipoDeTrabalhoErrada.size(); i++)
			System.out.println("tipoDeTrabalho errada: " + tipoDeTrabalhoErrada.get(i));

		for (int i = 0; i < ocupacaoErrada.size(); i++)
			System.out.println("ocupacao errada: " + ocupacaoErrada.get(i));

		AnaliseAtributosAusentes analiseAtributosAusentes = new AnaliseAtributosAusentes(matrizDeDados);

		System.out
				.println("Total de atributos ausentes: " + analiseAtributosAusentes.getNumeroAtributosAusentesTotal());

		System.out.println("Numero de instancias que contem um ou mais atributos ausentes: "
				+ analiseAtributosAusentes.getNumeroDeInstanciasComVazios());

		System.out.println("tamanho da matriz contendo ausentes(total): " + matrizDeDados.length);

		// Processo de limpeza de atributos ausentes

		ProcessamentoDeDados p = new ProcessamentoDeDados(matrizDeDados);

		matrizDeDados = p.eliminarInstanciasComAtributosAusentes(matrizDeDados);

		System.out.println("tamanho matriz depois de eliminar os ausentes: " + matrizDeDados.length);

		AnaliseAtributosAusentes analiseAtributosAusentes2 = new AnaliseAtributosAusentes(matrizDeDados);
		System.out.println("Numero de instancias que contem um ou mais atributos ausentes depois da limpeza : "
				+ analiseAtributosAusentes2.getNumeroDeInstanciasComVazios());

		// Processo de redução de dimensionalidade
		ReducaoDeDimensionalidade r = new ReducaoDeDimensionalidade();
		System.out.println("Existe correlacao entre os atributos Educacao e NroEducacao: "
				+ r.comprovarCorrelacaoDeEducacaoENumeroDeEducacao(matrizDeDados));
		matrizDeDados = r.eliminarAtributoNumeroEducacao(matrizDeDados);

		// Escrita do novo arquivo
		EscritaDeDados e = new EscritaDeDados();
		e.escreverMatrizDeDados(matrizDeDados);
		System.out.println(
				"\nTamanho final da matriz de dados: [" + matrizDeDados.length + "][" + matrizDeDados[0].length + "]");
		System.out.println("Total de atributos: " + matrizDeDados.length * matrizDeDados[0].length);

	}
}
