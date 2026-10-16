package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uzx {
    public static final defpackage.uzx a = new defpackage.uzx(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public uzx(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean a() {
        return this.b >= this.d || this.c >= this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uzx) {
            defpackage.uzx uzxVar = (defpackage.uzx) obj;
            if (this.b == uzxVar.b && this.c == uzxVar.c && this.d == uzxVar.d && this.e == uzxVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public uzx() {
        throw null;
    }
}
