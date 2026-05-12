package composite;

public class Catalogo {

    private ComponenteEstoque raiz;

    public void setRaiz(ComponenteEstoque raiz) {
        this.raiz = raiz;
    }

    public String getCatalogo() {
        if (this.raiz == null) {
            throw new NullPointerException("Catálogo sem componentes");
        }
        return this.raiz.getDetalhes();
    }
}