package defpackage;

import android.graphics.Point;

/* loaded from: classes.dex */
public final class eam {
    public final int a;
    private final int b;
    private final Point c;

    public eam(int i, int i2, int i3, int i4) {
        this.b = i;
        this.a = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eam) {
            eam eamVar = (eam) obj;
            if (this.b == eamVar.b && this.a == eamVar.a && this.c.equals(eamVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.a) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.b;
        sb.append(i != 0 ? i != 1 ? i != 2 ? "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.a);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
