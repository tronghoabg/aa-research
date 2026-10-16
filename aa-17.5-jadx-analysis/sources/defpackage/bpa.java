package defpackage;

/* loaded from: classes2.dex */
public final class bpa {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bpa(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bpa)) {
            return false;
        }
        bpa bpaVar = (bpa) obj;
        return a.j(this.a, bpaVar.a) && a.j(this.b, bpaVar.b) && a.j(this.c, bpaVar.c) && a.j(this.d, bpaVar.d);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.d;
        return ((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j);
    }
}
