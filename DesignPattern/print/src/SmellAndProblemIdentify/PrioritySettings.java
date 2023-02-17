package SmellAndProblemIdentify;

import SolutionOfSmell.HighToonerSave;
import SolutionOfSmell.LowToonerSave;
import SolutionOfSmell.MediumToonerSave;

import java.util.Queue;

public class PrioritySettings {

    HighToonerSave highTonerSaveMode = new HighToonerSave();
    LowToonerSave lowTonerSaveMode = new LowToonerSave();
    MediumToonerSave mediumTenorSaveMode = new MediumToonerSave();
    Document document = new Document();
    Queue<Object> PrintRequest ;

    public void changePriority() {
        System.out.println("Change Priority");

    }

}

