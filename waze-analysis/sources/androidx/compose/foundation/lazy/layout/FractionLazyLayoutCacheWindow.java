package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Density;
import h.h.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FractionLazyLayoutCacheWindow implements LazyLayoutCacheWindow {
    private final float aheadFraction;
    private final float behindFraction;

    public FractionLazyLayoutCacheWindow(float f2, float f3) {
        this.aheadFraction = f2;
        this.behindFraction = f3;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateAheadWindow(Density density, int i2) {
        return a.b(i2 * this.aheadFraction);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
    public int calculateBehindWindow(Density density, int i2) {
        return a.b(i2 * this.behindFraction);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FractionLazyLayoutCacheWindow)) {
            return false;
        }
        FractionLazyLayoutCacheWindow fractionLazyLayoutCacheWindow = (FractionLazyLayoutCacheWindow) obj;
        return fractionLazyLayoutCacheWindow.aheadFraction == this.aheadFraction && fractionLazyLayoutCacheWindow.behindFraction == this.behindFraction;
    }

    public final float getAheadFraction() {
        return this.aheadFraction;
    }

    public final float getBehindFraction() {
        return this.behindFraction;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aheadFraction) * 31) + Float.floatToIntBits(this.behindFraction);
    }
}
