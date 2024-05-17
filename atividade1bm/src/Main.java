//classe abstrata Progression
abstract class Progression {
    protected long current;
    public Progression(long start) {
        this.current = start;
    }
    public abstract long next();
    public void reset(long start) {
        this.current = start;
    }
}
//progressão aritmética
class ArithmeticProgression extends Progression {
    private long step;
    public ArithmeticProgression(long start, long step) {
        super(start);
        this.step = step;
    }
    @Override
    public long next() {
        current += step;
        return current;
    }
}
//progressão geométrica
class GeometricProgression extends Progression {
    private long ratio;
    public GeometricProgression(long start, long ratio) {
        super(start);
        this.ratio = ratio;
    }
    @Override
    public long next() {
        current *= ratio;
        return current;
    }
}
//progressão de Fibonacci
class FibonacciProgression extends Progression {
    private long prev;
    public FibonacciProgression() {
        this(0, 1);
    }
    public FibonacciProgression(long first, long second) {
        super(first);
        this.prev = second - first;
    }
    @Override
    public long next() {
        long nextValue = prev + current;
        prev = current;
        current = nextValue;
        return current;
    }
}
// Classe principal executa o exemplo
public class Main {
    public static void main(String[] args) {
        ArithmeticProgression arithProg = new ArithmeticProgression(2, 3);
        GeometricProgression geomProg = new GeometricProgression(2, 3);
        FibonacciProgression fibProg = new FibonacciProgression();


        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arithProg.next());
        }

        System.out.println("\nProgressão Geométrica:");
        for (int i = 0; i < 10; i++) {
            System.out.println(geomProg.next());
        }

        System.out.println("\nSérie de Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.println(fibProg.next());
        }
        arithProg.reset(2);
        geomProg.reset(2);
        fibProg.reset(0);

        System.out.println("\nProgressões reiniciadas:");
        System.out.println(arithProg.next());
        System.out.println(geomProg.next());
        System.out.println(fibProg.next());
    }
}
