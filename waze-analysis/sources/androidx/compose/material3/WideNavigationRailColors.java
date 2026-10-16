package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long modalContainerColor;
    private final long modalContentColor;
    private final long modalScrimColor;

    private WideNavigationRailColors(long j2, long j3, long j4, long j5, long j6) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.modalContainerColor = j4;
        this.modalScrimColor = j5;
        this.modalContentColor = j6;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ WideNavigationRailColors m6124copyjRlVdoo$default(WideNavigationRailColors wideNavigationRailColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = wideNavigationRailColors.containerColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = wideNavigationRailColors.contentColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = wideNavigationRailColors.modalContainerColor;
        }
        return wideNavigationRailColors.m6126copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? wideNavigationRailColors.modalScrimColor : j5);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ WideNavigationRailColors m6125copyt635Npw$default(WideNavigationRailColors wideNavigationRailColors, long j2, long j3, long j4, long j5, long j6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = wideNavigationRailColors.containerColor;
        }
        long j7 = j2;
        if ((i2 & 2) != 0) {
            j3 = wideNavigationRailColors.contentColor;
        }
        return wideNavigationRailColors.m6127copyt635Npw(j7, j3, (i2 & 4) != 0 ? wideNavigationRailColors.modalContainerColor : j4, (i2 & 8) != 0 ? wideNavigationRailColors.modalScrimColor : j5, (i2 & 16) != 0 ? wideNavigationRailColors.modalContentColor : j6);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final /* synthetic */ WideNavigationRailColors m6126copyjRlVdoo(long j2, long j3, long j4, long j5) {
        long j6;
        long j7;
        if (j2 == 16) {
            j2 = this.containerColor;
        }
        long j8 = j2;
        if (j3 != 16) {
            j7 = j3;
            j6 = j7;
        } else {
            j6 = this.contentColor;
            j7 = 16;
        }
        long j9 = j4 != 16 ? j4 : this.modalContainerColor;
        long j10 = j5 != 16 ? j5 : this.modalScrimColor;
        if (j7 == 16) {
            j7 = this.contentColor;
        }
        return m6127copyt635Npw(j8, j6, j9, j10, j7);
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final WideNavigationRailColors m6127copyt635Npw(long j2, long j3, long j4, long j5, long j6) {
        return new WideNavigationRailColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.contentColor, j4 != 16 ? j4 : this.modalContainerColor, j5 != 16 ? j5 : this.modalScrimColor, j6 != 16 ? j6 : this.modalContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WideNavigationRailColors)) {
            return false;
        }
        WideNavigationRailColors wideNavigationRailColors = (WideNavigationRailColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, wideNavigationRailColors.containerColor) && Color.m8229equalsimpl0(this.contentColor, wideNavigationRailColors.contentColor) && Color.m8229equalsimpl0(this.modalContainerColor, wideNavigationRailColors.modalContainerColor) && Color.m8229equalsimpl0(this.modalScrimColor, wideNavigationRailColors.modalScrimColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m6128getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m6129getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getModalContainerColor-0d7_KjU, reason: not valid java name */
    public final long m6130getModalContainerColor0d7_KjU() {
        return this.modalContainerColor;
    }

    /* renamed from: getModalContentColor-0d7_KjU, reason: not valid java name */
    public final long m6131getModalContentColor0d7_KjU() {
        return this.modalContentColor;
    }

    /* renamed from: getModalScrimColor-0d7_KjU, reason: not valid java name */
    public final long m6132getModalScrimColor0d7_KjU() {
        return this.modalScrimColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.modalContentColor;
        long j3 = this.modalScrimColor;
        return (((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.modalContainerColor)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ WideNavigationRailColors(long j2, long j3, long j4, long j5, long j6, o oVar) {
        this(j2, j3, j4, j5, j6);
    }

    public /* synthetic */ WideNavigationRailColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }

    private WideNavigationRailColors(long j2, long j3, long j4, long j5) {
        this(j2, j3, j4, j5, j3, null);
    }
}
