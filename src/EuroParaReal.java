import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EuroParaReal extends Armazenamento{
    public EuroParaReal() throws IOException, InterruptedException {
    }

    URI endereco6 = URI.create("https://v6.exchangerate-api.com/v6/" + getSerial() + "/pair/EUR/BRL/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco6)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson6 = new GsonBuilder()
            .create();
    String json6 = response.body();

    TransformacaoJSON transformacao6 = gson6.fromJson(json6, TransformacaoJSON.class);

}
