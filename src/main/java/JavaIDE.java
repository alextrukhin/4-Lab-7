/**
 * ConcreteFactory part of the Abstract Factory pattern
 */
public class JavaIDE implements IDE {
    /**
     * Default constructor
     */
    public JavaIDE() {
    }

    /**
     * Create a JavaDebugger
     *
     * @return JavaDebugger
     */
    @Override
    public Debugger createDebugger() {
        return new JavaDebugger();
    }

    /**
     * Create a JavaCompiler
     *
     * @return JavaCompiler
     */
    @Override
    public Compiler createCompiler() {
        return new JavaCompiler();
    }

    /**
     * Create a JavaValidator
     *
     * @return JavaValidator
     */
    @Override
    public Validator createValidator() {
        return new JavaValidator();
    }
}
