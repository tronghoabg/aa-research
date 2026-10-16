package androidx.compose.ui.semantics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CollectionInfo {
    public static final int $stable = 0;
    private final int columnCount;
    private final int rowCount;

    public CollectionInfo(int i2, int i3) {
        this.rowCount = i2;
        this.columnCount = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionInfo)) {
            return false;
        }
        CollectionInfo collectionInfo = (CollectionInfo) obj;
        return this.rowCount == collectionInfo.rowCount && this.columnCount == collectionInfo.columnCount;
    }

    public final int getColumnCount() {
        return this.columnCount;
    }

    public final int getRowCount() {
        return this.rowCount;
    }

    public int hashCode() {
        return (this.rowCount * 31) + this.columnCount;
    }

    public String toString() {
        return "CollectionInfo(rowCount=" + this.rowCount + ", columnCount=" + this.columnCount + ')';
    }
}
