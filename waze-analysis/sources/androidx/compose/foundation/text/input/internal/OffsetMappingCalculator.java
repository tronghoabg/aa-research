package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m3649constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m3644mapfzxv0v0(int i2, boolean z) {
        int i3;
        int[] iArr = this.ops;
        int i4 = this.opsSize;
        if (i4 < 0) {
            i3 = i2;
        } else if (z) {
            int iMin = i2;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 3;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                int i9 = iArr[i6 + 2];
                long jM3645mapStepC6uMEY = m3645mapStepC6uMEY(iMin, i7, i8, i9, z);
                long jM3645mapStepC6uMEY2 = m3645mapStepC6uMEY(i2, i7, i8, i9, z);
                int iM10546getStartimpl = TextRange.m10546getStartimpl(jM3645mapStepC6uMEY);
                int iM10546getStartimpl2 = TextRange.m10546getStartimpl(jM3645mapStepC6uMEY2);
                int iM10541getEndimpl = TextRange.m10541getEndimpl(jM3645mapStepC6uMEY);
                int iM10541getEndimpl2 = TextRange.m10541getEndimpl(jM3645mapStepC6uMEY2);
                iMin = Math.min(iM10546getStartimpl, iM10546getStartimpl2);
                i2 = Math.max(iM10541getEndimpl, iM10541getEndimpl2);
            }
            int i10 = iMin;
            i3 = i2;
            i2 = i10;
        } else {
            int i11 = i4 - 1;
            int iMin2 = i2;
            while (i11 >= 0) {
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                int i14 = iArr[i12 + 1];
                int i15 = iArr[i12 + 2];
                OffsetMappingCalculator offsetMappingCalculator = this;
                boolean z2 = z;
                long jM3645mapStepC6uMEY3 = offsetMappingCalculator.m3645mapStepC6uMEY(iMin2, i13, i14, i15, z2);
                long jM3645mapStepC6uMEY4 = offsetMappingCalculator.m3645mapStepC6uMEY(i2, i13, i14, i15, z2);
                int iM10546getStartimpl3 = TextRange.m10546getStartimpl(jM3645mapStepC6uMEY3);
                int iM10546getStartimpl4 = TextRange.m10546getStartimpl(jM3645mapStepC6uMEY4);
                int iM10541getEndimpl3 = TextRange.m10541getEndimpl(jM3645mapStepC6uMEY3);
                int iM10541getEndimpl4 = TextRange.m10541getEndimpl(jM3645mapStepC6uMEY4);
                iMin2 = Math.min(iM10546getStartimpl3, iM10546getStartimpl4);
                i2 = Math.max(iM10541getEndimpl3, iM10541getEndimpl4);
                i11--;
                this = offsetMappingCalculator;
                z = z2;
            }
            int i16 = i2;
            i2 = iMin2;
            i3 = i16;
        }
        return TextRangeKt.TextRange(i2, i3);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m3645mapStepC6uMEY(int i2, int i3, int i4, int i5, boolean z) {
        if (i2 < i3) {
            return TextRangeKt.TextRange(i2);
        }
        int i6 = true != z ? i4 : i5;
        if (true != z) {
            i4 = i5;
        }
        return i2 == i3 ? i4 == 0 ? TextRangeKt.TextRange(i3, i6 + i3) : TextRangeKt.TextRange(i3) : i2 < i3 + i4 ? i6 == 0 ? TextRangeKt.TextRange(i3) : TextRangeKt.TextRange(i3, i6 + i3) : TextRangeKt.TextRange((i2 - i4) + i6);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m3646mapFromDestjx7JFs(int i2) {
        return m3644mapfzxv0v0(i2, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m3647mapFromSourcejx7JFs(int i2) {
        return m3644mapfzxv0v0(i2, true);
    }

    public final void recordEditOperation(int i2, int i3, int i4) {
        if (i4 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + i4);
        }
        int iMin = Math.min(i2, i3);
        int iMax = Math.max(iMin, i3) - iMin;
        if (iMax >= 2 || iMax != i4) {
            int i5 = this.opsSize + 1;
            if (i5 > OpArray.m3656getSizeimpl(this.ops)) {
                int iM3656getSizeimpl = OpArray.m3656getSizeimpl(this.ops);
                this.ops = OpArray.m3651copyOfpSmdads(this.ops, Math.max(i5 + i5, iM3656getSizeimpl + iM3656getSizeimpl));
            }
            OpArray.m3658setimpl(this.ops, this.opsSize, iMin, iMax, i4);
            this.opsSize = i5;
        }
    }
}
