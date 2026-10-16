package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final l<InspectorInfo, ab> inspectorInfo;
    private final boolean rtlAware;
    private final float x;
    private final float y;

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetElement(float f2, float f3, boolean z, l<? super InspectorInfo, ab> lVar) {
        this.x = f2;
        this.y = f3;
        this.rtlAware = z;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.x, this.y, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && Dp.m11169equalsimpl0(this.x, offsetElement.x) && Dp.m11169equalsimpl0(this.y, offsetElement.y) && this.rtlAware == offsetElement.rtlAware;
    }

    public final l<InspectorInfo, ab> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m2710getXD9Ej5fM() {
        return this.x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m2711getYD9Ej5fM() {
        return this.y;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Dp.m11170hashCodeimpl(this.x) * 31) + Dp.m11170hashCodeimpl(this.y)) * 31) + OffsetElement$$ExternalSyntheticBackport0.m(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) Dp.m11175toStringimpl(this.x)) + ", y=" + ((Object) Dp.m11175toStringimpl(this.y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m2720updateMdfbLM(this.x, this.y, this.rtlAware);
    }

    public /* synthetic */ OffsetElement(float f2, float f3, boolean z, l lVar, o oVar) {
        this(f2, f3, z, lVar);
    }
}
