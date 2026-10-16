package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adzj {
    final int a;
    final long b;
    final long c;
    final double d;
    final java.lang.Long e;
    final java.util.Set f;

    public adzj(int i, long j, long j2, double d, java.lang.Long l, java.util.Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = defpackage.yhx.n(set);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.adzj)) {
            return false;
        }
        defpackage.adzj adzjVar = (defpackage.adzj) obj;
        return this.a == adzjVar.a && this.b == adzjVar.b && this.c == adzjVar.c && java.lang.Double.compare(this.d, adzjVar.d) == 0 && j$.util.Objects.equals(this.e, adzjVar.e) && j$.util.Objects.equals(this.f, adzjVar.f);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c), java.lang.Double.valueOf(this.d), this.e, this.f});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.f("maxAttempts", this.a);
        xymVarBy.g("initialBackoffNanos", this.b);
        xymVarBy.g("maxBackoffNanos", this.c);
        xymVarBy.d("backoffMultiplier", this.d);
        xymVarBy.b("perAttemptRecvTimeoutNanos", this.e);
        xymVarBy.b("retryableStatusCodes", this.f);
        return xymVarBy.toString();
    }
}
