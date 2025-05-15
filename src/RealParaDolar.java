import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RealParaDolar extends Armazenamento{

    public RealParaDolar() throws IOException, InterruptedException {
    }

    //Requisição e resposta da API
    URI endereco3 = URI.create("https://v6.exchangerate-api.com/v6/" + getKey() + "/pair/BRL/USD/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco3)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson3 = new GsonBuilder()
            .create();

    // Armazena o corpo da resposta da requisição
    String json3 = response.body();

    //Utiliza a biblioteca gson para transformar um objeto json em um elemento TransmocaoJSON +
    //o objeto transformacao3 está referenciando essa transformação
    TransformacaoJSON transformacao3 = gson3.fromJson(json3, TransformacaoJSON.class);

}

