package defpackage;

/* loaded from: classes3.dex */
public final class uzc {
    public static final uzc a = new uzc(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public uzc(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean a() {
        return this.b >= this.d || this.c >= this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uzc) {
            uzc uzcVar = (uzc) obj;
            if (this.b == uzcVar.b && this.c == uzcVar.c && this.d == uzcVar.d && this.e == uzcVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + "}";
    }

    public uzc() {
        throw null;
    }
}
