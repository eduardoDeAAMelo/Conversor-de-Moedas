import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DolarParaEuro extends Armazenamento {

    public DolarParaEuro() throws IOException, InterruptedException {
    }

    URI endereco2 = URI.create("https://v6.exchangerate-api.com/v6/" + getSerial() + "/pair/USD/EUR");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco2)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson2 = new GsonBuilder()
            .create();
    String json2 = response.body();

    TransformacaoJSON transformacao2 = gson2.fromJson(json2, TransformacaoJSON.class);

}
