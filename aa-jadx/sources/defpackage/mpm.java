package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mpm extends defpackage.edd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public mpm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static defpackage.mpl B() {
        defpackage.mpl mplVar = new defpackage.mpl();
        mplVar.e(true);
        mplVar.g(true);
        mplVar.f(true);
        mplVar.d(true);
        mplVar.c(false);
        mplVar.b(true);
        return mplVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.mpm) {
            defpackage.mpm mpmVar = (defpackage.mpm) obj;
            if (this.a == mpmVar.a && this.b == mpmVar.b && this.c == mpmVar.c && this.d == mpmVar.d && this.e == mpmVar.e && this.f == mpmVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = defpackage.a.e(this.a);
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((iE * 31) + defpackage.a.e(this.b)) * 31) + defpackage.a.e(this.c)) * 31) + defpackage.a.e(z3)) * 31) + defpackage.a.e(z2)) * 31) + defpackage.a.e(z);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.a), java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c), java.lang.Boolean.valueOf(this.d), java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.f)};
        java.lang.String[] strArrSplit = "showLeft;showTop;showRight;showBottom;isGradient;focusable".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("mpm[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
