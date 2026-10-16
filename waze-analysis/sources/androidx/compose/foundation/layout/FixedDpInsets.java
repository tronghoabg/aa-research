package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    private FixedDpInsets(float f2, float f3, float f4, float f5) {
        this.leftDp = f2;
        this.topDp = f3;
        this.rightDp = f4;
        this.bottomDp = f5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.m11169equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m11169equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m11169equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m11169equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo2121roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo2121roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo2121roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo2121roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((Dp.m11170hashCodeimpl(this.leftDp) * 31) + Dp.m11170hashCodeimpl(this.topDp)) * 31) + Dp.m11170hashCodeimpl(this.rightDp)) * 31) + Dp.m11170hashCodeimpl(this.bottomDp);
    }

    public String toString() {
        return "Insets(left=" + ((Object) Dp.m11175toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m11175toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m11175toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m11175toStringimpl(this.bottomDp)) + ')';
    }

    public /* synthetic */ FixedDpInsets(float f2, float f3, float f4, float f5, o oVar) {
        this(f2, f3, f4, f5);
    }
}
