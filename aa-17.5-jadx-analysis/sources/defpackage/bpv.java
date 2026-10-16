package defpackage;

/* loaded from: classes2.dex */
public final class bpv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public bpv(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.c : this.e : z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpv)) {
            return false;
        }
        bpv bpvVar = (bpv) obj;
        return a.j(this.a, bpvVar.a) && a.j(this.b, bpvVar.b) && a.j(this.c, bpvVar.c) && a.j(this.d, bpvVar.d) && a.j(this.e, bpvVar.e) && a.j(this.f, bpvVar.f) && a.j(this.g, bpvVar.g) && a.j(this.h, bpvVar.h) && a.j(this.i, bpvVar.i) && a.j(this.j, bpvVar.j);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.j;
        long j2 = this.i;
        long j3 = this.h;
        long j4 = this.g;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        return ((((((((((((((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j7)) * 31) + a.g(j6)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }
}
