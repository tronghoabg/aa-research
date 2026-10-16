package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PaddingValuesImpl implements PaddingValues {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    private PaddingValuesImpl(float f2, float f3, float f4, float f5) {
        this.start = f2;
        this.top = f3;
        this.end = f4;
        this.bottom = f5;
        if (!((f2 >= 0.0f) & (f3 >= 0.0f) & (f4 >= 0.0f)) || !(f5 >= 0.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo2704calculateBottomPaddingD9Ej5fM() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo2705calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo2706calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo2707calculateTopPaddingD9Ej5fM() {
        return this.top;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) obj;
        return Dp.m11169equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m11169equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m11169equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m11169equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m2776getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m2777getEndD9Ej5fM() {
        return this.end;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m2778getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m2779getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((Dp.m11170hashCodeimpl(this.start) * 31) + Dp.m11170hashCodeimpl(this.top)) * 31) + Dp.m11170hashCodeimpl(this.end)) * 31) + Dp.m11170hashCodeimpl(this.bottom);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m11175toStringimpl(this.start)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.top)) + ", end=" + ((Object) Dp.m11175toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottom)) + ')';
    }

    /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2772getBottomD9Ej5fM$annotations() {
    }

    /* renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2773getEndD9Ej5fM$annotations() {
    }

    /* renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2774getStartD9Ej5fM$annotations() {
    }

    /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2775getTopD9Ej5fM$annotations() {
    }

    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, o oVar) {
        this(f2, f3, f4, f5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaddingValuesImpl(float f2, float f3, float f4, float f5, int i2, o oVar) {
        f5 = (i2 & 8) != 0 ? 0.0f : f5;
        f4 = (i2 & 4) != 0 ? 0.0f : f4;
        this(1 == (i2 & 1) ? 0.0f : f2, (i2 & 2) != 0 ? 0.0f : f3, f4, f5, null);
    }
}
