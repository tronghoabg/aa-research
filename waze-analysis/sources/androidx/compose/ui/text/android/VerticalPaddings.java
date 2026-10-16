package androidx.compose.ui.text.android;

import androidx.media3.muxer.MuxerUtil;
import h.g.a;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class VerticalPaddings {
    private final long packedValue;

    private /* synthetic */ VerticalPaddings(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VerticalPaddings m10593boximpl(long j2) {
        return new VerticalPaddings(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10595equalsimpl(long j2, Object obj) {
        return (obj instanceof VerticalPaddings) && j2 == ((VerticalPaddings) obj).m10601unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10596equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getBottomPadding-impl, reason: not valid java name */
    public static final int m10597getBottomPaddingimpl(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: getTopPadding-impl, reason: not valid java name */
    public static final int m10598getTopPaddingimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10599hashCodeimpl(long j2) {
        return VerticalPaddings$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10600toStringimpl(long j2) {
        return "VerticalPaddings(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m10595equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m10599hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10600toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10601unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10594constructorimpl(long j2) {
        return j2;
    }
}
