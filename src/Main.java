import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu texto: ");
        String texto = leitura.nextLine();

        Pattern pattern = Pattern.compile("#\\w+"); //cria um regex e define o que é a hashtags
        Matcher matcher = pattern.matcher(texto); //isso é como um buscador no texto


        ArrayList<String> hashtags = new ArrayList<>();//é uma lista para guardar as hahstags.

        while(matcher.find()){//Repita enquanto a condição for verdadeira.
            // Procure a próxima ocorrência que corresponde ao padrão.
            hashtags.add(matcher.group()); // adiciona na lista e retorna o texto encontrado pelo regex.

            if(hashtags.isEmpty()){// valor vazio
                System.out.println("Nenhuma hashtag encontrada.");
            } else {
                System.out.println("Hashtags encontradas: " + String.join(", ", hashtags));
                //o Java junta todos os elementos usando ", " como separador.
            }
        }
        leitura.close();


    }
}