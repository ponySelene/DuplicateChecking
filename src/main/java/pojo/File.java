package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
public class File {
    private String fileName;
    private int fileId;
    private String student;
    private String batch;
    private Byte hasCheck;
    private String path;

    @Basic
    @Column(name = "fileName", nullable = false, length = 100)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Id
    @Column(name = "fileId", nullable = false)
    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "student", nullable = true, length = 255)
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    @Basic
    @Column(name = "batch", nullable = true, length = 255)
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Basic
    @Column(name = "hasCheck", nullable = true)
    public Byte getHasCheck() {
        return hasCheck;
    }

    public void setHasCheck(Byte hasCheck) {
        this.hasCheck = hasCheck;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 500)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (fileId != file.fileId) return false;
        if (fileName != null ? !fileName.equals(file.fileName) : file.fileName != null) return false;
        if (student != null ? !student.equals(file.student) : file.student != null) return false;
        if (batch != null ? !batch.equals(file.batch) : file.batch != null) return false;
        if (hasCheck != null ? !hasCheck.equals(file.hasCheck) : file.hasCheck != null) return false;
        if (path != null ? !path.equals(file.path) : file.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + fileId;
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        result = 31 * result + (hasCheck != null ? hasCheck.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }
}
