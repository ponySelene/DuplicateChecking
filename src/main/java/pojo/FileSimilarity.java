package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
@Table(name = "file_similarity", schema = "duplicatecheck", catalog = "")
public class FileSimilarity {
    private String sourceFile;
    private String destFile;
    private Double similarity;

    @Basic
    @Column(name = "sourceFile", nullable = false, length = 20)
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @Basic
    @Column(name = "destFile", nullable = false, length = 20)
    public String getDestFile() {
        return destFile;
    }

    public void setDestFile(String destFile) {
        this.destFile = destFile;
    }

    @Basic
    @Column(name = "similarity", nullable = true, precision = 0)
    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileSimilarity that = (FileSimilarity) o;

        if (sourceFile != null ? !sourceFile.equals(that.sourceFile) : that.sourceFile != null) return false;
        if (destFile != null ? !destFile.equals(that.destFile) : that.destFile != null) return false;
        if (similarity != null ? !similarity.equals(that.similarity) : that.similarity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceFile != null ? sourceFile.hashCode() : 0;
        result = 31 * result + (destFile != null ? destFile.hashCode() : 0);
        result = 31 * result + (similarity != null ? similarity.hashCode() : 0);
        return result;
    }
}
