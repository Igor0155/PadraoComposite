package composite;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    @Test
    void deveRetornarDetalhesCatalogo() {
        // Categoria 1 (vazia)
        Categoria cat1 = new Categoria("Eletrodomésticos");

        // Categoria 2 (com 1 produto)
        Categoria cat2 = new Categoria("Informática");
        Produto prod21 = new Produto("Notebook Dell", 4500.0f);
        cat2.addComponente(prod21);

        // Categoria 3 (com 2 produtos)
        Categoria cat3 = new Categoria("Periféricos");
        Produto prod31 = new Produto("Mouse Sem Fio", 150.0f);
        Produto prod32 = new Produto("Teclado Mecânico", 350.0f);
        cat3.addComponente(prod31);
        cat3.addComponente(prod32);

        // Raiz do catálogo agregando as categorias
        Categoria raiz = new Categoria("Catálogo Geral 2024");
        raiz.addComponente(cat1);
        raiz.addComponente(cat2);
        raiz.addComponente(cat3);

        Catalogo catalogo = new Catalogo();
        catalogo.setRaiz(raiz);

        assertEquals("Categoria: Catálogo Geral 2024\n" +
                "Categoria: Eletrodomésticos\n" +
                "Categoria: Informática\n" +
                "Produto: Notebook Dell - preço: R$ 4500.0\n" +
                "Categoria: Periféricos\n" +
                "Produto: Mouse Sem Fio - preço: R$ 150.0\n" +
                "Produto: Teclado Mecânico - preço: R$ 350.0\n", catalogo.getCatalogo());
    }

    @Test
    void deveRetornarExcecaoCatalogoSemRaiz() {
        try {
            Catalogo catalogo = new Catalogo();
            catalogo.getCatalogo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Catálogo sem componentes", e.getMessage());
        }
    }
}