package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : orientation, (i2 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j2, null);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m2331calculatePostSlopOffsettuRUvjQ(float f2) {
        Orientation orientation = this.orientation;
        long j2 = this.totalPositionChange;
        if (orientation == null) {
            return Offset.m7984minusMKHz9U(this.totalPositionChange, Offset.m7987timestuRUvjQ(Offset.m7975divtuRUvjQ(j2, Offset.m7978getDistanceimpl(j2)), f2));
        }
        float fM2337mainAxisk4lQ0M = m2337mainAxisk4lQ0M(j2) - (Math.signum(m2337mainAxisk4lQ0M(this.totalPositionChange)) * f2);
        float fM2334crossAxisk4lQ0M = m2334crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation != Orientation.Horizontal) {
            return (Float.floatToRawIntBits(fM2334crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM2337mainAxisk4lQ0M) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
        return (Float.floatToRawIntBits(fM2334crossAxisk4lQ0M) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fM2337mainAxisk4lQ0M) << 32);
    }

    /* renamed from: reset-k-4lQ0M$default, reason: not valid java name */
    public static /* synthetic */ void m2333resetk4lQ0M$default(TouchSlopDetector touchSlopDetector, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        touchSlopDetector.m2338resetk4lQ0M(j2);
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m2334crossAxisk4lQ0M(long j2) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) : (int) (j2 >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: getPostSlopOffset-qto3Fdw, reason: not valid java name */
    public final long m2335getPostSlopOffsetqto3Fdw(long j2, float f2, boolean z) {
        long jM7985plusMKHz9U;
        long j3 = this.totalPositionChange;
        if (z) {
            jM7985plusMKHz9U = Offset.m7985plusMKHz9U(j3, j2);
            this.totalPositionChange = jM7985plusMKHz9U;
        } else {
            jM7985plusMKHz9U = Offset.m7985plusMKHz9U(j3, j2);
        }
        return (this.orientation == null ? Offset.m7978getDistanceimpl(jM7985plusMKHz9U) : Math.abs(m2337mainAxisk4lQ0M(jM7985plusMKHz9U))) >= f2 ? m2331calculatePostSlopOffsettuRUvjQ(f2) : Offset.Companion.m7995getUnspecifiedF1C5BW0();
    }

    /* renamed from: getTotalPositionChange-F1C5BW0, reason: not valid java name */
    public final long m2336getTotalPositionChangeF1C5BW0() {
        return this.totalPositionChange;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m2337mainAxisk4lQ0M(long j2) {
        return Float.intBitsToFloat(this.orientation == Orientation.Horizontal ? (int) (j2 >> 32) : (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: reset-k-4lQ0M, reason: not valid java name */
    public final void m2338resetk4lQ0M(long j2) {
        this.totalPositionChange = j2;
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j2, o oVar) {
        this(orientation, j2);
    }

    private TouchSlopDetector(Orientation orientation, long j2) {
        this.orientation = orientation;
        this.totalPositionChange = j2;
    }
}
