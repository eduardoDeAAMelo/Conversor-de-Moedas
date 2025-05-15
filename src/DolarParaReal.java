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

    URI endereco1 = URI.create("https://v6.exchangerate-api.com/v6/" + getSerial() + "/pair/USD/BRL/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco1)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson1 = new GsonBuilder()
            .create();
    String json1 = response.body();

    TransformacaoJSON transformacao1 = gson1.fromJson(json1, TransformacaoJSON.class);


}