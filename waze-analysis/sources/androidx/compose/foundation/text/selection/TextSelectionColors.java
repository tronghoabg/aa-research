package androidx.compose.foundation.text.selection;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    private TextSelectionColors(long j2, long j3) {
        this.handleColor = j2;
        this.backgroundColor = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m8229equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m8229equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m3938getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m3939getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m8235hashCodeimpl(this.handleColor) * 31) + Color.m8235hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m8236toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m8236toStringimpl(this.backgroundColor)) + ')';
    }

    public /* synthetic */ TextSelectionColors(long j2, long j3, o oVar) {
        this(j2, j3);
    }
}
