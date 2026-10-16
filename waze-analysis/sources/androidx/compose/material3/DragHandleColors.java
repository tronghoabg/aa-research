package androidx.compose.material3;

import androidx.compose.ui.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragHandleColors {
    public static final int $stable = 0;
    private final long color;
    private final long draggedColor;
    private final long pressedColor;

    private DragHandleColors(long j2, long j3, long j4) {
        this.color = j2;
        this.pressedColor = j3;
        this.draggedColor = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleColors)) {
            return false;
        }
        DragHandleColors dragHandleColors = (DragHandleColors) obj;
        return Color.m8229equalsimpl0(this.color, dragHandleColors.color) && Color.m8229equalsimpl0(this.pressedColor, dragHandleColors.pressedColor) && Color.m8229equalsimpl0(this.draggedColor, dragHandleColors.draggedColor);
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4780getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getDraggedColor-0d7_KjU, reason: not valid java name */
    public final long m4781getDraggedColor0d7_KjU() {
        return this.draggedColor;
    }

    /* renamed from: getPressedColor-0d7_KjU, reason: not valid java name */
    public final long m4782getPressedColor0d7_KjU() {
        return this.pressedColor;
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.color) * 31) + Color.m8235hashCodeimpl(this.pressedColor)) * 31) + Color.m8235hashCodeimpl(this.draggedColor);
    }

    public /* synthetic */ DragHandleColors(long j2, long j3, long j4, o oVar) {
        this(j2, j3, j4);
    }
}
