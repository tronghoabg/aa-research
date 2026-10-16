package defpackage;

/* loaded from: classes.dex */
public final class bru {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public bru(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bru)) {
            return false;
        }
        bru bruVar = (bru) obj;
        return a.j(this.a, bruVar.a) && a.j(this.b, bruVar.b) && a.j(this.c, bruVar.c) && a.j(this.d, bruVar.d) && a.j(this.e, bruVar.e) && a.j(this.f, bruVar.f);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.f;
        long j2 = this.e;
        long j3 = this.d;
        return ((((((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }
}
