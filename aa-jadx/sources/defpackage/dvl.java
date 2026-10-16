package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dvl {
    public static final defpackage.dvl a = new defpackage.dvl(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dvl(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static defpackage.dvl b(defpackage.dvl dvlVar, defpackage.dvl dvlVar2) {
        return e(java.lang.Math.max(dvlVar.b, dvlVar2.b), java.lang.Math.max(dvlVar.c, dvlVar2.c), java.lang.Math.max(dvlVar.d, dvlVar2.d), java.lang.Math.max(dvlVar.e, dvlVar2.e));
    }

    public static defpackage.dvl c(defpackage.dvl dvlVar, defpackage.dvl dvlVar2) {
        int i = dvlVar.e;
        int i2 = dvlVar2.e;
        int i3 = dvlVar.d;
        int i4 = dvlVar2.d;
        return e(java.lang.Math.min(dvlVar.b, dvlVar2.b), java.lang.Math.min(dvlVar.c, dvlVar2.c), java.lang.Math.min(i3, i4), java.lang.Math.min(i, i2));
    }

    public static defpackage.dvl d(android.graphics.Rect rect) {
        return e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static defpackage.dvl e(int i, int i2, int i3, int i4) {
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
        return new defpackage.dvl(i, i2, i3, i4);
    }

    public static defpackage.dvl f(android.graphics.Insets insets) {
        return e(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final android.graphics.Insets a() {
        return android.graphics.Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.dvl dvlVar = (defpackage.dvl) obj;
        return this.e == dvlVar.e && this.b == dvlVar.b && this.d == dvlVar.d && this.c == dvlVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
