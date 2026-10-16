package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BackgroundElement extends ModifierNodeElement<BackgroundNode> {
    private final float alpha;
    private final Brush brush;
    private final long color;
    private final l<InspectorInfo, ab> inspectorInfo;
    private final Shape shape;

    public /* synthetic */ BackgroundElement(long j2, Brush brush, float f2, Shape shape, l lVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2, (i2 & 2) != 0 ? null : brush, f2, shape, lVar, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BackgroundNode create() {
        return new BackgroundNode(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m8229equalsimpl0(this.color, backgroundElement.color) && x.n(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && x.n(this.shape, backgroundElement.shape);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        Color.Companion companion = Color.Companion;
        Brush brush = this.brush;
        return (((((Color.m8235hashCodeimpl(this.color) * 31) + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BackgroundNode backgroundNode) {
        backgroundNode.m1974setColor8_81llA(this.color);
        backgroundNode.setBrush(this.brush);
        backgroundNode.setAlpha(this.alpha);
        if (!x.n(backgroundNode.getShape(), this.shape)) {
            backgroundNode.setShape(this.shape);
            SemanticsModifierNodeKt.invalidateSemantics(backgroundNode);
        }
        DrawModifierNodeKt.invalidateDraw(backgroundNode);
    }

    public /* synthetic */ BackgroundElement(long j2, Brush brush, float f2, Shape shape, l lVar, o oVar) {
        this(j2, brush, f2, shape, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j2, Brush brush, float f2, Shape shape, l<? super InspectorInfo, ab> lVar) {
        this.color = j2;
        this.brush = brush;
        this.alpha = f2;
        this.shape = shape;
        this.inspectorInfo = lVar;
    }
}
