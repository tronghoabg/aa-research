package defpackage;

/* loaded from: classes2.dex */
public final class bok {
    public final long a;
    public final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;

    public bok(long j, long j2, long j3, long j4, long j5, long j6) {
        long jN = cjn.n();
        long jN2 = cjn.n();
        long jN3 = cjn.n();
        long jN4 = cjn.n();
        long jN5 = cjn.n();
        long jN6 = cjn.n();
        this.a = j;
        this.c = j2;
        this.d = j3;
        this.b = j4;
        this.e = j5;
        this.f = j6;
        this.g = jN;
        this.h = jN2;
        this.i = jN6;
        this.j = jN3;
        this.k = jN4;
        this.l = jN5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bok)) {
            return false;
        }
        bok bokVar = (bok) obj;
        return a.j(this.a, bokVar.a) && a.j(this.g, bokVar.g) && a.j(this.c, bokVar.c) && a.j(this.d, bokVar.d) && a.j(this.b, bokVar.b) && a.j(this.e, bokVar.e) && a.j(this.f, bokVar.f) && a.j(this.h, bokVar.h) && a.j(this.i, bokVar.i) && a.j(this.j, bokVar.j) && a.j(this.k, bokVar.k) && a.j(this.l, bokVar.l);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.l;
        long j2 = this.k;
        long j3 = this.j;
        long j4 = this.i;
        long j5 = this.h;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.b;
        long j9 = this.d;
        return ((((((((((((((((((((iG + a.g(this.g)) * 31) + a.g(this.c)) * 31) + a.g(j9)) * 31) + a.g(j8)) * 31) + a.g(j7)) * 31) + a.g(j6)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }
}
