package SmellAndProblemIdentify;

import SolutionOfSmell.HighToonerSave;
import SolutionOfSmell.LowToonerSave;
import SolutionOfSmell.MediumToonerSave;
import java.util.Queue;

//Feature Envy code Smell
//Long Class code smell
//Extract Class to solve

public class PrintJob {

    HighToonerSave highTonerSaveMode = new HighToonerSave();
    LowToonerSave lowTonerSaveMode = new LowToonerSave();
    MediumToonerSave mediumTenorSaveMode = new MediumToonerSave();
    Queue<Object> PrintRequest ;


    public void pullJob() {

    }

    //Feature Envy Smell
    public void changePriority() {

    }
}