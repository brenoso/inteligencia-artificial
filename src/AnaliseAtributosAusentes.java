
public class AnaliseAtributosAusentes {

	private String[][] matrizDeDados;

	public AnaliseAtributosAusentes(String[][] matrizDeDados) {
		this.matrizDeDados = matrizDeDados;
	}

	public int getNumeroAtributosAusentesTotal() {

		int atributosAusentes = 0;

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			for (int j = 0; j < matrizDeDados[i].length; j++) {
				if (matrizDeDados[i][j].contains("?"))
					atributosAusentes++;
			}
		}

		return atributosAusentes;
	}

	public boolean temAtributosAusentesIdade() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][0].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesTipoDeTrabalho() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][1].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesFnlwgt() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][2].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesEducacao() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][3].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesNumeroEducacao() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][4].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesEstadoCivil() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][5].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesOcupacao() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][6].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesRelacionamento() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][7].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesEtnia() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][8].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesSexo() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][9].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesGanhoDeCapital() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][10].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesPerdaDeCapital() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][11].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesHorasPorSemanaTrabalhadas() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][12].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesPais() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][13].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAtributosAusentesClasse() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][14].contains("?"))
				return true;
		}

		return false;
	}

	public boolean seAusenteTipoDeTrabalhoAusenteEmOcupacao() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][1].contains("?") && matrizDeDados[i][6].contains("?"))
				return true;
		}

		return false;
	}

	public boolean temAusenteTipoDeTrabalhoEOcupacaoEPais() {

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][1].contains("?") && matrizDeDados[i][6].contains("?")
					&& matrizDeDados[i][13].contains("?"))
				return true;
		}

		return false;
	}	

	public int getNumeroDeInstanciasComVazios() {
		int contador = 0;

		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][1].contains("?") || matrizDeDados[i][6].contains("?")
					|| matrizDeDados[i][13].contains("?"))
				contador++;
		}
		return contador;
	}

}
