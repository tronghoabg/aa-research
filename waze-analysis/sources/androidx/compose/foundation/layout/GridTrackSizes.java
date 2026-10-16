package androidx.compose.foundation.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridTrackSizes {
    private final int columnGapPx;
    private final int[] columnWidths;
    private final int rowGapPx;
    private final int[] rowHeights;
    private final int totalHeight;
    private final int totalWidth;

    public GridTrackSizes(int[] iArr, int[] iArr2, int i2, int i3, int i4, int i5) {
        this.columnWidths = iArr;
        this.rowHeights = iArr2;
        this.totalWidth = i2;
        this.totalHeight = i3;
        this.columnGapPx = i4;
        this.rowGapPx = i5;
    }

    public final int getColumnGapPx() {
        return this.columnGapPx;
    }

    public final int[] getColumnWidths() {
        return this.columnWidths;
    }

    public final int getRowGapPx() {
        return this.rowGapPx;
    }

    public final int[] getRowHeights() {
        return this.rowHeights;
    }

    public final int getTotalHeight() {
        return this.totalHeight;
    }

    public final int getTotalWidth() {
        return this.totalWidth;
    }
}
