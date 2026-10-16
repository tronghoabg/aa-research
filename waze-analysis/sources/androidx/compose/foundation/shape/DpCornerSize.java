package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.m.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DpCornerSize implements CornerSize, InspectableValue {
    private final float size;

    private DpCornerSize(float f2) {
        this.size = f2;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m3082component1D9Ej5fM() {
        return this.size;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ DpCornerSize m3083copy0680j_4$default(DpCornerSize dpCornerSize, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = dpCornerSize.size;
        }
        return dpCornerSize.m3084copy0680j_4(f2);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final DpCornerSize m3084copy0680j_4(float f2) {
        return new DpCornerSize(f2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DpCornerSize) && Dp.m11169equalsimpl0(this.size, ((DpCornerSize) obj).size);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ h getInspectableElements() {
        return InspectableValue.CC.$default$getInspectableElements(this);
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* synthetic */ String getNameFallback() {
        return null;
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    public /* bridge */ /* synthetic */ Object getValueOverride() {
        return Dp.m11162boximpl(m3085getValueOverrideD9Ej5fM());
    }

    /* renamed from: getValueOverride-D9Ej5fM, reason: not valid java name */
    public float m3085getValueOverrideD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return Dp.m11170hashCodeimpl(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo3077toPxTmRCtEA(long j2, Density density) {
        return density.mo2127toPx0680j_4(this.size);
    }

    public String toString() {
        return "CornerSize(size = " + this.size + ".dp)";
    }

    public /* synthetic */ DpCornerSize(float f2, o oVar) {
        this(f2);
    }
}
