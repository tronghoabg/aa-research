package androidx.compose.material3.carousel;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ShiftPointRange {
    private final int fromStepIndex;
    private final float steppedInterpolation;
    private final int toStepIndex;

    public ShiftPointRange(int i2, int i3, float f2) {
        this.fromStepIndex = i2;
        this.toStepIndex = i3;
        this.steppedInterpolation = f2;
    }

    public static /* synthetic */ ShiftPointRange copy$default(ShiftPointRange shiftPointRange, int i2, int i3, float f2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = shiftPointRange.fromStepIndex;
        }
        if ((i4 & 2) != 0) {
            i3 = shiftPointRange.toStepIndex;
        }
        if ((i4 & 4) != 0) {
            f2 = shiftPointRange.steppedInterpolation;
        }
        return shiftPointRange.copy(i2, i3, f2);
    }

    public final int component1() {
        return this.fromStepIndex;
    }

    public final int component2() {
        return this.toStepIndex;
    }

    public final float component3() {
        return this.steppedInterpolation;
    }

    public final ShiftPointRange copy(int i2, int i3, float f2) {
        return new ShiftPointRange(i2, i3, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShiftPointRange)) {
            return false;
        }
        ShiftPointRange shiftPointRange = (ShiftPointRange) obj;
        return this.fromStepIndex == shiftPointRange.fromStepIndex && this.toStepIndex == shiftPointRange.toStepIndex && Float.compare(this.steppedInterpolation, shiftPointRange.steppedInterpolation) == 0;
    }

    public final int getFromStepIndex() {
        return this.fromStepIndex;
    }

    public final float getSteppedInterpolation() {
        return this.steppedInterpolation;
    }

    public final int getToStepIndex() {
        return this.toStepIndex;
    }

    public int hashCode() {
        return (((this.fromStepIndex * 31) + this.toStepIndex) * 31) + Float.floatToIntBits(this.steppedInterpolation);
    }

    public String toString() {
        return "ShiftPointRange(fromStepIndex=" + this.fromStepIndex + ", toStepIndex=" + this.toStepIndex + ", steppedInterpolation=" + this.steppedInterpolation + ')';
    }
}
