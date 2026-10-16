package androidx.compose.material3;

import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TabPosition {
    public static final int $stable = 0;
    private final float contentWidth;
    private final float left;
    private final float width;

    private TabPosition(float f2, float f3, float f4) {
        this.left = f2;
        this.width = f3;
        this.contentWidth = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        return Dp.m11169equalsimpl0(this.left, tabPosition.left) && Dp.m11169equalsimpl0(this.width, tabPosition.width) && Dp.m11169equalsimpl0(this.contentWidth, tabPosition.contentWidth);
    }

    /* renamed from: getContentWidth-D9Ej5fM, reason: not valid java name */
    public final float m5707getContentWidthD9Ej5fM() {
        return this.contentWidth;
    }

    /* renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m5708getLeftD9Ej5fM() {
        return this.left;
    }

    /* renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m5709getRightD9Ej5fM() {
        return this.left + this.width;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m5710getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (((Dp.m11170hashCodeimpl(this.left) * 31) + Dp.m11170hashCodeimpl(this.width)) * 31) + Dp.m11170hashCodeimpl(this.contentWidth);
    }

    public String toString() {
        return "TabPosition(left=" + ((Object) Dp.m11175toStringimpl(this.left)) + ", right=" + ((Object) Dp.m11175toStringimpl(m5709getRightD9Ej5fM())) + ", width=" + ((Object) Dp.m11175toStringimpl(this.width)) + ", contentWidth=" + ((Object) Dp.m11175toStringimpl(this.contentWidth)) + ')';
    }

    public /* synthetic */ TabPosition(float f2, float f3, float f4, o oVar) {
        this(f2, f3, f4);
    }
}
