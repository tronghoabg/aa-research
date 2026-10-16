package defpackage;

/* loaded from: classes.dex */
public final class dlp {
    public static final dlp a = new dlp(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public dlp(int i, int i2, int i3, int i4) {
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
        int iA = a() / 2;
        return ((this.c + iA) & 4294967295L) | ((this.b + iB) << 32);
    }

    public final long d() {
        return (this.b << 32) | (this.c & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlp)) {
            return false;
        }
        dlp dlpVar = (dlp) obj;
        return this.b == dlpVar.b && this.c == dlpVar.c && this.d == dlpVar.d && this.e == dlpVar.e;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "IntRect.fromLTRB(" + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ")";
    }
}
