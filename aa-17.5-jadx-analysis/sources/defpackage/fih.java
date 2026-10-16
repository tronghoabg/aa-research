package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class fih {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new fih(0, 0, 0, 0);
    }

    public fih(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(a.bo(i3, i, "Left must be less than or equal to right, left: ", ", right: "));
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(a.bo(i4, i2, "top must be less than or equal to bottom, top: ", ", bottom: "));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fih fihVar = (fih) obj;
        return this.a == fihVar.a && this.b == fihVar.b && this.c == fihVar.c && this.d == fihVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "fih { [" + this.a + "," + this.b + "," + this.c + "," + this.d + "] }";
    }

    public fih(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
