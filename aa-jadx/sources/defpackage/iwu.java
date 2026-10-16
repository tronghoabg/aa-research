package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iwu extends defpackage.edd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public iwu(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.iwu) {
            defpackage.iwu iwuVar = (defpackage.iwu) obj;
            if (this.a == iwuVar.a && this.b == iwuVar.b && this.c == iwuVar.c && this.d == iwuVar.d && this.e == iwuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d), java.lang.Integer.valueOf(this.e)};
        java.lang.String[] strArrSplit = "displayLeft;displayTop;displayWidth;displayHeight;roiQpOffset".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("iwu[");
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
