package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY, reason: not valid java name */
    public static final long m3795finalConstraintstfFHcEY(long j2, boolean z, int i2, float f2) {
        return Constraints.Companion.m11116fitPrioritizingWidthZbe2FdA(0, m3797finalMaxWidthtfFHcEY(j2, z, i2, f2), 0, Constraints.m11106getMaxHeightimpl(j2));
    }

    /* renamed from: finalMaxLines-xdlQI24, reason: not valid java name */
    public static final int m3796finalMaxLinesxdlQI24(boolean z, int i2, int i3) {
        if ((z || !m3798isEllipsisMW5ApA(i2)) && i3 > 0) {
            return i3;
        }
        return 1;
    }

    /* renamed from: finalMaxWidth-tfFHcEY, reason: not valid java name */
    public static final int m3797finalMaxWidthtfFHcEY(long j2, boolean z, int i2, float f2) {
        int iM11107getMaxWidthimpl = Integer.MAX_VALUE;
        if ((z || m3798isEllipsisMW5ApA(i2)) && Constraints.m11103getHasBoundedWidthimpl(j2)) {
            iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(j2);
        }
        return Constraints.m11109getMinWidthimpl(j2) == iM11107getMaxWidthimpl ? iM11107getMaxWidthimpl : n.j(TextDelegateKt.ceilToIntPx(f2), Constraints.m11109getMinWidthimpl(j2), iM11107getMaxWidthimpl);
    }

    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m3798isEllipsisMW5ApA(int i2) {
        return TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11069getEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11071getStartEllipsisgIe3tQ8()) || TextOverflow.m11059equalsimpl0(i2, TextOverflow.Companion.m11070getMiddleEllipsisgIe3tQ8());
    }
}
