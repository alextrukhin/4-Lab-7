/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class CPPValidator implements Validator {
    /**
     * Default constructor
     */
    public CPPValidator() {
    }

    /**
     * Validate C++ code
     */
    @Override
    public void validate() {
        System.out.println("Validating C++ code");
    }
}
