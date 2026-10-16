package defpackage;

/* loaded from: classes2.dex */
public final class mpg extends ebj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public mpg(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static mpf q() {
        mpf mpfVar = new mpf();
        mpfVar.e(true);
        mpfVar.g(true);
        mpfVar.f(true);
        mpfVar.d(true);
        mpfVar.c(false);
        mpfVar.b(true);
        return mpfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mpg) {
            mpg mpgVar = (mpg) obj;
            if (this.a == mpgVar.a && this.b == mpgVar.b && this.c == mpgVar.c && this.d == mpgVar.d && this.e == mpgVar.e && this.f == mpgVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = a.f(this.a);
        boolean z = this.f;
        boolean z2 = this.e;
        boolean z3 = this.d;
        return (((((((((iF * 31) + a.f(this.b)) * 31) + a.f(this.c)) * 31) + a.f(z3)) * 31) + a.f(z2)) * 31) + a.f(z);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f)};
        String[] strArrSplit = "showLeft;showTop;showRight;showBottom;isGradient;focusable".split(";");
        StringBuilder sb = new StringBuilder("mpg[");
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
