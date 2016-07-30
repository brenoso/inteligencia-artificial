
public class ReducaoDeDimensionalidade {

	public String[][] eliminarAtributoNumeroEducacao(String matrizDeDadosOriginal[][]) {
		String[][] novaMatrizDeDados = new String[matrizDeDadosOriginal.length][matrizDeDadosOriginal[0].length - 1];

		for (int i = 0; i < matrizDeDadosOriginal.length - 1; i++) {
			for (int j = 0; j < matrizDeDadosOriginal[i].length; j++) {
				if (j <= 3)
					novaMatrizDeDados[i][j] = matrizDeDadosOriginal[i][j];
				else
					novaMatrizDeDados[i][j - 1] = matrizDeDadosOriginal[i][j];

			}
		}

		return novaMatrizDeDados;
	}


	public boolean comprovarCorrelacaoDeEducacaoENumeroDeEducacao(String[][] matrizDeDados) {

		boolean temCorrelacao = false;
		for (int i = 0; i < matrizDeDados.length - 1; i++) {

			if (matrizDeDados[i][3].contains("Bachelors") && matrizDeDados[i][4].contains("13")
					|| matrizDeDados[i][3].contains("Some-college") && matrizDeDados[i][4].contains("10")
					|| matrizDeDados[i][3].contains("11th") && matrizDeDados[i][4].contains("7")
					|| matrizDeDados[i][3].contains("HS-grad") && matrizDeDados[i][4].contains("9")
					|| matrizDeDados[i][3].contains("Prof-school") && matrizDeDados[i][4].contains("15")
					|| matrizDeDados[i][3].contains("Assoc-acdm") && matrizDeDados[i][4].contains("12")
					|| matrizDeDados[i][3].contains("Assoc-voc") && matrizDeDados[i][4].contains("11")
					|| matrizDeDados[i][3].contains("9th") && matrizDeDados[i][4].contains("5")
					|| matrizDeDados[i][3].contains("7th-8th") && matrizDeDados[i][4].contains("4")
					|| matrizDeDados[i][3].contains("12th") && matrizDeDados[i][4].contains("8")
					|| matrizDeDados[i][3].contains("Masters") && matrizDeDados[i][4].contains("14")
					|| matrizDeDados[i][3].contains("1st-4th") && matrizDeDados[i][4].contains("2")
					|| matrizDeDados[i][3].contains("10th") && matrizDeDados[i][4].contains("6")
					|| matrizDeDados[i][3].contains("Doctorate") && matrizDeDados[i][4].contains("16")
					|| matrizDeDados[i][3].contains("5th-6th") && matrizDeDados[i][4].contains("3")
					|| matrizDeDados[i][3].contains("Preschool") && matrizDeDados[i][4].contains("1"))
				temCorrelacao = true;
			else
				return false;
		}
		return temCorrelacao;
	}

}
