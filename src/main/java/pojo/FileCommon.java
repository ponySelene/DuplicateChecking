package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
@Table(name = "file_common", schema = "duplicatecheck", catalog = "")
public class FileCommon {
    private String fileA;
    private String fileB;
    private String common;
    private Integer fileAIndex;
    private Integer fileBIndex;

    @Basic
    @Column(name = "fileA", nullable = false, length = 20)
    public String getFileA() {
        return fileA;
    }

    public void setFileA(String fileA) {
        this.fileA = fileA;
    }

    @Basic
    @Column(name = "fileB", nullable = false, length = 20)
    public String getFileB() {
        return fileB;
    }

    public void setFileB(String fileB) {
        this.fileB = fileB;
    }

    @Basic
    @Column(name = "common", nullable = false, length = -1)
    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    @Basic
    @Column(name = "fileAIndex", nullable = true)
    public Integer getFileAIndex() {
        return fileAIndex;
    }

    public void setFileAIndex(Integer fileAIndex) {
        this.fileAIndex = fileAIndex;
    }

    @Basic
    @Column(name = "fileBIndex", nullable = true)
    public Integer getFileBIndex() {
        return fileBIndex;
    }

    public void setFileBIndex(Integer fileBIndex) {
        this.fileBIndex = fileBIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileCommon that = (FileCommon) o;

        if (fileA != null ? !fileA.equals(that.fileA) : that.fileA != null) return false;
        if (fileB != null ? !fileB.equals(that.fileB) : that.fileB != null) return false;
        if (common != null ? !common.equals(that.common) : that.common != null) return false;
        if (fileAIndex != null ? !fileAIndex.equals(that.fileAIndex) : that.fileAIndex != null) return false;
        if (fileBIndex != null ? !fileBIndex.equals(that.fileBIndex) : that.fileBIndex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fileA != null ? fileA.hashCode() : 0;
        result = 31 * result + (fileB != null ? fileB.hashCode() : 0);
        result = 31 * result + (common != null ? common.hashCode() : 0);
        result = 31 * result + (fileAIndex != null ? fileAIndex.hashCode() : 0);
        result = 31 * result + (fileBIndex != null ? fileBIndex.hashCode() : 0);
        return result;
    }
}
