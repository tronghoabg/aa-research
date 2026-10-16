package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class p implements java.io.Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public p(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static j$.time.temporal.p f(long j, long j2) {
        if (j <= j2) {
            return new j$.time.temporal.p(j, j, j2, j2);
        }
        j$.time.g.a("Minimum value must be less than maximum value");
        return null;
    }

    public static j$.time.temporal.p g(long j, long j2, long j3) {
        if (j > 1) {
            j$.time.g.a("Smallest minimum value must be less than largest minimum value");
            return null;
        }
        if (j2 > j3) {
            j$.time.g.a("Smallest maximum value must be less than largest maximum value");
            return null;
        }
        if (1 <= j3) {
            return new j$.time.temporal.p(j, 1L, j2, j3);
        }
        j$.time.g.a("Minimum value must be less than maximum value");
        return null;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new java.io.InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new java.io.InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new java.io.InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j, j$.time.temporal.m mVar) {
        if (d() && e(j)) {
            return (int) j;
        }
        j$.time.g.g(c(j, mVar));
        return 0;
    }

    public final void b(long j, j$.time.temporal.m mVar) {
        if (e(j)) {
            return;
        }
        j$.time.g.g(c(j, mVar));
    }

    public final java.lang.String c(long j, j$.time.temporal.m mVar) {
        if (mVar == null) {
            return "Invalid value (valid values " + java.lang.String.valueOf(this) + "): " + j;
        }
        return "Invalid value for " + java.lang.String.valueOf(mVar) + " (valid values " + java.lang.String.valueOf(this) + "): " + j;
    }

    public final boolean d() {
        return this.a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.a && j <= this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.temporal.p) {
            j$.time.temporal.p pVar = (j$.time.temporal.p) obj;
            if (this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.d == pVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
