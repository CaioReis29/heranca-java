import java.util.ArrayList;
import java.util.List;

public class AppNavio1 {
    public static void main(String[] args) throws Exception {
        List<NavioGraneleiro> listaNavioGraneleiro = new ArrayList();
        List<NavioContainer> listaNavioContainer = new ArrayList();

        listaNavioGraneleiro.add(new NavioGraneleiro("Estrela do mar", 4, 50000, 4));
        listaNavioContainer.add(new NavioContainer("Bela fera", 2, 100000, 2, 30));
        listaNavioGraneleiro.add(new NavioGraneleiro("Cruzeiro do Sul", 3, 80000, 6));
        listaNavioContainer.add(new NavioContainer("Arrecifes", 2, 120000, 2, 30));
        listaNavioContainer.add(new NavioContainer("Águas Belas", 1, 90000, 0, 25));

        System.out.println("\nNavios container: ");
        for (NavioContainer navioContainer : listaNavioContainer) {
            System.out.println(navioContainer);
        }
        
        System.out.println("\nNavios Graneleiros: ");
        
        for (NavioGraneleiro navioGraneleiro : listaNavioGraneleiro) {
            System.out.println(navioGraneleiro);
        }
    }
}
