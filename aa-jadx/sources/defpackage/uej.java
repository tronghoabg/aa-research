package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uej {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final long h;

    public uej(int i, int i2, int i3, int i4, int i5, int i6, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = j;
        this.h = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uej) {
            defpackage.uej uejVar = (defpackage.uej) obj;
            if (this.a == uejVar.a && this.b == uejVar.b && this.c == uejVar.c && this.d == uejVar.d && this.e == uejVar.e && this.f == uejVar.f && this.g == uejVar.g && this.h == uejVar.h) {
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

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "}";
    }

    public uej() {
        throw null;
    }
}
