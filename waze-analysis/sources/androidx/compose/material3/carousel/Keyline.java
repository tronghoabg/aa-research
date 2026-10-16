package androidx.compose.material3.carousel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public Keyline(float f2, float f3, float f4, boolean z, boolean z2, boolean z3, float f5) {
        this.size = f2;
        this.offset = f3;
        this.unadjustedOffset = f4;
        this.isFocal = z;
        this.isAnchor = z2;
        this.isPivot = z3;
        this.cutoff = f5;
    }

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f2, float f3, float f4, boolean z, boolean z2, boolean z3, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = keyline.size;
        }
        if ((i2 & 2) != 0) {
            f3 = keyline.offset;
        }
        if ((i2 & 4) != 0) {
            f4 = keyline.unadjustedOffset;
        }
        if ((i2 & 8) != 0) {
            z = keyline.isFocal;
        }
        if ((i2 & 16) != 0) {
            z2 = keyline.isAnchor;
        }
        if ((i2 & 32) != 0) {
            z3 = keyline.isPivot;
        }
        if ((i2 & 64) != 0) {
            f5 = keyline.cutoff;
        }
        boolean z4 = z3;
        float f6 = f5;
        boolean z5 = z2;
        float f7 = f4;
        return keyline.copy(f2, f3, f7, z, z5, z4, f6);
    }

    public final float component1() {
        return this.size;
    }

    public final float component2() {
        return this.offset;
    }

    public final float component3() {
        return this.unadjustedOffset;
    }

    public final boolean component4() {
        return this.isFocal;
    }

    public final boolean component5() {
        return this.isAnchor;
    }

    public final boolean component6() {
        return this.isPivot;
    }

    public final float component7() {
        return this.cutoff;
    }

    public final Keyline copy(float f2, float f3, float f4, boolean z, boolean z2, boolean z3, float f5) {
        return new Keyline(f2, f3, f4, z, z2, z3, f5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) obj;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public final float getCutoff() {
        return this.cutoff;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.size) * 31) + Float.floatToIntBits(this.offset)) * 31) + Float.floatToIntBits(this.unadjustedOffset);
        float f2 = this.cutoff;
        boolean z = this.isPivot;
        return (((((((iFloatToIntBits * 31) + Keyline$$ExternalSyntheticBackport0.m(this.isFocal)) * 31) + Keyline$$ExternalSyntheticBackport0.m(this.isAnchor)) * 31) + Keyline$$ExternalSyntheticBackport0.m(z)) * 31) + Float.floatToIntBits(f2);
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public String toString() {
        return "Keyline(size=" + this.size + ", offset=" + this.offset + ", unadjustedOffset=" + this.unadjustedOffset + ", isFocal=" + this.isFocal + ", isAnchor=" + this.isAnchor + ", isPivot=" + this.isPivot + ", cutoff=" + this.cutoff + ')';
    }
}
