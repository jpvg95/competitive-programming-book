import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Solo lee por lineas
		String s;
		while((s = br.readLine()) != null){
			int n = Integer.parseInt(br.readLine());
			String l[] = br.readLine().split(" ");
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//No pone un salto de linea al final como si lo hace System.out.println(). Por tanto, se debe poner \n cuando sea necesario
		bw.write("Hola mundo\n");
		//El flush es el que realmente imprime en consola. En lo posible, hacer flush solo una vez, al final de todo
		bw.flush();
	}

}