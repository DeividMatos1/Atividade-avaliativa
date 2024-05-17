public class RectangleDrawerTest {

    // Interface que define o método draw
    public interface RectangleDrawer {
        void draw(String text);
    }

    // Classe para desenhar retângulos com bordas simples
    public static class SimpleBorderRectangleDrawer implements RectangleDrawer {
        @Override
        public void draw(String text) {
            int width = text.length() + 4;
            System.out.println("+" + "-".repeat(width - 2) + "+");
            System.out.println("| " + text + " |");
            System.out.println("+" + "-".repeat(width - 2) + "+");
        }
    }

    // Classe para desenhar retângulos com bordas arredondadas
    public static class RoundedBorderRectangleDrawer implements RectangleDrawer {
        @Override
        public void draw(String text) {
            int width = text.length() + 4;
            System.out.println(" ." + "-".repeat(width - 2) + ". ");
            System.out.println("( " + text + " )");
            System.out.println(" `" + "-".repeat(width - 2) + "' ");
        }
    }

    // Classe para desenhar retângulos com bordas de linha dupla
    public static class DoubleLineBorderRectangleDrawer implements RectangleDrawer {
        @Override
        public void draw(String text) {
            int width = text.length() + 4;
            System.out.println("╔" + "═".repeat(width - 2) + "╗");
            System.out.println("║ " + text + " ║");
            System.out.println("╚" + "═".repeat(width - 2) + "╝");
        }
    }

    // Classe para desenhar retângulos com bordas de arte ASCII
    public static class AsciiArtRectangleDrawer implements RectangleDrawer {
        @Override
        public void draw(String text) {
            int width = text.length() + 4;
            System.out.println("/" + "*".repeat(width - 2) + "\\");
            System.out.println("* " + text + " *");
            System.out.println("\\" + "*".repeat(width - 2) + "/");
        }
    }

    // Método principal para testar as implementações
    public static void main(String[] args) {
        RectangleDrawer simpleDrawer = new SimpleBorderRectangleDrawer();
        RectangleDrawer roundedDrawer = new RoundedBorderRectangleDrawer();
        RectangleDrawer doubleLineDrawer = new DoubleLineBorderRectangleDrawer();
        RectangleDrawer asciiArtDrawer = new AsciiArtRectangleDrawer();

        String text = "Deivid Matos";

        System.out.println("Borda Simples:");
        simpleDrawer.draw(text);

        System.out.println("\n Borda arredondada:");
        roundedDrawer.draw(text);

        System.out.println("\n Borda Dupla:");
        doubleLineDrawer.draw(text);

        System.out.println("\nASCII Borda:");
        asciiArtDrawer.draw(text);
    }
}