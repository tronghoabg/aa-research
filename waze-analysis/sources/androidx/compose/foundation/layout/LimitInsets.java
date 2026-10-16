package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {
    private final WindowInsets insets;
    private final int sides;

    private LimitInsets(WindowInsets windowInsets, int i2) {
        this.insets = windowInsets;
        this.sides = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return x.n(this.insets, limitInsets.insets) && WindowInsetsSides.m2857equalsimpl0(this.sides, limitInsets.sides);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        if (WindowInsetsSides.m2858hasAnybkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.m2868getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m2858hasAnybkgdKaI$foundation_layout(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m2864getAllowLeftInLtrJoeWqyM$foundation_layout() : WindowInsetsSides.Companion.m2865getAllowLeftInRtlJoeWqyM$foundation_layout())) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m2858hasAnybkgdKaI$foundation_layout(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m2866getAllowRightInLtrJoeWqyM$foundation_layout() : WindowInsetsSides.Companion.m2867getAllowRightInRtlJoeWqyM$foundation_layout())) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m2709getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        if (WindowInsetsSides.m2858hasAnybkgdKaI$foundation_layout(this.sides, WindowInsetsSides.Companion.m2874getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.sides;
    }

    public String toString() {
        return "(" + this.insets + " only " + ((Object) WindowInsetsSides.m2861toStringimpl(this.sides)) + ')';
    }

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i2, o oVar) {
        this(windowInsets, i2);
    }
}
