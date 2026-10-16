package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwitchColors {
    public static final int $stable = 0;
    private final long checkedBorderColor;
    private final long checkedIconColor;
    private final long checkedThumbColor;
    private final long checkedTrackColor;
    private final long disabledCheckedBorderColor;
    private final long disabledCheckedIconColor;
    private final long disabledCheckedThumbColor;
    private final long disabledCheckedTrackColor;
    private final long disabledUncheckedBorderColor;
    private final long disabledUncheckedIconColor;
    private final long disabledUncheckedThumbColor;
    private final long disabledUncheckedTrackColor;
    private final long uncheckedBorderColor;
    private final long uncheckedIconColor;
    private final long uncheckedThumbColor;
    private final long uncheckedTrackColor;

    private SwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        this.checkedThumbColor = j2;
        this.checkedTrackColor = j3;
        this.checkedBorderColor = j4;
        this.checkedIconColor = j5;
        this.uncheckedThumbColor = j6;
        this.uncheckedTrackColor = j7;
        this.uncheckedBorderColor = j8;
        this.uncheckedIconColor = j9;
        this.disabledCheckedThumbColor = j10;
        this.disabledCheckedTrackColor = j11;
        this.disabledCheckedBorderColor = j12;
        this.disabledCheckedIconColor = j13;
        this.disabledUncheckedThumbColor = j14;
        this.disabledUncheckedTrackColor = j15;
        this.disabledUncheckedBorderColor = j16;
        this.disabledUncheckedIconColor = j17;
    }

    /* renamed from: copy-Q_H9qLU$default, reason: not valid java name */
    public static /* synthetic */ SwitchColors m5679copyQ_H9qLU$default(SwitchColors switchColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i2, Object obj) {
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        SwitchColors switchColors2;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        long j33 = (i2 & 1) != 0 ? switchColors.checkedThumbColor : j2;
        long j34 = (i2 & 2) != 0 ? switchColors.checkedTrackColor : j3;
        long j35 = (i2 & 4) != 0 ? switchColors.checkedBorderColor : j4;
        long j36 = (i2 & 8) != 0 ? switchColors.checkedIconColor : j5;
        long j37 = (i2 & 16) != 0 ? switchColors.uncheckedThumbColor : j6;
        long j38 = (i2 & 32) != 0 ? switchColors.uncheckedTrackColor : j7;
        long j39 = (i2 & 64) != 0 ? switchColors.uncheckedBorderColor : j8;
        long j40 = j33;
        long j41 = (i2 & 128) != 0 ? switchColors.uncheckedIconColor : j9;
        long j42 = (i2 & 256) != 0 ? switchColors.disabledCheckedThumbColor : j10;
        long j43 = (i2 & 512) != 0 ? switchColors.disabledCheckedTrackColor : j11;
        long j44 = (i2 & 1024) != 0 ? switchColors.disabledCheckedBorderColor : j12;
        long j45 = (i2 & 2048) != 0 ? switchColors.disabledCheckedIconColor : j13;
        long j46 = (i2 & 4096) != 0 ? switchColors.disabledUncheckedThumbColor : j14;
        long j47 = (i2 & 8192) != 0 ? switchColors.disabledUncheckedTrackColor : j15;
        long j48 = (i2 & 16384) != 0 ? switchColors.disabledUncheckedBorderColor : j16;
        if ((i2 & 32768) != 0) {
            j19 = j48;
            j18 = switchColors.disabledUncheckedIconColor;
            j21 = j42;
            j22 = j43;
            j23 = j44;
            j24 = j45;
            j25 = j46;
            j26 = j47;
            j27 = j34;
            j28 = j35;
            j29 = j36;
            j30 = j37;
            j31 = j38;
            j32 = j39;
            j20 = j41;
            switchColors2 = switchColors;
        } else {
            j18 = j17;
            j19 = j48;
            j20 = j41;
            j21 = j42;
            j22 = j43;
            j23 = j44;
            j24 = j45;
            j25 = j46;
            j26 = j47;
            switchColors2 = switchColors;
            j27 = j34;
            j28 = j35;
            j29 = j36;
            j30 = j37;
            j31 = j38;
            j32 = j39;
        }
        return switchColors2.m5681copyQ_H9qLU(j40, j27, j28, j29, j30, j31, j32, j20, j21, j22, j23, j24, j25, j26, j19, j18);
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5680borderColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedBorderColor : this.uncheckedBorderColor : z2 ? this.disabledCheckedBorderColor : this.disabledUncheckedBorderColor;
    }

    /* renamed from: copy-Q_H9qLU, reason: not valid java name */
    public final SwitchColors m5681copyQ_H9qLU(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        return new SwitchColors(j2 != 16 ? j2 : this.checkedThumbColor, j3 != 16 ? j3 : this.checkedTrackColor, j4 != 16 ? j4 : this.checkedBorderColor, j5 != 16 ? j5 : this.checkedIconColor, j6 != 16 ? j6 : this.uncheckedThumbColor, j7 != 16 ? j7 : this.uncheckedTrackColor, j8 != 16 ? j8 : this.uncheckedBorderColor, j9 != 16 ? j9 : this.uncheckedIconColor, j10 != 16 ? j10 : this.disabledCheckedThumbColor, j11 != 16 ? j11 : this.disabledCheckedTrackColor, j12 != 16 ? j12 : this.disabledCheckedBorderColor, j13 != 16 ? j13 : this.disabledCheckedIconColor, j14 != 16 ? j14 : this.disabledUncheckedThumbColor, j15 != 16 ? j15 : this.disabledUncheckedTrackColor, j16 != 16 ? j16 : this.disabledUncheckedBorderColor, j17 != 16 ? j17 : this.disabledUncheckedIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SwitchColors)) {
            return false;
        }
        SwitchColors switchColors = (SwitchColors) obj;
        return Color.m8229equalsimpl0(this.checkedThumbColor, switchColors.checkedThumbColor) && Color.m8229equalsimpl0(this.checkedTrackColor, switchColors.checkedTrackColor) && Color.m8229equalsimpl0(this.checkedBorderColor, switchColors.checkedBorderColor) && Color.m8229equalsimpl0(this.checkedIconColor, switchColors.checkedIconColor) && Color.m8229equalsimpl0(this.uncheckedThumbColor, switchColors.uncheckedThumbColor) && Color.m8229equalsimpl0(this.uncheckedTrackColor, switchColors.uncheckedTrackColor) && Color.m8229equalsimpl0(this.uncheckedBorderColor, switchColors.uncheckedBorderColor) && Color.m8229equalsimpl0(this.uncheckedIconColor, switchColors.uncheckedIconColor) && Color.m8229equalsimpl0(this.disabledCheckedThumbColor, switchColors.disabledCheckedThumbColor) && Color.m8229equalsimpl0(this.disabledCheckedTrackColor, switchColors.disabledCheckedTrackColor) && Color.m8229equalsimpl0(this.disabledCheckedBorderColor, switchColors.disabledCheckedBorderColor) && Color.m8229equalsimpl0(this.disabledCheckedIconColor, switchColors.disabledCheckedIconColor) && Color.m8229equalsimpl0(this.disabledUncheckedThumbColor, switchColors.disabledUncheckedThumbColor) && Color.m8229equalsimpl0(this.disabledUncheckedTrackColor, switchColors.disabledUncheckedTrackColor) && Color.m8229equalsimpl0(this.disabledUncheckedBorderColor, switchColors.disabledUncheckedBorderColor) && Color.m8229equalsimpl0(this.disabledUncheckedIconColor, switchColors.disabledUncheckedIconColor);
    }

    /* renamed from: getCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5682getCheckedBorderColor0d7_KjU() {
        return this.checkedBorderColor;
    }

    /* renamed from: getCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5683getCheckedIconColor0d7_KjU() {
        return this.checkedIconColor;
    }

    /* renamed from: getCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5684getCheckedThumbColor0d7_KjU() {
        return this.checkedThumbColor;
    }

    /* renamed from: getCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5685getCheckedTrackColor0d7_KjU() {
        return this.checkedTrackColor;
    }

    /* renamed from: getDisabledCheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5686getDisabledCheckedBorderColor0d7_KjU() {
        return this.disabledCheckedBorderColor;
    }

    /* renamed from: getDisabledCheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5687getDisabledCheckedIconColor0d7_KjU() {
        return this.disabledCheckedIconColor;
    }

    /* renamed from: getDisabledCheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5688getDisabledCheckedThumbColor0d7_KjU() {
        return this.disabledCheckedThumbColor;
    }

    /* renamed from: getDisabledCheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5689getDisabledCheckedTrackColor0d7_KjU() {
        return this.disabledCheckedTrackColor;
    }

    /* renamed from: getDisabledUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5690getDisabledUncheckedBorderColor0d7_KjU() {
        return this.disabledUncheckedBorderColor;
    }

    /* renamed from: getDisabledUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5691getDisabledUncheckedIconColor0d7_KjU() {
        return this.disabledUncheckedIconColor;
    }

    /* renamed from: getDisabledUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5692getDisabledUncheckedThumbColor0d7_KjU() {
        return this.disabledUncheckedThumbColor;
    }

    /* renamed from: getDisabledUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5693getDisabledUncheckedTrackColor0d7_KjU() {
        return this.disabledUncheckedTrackColor;
    }

    /* renamed from: getUncheckedBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5694getUncheckedBorderColor0d7_KjU() {
        return this.uncheckedBorderColor;
    }

    /* renamed from: getUncheckedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5695getUncheckedIconColor0d7_KjU() {
        return this.uncheckedIconColor;
    }

    /* renamed from: getUncheckedThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5696getUncheckedThumbColor0d7_KjU() {
        return this.uncheckedThumbColor;
    }

    /* renamed from: getUncheckedTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5697getUncheckedTrackColor0d7_KjU() {
        return this.uncheckedTrackColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.checkedThumbColor);
        long j2 = this.disabledUncheckedIconColor;
        long j3 = this.disabledUncheckedBorderColor;
        long j4 = this.disabledUncheckedTrackColor;
        long j5 = this.disabledUncheckedThumbColor;
        long j6 = this.disabledCheckedIconColor;
        long j7 = this.disabledCheckedBorderColor;
        long j8 = this.disabledCheckedTrackColor;
        long j9 = this.disabledCheckedThumbColor;
        long j10 = this.uncheckedIconColor;
        long j11 = this.uncheckedBorderColor;
        long j12 = this.uncheckedTrackColor;
        long j13 = this.uncheckedThumbColor;
        long j14 = this.checkedIconColor;
        return (((((((((((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m8235hashCodeimpl(this.checkedBorderColor)) * 31) + Color.m8235hashCodeimpl(j14)) * 31) + Color.m8235hashCodeimpl(j13)) * 31) + Color.m8235hashCodeimpl(j12)) * 31) + Color.m8235hashCodeimpl(j11)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5698iconColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedIconColor : this.uncheckedIconColor : z2 ? this.disabledCheckedIconColor : this.disabledUncheckedIconColor;
    }

    /* renamed from: thumbColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5699thumbColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedThumbColor : this.uncheckedThumbColor : z2 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5700trackColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedTrackColor : this.uncheckedTrackColor : z2 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
    }

    public /* synthetic */ SwitchColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17);
    }
}
