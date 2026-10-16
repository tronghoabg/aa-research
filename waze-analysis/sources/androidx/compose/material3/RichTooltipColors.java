package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RichTooltipColors {
    public static final int $stable = 0;
    private final long actionContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long titleContentColor;

    private RichTooltipColors(long j2, long j3, long j4, long j5) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.titleContentColor = j4;
        this.actionContentColor = j5;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RichTooltipColors m5402copyjRlVdoo$default(RichTooltipColors richTooltipColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = richTooltipColors.containerColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = richTooltipColors.contentColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = richTooltipColors.titleContentColor;
        }
        return richTooltipColors.m5403copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? richTooltipColors.actionContentColor : j5);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RichTooltipColors m5403copyjRlVdoo(long j2, long j3, long j4, long j5) {
        return new RichTooltipColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.contentColor, j4 != 16 ? j4 : this.titleContentColor, j5 != 16 ? j5 : this.actionContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RichTooltipColors)) {
            return false;
        }
        RichTooltipColors richTooltipColors = (RichTooltipColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, richTooltipColors.containerColor) && Color.m8229equalsimpl0(this.contentColor, richTooltipColors.contentColor) && Color.m8229equalsimpl0(this.titleContentColor, richTooltipColors.titleContentColor) && Color.m8229equalsimpl0(this.actionContentColor, richTooltipColors.actionContentColor);
    }

    /* renamed from: getActionContentColor-0d7_KjU, reason: not valid java name */
    public final long m5404getActionContentColor0d7_KjU() {
        return this.actionContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5405getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5406getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m5407getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.actionContentColor;
        return (((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.titleContentColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ RichTooltipColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }
}
