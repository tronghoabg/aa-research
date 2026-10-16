package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import h.a.c;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class MeshGradientBlockModifierNode extends Modifier.Node implements DrawModifierNode {
    private l<? super MeshGradientScope, ab> block;
    private int columns;
    private boolean hasBicubicColor;
    private MeshGradientScope pointScope;
    private final MeshGradientRenderer renderer;
    private int rows;

    public MeshGradientBlockModifierNode(int i2, int i3, boolean z, l<? super MeshGradientScope, ab> lVar) {
        this.rows = i2;
        this.columns = i3;
        this.hasBicubicColor = z;
        this.block = lVar;
        if (i2 > 0 && i3 > 0) {
            this.pointScope = new MeshGradientScope(i2, i3);
            this.renderer = MeshGradientRenderer_androidKt.MeshGradientRenderer();
        } else {
            throw new IllegalArgumentException("Rows and columns must be greater than 0! Rows: " + this.rows + ", Columns: " + this.columns);
        }
    }

    private final void populateBuffersFromBlock() {
        c.ax(this.pointScope.getPositions$ui(), 0.0f);
        c.ay(this.pointScope.getColors$ui(), ColorKt.m8282toArgb8_81llA(Color.Companion.m8263getTransparent0d7_KjU()), 0, 6);
        c.ax(this.pointScope.getLeftBezierOffsets$ui(), Float.NaN);
        c.ax(this.pointScope.getRightBezierOffsets$ui(), Float.NaN);
        c.ax(this.pointScope.getTopBezierOffsets$ui(), Float.NaN);
        c.ax(this.pointScope.getBottomBezierOffsets$ui(), Float.NaN);
        this.block.invoke(this.pointScope);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        populateBuffersFromBlock();
        int i2 = this.rows;
        int i3 = this.columns;
        float[] positions$ui = this.pointScope.getPositions$ui();
        int[] colors$ui = this.pointScope.getColors$ui();
        float[] leftBezierOffsets$ui = this.pointScope.getLeftBezierOffsets$ui();
        float[] topBezierOffsets$ui = this.pointScope.getTopBezierOffsets$ui();
        float[] rightBezierOffsets$ui = this.pointScope.getRightBezierOffsets$ui();
        float[] bottomBezierOffsets$ui = this.pointScope.getBottomBezierOffsets$ui();
        boolean z = this.hasBicubicColor;
        this.renderer.draw(contentDrawScope, i2, i3, positions$ui, colors$ui, leftBezierOffsets$ui, topBezierOffsets$ui, rightBezierOffsets$ui, bottomBezierOffsets$ui, z);
        contentDrawScope.drawContent();
    }

    public final l<MeshGradientScope, ab> getBlock() {
        return this.block;
    }

    public final int getColumns() {
        return this.columns;
    }

    public final boolean getHasBicubicColor() {
        return this.hasBicubicColor;
    }

    public final int getRows() {
        return this.rows;
    }

    public final void setBlock(l<? super MeshGradientScope, ab> lVar) {
        this.block = lVar;
    }

    public final void setColumns(int i2) {
        this.columns = i2;
    }

    public final void setHasBicubicColor(boolean z) {
        this.hasBicubicColor = z;
    }

    public final void setRows(int i2) {
        this.rows = i2;
    }

    public final void update(int i2, int i3, boolean z, l<? super MeshGradientScope, ab> lVar) {
        boolean z2 = true;
        if (this.rows == i2 && this.columns == i3) {
            z2 = false;
        }
        this.rows = i2;
        this.columns = i3;
        this.hasBicubicColor = z;
        this.block = lVar;
        if (z2) {
            this.pointScope = new MeshGradientScope(i2, i3);
        }
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
