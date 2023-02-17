package SmellAndProblemIdentify;

public class PageSaveMode extends PrintMode {


    //Refused Bequest code smell
    //solution: Push Down Methon
    @Override
    void saveToner() {

    }

    @Override
    void savePage() {
        System.out.println("An algorithm");
    }

    @Override
    void boost() {

    }

    public void renderPreview() {
        System.out.println("Preview the Documents");
    }

}
