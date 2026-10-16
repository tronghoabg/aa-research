package androidx.compose.material3;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class SliderRange {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    private /* synthetic */ SliderRange(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SliderRange m5610boximpl(long j2) {
        return new SliderRange(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5612equalsimpl(long j2, Object obj) {
        return (obj instanceof SliderRange) && j2 == ((SliderRange) obj).m5618unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5613equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m5614getEndInclusiveimpl(long j2) {
        if (j2 != Unspecified) {
            return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m5615getStartimpl(long j2) {
        if (j2 != Unspecified) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }
        throw new IllegalStateException("SliderRange is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5616hashCodeimpl(long j2) {
        return SliderRange$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5617toStringimpl(long j2) {
        if (!SliderKt.m5604isSpecifiedIf1S1O4(j2)) {
            return "FloatRange.Unspecified";
        }
        return m5615getStartimpl(j2) + ".." + m5614getEndInclusiveimpl(j2);
    }

    public boolean equals(Object obj) {
        return m5612equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m5616hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m5617toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5618unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m5620getUnspecifiedFYbKRX4() {
            return SliderRange.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m5619getUnspecifiedFYbKRX4$annotations() {
        }
    }

    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5611constructorimpl(long j2) {
        return j2;
    }
}
