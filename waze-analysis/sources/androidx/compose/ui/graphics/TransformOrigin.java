package androidx.compose.ui.graphics;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TransformOrigin {
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long Center = TransformOriginKt.TransformOrigin(0.5f, 0.5f);

    private /* synthetic */ TransformOrigin(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TransformOrigin m8658boximpl(long j2) {
        return new TransformOrigin(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m8659component1impl(long j2) {
        return m8666getPivotFractionXimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m8660component2impl(long j2) {
        return m8667getPivotFractionYimpl(j2);
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m8662copyzey9I6w(long j2, float f2, float f3) {
        return TransformOriginKt.TransformOrigin(f2, f3);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m8663copyzey9I6w$default(long j2, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = m8666getPivotFractionXimpl(j2);
        }
        if ((i2 & 2) != 0) {
            f3 = m8667getPivotFractionYimpl(j2);
        }
        return m8662copyzey9I6w(j2, f2, f3);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8664equalsimpl(long j2, Object obj) {
        return (obj instanceof TransformOrigin) && j2 == ((TransformOrigin) obj).m8670unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8665equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m8666getPivotFractionXimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m8667getPivotFractionYimpl(long j2) {
        return Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8668hashCodeimpl(long j2) {
        return TransformOrigin$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8669toStringimpl(long j2) {
        return "TransformOrigin(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m8664equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m8668hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m8669toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8670unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-SzJe1aQ, reason: not valid java name */
        public final long m8671getCenterSzJe1aQ() {
            return TransformOrigin.Center;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8661constructorimpl(long j2) {
        return j2;
    }
}
