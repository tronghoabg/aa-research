package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    private ToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.containerColor = j2;
        this.contentColor = j3;
        this.disabledContainerColor = j4;
        this.disabledContentColor = j5;
        this.checkedContainerColor = j6;
        this.checkedContentColor = j7;
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ ToggleButtonColors m5907copytNS2XkQ$default(ToggleButtonColors toggleButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = toggleButtonColors.containerColor;
        }
        return toggleButtonColors.m5910copytNS2XkQ(j2, (i2 & 2) != 0 ? toggleButtonColors.contentColor : j3, (i2 & 4) != 0 ? toggleButtonColors.disabledContainerColor : j4, (i2 & 8) != 0 ? toggleButtonColors.disabledContentColor : j5, (i2 & 16) != 0 ? toggleButtonColors.checkedContainerColor : j6, (i2 & 32) != 0 ? toggleButtonColors.checkedContentColor : j7);
    }

    /* renamed from: containerColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5908containerColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedContainerColor : this.containerColor : this.disabledContainerColor;
    }

    /* renamed from: contentColor-WaAFU9c$material3, reason: not valid java name */
    public final long m5909contentColorWaAFU9c$material3(boolean z, boolean z2) {
        return z ? z2 ? this.checkedContentColor : this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final ToggleButtonColors m5910copytNS2XkQ(long j2, long j3, long j4, long j5, long j6, long j7) {
        return new ToggleButtonColors(j2 != 16 ? j2 : this.containerColor, j3 != 16 ? j3 : this.contentColor, j4 != 16 ? j4 : this.disabledContainerColor, j5 != 16 ? j5 : this.disabledContentColor, j6 != 16 ? j6 : this.checkedContainerColor, j7 != 16 ? j7 : this.checkedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ToggleButtonColors)) {
            return false;
        }
        ToggleButtonColors toggleButtonColors = (ToggleButtonColors) obj;
        return Color.m8229equalsimpl0(this.containerColor, toggleButtonColors.containerColor) && Color.m8229equalsimpl0(this.contentColor, toggleButtonColors.contentColor) && Color.m8229equalsimpl0(this.disabledContainerColor, toggleButtonColors.disabledContainerColor) && Color.m8229equalsimpl0(this.disabledContentColor, toggleButtonColors.disabledContentColor) && Color.m8229equalsimpl0(this.checkedContainerColor, toggleButtonColors.checkedContainerColor) && Color.m8229equalsimpl0(this.checkedContentColor, toggleButtonColors.checkedContentColor);
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5911getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m5912getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5913getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5914getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5915getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m5916getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.containerColor);
        long j2 = this.checkedContentColor;
        long j3 = this.checkedContainerColor;
        long j4 = this.disabledContentColor;
        return (((((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.contentColor)) * 31) + Color.m8235hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m8235hashCodeimpl(j4)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public /* synthetic */ ToggleButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, o oVar) {
        this(j2, j3, j4, j5, j6, j7);
    }
}
