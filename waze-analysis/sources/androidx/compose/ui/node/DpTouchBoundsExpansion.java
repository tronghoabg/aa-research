package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    private DpTouchBoundsExpansion(float f2, float f3, float f4, float f5, boolean z) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        this.isLayoutDirectionAware = z;
        if (f2 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (f3 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (f4 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f5 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }

    /* renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m9949copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f2, float f3, float f4, float f5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = dpTouchBoundsExpansion.start;
        }
        if ((i2 & 2) != 0) {
            f3 = dpTouchBoundsExpansion.top;
        }
        if ((i2 & 4) != 0) {
            f4 = dpTouchBoundsExpansion.end;
        }
        if ((i2 & 8) != 0) {
            f5 = dpTouchBoundsExpansion.bottom;
        }
        if ((i2 & 16) != 0) {
            z = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        boolean z2 = z;
        float f6 = f4;
        return dpTouchBoundsExpansion.m9954copylDy3nrA(f2, f3, f6, f5, z2);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m9950component1D9Ej5fM() {
        return this.start;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m9951component2D9Ej5fM() {
        return this.top;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m9952component3D9Ej5fM() {
        return this.end;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m9953component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m9954copylDy3nrA(float f2, float f3, float f4, float f5, boolean z) {
        return new DpTouchBoundsExpansion(f2, f3, f4, f5, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.m11169equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m11169equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m11169equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m11169equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m9955getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m9956getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m9957getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m9958getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((((Dp.m11170hashCodeimpl(this.start) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.end)) * 31) + Dp.m11170hashCodeimpl(this.bottom)) * 31) + DpTouchBoundsExpansion$$ExternalSyntheticBackport0.m(this.isLayoutDirectionAware);
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    /* renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m9959roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        float f2 = this.bottom;
        float f3 = this.end;
        float f4 = this.top;
        return TouchBoundsExpansion.Companion.pack$ui(density.mo2121roundToPx0680j_4(this.start), density.mo2121roundToPx0680j_4(f4), density.mo2121roundToPx0680j_4(f3), density.mo2121roundToPx0680j_4(f2), this.isLayoutDirectionAware);
    }

    public String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Dp.m11175toStringimpl(this.start)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.top)) + ", end=" + ((Object) Dp.m11175toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottom)) + ", isLayoutDirectionAware=" + this.isLayoutDirectionAware + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m9960Absolutea9UjIt4$default(Companion companion, float f2, float f3, float f4, float f5, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                f5 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f4 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f3 = 0.0f;
            }
            if (1 == (i2 & 1)) {
                f2 = 0.0f;
            }
            return companion.m9961Absolutea9UjIt4(f2, f3, f4, f5);
        }

        /* renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m9961Absolutea9UjIt4(float f2, float f3, float f4, float f5) {
            return new DpTouchBoundsExpansion(f2, f3, f4, f5, false, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f2, float f3, float f4, float f5, boolean z, o oVar) {
        this(f2, f3, f4, f5, z);
    }
}
