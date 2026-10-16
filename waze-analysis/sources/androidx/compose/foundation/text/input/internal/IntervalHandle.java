package androidx.compose.foundation.text.input.internal;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class IntervalHandle {
    public static final Companion Companion = new Companion(null);
    private static final long Invalid = m3624constructorimpl(0, 0);
    private final long packed;

    private /* synthetic */ IntervalHandle(long j2) {
        this.packed = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntervalHandle m3623boximpl(long j2) {
        return new IntervalHandle(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3624constructorimpl(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3626equalsimpl(long j2, Object obj) {
        return (obj instanceof IntervalHandle) && j2 == ((IntervalHandle) obj).m3632unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3627equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getId-impl, reason: not valid java name */
    public static final int m3628getIdimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: getOriginalNodeIndex-impl, reason: not valid java name */
    public static final int m3629getOriginalNodeIndeximpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3630hashCodeimpl(long j2) {
        return IntervalHandle$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3631toStringimpl(long j2) {
        return "IntervalHandle(packed=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m3626equalsimpl(this.packed, obj);
    }

    public final long getPacked() {
        return this.packed;
    }

    public int hashCode() {
        return m3630hashCodeimpl(this.packed);
    }

    public String toString() {
        return m3631toStringimpl(this.packed);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3632unboximpl() {
        return this.packed;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getInvalid-mo69AQQ, reason: not valid java name */
        public final long m3633getInvalidmo69AQQ() {
            return IntervalHandle.Invalid;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3625constructorimpl(long j2) {
        return j2;
    }
}
