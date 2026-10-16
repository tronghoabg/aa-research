package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntSizeKt {
    public static final long IntSize(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m11345getCenterozmzZPI(long j2) {
        return ((j2 >> 33) << 32) | (((j2 << 32) >> 33) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m11347roundToIntSizeuvyYCjk(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m11348timesO0kMr_c(int i2, long j2) {
        return IntSize.m11341timesYEO4UFw(j2, i2);
    }

    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m11349toIntRectozmzZPI(long j2) {
        return IntRectKt.m11329IntRectVbeCjmY(IntOffset.Companion.m11307getZeronOccac(), j2);
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m11350toIntSizeuvyYCjk(long j2) {
        return (((int) Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (((int) Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m11351toSizeozmzZPI(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m11346getCenterozmzZPI$annotations(long j2) {
    }
}
