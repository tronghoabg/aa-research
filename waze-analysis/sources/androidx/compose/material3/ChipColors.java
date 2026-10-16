package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconContentColor;
    private final long disabledTrailingIconContentColor;
    private final long labelColor;
    private final long leadingIconContentColor;
    private final long trailingIconContentColor;

    private ChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j2;
        this.labelColor = j3;
        this.leadingIconContentColor = j4;
        this.trailingIconContentColor = j5;
        this.disabledContainerColor = j6;
        this.disabledLabelColor = j7;
        this.disabledLeadingIconContentColor = j8;
        this.disabledTrailingIconContentColor = j9;
    }

    /* renamed from: copy-FD3wquc$default, reason: not valid java name */
    public static /* synthetic */ ChipColors m4496copyFD3wquc$default(ChipColors chipColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i2, Object obj) {
        long j10;
        long j11;
        long j12 = (i2 & 1) != 0 ? chipColors.containerColor : j2;
        long j13 = (i2 & 2) != 0 ? chipColors.labelColor : j3;
        long j14 = (i2 & 4) != 0 ? chipColors.leadingIconContentColor : j4;
        long j15 = (i2 & 8) != 0 ? chipColors.trailingIconContentColor : j5;
        long j16 = (i2 & 16) != 0 ? chipColors.disabledContainerColor : j6;
        long j17 = (i2 & 32) != 0 ? chipColors.disabledLabelColor : j7;
        long j18 = (i2 & 64) != 0 ? chipColors.disabledLeadingIconContentColor : j8;
        if ((i2 & 128) != 0) {
            j10 = chipColors.disabledTrailingIconContentColor;
            j11 = j12;
        } else {
            j10 = j9;
            j11 = j12;
        }
        return chipColors.m4498copyFD3wquc(j11, j13, j14, j15, j16, j17, j18, j10);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m4497containerColorvNxB06k$material3(boolean z) {
        return z ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: copy-FD3wquc, reason: not valid java name */
    public final ChipColors m4498copyFD3wquc(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        return new ChipColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.labelColor, j4 != 16 ? j4 : this.leadingIconContentColor, j5 != 16 ? j5 : this.trailingIconContentColor, j6 != 16 ? j6 : this.disabledContainerColor, j7 != 16 ? j7 : this.disabledLabelColor, j8 != 16 ? j8 : this.disabledLeadingIconContentColor, j9 != 16 ? j9 : this.disabledTrailingIconContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipColors)) {
            return false;
        }
        ChipColors chipColors = (ChipColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, chipColors.containerColor) && Color.m8229equalsimpl0(this.labelColor, chipColors.labelColor) && Color.m8229equalsimpl0(this.leadingIconContentColor, chipColors.leadingIconContentColor) && Color.m8229equalsimpl0(this.trailingIconContentColor, chipColors.trailingIconContentColor) && Color.m8229equalsimpl0(this.disabledContainerColor, chipColors.disabledContainerColor) && Color.m8229equalsimpl0(this.disabledLabelColor, chipColors.disabledLabelColor) && Color.m8229equalsimpl0(this.disabledLeadingIconContentColor, chipColors.disabledLeadingIconContentColor) && Color.m8229equalsimpl0(this.disabledTrailingIconContentColor, chipColors.disabledTrailingIconContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4499getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4500getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledLabelColor-0d7_KjU, reason: not valid java name */
    public final long m4501getDisabledLabelColor0d7_KjU() {
        return this.disabledLabelColor;
    }

    /* renamed from: getDisabledLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m4502getDisabledLeadingIconContentColor0d7_KjU() {
        return this.disabledLeadingIconContentColor;
    }

    /* renamed from: getDisabledTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m4503getDisabledTrailingIconContentColor0d7_KjU() {
        return this.disabledTrailingIconContentColor;
    }

    /* renamed from: getLabelColor-0d7_KjU, reason: not valid java name */
    public final long m4504getLabelColor0d7_KjU() {
        return this.labelColor;
    }

    /* renamed from: getLeadingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m4505getLeadingIconContentColor0d7_KjU() {
        return this.leadingIconContentColor;
    }

    /* renamed from: getTrailingIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m4506getTrailingIconContentColor0d7_KjU() {
        return this.trailingIconContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.disabledTrailingIconContentColor;
        long j3 = this.disabledLeadingIconContentColor;
        long j4 = this.disabledLabelColor;
        long j5 = this.disabledContainerColor;
        long j6 = this.trailingIconContentColor;
        return (((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.labelColor)) * 31) + Color.m8235hashCodeimpl(this.leadingIconContentColor)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: labelColor-vNxB06k$material3, reason: not valid java name */
    public final long m4507labelColorvNxB06k$material3(boolean z) {
        return z ? this.labelColor : this.disabledLabelColor;
    }

    /* renamed from: leadingIconContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m4508leadingIconContentColorvNxB06k$material3(boolean z) {
        return z ? this.leadingIconContentColor : this.disabledLeadingIconContentColor;
    }

    /* renamed from: trailingIconContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m4509trailingIconContentColorvNxB06k$material3(boolean z) {
        return z ? this.trailingIconContentColor : this.disabledTrailingIconContentColor;
    }

    public /* synthetic */ ChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9);
    }
}
