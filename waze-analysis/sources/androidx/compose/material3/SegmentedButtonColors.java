package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    private SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.activeContainerColor = j2;
        this.activeContentColor = j3;
        this.activeBorderColor = j4;
        this.inactiveContainerColor = j5;
        this.inactiveContentColor = j6;
        this.inactiveBorderColor = j7;
        this.disabledActiveContainerColor = j8;
        this.disabledActiveContentColor = j9;
        this.disabledActiveBorderColor = j10;
        this.disabledInactiveContainerColor = j11;
        this.disabledInactiveContentColor = j12;
        this.disabledInactiveBorderColor = j13;
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m5500copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14;
        long j15;
        long j16 = (i2 & 1) != 0 ? segmentedButtonColors.activeContainerColor : j2;
        long j17 = (i2 & 2) != 0 ? segmentedButtonColors.activeContentColor : j3;
        long j18 = (i2 & 4) != 0 ? segmentedButtonColors.activeBorderColor : j4;
        long j19 = (i2 & 8) != 0 ? segmentedButtonColors.inactiveContainerColor : j5;
        long j20 = (i2 & 16) != 0 ? segmentedButtonColors.inactiveContentColor : j6;
        long j21 = (i2 & 32) != 0 ? segmentedButtonColors.inactiveBorderColor : j7;
        long j22 = (i2 & 64) != 0 ? segmentedButtonColors.disabledActiveContainerColor : j8;
        long j23 = j16;
        long j24 = (i2 & 128) != 0 ? segmentedButtonColors.disabledActiveContentColor : j9;
        long j25 = (i2 & 256) != 0 ? segmentedButtonColors.disabledActiveBorderColor : j10;
        long j26 = (i2 & 512) != 0 ? segmentedButtonColors.disabledInactiveContainerColor : j11;
        long j27 = (i2 & 1024) != 0 ? segmentedButtonColors.disabledInactiveContentColor : j12;
        if ((i2 & 2048) != 0) {
            j15 = j27;
            j14 = segmentedButtonColors.disabledInactiveBorderColor;
        } else {
            j14 = j13;
            j15 = j27;
        }
        return segmentedButtonColors.m5504copy2qZNXz8(j23, j17, j18, j19, j20, j21, j22, j24, j25, j26, j15, j14);
    }

    /* renamed from: borderColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5501borderColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeBorderColor : z ? this.inactiveBorderColor : z2 ? this.disabledActiveBorderColor : this.disabledInactiveBorderColor;
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5502containerColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeContainerColor : z ? this.inactiveContainerColor : z2 ? this.disabledActiveContainerColor : this.disabledInactiveContainerColor;
    }

    /* renamed from: contentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5503contentColorWaAFU9c$material3(boolean z, boolean z2) {
        return (z && z2) ? this.activeContentColor : z ? this.inactiveContentColor : z2 ? this.disabledActiveContentColor : this.disabledInactiveContentColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m5504copy2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new SegmentedButtonColors(j2 != 16 ? j2 : this.activeContainerColor, j3 != 16 ? j3 : this.activeContentColor, j4 != 16 ? j4 : this.activeBorderColor, j5 != 16 ? j5 : this.inactiveContainerColor, j6 != 16 ? j6 : this.inactiveContentColor, j7 != 16 ? j7 : this.inactiveBorderColor, j8 != 16 ? j8 : this.disabledActiveContainerColor, j9 != 16 ? j9 : this.disabledActiveContentColor, j10 != 16 ? j10 : this.disabledActiveBorderColor, j11 != 16 ? j11 : this.disabledInactiveContainerColor, j12 != 16 ? j12 : this.disabledInactiveContentColor, j13 != 16 ? j13 : this.disabledInactiveBorderColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        return Color.m8229equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m8229equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m8229equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m8229equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m8229equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m8229equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m8229equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m8229equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m8229equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m8229equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m8229equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m8229equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5505getActiveBorderColor0d7_KjU() {
        return this.activeBorderColor;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5506getActiveContainerColor0d7_KjU() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m5507getActiveContentColor0d7_KjU() {
        return this.activeContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5508getDisabledActiveBorderColor0d7_KjU() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5509getDisabledActiveContainerColor0d7_KjU() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m5510getDisabledActiveContentColor0d7_KjU() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5511getDisabledInactiveBorderColor0d7_KjU() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5512getDisabledInactiveContainerColor0d7_KjU() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m5513getDisabledInactiveContentColor0d7_KjU() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5514getInactiveBorderColor0d7_KjU() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5515getInactiveContainerColor0d7_KjU() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name */
    public final long m5516getInactiveContentColor0d7_KjU() {
        return this.inactiveContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.activeBorderColor);
        long j2 = this.disabledInactiveContainerColor;
        long j3 = this.disabledInactiveContentColor;
        long j4 = this.disabledInactiveBorderColor;
        long j5 = this.disabledActiveContainerColor;
        long j6 = this.disabledActiveContentColor;
        long j7 = this.disabledActiveBorderColor;
        long j8 = this.inactiveContainerColor;
        long j9 = this.inactiveContentColor;
        long j10 = this.inactiveBorderColor;
        return (((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.activeContentColor)) * 31) + Color.m8235hashCodeimpl(this.activeContainerColor)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }
}
