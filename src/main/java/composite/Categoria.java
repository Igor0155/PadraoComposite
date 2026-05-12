package composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ComponenteEstoque {

    private List<ComponenteEstoque> componentes;

    public Categoria(String descricao) {
        super(descricao);
        this.componentes = new ArrayList<ComponenteEstoque>();
    }

    public void addComponente(ComponenteEstoque componente) {
        this.componentes.add(componente);
    }

    public String getDetalhes() {
        String saida = "";
        saida = "Categoria: " + this.getDescricao() + "\n";
        for (ComponenteEstoque componente : componentes) {
            saida += componente.getDetalhes();
        }
        return saida;
    }
}