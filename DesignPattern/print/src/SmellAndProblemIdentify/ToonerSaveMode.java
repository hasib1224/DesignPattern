package SmellAndProblemIdentify;

import SolutionOfSmell.HighToonerSave;

import java.util.Objects;

public class ToonerSaveMode extends PrintMode {

    public String tonerSavingLevel;

    //Code repeatation smell
    HighToonerSave hs =new HighToonerSave();
    @Override
    void saveToner() {
        if(Objects.equals(tonerSavingLevel, "Low")){
            System.out.println("An algorithm");
        } else if (Objects.equals(tonerSavingLevel, "Middle")) {
            System.out.println("An algorithm");
        }
        else {
            System.out.println("A algorithm implement for high ");
        }


    }

    //Refused Bequest code smell
    //solution: Push Down Method
    @Override
    void savePage() {
        System.out.println("An algorithm");
    }

    @Override
    void boost() {
        System.out.println("An algorithm");
    }
}