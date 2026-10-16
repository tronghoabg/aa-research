package androidx.compose.ui.semantics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CollectionItemInfo {
    public static final int $stable = 0;
    private final int columnIndex;
    private final int columnSpan;
    private final int rowIndex;
    private final int rowSpan;

    public CollectionItemInfo(int i2, int i3, int i4, int i5) {
        this.rowIndex = i2;
        this.rowSpan = i3;
        this.columnIndex = i4;
        this.columnSpan = i5;
    }

    public final int getColumnIndex() {
        return this.columnIndex;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }
}
