package androidx.compose.ui.unit;

import androidx.media3.common.util.WavUtil;
import h.e;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m11094boximpl(long j2) {
        return new Constraints(j2);
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m11096copyZbe2FdA(long j2, int i2, int i3, int i4, int i5) {
        if (i3 < i2 || i5 < i4 || i2 < 0 || i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i2, i3, i4, i5);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m11097copyZbe2FdA$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = m11109getMinWidthimpl(j2);
        }
        int i7 = i2;
        if ((i6 & 2) != 0) {
            i3 = m11107getMaxWidthimpl(j2);
        }
        int i8 = i3;
        if ((i6 & 4) != 0) {
            i4 = m11108getMinHeightimpl(j2);
        }
        int i9 = i4;
        if ((i6 & 8) != 0) {
            i5 = m11106getMaxHeightimpl(j2);
        }
        return m11096copyZbe2FdA(j2, i7, i8, i9, i5);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m11098copyMaxDimensionsmsEJaDk(long j2) {
        return j2 & ConstraintsKt.MaxDimensionsAndFocusMask;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11099equalsimpl(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).m11113unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11100equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m11101getFocusIndeximpl(long j2) {
        return (int) (j2 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m11102getHasBoundedHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = i4 + i4 + (i3 * 3);
        return (((int) (j2 >> (i5 + 46))) & ((1 << (18 - i5)) + (-1))) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m11103getHasBoundedWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        return (((int) (j2 >> 33)) & ((1 << (((i4 + i4) + (i3 * 3)) + 13)) + (-1))) != 0;
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m11104getHasFixedHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = i4 + i4 + (i3 * 3);
        int i6 = i5 + 15;
        int i7 = (1 << (18 - i5)) - 1;
        int i8 = ((int) (j2 >> (i5 + 46))) & i7;
        return (((int) (j2 >> i6)) & i7) == (i8 == 0 ? Integer.MAX_VALUE : i8 + (-1));
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m11105getHasFixedWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = (1 << (((i4 + i4) + (i3 * 3)) + 13)) - 1;
        int i6 = ((int) (j2 >> 33)) & i5;
        return (((int) (j2 >> 2)) & i5) == (i6 == 0 ? Integer.MAX_VALUE : i6 + (-1));
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m11106getMaxHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = ((int) (j2 >> (((i4 + i4) + (i3 * 3)) + 46))) & ((1 << (18 - r0)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m11107getMaxWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = ((int) (j2 >> 33)) & ((1 << (((i4 + i4) + (i3 * 3)) + 13)) - 1);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m11108getMinHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        return ((int) (j2 >> (((i4 + i4) + (i3 * 3)) + 15))) & ((1 << (18 - r0)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m11109getMinWidthimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        return ((int) (j2 >> 2)) & ((1 << (((i4 + i4) + (i3 * 3)) + 13)) - 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11110hashCodeimpl(long j2) {
        return Constraints$$ExternalSyntheticBackport0.m(j2);
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m11111isZeroimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        int i5 = i4 + i4 + (i3 * 3);
        return ((((1 << (i5 + 13)) + (-1)) & ((int) (j2 >> 33))) + (-1) == 0) | ((((int) (j2 >> (i5 + 46))) & ((1 << (18 - i5)) + (-1))) + (-1) == 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11112toStringimpl(long j2) {
        int iM11107getMaxWidthimpl = m11107getMaxWidthimpl(j2);
        String strValueOf = iM11107getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM11107getMaxWidthimpl);
        int iM11106getMaxHeightimpl = m11106getMaxHeightimpl(j2);
        return "Constraints(minWidth = " + m11109getMinWidthimpl(j2) + ", maxWidth = " + strValueOf + ", minHeight = " + m11108getMinHeightimpl(j2) + ", maxHeight = " + (iM11106getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM11106getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m11099equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11110hashCodeimpl(this.value);
    }

    public String toString() {
        return m11112toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11113unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m11115fitPrioritizingHeightZbe2FdA(int i2, int i3, int i4, int i5) {
            int i6 = 262142;
            int iMin = Math.min(i4, 262142);
            int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
            int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i7 >= 8191) {
                if (i7 < 32767) {
                    i6 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i7 < 65535) {
                    i6 = 32766;
                } else {
                    if (i7 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i7);
                        throw new e();
                    }
                    i6 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m11116fitPrioritizingWidthZbe2FdA(int i2, int i3, int i4, int i5) {
            int i6 = 262142;
            int iMin = Math.min(i2, 262142);
            int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
            int i7 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i7 >= 8191) {
                if (i7 < 32767) {
                    i6 = WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE;
                } else if (i7 < 65535) {
                    i6 = 32766;
                } else {
                    if (i7 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i7);
                        throw new e();
                    }
                    i6 = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
        }

        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m11117fixedJhjzzOo(int i2, int i3) {
            if (!((i3 >= 0) & (i2 >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i2, i2, i3, i3);
        }

        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m11118fixedHeightOenEA2s(int i2) {
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i2, i2);
        }

        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m11119fixedWidthOenEA2s(int i2) {
            if (i2 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i2, i2, 0, Integer.MAX_VALUE);
        }

        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m11120restrictConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z) {
            return z ? m11116fitPrioritizingWidthZbe2FdA(i2, i3, i4, i5) : m11115fitPrioritizingHeightZbe2FdA(i2, i3, i4, i5);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11095constructorimpl(long j2) {
        return j2;
    }
}
