package androidx.constraintlayout.compose.carousel;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    private FixedThreshold(float f2) {
        this.offset = f2;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m11642component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m11643copy0680j_4$default(FixedThreshold fixedThreshold, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = fixedThreshold.offset;
        }
        return fixedThreshold.m11644copy0680j_4(f2);
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public float computeThreshold(Density density, float f2, float f3) {
        return f2 + (density.mo2127toPx0680j_4(this.offset) * Math.signum(f3 - f2));
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m11644copy0680j_4(float f2) {
        return new FixedThreshold(f2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.m11169equalsimpl0(this.offset, ((FixedThreshold) obj).offset);
    }

    public int hashCode() {
        return Dp.m11170hashCodeimpl(this.offset);
    }

    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m11175toStringimpl(this.offset)) + ')';
    }

    public /* synthetic */ FixedThreshold(float f2, o oVar) {
        this(f2);
    }
}
