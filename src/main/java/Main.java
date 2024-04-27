/**
 * Client part of the Abstract Factory pattern
 * Main class to demonstrate the Abstract Factory pattern.
 */
public class Main {
    /**
     * Main method
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        JavaIDE javaIDE = new JavaIDE();
        Validator validator = javaIDE.createValidator();
        Debugger debugger = javaIDE.createDebugger();
        Compiler compiler = javaIDE.createCompiler();
        validator.validate();
        debugger.debug();
        compiler.compile();

        CPPIDE cppIDE = new CPPIDE();
        validator = cppIDE.createValidator();
        debugger = cppIDE.createDebugger();
        compiler = cppIDE.createCompiler();
        validator.validate();
        debugger.debug();
        compiler.compile();
    }
}
