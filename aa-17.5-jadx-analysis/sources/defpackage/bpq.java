package defpackage;

/* loaded from: classes2.dex */
public final class bpq {
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
    public final long k;
    public final long l;
    public final long m;

    public bpq(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpq)) {
            return false;
        }
        bpq bpqVar = (bpq) obj;
        return a.j(this.a, bpqVar.a) && a.j(this.b, bpqVar.b) && a.j(this.c, bpqVar.c) && a.j(this.d, bpqVar.d) && a.j(this.e, bpqVar.e) && a.j(this.f, bpqVar.f) && a.j(this.g, bpqVar.g) && a.j(this.h, bpqVar.h) && a.j(this.i, bpqVar.i) && a.j(this.j, bpqVar.j) && a.j(this.k, bpqVar.k) && a.j(this.l, bpqVar.l) && a.j(this.m, bpqVar.m);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.m;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        return ((((((((((((((((((((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j10)) * 31) + a.g(j9)) * 31) + a.g(j8)) * 31) + a.g(j7)) * 31) + a.g(j6)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }
}
