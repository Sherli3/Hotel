package com.leverx.model;

public class Commandant{
    private static Commandant commandant;
    String name = "Maria Petrovna";

    private Commandant() {

    }
    public  void run(){

        //go through the cycle Hostel (all floors and rooms)
        // каждые три секунды проверка
        Student student = new Student("fdffd", 2);
        if(student.getStudyCourse()>=4 || !student.isCreditworthy() ||
                student.getRemark()>=2|| student.isExpelled() || !student.isAccessAvailable()){
            int countStud=0;
            int roomCount=0;
            Guard.getInstance().evictStudent(countStud);
        }

        if(student.getStudyCourse()<=4 && student.getRemark()<2 && !student.isExpelled() && !student.isAccessAvailable()){
            Guard.getInstance().houseStudentIn(student);
        }



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
