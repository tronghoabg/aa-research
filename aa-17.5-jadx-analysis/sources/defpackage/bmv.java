package defpackage;

/* loaded from: classes.dex */
public final class bmv {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bmv(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bmv)) {
            bmv bmvVar = (bmv) obj;
            if (this.a == bmvVar.a && this.b == bmvVar.b && this.c == bmvVar.c && this.d == bmvVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }
}
