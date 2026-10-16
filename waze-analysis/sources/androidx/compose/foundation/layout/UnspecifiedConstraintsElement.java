package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f2, float f3, int i2, o oVar) {
        this((i2 & 1) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.Companion.m11184getUnspecifiedD9Ej5fM() : f3, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.m11169equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && Dp.m11169equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2840getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2841getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Dp.m11170hashCodeimpl(this.minWidth) * 31) + Dp.m11170hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", Dp.m11162boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", Dp.m11162boximpl(this.minHeight));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m2845setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m2844setMinHeight0680j_4(this.minHeight);
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f2, float f3, o oVar) {
        this(f2, f3);
    }

    private UnspecifiedConstraintsElement(float f2, float f3) {
        this.minWidth = f2;
        this.minHeight = f3;
    }
}
