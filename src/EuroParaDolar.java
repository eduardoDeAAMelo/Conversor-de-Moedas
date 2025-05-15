import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EuroParaDolar extends Armazenamento{
    public EuroParaDolar() throws IOException, InterruptedException {
    }

    // Requisição e resposta da API
    URI endereco5 = URI.create("https://v6.exchangerate-api.com/v6/" + getKey() + "/pair/EUR/USD/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco5)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson5 = new GsonBuilder()
            .create();

    // Armazena o corpo da resposta da requisição
    String json5 = response.body();

    //Utiliza a biblioteca gson para transformar um objeto json em um elemento TransmocaoJSON +
    //o objeto transformacao5 está referenciando essa transformação
    TransformacaoJSON transformacao5 = gson5.fromJson(json5, TransformacaoJSON.class);

}
