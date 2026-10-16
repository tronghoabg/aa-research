package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ipz extends defpackage.edd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public ipz(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static defpackage.iqy B() {
        defpackage.iqy iqyVar = new defpackage.iqy();
        iqyVar.b(900L);
        iqyVar.d(700L);
        iqyVar.c(0L);
        iqyVar.e(0L);
        return iqyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ipz) {
            defpackage.ipz ipzVar = (defpackage.ipz) obj;
            if (this.a == ipzVar.a && this.b == ipzVar.b && this.c == ipzVar.c && this.d == ipzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.a) * 31;
        long j = this.d;
        return ((((iF + defpackage.a.f(this.b)) * 31) + defpackage.a.f(this.c)) * 31) + defpackage.a.f(j);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c), java.lang.Long.valueOf(this.d)};
        java.lang.String[] strArrSplit = "maxAudioBufferMs;targetBufferAfterMaxBufferReachedMs;maxHuAudioBufferMs;targetHuBufferAfterMaxHuBufferReachedMs".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ipz[");
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
