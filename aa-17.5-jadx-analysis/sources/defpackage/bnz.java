package defpackage;

/* loaded from: classes2.dex */
public final class bnz {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bnz(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final bnz a(long j, long j2, long j3, long j4) {
        return new bnz(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bnz)) {
            return false;
        }
        bnz bnzVar = (bnz) obj;
        return a.j(this.a, bnzVar.a) && a.j(this.b, bnzVar.b) && a.j(this.c, bnzVar.c) && a.j(this.d, bnzVar.d);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.d;
        return ((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j);
    }
}
