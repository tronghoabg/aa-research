package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    private TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.clockDialColor = j2;
        this.selectorColor = j3;
        this.containerColor = j4;
        this.periodSelectorBorderColor = j5;
        this.clockDialSelectedContentColor = j6;
        this.clockDialUnselectedContentColor = j7;
        this.periodSelectorSelectedContainerColor = j8;
        this.periodSelectorUnselectedContainerColor = j9;
        this.periodSelectorSelectedContentColor = j10;
        this.periodSelectorUnselectedContentColor = j11;
        this.timeSelectorSelectedContainerColor = j12;
        this.timeSelectorUnselectedContainerColor = j13;
        this.timeSelectorSelectedContentColor = j14;
        this.timeSelectorUnselectedContentColor = j15;
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m5821copydVHXu7A$default(TimePickerColors timePickerColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i2, Object obj) {
        long j16;
        long j17;
        long j18 = (i2 & 1) != 0 ? timePickerColors.containerColor : j2;
        long j19 = (i2 & 2) != 0 ? timePickerColors.selectorColor : j3;
        long j20 = (i2 & 4) != 0 ? timePickerColors.containerColor : j4;
        long j21 = (i2 & 8) != 0 ? timePickerColors.periodSelectorBorderColor : j5;
        long j22 = (i2 & 16) != 0 ? timePickerColors.clockDialSelectedContentColor : j6;
        long j23 = (i2 & 32) != 0 ? timePickerColors.clockDialUnselectedContentColor : j7;
        long j24 = (i2 & 64) != 0 ? timePickerColors.periodSelectorSelectedContainerColor : j8;
        long j25 = j18;
        long j26 = (i2 & 128) != 0 ? timePickerColors.periodSelectorUnselectedContainerColor : j9;
        long j27 = (i2 & 256) != 0 ? timePickerColors.periodSelectorSelectedContentColor : j10;
        long j28 = (i2 & 512) != 0 ? timePickerColors.periodSelectorUnselectedContentColor : j11;
        long j29 = (i2 & 1024) != 0 ? timePickerColors.timeSelectorSelectedContainerColor : j12;
        long j30 = (i2 & 2048) != 0 ? timePickerColors.timeSelectorUnselectedContainerColor : j13;
        long j31 = (i2 & 4096) != 0 ? timePickerColors.timeSelectorSelectedContentColor : j14;
        if ((i2 & 8192) != 0) {
            j17 = j31;
            j16 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j16 = j15;
            j17 = j31;
        }
        return timePickerColors.m5823copydVHXu7A(j25, j19, j20, j21, j22, j23, j24, j26, j27, j28, j29, j30, j17, j16);
    }

    /* renamed from: clockDialContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m5822clockDialContentColorvNxB06k$material3(boolean z) {
        return z ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m5823copydVHXu7A(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        return new TimePickerColors(j2 != 16 ? j2 : this.clockDialColor, j3 != 16 ? j3 : this.selectorColor, j4 != 16 ? j4 : this.containerColor, j5 != 16 ? j5 : this.periodSelectorBorderColor, j6 != 16 ? j6 : this.clockDialSelectedContentColor, j7 != 16 ? j7 : this.clockDialUnselectedContentColor, j8 != 16 ? j8 : this.periodSelectorSelectedContainerColor, j9 != 16 ? j9 : this.periodSelectorUnselectedContainerColor, j10 != 16 ? j10 : this.periodSelectorSelectedContentColor, j11 != 16 ? j11 : this.periodSelectorUnselectedContentColor, j12 != 16 ? j12 : this.timeSelectorSelectedContainerColor, j13 != 16 ? j13 : this.timeSelectorUnselectedContainerColor, j14 != 16 ? j14 : this.timeSelectorSelectedContentColor, j15 != 16 ? j15 : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) obj;
        return Color.m8229equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m8229equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m8229equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m8229equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m8229equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m8229equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m8229equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m8229equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m8229equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m8229equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m8229equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m8229equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name */
    public final long m5824getClockDialColor0d7_KjU() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5825getClockDialSelectedContentColor0d7_KjU() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5826getClockDialUnselectedContentColor0d7_KjU() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5827getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name */
    public final long m5828getPeriodSelectorBorderColor0d7_KjU() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5829getPeriodSelectorSelectedContainerColor0d7_KjU() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5830getPeriodSelectorSelectedContentColor0d7_KjU() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5831getPeriodSelectorUnselectedContainerColor0d7_KjU() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5832getPeriodSelectorUnselectedContentColor0d7_KjU() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name */
    public final long m5833getSelectorColor0d7_KjU() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5834getTimeSelectorSelectedContainerColor0d7_KjU() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5835getTimeSelectorSelectedContentColor0d7_KjU() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5836getTimeSelectorUnselectedContainerColor0d7_KjU() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5837getTimeSelectorUnselectedContentColor0d7_KjU() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.clockDialColor);
        long j2 = this.timeSelectorUnselectedContentColor;
        long j3 = this.timeSelectorSelectedContentColor;
        long j4 = this.timeSelectorUnselectedContainerColor;
        long j5 = this.timeSelectorSelectedContainerColor;
        long j6 = this.periodSelectorUnselectedContentColor;
        long j7 = this.periodSelectorSelectedContentColor;
        long j8 = this.periodSelectorUnselectedContainerColor;
        long j9 = this.periodSelectorSelectedContainerColor;
        long j10 = this.periodSelectorBorderColor;
        return (((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.selectorColor)) * 31) + Color.m8235hashCodeimpl(this.containerColor)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: periodSelectorContainerColor-vNxB06k$material3, reason: not valid java name */
    public final long m5838periodSelectorContainerColorvNxB06k$material3(boolean z) {
        return z ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: periodSelectorContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m5839periodSelectorContentColorvNxB06k$material3(boolean z) {
        return z ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: timeSelectorContainerColor-vNxB06k$material3, reason: not valid java name */
    public final long m5840timeSelectorContainerColorvNxB06k$material3(boolean z) {
        return z ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: timeSelectorContentColor-vNxB06k$material3, reason: not valid java name */
    public final long m5841timeSelectorContentColorvNxB06k$material3(boolean z) {
        return z ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    public /* synthetic */ TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15);
    }
}
