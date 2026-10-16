package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m3773constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ InlineDensity(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m3772boximpl(long j2) {
        return new InlineDensity(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3773constructorimpl(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3776equalsimpl(long j2, Object obj) {
        return (obj instanceof InlineDensity) && j2 == ((InlineDensity) obj).m3782unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3777equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m3778getDensityimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m3779getFontScaleimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3780hashCodeimpl(long j2) {
        return InlineDensity$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3781toStringimpl(long j2) {
        return "InlineDensity(density=" + m3778getDensityimpl(j2) + ", fontScale=" + m3779getFontScaleimpl(j2) + ')';
    }

    public boolean equals(Object obj) {
        return m3776equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3780hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m3781toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3782unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m3783getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m3774constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3775constructorimpl(Density density) {
        return m3773constructorimpl(density.getDensity(), density.getFontScale());
    }
}
