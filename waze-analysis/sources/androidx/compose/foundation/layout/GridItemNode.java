package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridItemNode extends Modifier.Node implements ParentDataModifierNode {
    private Alignment alignment;
    private int column;
    private int columnSpan;
    private int row;
    private int rowSpan;

    public GridItemNode(int i2, int i3, int i4, int i5, Alignment alignment) {
        this.row = i2;
        this.column = i3;
        this.rowSpan = i4;
        this.columnSpan = i5;
        this.alignment = alignment;
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

    public final int getRow() {
        return this.row;
    }

    public final int getRowSpan() {
        return this.rowSpan;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setColumn(int i2) {
        this.column = i2;
    }

    public final void setColumnSpan(int i2) {
        this.columnSpan = i2;
    }

    public final void setRow(int i2) {
        this.row = i2;
    }

    public final void setRowSpan(int i2) {
        this.rowSpan = i2;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public /* bridge */ /* synthetic */ Object modifyParentData(Density density, Object obj) {
        return this;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public GridItemNode modifyParentData(Density density, Object obj) {
        return this;
    }
}
