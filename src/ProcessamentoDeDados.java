public class ProcessamentoDeDados {

	String matrizDeDados[][];

	public ProcessamentoDeDados(String[][] matrizDeDados) {
		this.matrizDeDados = matrizDeDados;
	}

	public String[][] eliminarInstanciasComAtributosAusentes(String[][] matrizDeDadosOriginal) {

		AnaliseAtributosAusentes ausentes = new AnaliseAtributosAusentes(matrizDeDadosOriginal);

		String novaMatrizDeDados[][] = new String[matrizDeDadosOriginal.length
				- ausentes.getNumeroDeInstanciasComVazios()][15];
		int linhaNovaMatriz = 0;

		for (int i = 0; i < matrizDeDadosOriginal.length - 1; i++) {
			if (!this.temAtributosVaziosNaLinha(i)) {
				for (int j = 0; j < matrizDeDadosOriginal[i].length; j++) {
					novaMatrizDeDados[linhaNovaMatriz][j] = matrizDeDadosOriginal[i][j];
				}
				linhaNovaMatriz++;
			}
		}
		return novaMatrizDeDados;

	}

	private boolean temAtributosVaziosNaLinha(int posicaoDaLinha) {

		for (int i = 0; i < matrizDeDados[i].length; i++)
			if (matrizDeDados[posicaoDaLinha][i].contains("?")) {
				return true;
			}
		return false;
	}

}
