package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class dve {
    public static final dve a = new dve(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dve(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static dve b(dve dveVar, dve dveVar2) {
        return e(Math.max(dveVar.b, dveVar2.b), Math.max(dveVar.c, dveVar2.c), Math.max(dveVar.d, dveVar2.d), Math.max(dveVar.e, dveVar2.e));
    }

    public static dve c(dve dveVar, dve dveVar2) {
        int i = dveVar.e;
        int i2 = dveVar2.e;
        int i3 = dveVar.d;
        int i4 = dveVar2.d;
        return e(Math.min(dveVar.b, dveVar2.b), Math.min(dveVar.c, dveVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static dve d(Rect rect) {
        return e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static dve e(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new dve(i, i2, i3, i4);
    }

    public static dve f(Insets insets) {
        return e(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dve dveVar = (dve) obj;
        return this.e == dveVar.e && this.b == dveVar.b && this.d == dveVar.d && this.c == dveVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
