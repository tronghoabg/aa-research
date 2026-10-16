package androidx.compose.ui.text;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    private /* synthetic */ TextRange(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m10534boximpl(long j2) {
        return new TextRange(j2);
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m10536contains5zctL8(long j2, long j3) {
        return (m10544getMinimpl(j2) <= m10544getMinimpl(j3)) & (m10543getMaximpl(j3) <= m10543getMaximpl(j2));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m10537containsimpl(long j2, int i2) {
        return i2 < m10543getMaximpl(j2) && m10544getMinimpl(j2) <= i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10538equalsimpl(long j2, Object obj) {
        return (obj instanceof TextRange) && j2 == ((TextRange) obj).m10550unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10539equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m10540getCollapsedimpl(long j2) {
        return m10546getStartimpl(j2) == m10541getEndimpl(j2);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m10541getEndimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m10542getLengthimpl(long j2) {
        return m10543getMaximpl(j2) - m10544getMinimpl(j2);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m10543getMaximpl(long j2) {
        return Math.max(m10546getStartimpl(j2), m10541getEndimpl(j2));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m10544getMinimpl(long j2) {
        return Math.min(m10546getStartimpl(j2), m10541getEndimpl(j2));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m10545getReversedimpl(long j2) {
        return m10546getStartimpl(j2) > m10541getEndimpl(j2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m10546getStartimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10547hashCodeimpl(long j2) {
        return TextRange$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m10548intersects5zctL8(long j2, long j3) {
        return (m10544getMinimpl(j2) < m10543getMaximpl(j3)) & (m10544getMinimpl(j3) < m10543getMaximpl(j2));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10549toStringimpl(long j2) {
        return "TextRange(" + m10546getStartimpl(j2) + ", " + m10541getEndimpl(j2) + ')';
    }

    public boolean equals(Object obj) {
        return m10538equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m10547hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10549toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10550unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m10551getZerod9O1mEE() {
            return TextRange.Zero;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10535constructorimpl(long j2) {
        return j2;
    }
}
