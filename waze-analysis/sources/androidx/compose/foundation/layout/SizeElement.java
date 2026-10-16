package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final l<InspectorInfo, ab> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z, l lVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f5, z, lVar, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.m11169equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m11169equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m11169equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m11169equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m11170hashCodeimpl(this.minWidth) * 31) + Dp.m11170hashCodeimpl(this.minHeight)) * 31) + Dp.m11170hashCodeimpl(this.maxWidth)) * 31) + Dp.m11170hashCodeimpl(this.maxHeight)) * 31) + SizeElement$$ExternalSyntheticBackport0.m(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(SizeNode sizeNode) {
        sizeNode.m2838setMinWidth0680j_4(this.minWidth);
        sizeNode.m2837setMinHeight0680j_4(this.minHeight);
        sizeNode.m2836setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m2835setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    public /* synthetic */ SizeElement(float f2, float f3, float f4, float f5, boolean z, l lVar, o oVar) {
        this(f2, f3, f4, f5, z, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f2, float f3, float f4, float f5, boolean z, l<? super InspectorInfo, ab> lVar) {
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z;
        this.inspectorInfo = lVar;
    }
}
