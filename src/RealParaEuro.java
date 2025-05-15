import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RealParaEuro extends Armazenamento{
    public RealParaEuro() throws IOException, InterruptedException {
    }

    //Requisição e resposta da API
    URI endereco4 = URI.create("https://v6.exchangerate-api.com/v6/" + getKey() + "/pair/BRL/EUR/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco4)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson4 = new GsonBuilder()
            .create();

    // Armazena o corpo da resposta da requisição
    String json4 = response.body();

    //Utiliza a biblioteca gson para transformar um objeto json em um elemento TransmocaoJSON +
    //o objeto transformacao4 está referenciando essa transformação
    TransformacaoJSON transformacao4 = gson4.fromJson(json4, TransformacaoJSON.class);

}
