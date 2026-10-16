package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return x.n(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        return density.mo2121roundToPx0680j_4(this.paddingValues.mo2704calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        return density.mo2121roundToPx0680j_4(this.paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        return density.mo2121roundToPx0680j_4(this.paddingValues.mo2706calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        return density.mo2121roundToPx0680j_4(this.paddingValues.mo2707calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    public String toString() {
        PaddingValues paddingValues = this.paddingValues;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float fMo2705calculateLeftPaddingu2uoSUM = paddingValues.mo2705calculateLeftPaddingu2uoSUM(layoutDirection);
        PaddingValues paddingValues2 = this.paddingValues;
        return "PaddingValues(" + ((Object) Dp.m11175toStringimpl(fMo2705calculateLeftPaddingu2uoSUM)) + ", " + ((Object) Dp.m11175toStringimpl(paddingValues2.mo2707calculateTopPaddingD9Ej5fM())) + ", " + ((Object) Dp.m11175toStringimpl(paddingValues2.mo2706calculateRightPaddingu2uoSUM(layoutDirection))) + ", " + ((Object) Dp.m11175toStringimpl(this.paddingValues.mo2704calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
