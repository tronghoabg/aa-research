package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MenuItemColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledContainerColor;
    private final long disabledLeadingIconColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long leadingIconColor;
    private final long selectedContainerColor;
    private final long selectedLeadingIconColor;
    private final long selectedTextColor;
    private final long selectedTrailingIconColor;
    private final long textColor;
    private final long trailingIconColor;

    private MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this(j2, j3, j4, j5, j6, j7, Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), Color.Companion.m8264getUnspecified0d7_KjU(), null);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m5204copy2qZNXz8$default(MenuItemColors menuItemColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14;
        long j15;
        long j16 = (i2 & 1) != 0 ? menuItemColors.textColor : j2;
        long j17 = (i2 & 2) != 0 ? menuItemColors.containerColor : j3;
        long j18 = (i2 & 4) != 0 ? menuItemColors.leadingIconColor : j4;
        long j19 = (i2 & 8) != 0 ? menuItemColors.trailingIconColor : j5;
        long j20 = (i2 & 16) != 0 ? menuItemColors.disabledTextColor : j6;
        long j21 = (i2 & 32) != 0 ? menuItemColors.disabledContainerColor : j7;
        long j22 = (i2 & 64) != 0 ? menuItemColors.disabledLeadingIconColor : j8;
        long j23 = j16;
        long j24 = (i2 & 128) != 0 ? menuItemColors.disabledTrailingIconColor : j9;
        long j25 = (i2 & 256) != 0 ? menuItemColors.selectedTextColor : j10;
        long j26 = (i2 & 512) != 0 ? menuItemColors.selectedContainerColor : j11;
        long j27 = (i2 & 1024) != 0 ? menuItemColors.selectedLeadingIconColor : j12;
        if ((i2 & 2048) != 0) {
            j15 = j27;
            j14 = menuItemColors.selectedTrailingIconColor;
        } else {
            j14 = j13;
            j15 = j27;
        }
        return menuItemColors.m5210copy2qZNXz8(j23, j17, j18, j19, j20, j21, j22, j24, j25, j26, j15, j14);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ MenuItemColors m5205copytNS2XkQ$default(MenuItemColors menuItemColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = menuItemColors.textColor;
        }
        return menuItemColors.m5211copytNS2XkQ(j2, (i2 & 2) != 0 ? menuItemColors.leadingIconColor : j3, (i2 & 4) != 0 ? menuItemColors.trailingIconColor : j4, (i2 & 8) != 0 ? menuItemColors.disabledTextColor : j5, (i2 & 16) != 0 ? menuItemColors.disabledLeadingIconColor : j6, (i2 & 32) != 0 ? menuItemColors.disabledTrailingIconColor : j7);
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5209containerColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.selectedContainerColor : this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final MenuItemColors m5210copy2qZNXz8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new MenuItemColors(j2 != 16 ? j2 : this.textColor, j4 != 16 ? j4 : this.leadingIconColor, j5 != 16 ? j5 : this.trailingIconColor, j6 != 16 ? j6 : this.disabledTextColor, j8 != 16 ? j8 : this.disabledLeadingIconColor, j9 != 16 ? j9 : this.disabledTrailingIconColor, j3 != 16 ? j3 : this.containerColor, j7 != 16 ? j7 : this.disabledContainerColor, j10 != 16 ? j10 : this.selectedTextColor, j12 != 16 ? j12 : this.selectedLeadingIconColor, j13 != 16 ? j13 : this.selectedTrailingIconColor, j11 == 16 ? this.selectedContainerColor : j11, null);
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final MenuItemColors m5211copytNS2XkQ(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new MenuItemColors(j2 != 16 ? j2 : this.textColor, j3 != 16 ? j3 : this.leadingIconColor, j4 != 16 ? j4 : this.trailingIconColor, j5 != 16 ? j5 : this.disabledTextColor, j6 != 16 ? j6 : this.disabledLeadingIconColor, j7 != 16 ? j7 : this.disabledTrailingIconColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MenuItemColors)) {
            return false;
        }
        MenuItemColors menuItemColors = (MenuItemColors) obj;
        return Color.m8229equalsimpl0(this.textColor, menuItemColors.textColor) && Color.m8229equalsimpl0(this.containerColor, menuItemColors.containerColor) && Color.m8229equalsimpl0(this.leadingIconColor, menuItemColors.leadingIconColor) && Color.m8229equalsimpl0(this.trailingIconColor, menuItemColors.trailingIconColor) && Color.m8229equalsimpl0(this.disabledTextColor, menuItemColors.disabledTextColor) && Color.m8229equalsimpl0(this.disabledLeadingIconColor, menuItemColors.disabledLeadingIconColor) && Color.m8229equalsimpl0(this.disabledTrailingIconColor, menuItemColors.disabledTrailingIconColor) && Color.m8229equalsimpl0(this.disabledContainerColor, menuItemColors.disabledContainerColor) && Color.m8229equalsimpl0(this.selectedContainerColor, menuItemColors.selectedContainerColor) && Color.m8229equalsimpl0(this.selectedTextColor, menuItemColors.selectedTextColor) && Color.m8229equalsimpl0(this.selectedLeadingIconColor, menuItemColors.selectedLeadingIconColor) && Color.m8229equalsimpl0(this.selectedTrailingIconColor, menuItemColors.selectedTrailingIconColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5212getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5213getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5214getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m5215getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5216getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5217getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getSelectedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5218getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    /* renamed from: getSelectedLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5219getSelectedLeadingIconColor0d7_KjU() {
        return this.selectedLeadingIconColor;
    }

    /* renamed from: getSelectedTextColor-0d7_KjU, reason: not valid java name */
    public final long m5220getSelectedTextColor0d7_KjU() {
        return this.selectedTextColor;
    }

    /* renamed from: getSelectedTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5221getSelectedTrailingIconColor0d7_KjU() {
        return this.selectedTrailingIconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m5222getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m5223getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.textColor);
        long j2 = this.selectedTrailingIconColor;
        long j3 = this.selectedLeadingIconColor;
        long j4 = this.selectedTextColor;
        long j5 = this.selectedContainerColor;
        long j6 = this.disabledContainerColor;
        long j7 = this.disabledTrailingIconColor;
        long j8 = this.disabledLeadingIconColor;
        long j9 = this.disabledTextColor;
        long j10 = this.trailingIconColor;
        return (((((((((((((((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.containerColor)) * 31) + Color.m8235hashCodeimpl(this.leadingIconColor)) * 31) + Color.m8235hashCodeimpl(j10)) * 31) + Color.m8235hashCodeimpl(j9)) * 31) + Color.m8235hashCodeimpl(j8)) * 31) + Color.m8235hashCodeimpl(j7)) * 31) + Color.m8235hashCodeimpl(j6)) * 31) + Color.m8235hashCodeimpl(j5)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    /* renamed from: leadingIconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5224leadingIconColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.selectedLeadingIconColor : this.leadingIconColor : this.disabledLeadingIconColor;
    }

    /* renamed from: textColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5225textColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.selectedTextColor : this.textColor : this.disabledTextColor;
    }

    /* renamed from: trailingIconColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5226trailingIconColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.selectedTrailingIconColor : this.trailingIconColor : this.disabledTrailingIconColor;
    }

    public /* synthetic */ MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, o oVar) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    public /* synthetic */ MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7, o oVar) {
        this(j2, j3, j4, j5, j6, j7);
    }

    private MenuItemColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.textColor = j2;
        this.leadingIconColor = j3;
        this.trailingIconColor = j4;
        this.disabledTextColor = j5;
        this.disabledLeadingIconColor = j6;
        this.disabledTrailingIconColor = j7;
        this.containerColor = j8;
        this.disabledContainerColor = j9;
        this.selectedContainerColor = j13;
        this.selectedTextColor = j10;
        this.selectedLeadingIconColor = j11;
        this.selectedTrailingIconColor = j12;
    }
}
