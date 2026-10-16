package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IconButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private IconButtonColors(long j2, long j3, long j4, long j5) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ IconButtonColors m4980copyjRlVdoo$default(IconButtonColors iconButtonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = iconButtonColors.containerColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = iconButtonColors.contentColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = iconButtonColors.disabledContainerColor;
        }
        return iconButtonColors.m4983copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? iconButtonColors.disabledContentColor : j5);
    }

    /* renamed from: containerColor-vNxB06k$material3, reason: not valid java name */
    public final long m4981containerColorvNxB06k$material3(boolean z) {
        return z ? this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: contentColor-vNxB06k$material3, reason: not valid java name */
    public final long m4982contentColorvNxB06k$material3(boolean z) {
        return z ? this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final IconButtonColors m4983copyjRlVdoo(long j2, long j3, long j4, long j5) {
        return new IconButtonColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.contentColor, j4 != 16 ? j4 : this.disabledContainerColor, j5 != 16 ? j5 : this.disabledContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, iconButtonColors.containerColor) && Color.m8229equalsimpl0(this.contentColor, iconButtonColors.contentColor) && Color.m8229equalsimpl0(this.disabledContainerColor, iconButtonColors.disabledContainerColor) && Color.m8229equalsimpl0(this.disabledContentColor, iconButtonColors.disabledContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4984getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m4985getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m4986getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m4987getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.disabledContentColor;
        return (((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ IconButtonColors(long j2, long j3, long j4, long j5, o oVar) {
        this(j2, j3, j4, j5);
    }
}
