package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DpLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float ahead;
    private final float behind;

    private DpLazyLayoutCacheWindow(float f2, float f3) {
        this.ahead = f2;
        this.behind = f3;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i2) {
        return density.mo2121roundToPx0680j_4(this.ahead);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i2) {
        return density.mo2121roundToPx0680j_4(this.behind);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DpLazyLayoutCacheWindow)) {
            return false;
        }
        DpLazyLayoutCacheWindow dpLazyLayoutCacheWindow = (DpLazyLayoutCacheWindow) obj;
        return Dp.m11169equalsimpl0(dpLazyLayoutCacheWindow.ahead, this.ahead) && Dp.m11169equalsimpl0(dpLazyLayoutCacheWindow.behind, this.behind);
    }

    /* renamed from: getAhead-D9Ej5fM, reason: not valid java name */
    public final float m2923getAheadD9Ej5fM() {
        return this.ahead;
    }

    /* renamed from: getBehind-D9Ej5fM, reason: not valid java name */
    public final float m2924getBehindD9Ej5fM() {
        return this.behind;
    }

    public int hashCode() {
        return (Dp.m11170hashCodeimpl(this.ahead) * 31) + Dp.m11170hashCodeimpl(this.behind);
    }

    public /* synthetic */ DpLazyLayoutCacheWindow(float f2, float f3, o oVar) {
        this(f2, f3);
    }
}
