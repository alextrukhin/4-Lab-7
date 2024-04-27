/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class CPPDebugger implements Debugger {
    /**
     * Default constructor
     */
    public CPPDebugger() {
    }

    /**
     * Debugs C++ code
     */
    @Override
    public void debug() {
        System.out.println("Debugging C++ code");
    }
}
