package pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by 41159 on 2016/8/5.
 */
@Entity
public class Batch {
    private int batchId;
    private String batchName;

    @Id
    @Column(name = "batchId", nullable = false)
    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    @Basic
    @Column(name = "batchName", nullable = true, length = 255)
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Batch batch = (Batch) o;

        if (batchId != batch.batchId) return false;
        if (batchName != null ? !batchName.equals(batch.batchName) : batch.batchName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = batchId;
        result = 31 * result + (batchName != null ? batchName.hashCode() : 0);
        return result;
    }
}
