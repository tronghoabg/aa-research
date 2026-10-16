package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ahf implements defpackage.agy {
    private final int a;
    private final defpackage.agx b;
    private final long c;
    private final int d;

    public ahf(int i, defpackage.agx agxVar, int i2) {
        this.a = i;
        this.b = agxVar;
        this.d = i2;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.c = ((long) ((defpackage.ahe) agxVar).a) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.c;
        long jMin = java.lang.Math.min(j / j2, ((long) this.a) - 1);
        if (this.d != 1 && jMin % 2 != 0) {
            return ((jMin + 1) * j2) - j;
        }
        java.lang.Long.signum(jMin);
        return j - (jMin * j2);
    }

    private final defpackage.aep g(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        long j2 = this.c;
        return j > j2 ? d(j2, aepVar, aepVar2, aepVar3) : aepVar2;
    }

    @Override // defpackage.agu
    public final long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return ((long) this.a) * this.c;
    }

    @Override // defpackage.agu
    public final /* synthetic */ defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return d(a(aepVar, aepVar2, aepVar3), aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.b.c(f(j), aepVar, aepVar2, g(j, aepVar, aepVar3, aepVar2));
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.b.d(f(j), aepVar, aepVar2, g(j, aepVar, aepVar3, aepVar2));
    }

    @Override // defpackage.agu
    public final /* synthetic */ boolean e() {
        return false;
    }
}
