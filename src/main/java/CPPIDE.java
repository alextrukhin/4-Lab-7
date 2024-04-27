/**
 * ConcreteFactory part of the Abstract Factory pattern
 */
public class CPPIDE implements IDE {
    /**
     * Default constructor
     */
    public CPPIDE() {
    }

    /**
     * Create a CPPDebugger
     *
     * @return CPPDebugger
     */
    @Override
    public Debugger createDebugger() {
        return new CPPDebugger();
    }

    /**
     * Create a CPPCompiler
     *
     * @return CPPCompiler
     */
    @Override
    public Compiler createCompiler() {
        return new CPPCompiler();
    }

    /**
     * Create a CPPValidator
     *
     * @return CPPValidator
     */
    @Override
    public Validator createValidator() {
        return new CPPValidator();
    }
}
