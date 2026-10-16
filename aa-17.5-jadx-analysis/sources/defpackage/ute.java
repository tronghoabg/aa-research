package defpackage;

/* loaded from: classes3.dex */
public final class ute implements Comparable {
    public static final ute a = new ute(0, 0, 0, 0);
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ute(long j, long j2, long j3, long j4) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ute uteVar) {
        if (uteVar == null) {
            return 1;
        }
        long j = this.b;
        long j2 = uteVar.b;
        if (j < j2) {
            return -1;
        }
        if (j != j2) {
            return 1;
        }
        long j3 = this.c;
        long j4 = uteVar.c;
        if (j3 < j4) {
            return -1;
        }
        if (j3 != j4) {
            return 1;
        }
        long j5 = this.d;
        long j6 = uteVar.d;
        if (j5 < j6) {
            return -1;
        }
        return j5 == j6 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ute)) {
            return false;
        }
        ute uteVar = (ute) obj;
        return this.b == uteVar.b && this.c == uteVar.c && this.d == uteVar.d && this.e == uteVar.e;
    }

    public final int hashCode() {
        int iG = a.g(this.b);
        long j = this.e;
        return ((((((iG + 31) * 31) + a.g(this.c)) * 31) + a.g(this.d)) * 31) + a.g(j);
    }

    public final String toString() {
        return "[plane: " + this.b + ", grade: " + this.c + ", within grade: " + this.d + ", id: " + this.e + "]";
    }
}
