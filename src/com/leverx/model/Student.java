package com.leverx.model;

public class Student {
    private static int instanceCounter = 1;
    private String name;
    private int studyCourse;
    private Room room;
    private Floor floor;
    private int remark = 0;
    private boolean isCreditworthy = true;
    private boolean isExpelled = false;
    private boolean isAccessAvailable = true;


    public Student(String name, int studyСourse) {
        this.name = name;
        this.studyCourse = studyСourse;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudyCourse() {
        return studyCourse;
    }

    public void setStudyCourse(int studyCourse) {
        this.studyCourse = studyCourse;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public boolean isCreditworthy() {
        return isCreditworthy;
    }

    public void setCreditworthy(boolean creditworthy) {
        isCreditworthy = creditworthy;
    }

    public int getRemark() {
        return remark;
    }

    public void setRemark(int remark) {
        this.remark = remark;
    }

    public boolean isExpelled() {
        return isExpelled;
    }

    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    public boolean isAccessAvailable() {
        return isAccessAvailable;
    }

    public void setAccessAvailable(boolean accessAvailable) {
        isAccessAvailable = accessAvailable;
    }

    public static class Builder {

        private Student student;

        public Builder() {
            student = new Student("Unnamed student#" + (instanceCounter++), 1);
        }

        public Student build() {
            return student;
        }

        public Builder name(String name) {
            student.setName(name);
            return this;
        }

        public Builder studyCourse(int course) {
            student.setStudyCourse(course);
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (studyCourse != student.studyCourse) return false;
        if (remark != student.remark) return false;
        if (isCreditworthy != student.isCreditworthy) return false;
        if (isExpelled != student.isExpelled) return false;
        if (isAccessAvailable != student.isAccessAvailable) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (room != null ? !room.equals(student.room) : student.room != null) return false;
        return floor != null ? floor.equals(student.floor) : student.floor == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + studyCourse;
        result = 31 * result + (room != null ? room.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        result = 31 * result + remark;
        result = 31 * result + (isCreditworthy ? 1 : 0);
        result = 31 * result + (isExpelled ? 1 : 0);
        result = 31 * result + (isAccessAvailable ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studyCourse=" + studyCourse +
                ", room=" + room +
                ", floor=" + floor +
                ", remark=" + remark +
                ", isCreditworthy=" + isCreditworthy +
                ", isExpelled=" + isExpelled +
                ", isAccessAvailable=" + isAccessAvailable +
                '}';
    }
}
