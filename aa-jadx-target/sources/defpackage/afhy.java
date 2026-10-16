package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afhy implements java.lang.Iterable, defpackage.afhc {
    public final int a;
    public final int b;
    public final int c;

    public afhy(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = defpackage.afga.o(i, i2, i3);
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.afck iterator() {
        return new afhz(this.a, this.b, this.c);
    }

    public boolean b() {
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            return i2 > i3;
        }
        return i2 < i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.afhy) {
            if (b() && ((defpackage.afhy) obj).b()) {
                return true;
            }
            defpackage.afhy afhyVar = (defpackage.afhy) obj;
            return this.a == afhyVar.a && this.b == afhyVar.b && this.c == afhyVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
