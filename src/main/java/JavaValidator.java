/**
 * ConcreteProduct part of the Abstract Factory pattern
 */
public class JavaValidator implements Validator {
    /**
     * Default constructor
     */
    public JavaValidator() {
    }

    /**
     * Validate Java code
     */
    @Override
    public void validate() {
        System.out.println("Validating Java code");
    }
}
