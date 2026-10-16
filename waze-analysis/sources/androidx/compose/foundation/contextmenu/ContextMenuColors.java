package androidx.compose.foundation.contextmenu;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    private ContextMenuColors(long j2, long j3, long j4, long j5, long j6) {
        this.backgroundColor = j2;
        this.textColor = j3;
        this.iconColor = j4;
        this.disabledTextColor = j5;
        this.disabledIconColor = j6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.m8229equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m8229equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m8229equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m8229equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m8229equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m2089getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m2090getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m2091getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m2092getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m2093getTextColor0d7_KjU() {
        return this.textColor;
    }

    public int hashCode() {
        int iM8235hashCodeimpl = Color.m8235hashCodeimpl(this.backgroundColor);
        long j2 = this.disabledIconColor;
        long j3 = this.disabledTextColor;
        return (((((((iM8235hashCodeimpl * 31) + Color.m8235hashCodeimpl(this.textColor)) * 31) + Color.m8235hashCodeimpl(this.iconColor)) * 31) + Color.m8235hashCodeimpl(j3)) * 31) + Color.m8235hashCodeimpl(j2);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m8236toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m8236toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m8236toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m8236toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m8236toStringimpl(this.disabledIconColor)) + ')';
    }

    public /* synthetic */ ContextMenuColors(long j2, long j3, long j4, long j5, long j6, o oVar) {
        this(j2, j3, j4, j5, j6);
    }
}
