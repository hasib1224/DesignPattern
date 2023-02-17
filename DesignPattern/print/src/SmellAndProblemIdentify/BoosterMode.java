package SmellAndProblemIdentify;

public class BoosterMode extends PrintMode {

    //Refused Bequest code smell
    //solution: Push Down Methon
    @Override
    void saveToner() {

    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {
        System.out.println("An algorithm");
    }
}