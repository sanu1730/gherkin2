package gherkin;

/**
 * Created by sagarwal on 24-06-2016.
 */
public class CallerContext extends SecurityManager {

    /**
     * Returns the run time execution stack.
     *
     * @return Class[]
     */
    public final Class[] getClassExecutionStack() {
        return getClassContext();
    }

}


