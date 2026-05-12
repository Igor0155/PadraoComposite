package composite;

public class Produto extends ComponenteEstoque {

    private float precoBase;

    public Produto(String descricao, float precoBase) {
        super(descricao);
        this.precoBase = precoBase;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public String getDetalhes() {
        return "Produto: " + this.getDescricao() + " - preço: R$ " + this.precoBase + "\n";
    }
}