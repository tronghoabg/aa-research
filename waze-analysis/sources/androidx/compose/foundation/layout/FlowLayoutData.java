package androidx.compose.foundation.layout;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f2) {
        this.fillCrossAxisFraction = f2;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f2);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    public final FlowLayoutData copy(float f2) {
        return new FlowLayoutData(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.fillCrossAxisFraction);
    }

    public final void setFillCrossAxisFraction(float f2) {
        this.fillCrossAxisFraction = f2;
    }

    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.fillCrossAxisFraction + ')';
    }
}
