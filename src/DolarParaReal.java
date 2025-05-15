import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DolarParaReal extends Armazenamento {

    public DolarParaReal() throws IOException, InterruptedException {
    }

    // Requisição e resposta da API
    URI endereco1 = URI.create("https://v6.exchangerate-api.com/v6/" + getKey() + "/pair/USD/BRL/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco1)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson1 = new GsonBuilder()
            .create();

    // Armazena o corpo da resposta da requisição
    String json1 = response.body();

    //Utiliza a biblioteca gson para transformar um objeto json em um elemento TransmocaoJSON +
    //o objeto transformacao1 está referenciando essa transformação
    TransformacaoJSON transformacao1 = gson1.fromJson(json1, TransformacaoJSON.class);


}