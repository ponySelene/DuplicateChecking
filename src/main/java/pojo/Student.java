package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
public class Student {
    private String studentName;
    private int studentId;
    private Integer studentNumber;

    @Basic
    @Column(name = "studentName", nullable = true, length = 255)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Id
    @Column(name = "studentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "studentNumber", nullable = true)
    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (studentNumber != null ? !studentNumber.equals(student.studentNumber) : student.studentNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + studentId;
        result = 31 * result + (studentNumber != null ? studentNumber.hashCode() : 0);
        return result;
    }
}
