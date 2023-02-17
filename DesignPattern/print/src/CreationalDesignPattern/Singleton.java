package CreationalDesignPattern;

//public class Singleton {
//
//    College name= College.getCollege();
//}

class College{

    static College clg=new College();
    private College(){
        System.out.println("Only one College !!");
    }

    public static College getCollege(){
        return clg;
    }

    public void clg_name(){
        System.out.println("My college name is X");
    }

}




