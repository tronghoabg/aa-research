package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationRailItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationRailItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.selectedIconColor = j2;
        this.selectedTextColor = j3;
        this.selectedIndicatorColor = j4;
        this.unselectedIconColor = j5;
        this.unselectedTextColor = j6;
        this.disabledIconColor = j7;
        this.disabledTextColor = j8;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationRailItemColors m5321copy4JmcsL4(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new NavigationRailItemColors(j2 != 16 ? j2 : this.selectedIconColor, j3 != 16 ? j3 : this.selectedTextColor, j4 != 16 ? j4 : this.selectedIndicatorColor, j5 != 16 ? j5 : this.unselectedIconColor, j6 != 16 ? j6 : this.unselectedTextColor, j7 != 16 ? j7 : this.disabledIconColor, j8 != 16 ? j8 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationRailItemColors)) {
            return false;
        }
        NavigationRailItemColors navigationRailItemColors = (NavigationRailItemColors) obj;
        return Color.m8229equalsimpl0(this.selectedIconColor, navigationRailItemColors.selectedIconColor) && Color.m8229equalsimpl0(this.unselectedIconColor, navigationRailItemColors.unselectedIconColor) && Color.m8229equalsimpl0(this.selectedTextColor, navigationRailItemColors.selectedTextColor) && Color.m8229equalsimpl0(this.unselectedTextColor, navigationRailItemColors.unselectedTextColor) && Color.m8229equalsimpl0(this.selectedIndicatorColor, navigationRailItemColors.selectedIndicatorColor) && Color.m8229equalsimpl0(this.disabledIconColor, navigationRailItemColors.disabledIconColor) && Color.m8229equalsimpl0(this.disabledTextColor, navigationRailItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m5322getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m5323getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIndicatorColor-0d7_KjU$material3, reason: not valid java name */
    public final long m5324getIndicatorColor0d7_KjU$material3() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5325getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5326getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5327getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5328getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5329getUnselectedTextColor0d7_KjU() {
        return this.unselectedTextColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.selectedIconColor);
        long j2 = this.disabledTextColor;
        long j3 = this.disabledIconColor;
        long j4 = this.selectedIndicatorColor;
        long j5 = this.unselectedTextColor;
        return (((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.unselectedIconColor)) * 31) + Color.m8235hashCodeimpl(this.selectedTextColor)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: iconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5330iconColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledIconColor : z ? this.selectedIconColor : this.unselectedIconColor;
    }

    /* renamed from: textColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5331textColorWaAFU9c$material3(boolean z, boolean z2) {
        return !z2 ? this.disabledTextColor : z ? this.selectedTextColor : this.unselectedTextColor;
    }

    public /* synthetic */ NavigationRailItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8);
    }
}
