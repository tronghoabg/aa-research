package defpackage;

/* loaded from: classes.dex */
public final class bmn {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bmn(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bmn)) {
            bmn bmnVar = (bmn) obj;
            if (this.a == bmnVar.a && this.b == bmnVar.b && this.c == bmnVar.c && this.d == bmnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        long j = this.d;
        return ((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j);
    }
}
