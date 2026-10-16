package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SelectableChipColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledSelectedContainerColor;
    private final long disabledTrailingIconColor;
    private final long labelColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;
    private final long selectedLeadingIconColor;
    private final long selectedTrailingIconColor;
    private final long trailingIconColor;

    private SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.containerColor = j2;
        this.labelColor = j3;
        this.leadingIconColor = j4;
        this.trailingIconColor = j5;
        this.disabledContainerColor = j6;
        this.disabledLabelColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
        this.selectedContainerColor = j10;
        this.disabledSelectedContainerColor = j11;
        this.selectedLabelColor = j12;
        this.selectedLeadingIconColor = j13;
        this.selectedTrailingIconColor = j14;
    }

    /* renamed from: copy-daRQuJA$default, reason: not valid java name */
    public static /* synthetic */ SelectableChipColors m5524copydaRQuJA$default(SelectableChipColors selectableChipColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i2, Object obj) {
        long j15;
        long j16;
        long j17 = (i2 & 1) != 0 ? selectableChipColors.containerColor : j2;
        long j18 = (i2 & 2) != 0 ? selectableChipColors.labelColor : j3;
        long j19 = (i2 & 4) != 0 ? selectableChipColors.leadingIconColor : j4;
        long j20 = (i2 & 8) != 0 ? selectableChipColors.trailingIconColor : j5;
        long j21 = (i2 & 16) != 0 ? selectableChipColors.disabledContainerColor : j6;
        long j22 = (i2 & 32) != 0 ? selectableChipColors.disabledLabelColor : j7;
        long j23 = (i2 & 64) != 0 ? selectableChipColors.disabledLeadingIconColor : j8;
        long j24 = j17;
        long j25 = (i2 & 128) != 0 ? selectableChipColors.disabledTrailingIconColor : j9;
        long j26 = (i2 & 256) != 0 ? selectableChipColors.selectedContainerColor : j10;
        long j27 = (i2 & 512) != 0 ? selectableChipColors.disabledSelectedContainerColor : j11;
        long j28 = (i2 & 1024) != 0 ? selectableChipColors.selectedLabelColor : j12;
        long j29 = (i2 & 2048) != 0 ? selectableChipColors.selectedLeadingIconColor : j13;
        if ((i2 & 4096) != 0) {
            j16 = j29;
            j15 = selectableChipColors.selectedTrailingIconColor;
        } else {
            j15 = j14;
            j16 = j29;
        }
        return selectableChipColors.m5526copydaRQuJA(j24, j18, j19, j20, j21, j22, j23, j25, j26, j27, j28, j16, j15);
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5525containerColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z ? z2 ? this.disabledSelectedContainerColor : this.disabledContainerColor : !z2 ? this.containerColor : this.selectedContainerColor;
    }

    /* renamed from: copy-daRQuJA, reason: not valid java name */
    public final SelectableChipColors m5526copydaRQuJA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        return new SelectableChipColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.labelColor, j4 != 16 ? j4 : this.leadingIconColor, j5 != 16 ? j5 : this.trailingIconColor, j6 != 16 ? j6 : this.disabledContainerColor, j7 != 16 ? j7 : this.disabledLabelColor, j8 != 16 ? j8 : this.disabledLeadingIconColor, j9 != 16 ? j9 : this.disabledTrailingIconColor, j10 != 16 ? j10 : this.selectedContainerColor, j11 != 16 ? j11 : this.disabledSelectedContainerColor, j12 != 16 ? j12 : this.selectedLabelColor, j13 != 16 ? j13 : this.selectedLeadingIconColor, j14 != 16 ? j14 : this.selectedTrailingIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectableChipColors)) {
            return false;
        }
        SelectableChipColors selectableChipColors = (SelectableChipColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, selectableChipColors.containerColor) && Color.m8229equalsimpl0(this.labelColor, selectableChipColors.labelColor) && Color.m8229equalsimpl0(this.leadingIconColor, selectableChipColors.leadingIconColor) && Color.m8229equalsimpl0(this.trailingIconColor, selectableChipColors.trailingIconColor) && Color.m8229equalsimpl0(this.disabledContainerColor, selectableChipColors.disabledContainerColor) && Color.m8229equalsimpl0(this.disabledLabelColor, selectableChipColors.disabledLabelColor) && Color.m8229equalsimpl0(this.disabledLeadingIconColor, selectableChipColors.disabledLeadingIconColor) && Color.m8229equalsimpl0(this.disabledTrailingIconColor, selectableChipColors.disabledTrailingIconColor) && Color.m8229equalsimpl0(this.selectedContainerColor, selectableChipColors.selectedContainerColor) && Color.m8229equalsimpl0(this.disabledSelectedContainerColor, selectableChipColors.disabledSelectedContainerColor) && Color.m8229equalsimpl0(this.selectedLabelColor, selectableChipColors.selectedLabelColor) && Color.m8229equalsimpl0(this.selectedLeadingIconColor, selectableChipColors.selectedLeadingIconColor) && Color.m8229equalsimpl0(this.selectedTrailingIconColor, selectableChipColors.selectedTrailingIconColor);
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.selectedTrailingIconColor;
        long j3 = this.selectedLeadingIconColor;
        long j4 = this.selectedLabelColor;
        long j5 = this.disabledSelectedContainerColor;
        long j6 = this.selectedContainerColor;
        long j7 = this.disabledTrailingIconColor;
        long j8 = this.disabledLeadingIconColor;
        long j9 = this.disabledLabelColor;
        long j10 = this.disabledContainerColor;
        long j11 = this.trailingIconColor;
        return (((((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.labelColor)) * 31) + Color.m8235hashCodeimpl(this.leadingIconColor)) * 31) + Color.m8235hashCodeimpl(j11)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: labelColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5527labelColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z ? this.disabledLabelColor : !z2 ? this.labelColor : this.selectedLabelColor;
    }

    /* renamed from: leadingIconContentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5528leadingIconContentColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z ? this.disabledLeadingIconColor : !z2 ? this.leadingIconColor : this.selectedLeadingIconColor;
    }

    /* renamed from: trailingIconContentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5529trailingIconContentColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z ? this.disabledTrailingIconColor : !z2 ? this.trailingIconColor : this.selectedTrailingIconColor;
    }

    public /* synthetic */ SelectableChipColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14);
    }
}
