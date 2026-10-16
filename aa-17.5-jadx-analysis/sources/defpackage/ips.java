package defpackage;

/* loaded from: classes.dex */
public final class ips extends ebj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ips(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static iqq q() {
        iqq iqqVar = new iqq();
        iqqVar.b(900L);
        iqqVar.d(700L);
        iqqVar.c(0L);
        iqqVar.e(0L);
        return iqqVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ips) {
            ips ipsVar = (ips) obj;
            if (this.a == ipsVar.a && this.b == ipsVar.b && this.c == ipsVar.c && this.d == ipsVar.d) {
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

    public final String toString() {
        int i = 0;
        Object[] objArr = {Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d)};
        String[] strArrSplit = "maxAudioBufferMs;targetBufferAfterMaxBufferReachedMs;maxHuAudioBufferMs;targetHuBufferAfterMaxHuBufferReachedMs".split(";");
        StringBuilder sb = new StringBuilder("ips[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
