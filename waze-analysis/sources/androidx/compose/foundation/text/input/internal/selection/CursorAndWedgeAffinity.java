package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.media3.muxer.MuxerUtil;
import h.g.a;
import h.i;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m3722boximpl(long j2) {
        return new CursorAndWedgeAffinity(j2);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m3723component1impl(long j2) {
        return m3730getCursorimpl(j2);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m3724component2impl(long j2) {
        return m3731getWedgeAffinityimpl(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3726constructorimpl(int i2, WedgeAffinity wedgeAffinity) {
        int i3;
        if (wedgeAffinity == null) {
            i3 = -1;
        } else {
            int iOrdinal = wedgeAffinity.ordinal();
            if (iOrdinal == 0) {
                i3 = 0;
            } else {
                if (iOrdinal != 1) {
                    throw new i();
                }
                i3 = 1;
            }
        }
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3728equalsimpl(long j2, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j2 == ((CursorAndWedgeAffinity) obj).m3734unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3729equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m3730getCursorimpl(long j2) {
        return (int) (j2 >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m3731getWedgeAffinityimpl(long j2) {
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        if (i2 < 0) {
            return null;
        }
        return i2 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3732hashCodeimpl(long j2) {
        return CursorAndWedgeAffinity$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3733toStringimpl(long j2) {
        return "CursorAndWedgeAffinity(value=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m3728equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3732hashCodeimpl(this.value);
    }

    public String toString() {
        return m3733toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3734unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3727constructorimpl(long j2) {
        return j2;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3725constructorimpl(int i2) {
        return (i2 << 32) | MuxerUtil.UNSIGNED_INT_MAX_VALUE;
    }
}
