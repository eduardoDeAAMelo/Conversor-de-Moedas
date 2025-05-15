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

    URI endereco3 = URI.create("https://v6.exchangerate-api.com/v6/" + getSerial() + "/pair/BRL/USD/");

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(endereco3)
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    Gson gson3 = new GsonBuilder()
            .create();
    String json3 = response.body();

    TransformacaoJSON transformacao3 = gson3.fromJson(json3, TransformacaoJSON.class);

}

