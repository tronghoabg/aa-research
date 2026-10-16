package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.l;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final l<InspectorInfo, ab> inspectorInfo;
    private boolean rtlAware;
    private float start;
    private float top;

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f2, float f3, float f4, float f5, boolean z, l<? super InspectorInfo, ab> lVar) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.rtlAware = z;
        this.inspectorInfo = lVar;
        boolean z2 = f2 >= 0.0f || Float.isNaN(f2);
        float f6 = this.top;
        boolean z3 = z2 & (f6 >= 0.0f || Float.isNaN(f6));
        float f7 = this.end;
        boolean z4 = z3 & (f7 >= 0.0f || Float.isNaN(f7));
        float f8 = this.bottom;
        if (!z4 || !(f8 >= 0.0f || Float.isNaN(f8))) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && Dp.m11169equalsimpl0(this.start, paddingElement.start) && Dp.m11169equalsimpl0(this.top, paddingElement.top) && Dp.m11169equalsimpl0(this.end, paddingElement.end) && Dp.m11169equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m2740getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m2741getEndD9Ej5fM() {
        return this.end;
    }

    public final l<InspectorInfo, ab> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m2742getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m2743getTopD9Ej5fM() {
        return this.top;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m11170hashCodeimpl(this.start) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.end)) * 31) + Dp.m11170hashCodeimpl(this.bottom)) * 31) + PaddingElement$$ExternalSyntheticBackport0.m(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m2744setBottom0680j_4(float f2) {
        this.bottom = f2;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m2745setEnd0680j_4(float f2) {
        this.end = f2;
    }

    public final void setRtlAware(boolean z) {
        this.rtlAware = z;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m2746setStart0680j_4(float f2) {
        this.start = f2;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m2747setTop0680j_4(float f2) {
        this.top = f2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m2766setStart0680j_4(this.start);
        paddingNode.m2767setTop0680j_4(this.top);
        paddingNode.m2765setEnd0680j_4(this.end);
        paddingNode.m2764setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f2, float f3, float f4, float f5, boolean z, l lVar, o oVar) {
        this(f2, f3, f4, f5, z, lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaddingElement(float f2, float f3, float f4, float f5, boolean z, l lVar, int i2, o oVar) {
        f5 = (i2 & 8) != 0 ? 0.0f : f5;
        f4 = (i2 & 4) != 0 ? 0.0f : f4;
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, f4, f5, z, lVar, null);
    }
}
