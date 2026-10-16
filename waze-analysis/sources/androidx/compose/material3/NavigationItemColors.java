package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationItemColors {
    public static final int $stable = 0;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long selectedIconColor;
    private final long selectedIndicatorColor;
    private final long selectedTextColor;
    private final long unselectedIconColor;
    private final long unselectedTextColor;

    private NavigationItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.selectedIconColor = j2;
        this.selectedTextColor = j3;
        this.selectedIndicatorColor = j4;
        this.unselectedIconColor = j5;
        this.unselectedTextColor = j6;
        this.disabledIconColor = j7;
        this.disabledTextColor = j8;
    }

    /* renamed from: copy-4JmcsL4, reason: not valid java name */
    public final NavigationItemColors m5286copy4JmcsL4(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        return new NavigationItemColors(j2 != 16 ? j2 : this.selectedIconColor, j3 != 16 ? j3 : this.selectedTextColor, j4 != 16 ? j4 : this.selectedIndicatorColor, j5 != 16 ? j5 : this.unselectedIconColor, j6 != 16 ? j6 : this.unselectedTextColor, j7 != 16 ? j7 : this.disabledIconColor, j8 != 16 ? j8 : this.disabledTextColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavigationItemColors)) {
            return false;
        }
        NavigationItemColors navigationItemColors = (NavigationItemColors) obj;
        return Color.m8229equalsimpl0(this.selectedIconColor, navigationItemColors.selectedIconColor) && Color.m8229equalsimpl0(this.unselectedIconColor, navigationItemColors.unselectedIconColor) && Color.m8229equalsimpl0(this.selectedTextColor, navigationItemColors.selectedTextColor) && Color.m8229equalsimpl0(this.unselectedTextColor, navigationItemColors.unselectedTextColor) && Color.m8229equalsimpl0(this.selectedIndicatorColor, navigationItemColors.selectedIndicatorColor) && Color.m8229equalsimpl0(this.disabledIconColor, navigationItemColors.disabledIconColor) && Color.m8229equalsimpl0(this.disabledTextColor, navigationItemColors.disabledTextColor);
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m5287getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m5288getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getSelectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5289getSelectedIconColor0d7_KjU() {
        return this.selectedIconColor;
    }

    /* renamed from: getSelectedIndicatorColor-0d7_KjU, reason: not valid java name */
    public final long m5290getSelectedIndicatorColor0d7_KjU() {
        return this.selectedIndicatorColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5291getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getUnselectedIconColor-0d7_KjU, reason: not valid java name */
    public final long m5292getUnselectedIconColor0d7_KjU() {
        return this.unselectedIconColor;
    }

    /* renamed from: getUnselectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5293getUnselectedTextColor0d7_KjU() {
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

    /* renamed from: iconColor-WaAFU9c, reason: not valid java name */
    public final long m5294iconColorWaAFU9c(boolean z, boolean z2) {
        return !z2 ? this.disabledIconColor : z ? this.selectedIconColor : this.unselectedIconColor;
    }

    /* renamed from: textColor-WaAFU9c, reason: not valid java name */
    public final long m5295textColorWaAFU9c(boolean z, boolean z2) {
        return !z2 ? this.disabledTextColor : z ? this.selectedTextColor : this.unselectedTextColor;
    }

    public /* synthetic */ NavigationItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8);
    }
}
