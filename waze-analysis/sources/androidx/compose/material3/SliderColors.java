package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    private SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.thumbColor = j2;
        this.activeTrackColor = j3;
        this.activeTickColor = j4;
        this.inactiveTrackColor = j5;
        this.inactiveTickColor = j6;
        this.disabledThumbColor = j7;
        this.disabledActiveTrackColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTrackColor = j10;
        this.disabledInactiveTickColor = j11;
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m5558copyK518z4$default(SliderColors sliderColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2, Object obj) {
        long j12;
        long j13;
        long j14 = (i2 & 1) != 0 ? sliderColors.thumbColor : j2;
        long j15 = (i2 & 2) != 0 ? sliderColors.activeTrackColor : j3;
        long j16 = (i2 & 4) != 0 ? sliderColors.activeTickColor : j4;
        long j17 = (i2 & 8) != 0 ? sliderColors.inactiveTrackColor : j5;
        long j18 = (i2 & 16) != 0 ? sliderColors.inactiveTickColor : j6;
        long j19 = (i2 & 32) != 0 ? sliderColors.disabledThumbColor : j7;
        long j20 = (i2 & 64) != 0 ? sliderColors.disabledActiveTrackColor : j8;
        long j21 = j14;
        long j22 = (i2 & 128) != 0 ? sliderColors.disabledActiveTickColor : j9;
        long j23 = (i2 & 256) != 0 ? sliderColors.disabledInactiveTrackColor : j10;
        if ((i2 & 512) != 0) {
            j13 = j23;
            j12 = sliderColors.disabledInactiveTickColor;
        } else {
            j12 = j11;
            j13 = j23;
        }
        return sliderColors.m5559copyK518z4(j21, j15, j16, j17, j18, j19, j20, j22, j13, j12);
    }

    /* renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m5559copyK518z4(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        return new SliderColors(j2 != 16 ? j2 : this.thumbColor, j3 != 16 ? j3 : this.activeTrackColor, j4 != 16 ? j4 : this.activeTickColor, j5 != 16 ? j5 : this.inactiveTrackColor, j6 != 16 ? j6 : this.inactiveTickColor, j7 != 16 ? j7 : this.disabledThumbColor, j8 != 16 ? j8 : this.disabledActiveTrackColor, j9 != 16 ? j9 : this.disabledActiveTickColor, j10 != 16 ? j10 : this.disabledInactiveTrackColor, j11 != 16 ? j11 : this.disabledInactiveTickColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) obj;
        return Color.m8229equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m8229equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m8229equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m8229equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m8229equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m8229equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m8229equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m8229equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m8229equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m8229equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    /* renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m5560getActiveTickColor0d7_KjU() {
        return this.activeTickColor;
    }

    /* renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5561getActiveTrackColor0d7_KjU() {
        return this.activeTrackColor;
    }

    /* renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m5562getDisabledActiveTickColor0d7_KjU() {
        return this.disabledActiveTickColor;
    }

    /* renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5563getDisabledActiveTrackColor0d7_KjU() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m5564getDisabledInactiveTickColor0d7_KjU() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5565getDisabledInactiveTrackColor0d7_KjU() {
        return this.disabledInactiveTrackColor;
    }

    /* renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5566getDisabledThumbColor0d7_KjU() {
        return this.disabledThumbColor;
    }

    /* renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name */
    public final long m5567getInactiveTickColor0d7_KjU() {
        return this.inactiveTickColor;
    }

    /* renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name */
    public final long m5568getInactiveTrackColor0d7_KjU() {
        return this.inactiveTrackColor;
    }

    /* renamed from: getThumbColor-0d7_KjU, reason: not valid java name */
    public final long m5569getThumbColor0d7_KjU() {
        return this.thumbColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.thumbColor);
        long j2 = this.disabledInactiveTickColor;
        long j3 = this.disabledInactiveTrackColor;
        long j4 = this.disabledActiveTickColor;
        long j5 = this.disabledActiveTrackColor;
        long j6 = this.disabledThumbColor;
        long j7 = this.inactiveTickColor;
        long j8 = this.inactiveTrackColor;
        return (((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.activeTrackColor)) * 31) + Color.m8235hashCodeimpl(this.activeTickColor)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: thumbColor-vNxB06k$material3, reason: not valid java name */
    public final long m5570thumbColorvNxB06k$material3(boolean z) {
        return z ? this.thumbColor : this.disabledThumbColor;
    }

    /* renamed from: tickColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5571tickColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.activeTickColor : this.inactiveTickColor : z2 ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5572trackColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.activeTrackColor : this.inactiveTrackColor : z2 ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    public /* synthetic */ SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }
}
