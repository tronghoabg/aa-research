package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BorderStroke {
    public static final int $stable = 0;
    private final Brush brush;
    private final float width;

    private BorderStroke(float f2, Brush brush) {
        this.width = f2;
        this.brush = brush;
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m1995copyD5KLDUw$default(BorderStroke borderStroke, float f2, Brush brush, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = borderStroke.width;
        }
        if ((i2 & 2) != 0) {
            brush = borderStroke.brush;
        }
        return borderStroke.m1996copyD5KLDUw(f2, brush);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final BorderStroke m1996copyD5KLDUw(float f2, Brush brush) {
        return new BorderStroke(f2, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStroke)) {
            return false;
        }
        BorderStroke borderStroke = (BorderStroke) obj;
        return Dp.m11169equalsimpl0(this.width, borderStroke.width) && x.n(this.brush, borderStroke.brush);
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m1997getWidthD9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (Dp.m11170hashCodeimpl(this.width) * 31) + this.brush.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) Dp.m11175toStringimpl(this.width)) + ", brush=" + this.brush + ')';
    }

    public /* synthetic */ BorderStroke(float f2, Brush brush, o oVar) {
        this(f2, brush);
    }
}
