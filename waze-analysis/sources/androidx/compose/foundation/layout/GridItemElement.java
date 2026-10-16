package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class GridItemElement extends ModifierNodeElement<GridItemNode> {
    private final Alignment alignment;
    private final int column;
    private final int columnSpan;
    private final int row;
    private final int rowSpan;

    public GridItemElement(int i2, int i3, int i4, int i5, Alignment alignment) {
        this.row = i2;
        this.column = i3;
        this.rowSpan = i4;
        this.columnSpan = i5;
        this.alignment = alignment;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public GridItemNode create() {
        return new GridItemNode(this.row, this.column, this.rowSpan, this.columnSpan, this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItemElement)) {
            return false;
        }
        GridItemElement gridItemElement = (GridItemElement) obj;
        return this.row == gridItemElement.row && this.column == gridItemElement.column && this.rowSpan == gridItemElement.rowSpan && this.columnSpan == gridItemElement.columnSpan && x.n(this.alignment, gridItemElement.alignment);
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

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((this.row * 31) + this.column) * 31) + this.rowSpan) * 31) + this.columnSpan) * 31) + this.alignment.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("gridItem");
        inspectorInfo.getProperties().set("row", Integer.valueOf(this.row));
        inspectorInfo.getProperties().set("column", Integer.valueOf(this.column));
        inspectorInfo.getProperties().set("rowSpan", Integer.valueOf(this.rowSpan));
        inspectorInfo.getProperties().set("columnSpan", Integer.valueOf(this.columnSpan));
        inspectorInfo.getProperties().set("alignment", this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(GridItemNode gridItemNode) {
        gridItemNode.setRow(this.row);
        gridItemNode.setColumn(this.column);
        gridItemNode.setRowSpan(this.rowSpan);
        gridItemNode.setColumnSpan(this.columnSpan);
        gridItemNode.setAlignment(this.alignment);
    }
}
