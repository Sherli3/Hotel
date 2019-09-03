package com.leverx.model;

public class Commandant{
    private static Commandant commandant;
    String name = "Maria Petrovna";

    private Commandant() {

    }

    public void evictStudentCommandant(Student student) {
        Guard.getInstance().evictStudent(student);
    }
    public void houseStudentInCommandant(Student student) {
        Guard.getInstance().houseStudentIn(student);
    }



    public static Commandant getInstance(){
        Commandant local = commandant;
        if(local==null){
            synchronized (Commandant .class){
                local= commandant;
                if(local==null){
                    commandant=local=new Commandant ();
                }
            }
        }
        return local;

    }
}
