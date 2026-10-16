package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScrollFieldColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long selectedContentColor;
    private final long unselectedContentColor;

    private ScrollFieldColors(long j2, long j3, long j4) {
        this.containerColor = j2;
        this.unselectedContentColor = j3;
        this.selectedContentColor = j4;
    }

    /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ ScrollFieldColors m5431copyysEtTa8$default(ScrollFieldColors scrollFieldColors, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = scrollFieldColors.containerColor;
        }
        long j5 = j2;
        if ((i2 & 2) != 0) {
            j3 = scrollFieldColors.unselectedContentColor;
        }
        long j6 = j3;
        if ((i2 & 4) != 0) {
            j4 = scrollFieldColors.selectedContentColor;
        }
        return scrollFieldColors.m5432copyysEtTa8(j5, j6, j4);
    }

    /* renamed from: copy-ysEtTa8, reason: not valid java name */
    public final ScrollFieldColors m5432copyysEtTa8(long j2, long j3, long j4) {
        if (j2 == 16) {
            j2 = this.containerColor;
        }
        return new ScrollFieldColors(j2, j3 != 16 ? j3 : this.unselectedContentColor, j4 != 16 ? j4 : this.selectedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ScrollFieldColors)) {
            return false;
        }
        ScrollFieldColors scrollFieldColors = (ScrollFieldColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, scrollFieldColors.containerColor) && Color.m8229equalsimpl0(this.unselectedContentColor, scrollFieldColors.unselectedContentColor) && Color.m8229equalsimpl0(this.selectedContentColor, scrollFieldColors.selectedContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5433getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getSelectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5434getSelectedContentColor0d7_KjU() {
        return this.selectedContentColor;
    }

    /* renamed from: getUnselectedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5435getUnselectedContentColor0d7_KjU() {
        return this.unselectedContentColor;
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.containerColor) * 31) + Color.m8235hashCodeimpl(this.unselectedContentColor)) * 31) + Color.m8235hashCodeimpl(this.selectedContentColor);
    }

    public /* synthetic */ ScrollFieldColors(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
