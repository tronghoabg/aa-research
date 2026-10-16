package androidx.constraintlayout.compose.carousel;

import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public /* synthetic */ ResistanceConfig(float f2, float f3, float f4, int i2, o oVar) {
        this(f2, (i2 & 2) != 0 ? 10.0f : f3, (i2 & 4) != 0 ? 10.0f : f4);
    }

    public final float computeResistance(float f2) {
        float f3 = f2 < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (this.basis / f3) * ((float) Math.sin((n.g(f2 / r3, -1.0f, 1.0f) * 3.1415927f) / 2.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.basis) * 31) + Float.floatToIntBits(this.factorAtMin)) * 31) + Float.floatToIntBits(this.factorAtMax);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public ResistanceConfig(float f2, float f3, float f4) {
        this.basis = f2;
        this.factorAtMin = f3;
        this.factorAtMax = f4;
    }
}
