package defpackage;

/* loaded from: classes2.dex */
public final class bqs {
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
    private final long m;
    private final long n;
    private final long o;
    private final long p;

    public bqs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.m = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.n = j8;
        this.g = j9;
        this.h = j10;
        this.i = j11;
        this.o = j12;
        this.j = j13;
        this.k = j14;
        this.l = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bqs)) {
            return false;
        }
        bqs bqsVar = (bqs) obj;
        return a.j(this.a, bqsVar.a) && a.j(this.b, bqsVar.b) && a.j(this.c, bqsVar.c) && a.j(this.m, bqsVar.m) && a.j(this.d, bqsVar.d) && a.j(this.e, bqsVar.e) && a.j(this.f, bqsVar.f) && a.j(this.n, bqsVar.n) && a.j(this.g, bqsVar.g) && a.j(this.h, bqsVar.h) && a.j(this.i, bqsVar.i) && a.j(this.o, bqsVar.o) && a.j(this.j, bqsVar.j) && a.j(this.k, bqsVar.k) && a.j(this.l, bqsVar.l) && a.j(this.p, bqsVar.p);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.p;
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.o;
        long j6 = this.i;
        long j7 = this.h;
        long j8 = this.g;
        long j9 = this.n;
        long j10 = this.f;
        long j11 = this.e;
        long j12 = this.d;
        long j13 = this.m;
        return ((((((((((((((((((((((((((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j13)) * 31) + a.g(j12)) * 31) + a.g(j11)) * 31) + a.g(j10)) * 31) + a.g(j9)) * 31) + a.g(j8)) * 31) + a.g(j7)) * 31) + a.g(j6)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }
}
