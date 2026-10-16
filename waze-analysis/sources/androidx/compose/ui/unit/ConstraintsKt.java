package androidx.compose.ui.unit;

import androidx.media3.muxer.MuxerUtil;
import h.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    public static final long Constraints(int i2, int i3, int i4, int i5) {
        if (!((i4 >= 0) & (i3 >= i2) & (i5 >= i4) & (i2 >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i2, i3, i4, i5);
    }

    public static /* synthetic */ long Constraints$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if (1 == (i6 & 1)) {
            i2 = 0;
        }
        if ((i6 & 2) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i2, i3, i4, i5);
    }

    private static final int addMaxWithMinimum(int i2, int i3) {
        if (i2 == Integer.MAX_VALUE) {
            return i2;
        }
        int i4 = i2 + i3;
        if (i4 < 0) {
            return 0;
        }
        return i4;
    }

    private static final int bitOffsetToIndex(int i2) {
        return (i2 >> 1) + (i2 & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i2) {
        if (i2 < MaxNonFocusMask) {
            return 13;
        }
        if (i2 < 32767) {
            return 15;
        }
        if (i2 < 65535) {
            return 16;
        }
        return i2 >= MaxFocusMask ? 255 : 18;
    }

    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m11121constrain4WqzIAM(long j2, long j3) {
        int i2 = (int) (j3 >> 32);
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        if (i2 < iM11109getMinWidthimpl) {
            i2 = iM11109getMinWidthimpl;
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (i2 > iM11107getMaxWidthimpl) {
            i2 = iM11107getMaxWidthimpl;
        }
        long j4 = i2 << 32;
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        if (i3 < iM11108getMinHeightimpl) {
            i3 = iM11108getMinHeightimpl;
        }
        if (i3 <= iM11106getMaxHeightimpl) {
            iM11106getMaxHeightimpl = i3;
        }
        return iM11106getMaxHeightimpl | j4;
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m11122constrainN9IONVI(long j2, long j3) {
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j3);
        int iM11109getMinWidthimpl2 = Constraints.m11109getMinWidthimpl(j2);
        if (iM11109getMinWidthimpl < iM11109getMinWidthimpl2) {
            iM11109getMinWidthimpl = iM11109getMinWidthimpl2;
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (iM11109getMinWidthimpl > iM11107getMaxWidthimpl) {
            iM11109getMinWidthimpl = iM11107getMaxWidthimpl;
        }
        int iM11107getMaxWidthimpl2 = Constraints.m11107getMaxWidthimpl(j3);
        if (iM11107getMaxWidthimpl2 >= iM11109getMinWidthimpl2) {
            iM11109getMinWidthimpl2 = iM11107getMaxWidthimpl2;
        }
        if (iM11109getMinWidthimpl2 <= iM11107getMaxWidthimpl) {
            iM11107getMaxWidthimpl = iM11109getMinWidthimpl2;
        }
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j3);
        int iM11108getMinHeightimpl2 = Constraints.m11108getMinHeightimpl(j2);
        if (iM11108getMinHeightimpl < iM11108getMinHeightimpl2) {
            iM11108getMinHeightimpl = iM11108getMinHeightimpl2;
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        if (iM11108getMinHeightimpl > iM11106getMaxHeightimpl) {
            iM11108getMinHeightimpl = iM11106getMaxHeightimpl;
        }
        int iM11106getMaxHeightimpl2 = Constraints.m11106getMaxHeightimpl(j3);
        if (iM11106getMaxHeightimpl2 >= iM11108getMinHeightimpl2) {
            iM11108getMinHeightimpl2 = iM11106getMaxHeightimpl2;
        }
        if (iM11108getMinHeightimpl2 <= iM11106getMaxHeightimpl) {
            iM11106getMaxHeightimpl = iM11108getMinHeightimpl2;
        }
        return Constraints(iM11109getMinWidthimpl, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, iM11106getMaxHeightimpl);
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m11123constrainHeightK40F9xA(long j2, int i2) {
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        if (i2 < iM11108getMinHeightimpl) {
            i2 = iM11108getMinHeightimpl;
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        return i2 > iM11106getMaxHeightimpl ? iM11106getMaxHeightimpl : i2;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m11124constrainWidthK40F9xA(long j2, int i2) {
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2);
        if (i2 < iM11109getMinWidthimpl) {
            i2 = iM11109getMinWidthimpl;
        }
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        return i2 > iM11107getMaxWidthimpl ? iM11107getMaxWidthimpl : i2;
    }

    public static final long createConstraints(int i2, int i3, int i4, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i4 : i5;
        int i7 = i3 == Integer.MAX_VALUE ? i2 : i3;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i6);
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i7);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i7, i6);
        }
        int i8 = i3 + 1;
        int i9 = i5 + 1;
        int i10 = iBitsNeedForSizeUnchecked2 - 13;
        return (((~(i8 >> 31)) & i8) << 33) | (i2 << 2) | ((i10 >> 1) + (i10 & 1)) | (i4 << (iBitsNeedForSizeUnchecked2 + 2)) | (((~(i9 >> 31)) & i9) << (iBitsNeedForSizeUnchecked2 + 33));
    }

    private static final int heightMask(int i2) {
        return (1 << (18 - i2)) - 1;
    }

    private static final int indexToBitOffset(int i2) {
        int i3 = (i2 & 2) >> 1;
        int i4 = i2 & 1;
        return i4 + i4 + (i3 * 3);
    }

    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m11125isSatisfiedBy4WqzIAM(long j2, long j3) {
        int i2 = (int) (j3 >> 32);
        if (Constraints.m11109getMinWidthimpl(j2) > i2 || i2 > Constraints.m11107getMaxWidthimpl(j2)) {
            return false;
        }
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2);
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        int i3 = (int) (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        return iM11108getMinHeightimpl <= i3 && i3 <= iM11106getMaxHeightimpl;
    }

    private static final int maxAllowedForSize(int i2) {
        if (i2 < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i2 < 32767) {
            return 65534;
        }
        if (i2 < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i2 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i2);
        throw new e();
    }

    private static final int minHeightOffsets(int i2) {
        return i2 + 15;
    }

    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m11126offsetNN6EwU(long j2, int i2, int i3) {
        int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        if (iM11107getMaxWidthimpl != Integer.MAX_VALUE && (iM11107getMaxWidthimpl = iM11107getMaxWidthimpl + i2) < 0) {
            iM11107getMaxWidthimpl = 0;
        }
        int iM11108getMinHeightimpl = Constraints.m11108getMinHeightimpl(j2) + i3;
        if (iM11108getMinHeightimpl < 0) {
            iM11108getMinHeightimpl = 0;
        }
        int iM11106getMaxHeightimpl = Constraints.m11106getMaxHeightimpl(j2);
        if (iM11106getMaxHeightimpl != Integer.MAX_VALUE && (iM11106getMaxHeightimpl = iM11106getMaxHeightimpl + i3) < 0) {
            iM11106getMaxHeightimpl = 0;
        }
        int iM11109getMinWidthimpl = Constraints.m11109getMinWidthimpl(j2) + i2;
        return Constraints(iM11109getMinWidthimpl >= 0 ? iM11109getMinWidthimpl : 0, iM11107getMaxWidthimpl, iM11108getMinHeightimpl, iM11106getMaxHeightimpl);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m11127offsetNN6EwU$default(long j2, int i2, int i3, int i4, Object obj) {
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return m11126offsetNN6EwU(j2, i2, i3);
    }

    public static final void throwInvalidConstraintException(int i2, int i3) {
        throw new IllegalArgumentException("Can't represent a width of " + i2 + " and height of " + i3 + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int i2) {
        throw new IllegalArgumentException("Can't represent a size of " + i2 + " in Constraints");
    }

    private static final int widthMask(int i2) {
        return (1 << (i2 + 13)) - 1;
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }
}
