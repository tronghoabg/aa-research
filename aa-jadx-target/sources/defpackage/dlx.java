package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dlx {
    public static final defpackage.dlx a = new defpackage.dlx(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dlx(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final int a() {
        return this.e - this.c;
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        int iB = b() / 2;
        return (((long) (this.c + (a() / 2))) & 4294967295L) | ((this.b + iB) << 32);
    }

    public final long d() {
        return (((long) this.b) << 32) | (((long) this.c) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dlx)) {
            return false;
        }
        defpackage.dlx dlxVar = (defpackage.dlx) obj;
        return this.b == dlxVar.b && this.c == dlxVar.c && this.d == dlxVar.d && this.e == dlxVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ")";
    }
}
