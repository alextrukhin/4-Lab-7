/**
 * AbstractFactory part of the Abstract Factory pattern
 */
public interface IDE {
    /**
     * Create a Compiler
     * @return Compiler
     */
    Compiler createCompiler();
    /**
     * Create a Validator
     * @return Validator
     */
    Validator createValidator();
    /**
     * Create a Debugger
     * @return Debugger
     */
    Debugger createDebugger();
}
