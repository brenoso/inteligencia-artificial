import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeDados {

	private String[][] matrizDeDados = new String[32562][15];

	private void leitor() throws IOException {
		try {

			BufferedReader lerArq = new BufferedReader(new FileReader("dataset.txt"));
			String linha = lerArq.readLine(); // lê a primeira linha do arquivo.
			String[] linhaQuebrada;
			int i = 0;

			do {
				linhaQuebrada = divideLinha(linha);

				for (int j = 0; j < linhaQuebrada.length; j++) {
					matrizDeDados[i][j] = linhaQuebrada[j];
				}

				i++;

				linha = lerArq.readLine(); // continua lendo as linhas do arquivo.
			} while (linha != null);

			lerArq.close();

		} catch (FileNotFoundException e) {

			System.out.println("Arquivo não encontrado");
		}
	}

	private String[] divideLinha(String linha) {

		String[] linhaDividida;
		linhaDividida = linha.split(", ");

		return linhaDividida;

	}

	public String[][] getMatrizDeDados() throws IOException {
		this.leitor();
		return matrizDeDados;
	}

}
