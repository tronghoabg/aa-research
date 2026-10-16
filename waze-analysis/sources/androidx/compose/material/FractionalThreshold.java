package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FractionalThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float fraction;

    public FractionalThreshold(float f2) {
        this.fraction = f2;
    }

    private final float component1() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = fractionalThreshold.fraction;
        }
        return fractionalThreshold.copy(f2);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(Density density, float f2, float f3) {
        return MathHelpersKt.lerp(f2, f3, this.fraction);
    }

    public final FractionalThreshold copy(float f2) {
        return new FractionalThreshold(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(this.fraction, ((FractionalThreshold) obj).fraction) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fraction);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}
