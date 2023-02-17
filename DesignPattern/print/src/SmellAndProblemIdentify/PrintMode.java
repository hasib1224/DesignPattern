package SmellAndProblemIdentify;

abstract class PrintMode {

    public int numberOfPages;
//    public PageSize pageSize;
    public String orientation;
    public double colorIntensity;
    public double costPerPage;


    abstract void saveToner();

    abstract void savePage();

    abstract void boost();

}

//
//class PageSize {
//
//    private double pageHeight;
//    private double pageWidth;
//
//    public PageSize(double pageHeight, double pageWidth) {
//        this.pageHeight = pageHeight;
//        this.pageWidth = pageWidth;
//    }
//
//    public double getPageHeight() {
//        return pageHeight;
//    }
//
//    public void setPageHeight(double pageHeight) {
//        this.pageHeight = pageHeight;
//    }
//
//    public double getPageWidth() {
//        return pageWidth;
//    }
//
//    public void setPageWidth(double pageWidth) {
//        this.pageWidth = pageWidth;
//    }
//}