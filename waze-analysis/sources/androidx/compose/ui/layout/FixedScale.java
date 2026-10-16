package androidx.compose.ui.layout;

import androidx.compose.ui.layout.ScaleFactor;
import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f2) {
        this.value = f2;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = fixedScale.value;
        }
        return fixedScale.copy(f2);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo9734computeScaleFactorH7hwNQA(long j2, long j3) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.value);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(this.value);
        ScaleFactor.Companion companion = ScaleFactor.Companion;
        return (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public final FixedScale copy(float f2) {
        return new FixedScale(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
