package androidx.compose.ui.layout;

import androidx.compose.ui.layout.HorizontalRuler;
import androidx.compose.ui.layout.VerticalRuler;
import h.a.c;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OuterRectRulers implements RectRulers {
    private final HorizontalRuler bottom;
    private final VerticalRuler left;
    private final VerticalRuler right;
    private final RectRulers[] rulers;
    private final HorizontalRuler top;

    public OuterRectRulers(RectRulers[] rectRulersArr) {
        this.rulers = rectRulersArr;
        VerticalRuler.Companion companion = VerticalRuler.Companion;
        int length = rectRulersArr.length;
        VerticalRuler[] verticalRulerArr = new VerticalRuler[length];
        for (int i2 = 0; i2 < length; i2++) {
            verticalRulerArr[i2] = this.rulers[i2].getLeft();
        }
        this.left = companion.minOf(verticalRulerArr);
        HorizontalRuler.Companion companion2 = HorizontalRuler.Companion;
        int length2 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr = new HorizontalRuler[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            horizontalRulerArr[i3] = this.rulers[i3].getTop();
        }
        this.top = companion2.minOf(horizontalRulerArr);
        VerticalRuler.Companion companion3 = VerticalRuler.Companion;
        int length3 = this.rulers.length;
        VerticalRuler[] verticalRulerArr2 = new VerticalRuler[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            verticalRulerArr2[i4] = this.rulers[i4].getRight();
        }
        this.right = companion3.maxOf(verticalRulerArr2);
        HorizontalRuler.Companion companion4 = HorizontalRuler.Companion;
        int length4 = this.rulers.length;
        HorizontalRuler[] horizontalRulerArr2 = new HorizontalRuler[length4];
        for (int i5 = 0; i5 < length4; i5++) {
            horizontalRulerArr2[i5] = this.rulers[i5].getBottom();
        }
        this.bottom = companion4.maxOf(horizontalRulerArr2);
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public VerticalRuler getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.layout.RectRulers
    public HorizontalRuler getTop() {
        return this.top;
    }

    public String toString() {
        return c.aE(this.rulers, null, "outermostOf(", ")", null, 57);
    }
}
