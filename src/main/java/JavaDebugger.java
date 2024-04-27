/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class JavaDebugger implements Debugger {
    /**
     * Default constructor
     */
    public JavaDebugger() {
    }

    /**
     * Debugs Java code
     */
    @Override
    public void debug() {
        System.out.println("Debugging Java code");
    }
}
