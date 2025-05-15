import com.google.gson.annotations.SerializedName;

public class TransformacaoJSON {

    @SerializedName("base_code")
    private String primeiraMoeda;
    @SerializedName("target_code")
    private String segundaMoeda;
    @SerializedName("conversion_rate")
    private double taxaConversao;

    private double resultadoConversao;

    public String getPrimeiraMoeda() {
        return primeiraMoeda;
    }

    public void setPrimeiraMoeda(String primeiraMoeda) {
        this.primeiraMoeda = primeiraMoeda;
    }

    public String getSegundaMoeda() {
        return segundaMoeda;
    }

    public void setSegundaMoeda(String segundaMoeda) {
        this.segundaMoeda = segundaMoeda;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public void setTaxaConversao(double taxaConversao) {
        this.taxaConversao = taxaConversao;
    }

    public double getResultadoConversao() {
        return resultadoConversao;
    }

    public void setResultadoConversao(double resultadoConversao) {
        this.resultadoConversao = resultadoConversao;
    }

    @Override
    public String toString() {
        return "Conversão: [ Moeda para conversão: " + primeiraMoeda +
                ", moeda convertida: " + segundaMoeda +
                ", taxa de conversão: " + taxaConversao +
                ", resultado da conversão: " + resultadoConversao + "]";
    }
}

