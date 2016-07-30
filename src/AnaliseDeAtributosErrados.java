import java.util.ArrayList;

// Classe que analisa atributos buscando atributos fora dos padrões especificados

public class AnaliseDeAtributosErrados {

	private String[][] matrizDeDados;

	public AnaliseDeAtributosErrados(String[][] matrizDeDados) {
		this.matrizDeDados = matrizDeDados;
	}

	public ArrayList<String> getPaisesErrados() {

		ArrayList<String> listaPaisesErrados = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			for (int j = 0; j < 15; j++) {

				if (!(matrizDeDados[i][13].contains("United-States") || matrizDeDados[i][13].contains("Cambodia")
						|| matrizDeDados[i][13].contains("England") || matrizDeDados[i][13].contains("Puerto-Rico")
						|| matrizDeDados[i][13].contains("Canada") || matrizDeDados[i][13].contains("Germany")
						|| matrizDeDados[i][13].contains("Outlying-US(Guam-USVI-etc)")
						|| matrizDeDados[i][13].contains("India") || matrizDeDados[i][13].contains("Japan")
						|| matrizDeDados[i][13].contains("Greece") || matrizDeDados[i][13].contains("South")
						|| matrizDeDados[i][13].contains("China") || matrizDeDados[i][13].contains("Cuba")
						|| matrizDeDados[i][13].contains("Iran") || matrizDeDados[i][13].contains("Honduras")
						|| matrizDeDados[i][13].contains("Philippines") || matrizDeDados[i][13].contains("Italy")
						|| matrizDeDados[i][13].contains("Poland") || matrizDeDados[i][13].contains("Jamaica")
						|| matrizDeDados[i][13].contains("Vietnam") || matrizDeDados[i][13].contains("Mexico")
						|| matrizDeDados[i][13].contains("Portugal") || matrizDeDados[i][13].contains("Ireland")
						|| matrizDeDados[i][13].contains("France")
						|| matrizDeDados[i][13].contains("Dominican-Republic") || matrizDeDados[i][13].contains("Laos")
						|| matrizDeDados[i][13].contains("Ecuador") || matrizDeDados[i][13].contains("Taiwan")
						|| matrizDeDados[i][13].contains("Haiti") || matrizDeDados[i][13].contains("Columbia")
						|| matrizDeDados[i][13].contains("Hungary") || matrizDeDados[i][13].contains("Guatemala")
						|| matrizDeDados[i][13].contains("Nicaragua") || matrizDeDados[i][13].contains("Scotland")
						|| matrizDeDados[i][13].contains("Thailand") || matrizDeDados[i][13].contains("Yugoslavia")
						|| matrizDeDados[i][13].contains("El-Salvador")
						|| matrizDeDados[i][13].contains("Trinadad&Tobago") || matrizDeDados[i][13].contains("Peru")
						|| matrizDeDados[i][13].contains("Hong") || matrizDeDados[i][13].contains("Holand-Netherlands")
						|| matrizDeDados[i][13].contains("?"))) {
					listaPaisesErrados.add(matrizDeDados[i][13]);
				}

			}
		}

		return listaPaisesErrados;
	}

	public ArrayList<String> getSexoErrado() {

		ArrayList<String> listaSexoErrado = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][9].contains("Male") || matrizDeDados[i][9].contains("Female")
					|| matrizDeDados[i][9].contains("?"))) {
				listaSexoErrado.add(matrizDeDados[i][9]);
			}
		}

		return listaSexoErrado;
	}

	public ArrayList<String> getEducacaoErrado() {

		ArrayList<String> listaEducacaoErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][3].contains("Bachelors") || matrizDeDados[i][3].contains("Some-college")
					|| matrizDeDados[i][3].contains("11th") || matrizDeDados[i][3].contains("HS-grad")
					|| matrizDeDados[i][3].contains("Prof-school") || matrizDeDados[i][3].contains("Assoc-acdm")
					|| matrizDeDados[i][3].contains("Assoc-voc") || matrizDeDados[i][3].contains("9th")
					|| matrizDeDados[i][3].contains("7th-8th") || matrizDeDados[i][3].contains("12th")
					|| matrizDeDados[i][3].contains("Masters") || matrizDeDados[i][3].contains("1st-4th")
					|| matrizDeDados[i][3].contains("10th") || matrizDeDados[i][3].contains("Doctorate")
					|| matrizDeDados[i][3].contains("5th-6th") || matrizDeDados[i][3].contains("Preschool")
					|| matrizDeDados[i][3].contains("?"))) {

				listaEducacaoErrada.add(matrizDeDados[i][3]);
			}
		}

		return listaEducacaoErrada;
	}

	public ArrayList<String> getEtniaErrado() {

		ArrayList<String> listaEtniaErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][8].contains("White") || matrizDeDados[i][8].contains("Asian-Pac-Islander")
					|| matrizDeDados[i][8].contains("Amer-Indian-Eskimo") || matrizDeDados[i][8].contains("Other")
					|| matrizDeDados[i][8].contains("Black") || matrizDeDados[i][8].contains("?"))) {

				listaEtniaErrada.add(matrizDeDados[i][8]);
			}
		}

		return listaEtniaErrada;
	}

	public ArrayList<String> getRelacionamentoErrado() {

		ArrayList<String> listaRelacionamentoErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][7].contains("Wife") || matrizDeDados[i][7].contains("Own-child")
					|| matrizDeDados[i][7].contains("Husband") || matrizDeDados[i][7].contains("Not-in-family")
					|| matrizDeDados[i][7].contains("Other-relative") || matrizDeDados[i][7].contains("Unmarried")
					|| matrizDeDados[i][7].contains("?"))) {

				listaRelacionamentoErrada.add(matrizDeDados[i][7]);
			}
		}

		return listaRelacionamentoErrada;
	}

	public ArrayList<String> getEstadoCivilErrado() {

		ArrayList<String> listaEstadoCivilErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][5].contains("Married-civ-spouse") || matrizDeDados[i][5].contains("Divorced")
					|| matrizDeDados[i][5].contains("Never-married") || matrizDeDados[i][5].contains("Separated")
					|| matrizDeDados[i][5].contains("Widowed") || matrizDeDados[i][5].contains("Married-spouse-absent")
					|| matrizDeDados[i][5].contains("Married-AF-spouse") || matrizDeDados[i][5].contains("?"))) {

				listaEstadoCivilErrada.add(matrizDeDados[i][5]);
			}
		}

		return listaEstadoCivilErrada;
	}

	public ArrayList<String> getTipoDeTrabalhoErrado() {

		ArrayList<String> listaTipoDeTrabalhoErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][1].contains("Private") || matrizDeDados[i][1].contains("Self-emp-not-inc")
					|| matrizDeDados[i][1].contains("Self-emp-inc") || matrizDeDados[i][1].contains("Federal-gov")
					|| matrizDeDados[i][1].contains("Local-gov") || matrizDeDados[i][1].contains("State-gov")
					|| matrizDeDados[i][1].contains("Without-pay") || matrizDeDados[i][1].contains("Never-worked")
					|| matrizDeDados[i][1].contains("?"))) {

				listaTipoDeTrabalhoErrada.add(matrizDeDados[i][1]);
			}
		}

		return listaTipoDeTrabalhoErrada;
	}

	public ArrayList<String> getOcupacaoErrado() {

		ArrayList<String> listaOcupacaoErrada = new ArrayList<String>();

		for (int i = 0; i < matrizDeDados.length - 1; i++) {
			if (!(matrizDeDados[i][6].contains("Tech-support") || matrizDeDados[i][6].contains("Craft-repair")
					|| matrizDeDados[i][6].contains("Other-service") || matrizDeDados[i][6].contains("Sales")
					|| matrizDeDados[i][6].contains("Exec-managerial") || matrizDeDados[i][6].contains("Prof-specialty")
					|| matrizDeDados[i][6].contains("Handlers-cleaners")
					|| matrizDeDados[i][6].contains("Machine-op-inspct") || matrizDeDados[i][6].contains("Adm-clerical")
					|| matrizDeDados[i][6].contains("Farming-fishing")
					|| matrizDeDados[i][6].contains("Transport-moving")
					|| matrizDeDados[i][6].contains("Priv-house-serv")
					|| matrizDeDados[i][6].contains("Protective-serv") || matrizDeDados[i][6].contains("Armed-Forces")
					|| matrizDeDados[i][6].contains("?"))) {

				listaOcupacaoErrada.add(matrizDeDados[i][6]);
			}
		}

		return listaOcupacaoErrada;
	}

}
