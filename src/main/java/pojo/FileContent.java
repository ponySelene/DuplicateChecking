package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
@Table(name = "file_content", schema = "duplicatecheck", catalog = "")
public class FileContent {
    private String file;
    private String sentence;
    private Integer fileIndex;

    @Basic
    @Column(name = "file", nullable = false, length = 100)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "sentence", nullable = false, length = -1)
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Basic
    @Column(name = "fileIndex", nullable = true)
    public Integer getFileIndex() {
        return fileIndex;
    }

    public void setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileContent that = (FileContent) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (sentence != null ? !sentence.equals(that.sentence) : that.sentence != null) return false;
        if (fileIndex != null ? !fileIndex.equals(that.fileIndex) : that.fileIndex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (sentence != null ? sentence.hashCode() : 0);
        result = 31 * result + (fileIndex != null ? fileIndex.hashCode() : 0);
        return result;
    }
}
