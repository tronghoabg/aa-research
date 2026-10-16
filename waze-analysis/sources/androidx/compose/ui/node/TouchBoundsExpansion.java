package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    private /* synthetic */ TouchBoundsExpansion(long j2) {
        this.packedValue = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m10154boximpl(long j2) {
        return new TouchBoundsExpansion(j2);
    }

    /* renamed from: computeLeft-impl$ui, reason: not valid java name */
    public static final int m10155computeLeftimpl$ui(long j2, LayoutDirection layoutDirection) {
        return (!m10165isLayoutDirectionAwareimpl(j2) || layoutDirection == LayoutDirection.Ltr) ? m10162getStartimpl(j2) : m10161getEndimpl(j2);
    }

    /* renamed from: computeRight-impl$ui, reason: not valid java name */
    public static final int m10156computeRightimpl$ui(long j2, LayoutDirection layoutDirection) {
        return (!m10165isLayoutDirectionAwareimpl(j2) || layoutDirection == LayoutDirection.Ltr) ? m10161getEndimpl(j2) : m10162getStartimpl(j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10158equalsimpl(long j2, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j2 == ((TouchBoundsExpansion) obj).m10167unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10159equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m10160getBottomimpl(long j2) {
        return Companion.unpack(j2, 3);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m10161getEndimpl(long j2) {
        return Companion.unpack(j2, 2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m10162getStartimpl(long j2) {
        return Companion.unpack(j2, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m10163getTopimpl(long j2) {
        return Companion.unpack(j2, 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10164hashCodeimpl(long j2) {
        return TouchBoundsExpansion$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m10165isLayoutDirectionAwareimpl(long j2) {
        return (j2 & Long.MIN_VALUE) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10166toStringimpl(long j2) {
        return "TouchBoundsExpansion(packedValue=" + j2 + ')';
    }

    public boolean equals(Object obj) {
        return m10158equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m10164hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m10166toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10167unboximpl() {
        return this.packedValue;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m10168Absolutevsh68fg$default(Companion companion, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if (1 == (i6 & 1)) {
                i2 = 0;
            }
            if ((i6 & 2) != 0) {
                i3 = 0;
            }
            if ((i6 & 4) != 0) {
                i4 = 0;
            }
            if ((i6 & 8) != 0) {
                i5 = 0;
            }
            return companion.m10169Absolutevsh68fg(i2, i3, i4, i5);
        }

        private final long trimAndShift(int i2, int i3) {
            return (i2 & 32767) << (i3 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long j2, int i2) {
            return ((int) (j2 >> (i2 * 15))) & 32767;
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m10169Absolutevsh68fg(int i2, int i3, int i4, int i5) {
            if (i2 < 0 || i2 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (i3 < 0 || i3 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (i4 < 0 || i4 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (i5 < 0 || i5 >= 32768) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            long jPack$ui = pack$ui(i2, i3, i4, i5, false);
            Companion companion = TouchBoundsExpansion.Companion;
            return jPack$ui;
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m10170getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui(int i2, int i3, int i4, int i5, boolean z) {
            return trimAndShift(i2, 0) | trimAndShift(i3, 1) | trimAndShift(i4, 2) | trimAndShift(i5, 3) | (true != z ? 0L : Long.MIN_VALUE);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m10157constructorimpl(long j2) {
        return j2;
    }
}
