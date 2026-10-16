package defpackage;

/* loaded from: classes3.dex */
final class udm {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;

    public udm(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udm) {
            udm udmVar = (udm) obj;
            if (this.a == udmVar.a && this.b == udmVar.b && this.c == udmVar.c && this.d == udmVar.d && this.e == udmVar.e && this.f == udmVar.f && this.g == udmVar.g && this.h == udmVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.h;
        int i = this.a;
        long j2 = j ^ (j >>> 32);
        long j3 = this.g;
        long j4 = j3 ^ (j3 >>> 32);
        return ((((this.f ^ ((((((((((i ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003)) * 1000003) ^ ((int) j4)) * 1000003) ^ ((int) j2);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "}";
    }

    public udm() {
        throw null;
    }
}
