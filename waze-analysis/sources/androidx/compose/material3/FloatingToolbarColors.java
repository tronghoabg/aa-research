package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FloatingToolbarColors {
    public static final int $stable = 0;
    private final long fabContainerColor;
    private final long fabContentColor;
    private final long toolbarContainerColor;
    private final long toolbarContentColor;

    private FloatingToolbarColors(long j2, long j3, long j4, long j5) {
        this.toolbarContainerColor = j2;
        this.toolbarContentColor = j3;
        this.fabContainerColor = j4;
        this.fabContentColor = j5;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ FloatingToolbarColors m4890copyjRlVdoo$default(FloatingToolbarColors floatingToolbarColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = floatingToolbarColors.toolbarContainerColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = floatingToolbarColors.toolbarContentColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = floatingToolbarColors.fabContainerColor;
        }
        return floatingToolbarColors.m4891copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? floatingToolbarColors.fabContentColor : j5);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final FloatingToolbarColors m4891copyjRlVdoo(long j2, long j3, long j4, long j5) {
        return new FloatingToolbarColors(j2 != 16 ? j2 : this.toolbarContainerColor, j3 != 16 ? j3 : this.toolbarContentColor, j4 != 16 ? j4 : this.fabContainerColor, j5 != 16 ? j5 : this.fabContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FloatingToolbarColors)) {
            return false;
        }
        FloatingToolbarColors floatingToolbarColors = (FloatingToolbarColors) obj;
        return Color.m8229equalsimpl0(this.toolbarContainerColor, floatingToolbarColors.toolbarContainerColor) && Color.m8229equalsimpl0(this.toolbarContentColor, floatingToolbarColors.toolbarContentColor) && Color.m8229equalsimpl0(this.fabContainerColor, floatingToolbarColors.fabContainerColor) && Color.m8229equalsimpl0(this.fabContentColor, floatingToolbarColors.fabContentColor);
    }

    /* renamed from: getFabContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4892getFabContainerColor0d7_KjU() {
        return this.fabContainerColor;
    }

    /* renamed from: getFabContentColor-0d7_KjU, reason: not valid java name */
    public final long m4893getFabContentColor0d7_KjU() {
        return this.fabContentColor;
    }

    /* renamed from: getToolbarContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4894getToolbarContainerColor0d7_KjU() {
        return this.toolbarContainerColor;
    }

    /* renamed from: getToolbarContentColor-0d7_KjU, reason: not valid java name */
    public final long m4895getToolbarContentColor0d7_KjU() {
        return this.toolbarContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.toolbarContainerColor);
        long j2 = this.fabContentColor;
        return (((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.toolbarContentColor)) * 31) + Color.m8235hashCodeimpl(this.fabContainerColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ FloatingToolbarColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }
}
