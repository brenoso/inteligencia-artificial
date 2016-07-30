import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Classe que recebe uma matriz de dados no construtor e escreve em um arquivo.

public class EscritaDeDados {

	public void escreverMatrizDeDados(String[][] matrizDeDados) {

		try {
			BufferedWriter escreverArq = new BufferedWriter(new FileWriter("NovaMatrizDeDados"));

			for (int i = 0; i < matrizDeDados.length - 1; i++) {
				for (int j = 0; j < matrizDeDados[0].length; j++) {
					if (j != matrizDeDados[i].length -1)
						escreverArq.append(matrizDeDados[i][j] + ", ");
					else 
						escreverArq.append(matrizDeDados[i][j]);
				}
				escreverArq.append("\n");
			}

			escreverArq.close();
		} catch (IOException e) {
			System.out.println("Erro ao escrever arquivo!");
		}
	}

}
