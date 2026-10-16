package androidx.compose.material3;

import androidx.compose.animation.core.EasingKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TopAppBarColors {
    public static final int $stable = 0;
    private final long actionIconContentColor;
    private final long containerColor;
    private final long navigationIconContentColor;
    private final long scrolledContainerColor;
    private final long subtitleContentColor;
    private final long titleContentColor;

    private TopAppBarColors(long j2, long j3, long j4, long j5, long j6) {
        this(j2, j3, j4, j5, j6, j5, null);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ TopAppBarColors m6064copytNS2XkQ$default(TopAppBarColors topAppBarColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = topAppBarColors.containerColor;
        }
        return topAppBarColors.m6066copytNS2XkQ(j2, (i2 & 2) != 0 ? topAppBarColors.scrolledContainerColor : j3, (i2 & 4) != 0 ? topAppBarColors.navigationIconContentColor : j4, (i2 & 8) != 0 ? topAppBarColors.titleContentColor : j5, (i2 & 16) != 0 ? topAppBarColors.actionIconContentColor : j6, (i2 & 32) != 0 ? topAppBarColors.subtitleContentColor : j7);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m6065containerColorvNxB06k$material3(float f2) {
        return ColorKt.m8279lerpjxsXWHM(this.containerColor, this.scrolledContainerColor, EasingKt.getFastOutLinearInEasing().transform(f2));
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final TopAppBarColors m6066copytNS2XkQ(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new TopAppBarColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.scrolledContainerColor, j4 != 16 ? j4 : this.navigationIconContentColor, j5 != 16 ? j5 : this.titleContentColor, j6 != 16 ? j6 : this.actionIconContentColor, j7 != 16 ? j7 : this.subtitleContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TopAppBarColors)) {
            return false;
        }
        TopAppBarColors topAppBarColors = (TopAppBarColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, topAppBarColors.containerColor) && Color.m8229equalsimpl0(this.scrolledContainerColor, topAppBarColors.scrolledContainerColor) && Color.m8229equalsimpl0(this.navigationIconContentColor, topAppBarColors.navigationIconContentColor) && Color.m8229equalsimpl0(this.titleContentColor, topAppBarColors.titleContentColor) && Color.m8229equalsimpl0(this.actionIconContentColor, topAppBarColors.actionIconContentColor) && Color.m8229equalsimpl0(this.subtitleContentColor, topAppBarColors.subtitleContentColor);
    }

    /* renamed from: getActionIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m6067getActionIconContentColor0d7_KjU() {
        return this.actionIconContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m6068getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getNavigationIconContentColor-0d7_KjU, reason: not valid java name */
    public final long m6069getNavigationIconContentColor0d7_KjU() {
        return this.navigationIconContentColor;
    }

    /* renamed from: getScrolledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m6070getScrolledContainerColor0d7_KjU() {
        return this.scrolledContainerColor;
    }

    /* renamed from: getSubtitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m6071getSubtitleContentColor0d7_KjU() {
        return this.subtitleContentColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name */
    public final long m6072getTitleContentColor0d7_KjU() {
        return this.titleContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.subtitleContentColor;
        long j3 = this.actionIconContentColor;
        long j4 = this.titleContentColor;
        return (((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.scrolledContainerColor)) * 31) + Color.m8235hashCodeimpl(this.navigationIconContentColor)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ TopAppBarColors(long j2, long j3, long j4, long j5, long j6, long j7, o oVar) {
        this(j2, j3, j4, j5, j6, j7);
    }

    public /* synthetic */ TopAppBarColors(long j2, long j3, long j4, long j5, long j6, o oVar) {
        this(j2, j3, j4, j5, j6);
    }

    private TopAppBarColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.containerColor = j2;
        this.scrolledContainerColor = j3;
        this.navigationIconContentColor = j4;
        this.titleContentColor = j5;
        this.actionIconContentColor = j6;
        this.subtitleContentColor = j7;
    }
}
