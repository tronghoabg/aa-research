package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridItem {
    private final Alignment alignment;
    private int column;
    private int columnSpan;
    private final Measurable measurable;
    private int offsetX;
    private int offsetY;
    private Placeable placeable;
    private int row;
    private int rowSpan;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GridItem(androidx.compose.ui.layout.Measurable r13, int r14, int r15, int r16, int r17, androidx.compose.ui.Alignment r18, androidx.compose.ui.layout.Placeable r19, int r20, int r21, int r22, h.g.b.o r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L9
            r1 = 0
            r9 = r1
            goto Lb
        L9:
            r9 = r19
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r10 = r2
            goto L14
        L12:
            r10 = r20
        L14:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L24
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2 = r12
            goto L30
        L24:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L30:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.GridItem.<init>(androidx.compose.ui.layout.Measurable, int, int, int, int, androidx.compose.ui.Alignment, androidx.compose.ui.layout.Placeable, int, int, int, h.g.b.o):void");
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getColumnSpan() {
        return this.columnSpan;
    }

    public final Measurable getMeasurable() {
        return this.measurable;
    }

    public final int getOffsetX() {
        return this.offsetX;
    }

    public final int getOffsetY() {
        return this.offsetY;
    }

    public final Placeable getPlaceable() {
        return this.placeable;
    }

    public final int getRow() {
        return this.row;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }

    public final void setColumn(int i2) {
        this.column = i2;
    }

    public final void setColumnSpan(int i2) {
        this.columnSpan = i2;
    }

    public final void setOffsetX(int i2) {
        this.offsetX = i2;
    }

    public final void setOffsetY(int i2) {
        this.offsetY = i2;
    }

    public final void setPlaceable(Placeable placeable) {
        this.placeable = placeable;
    }

    public final void setRow(int i2) {
        this.row = i2;
    }

    public final void setRowSpan(int i2) {
        this.rowSpan = i2;
    }

    public GridItem(Measurable measurable, int i2, int i3, int i4, int i5, Alignment alignment, Placeable placeable, int i6, int i7) {
        this.measurable = measurable;
        this.row = i2;
        this.column = i3;
        this.rowSpan = i4;
        this.columnSpan = i5;
        this.alignment = alignment;
        this.placeable = placeable;
        this.offsetX = i6;
        this.offsetY = i7;
    }
}
