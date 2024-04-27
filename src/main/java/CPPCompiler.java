/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class CPPCompiler implements Compiler {
    /**
     * Default constructor
     */
    public CPPCompiler() {
    }

    /**
     * Compile code
     */
    @Override
    public void compile() {
        System.out.println("Compiling C++ code");
    }
}
