/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class JavaCompiler implements Compiler {
    /**
     * Default constructor
     */
    public JavaCompiler() {
    }

    /**
     * Compile code
     */
    @Override
    public void compile() {
        System.out.println("Compiling Java code");
    }
}
