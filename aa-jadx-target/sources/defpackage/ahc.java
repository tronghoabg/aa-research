package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ahc implements defpackage.agu {
    private final defpackage.agx a;
    private final long b;
    private final int c;

    public ahc(defpackage.agx agxVar, int i) {
        this.a = agxVar;
        this.c = i;
        this.b = ((long) (agxVar.f() + agxVar.g())) * 1000000;
    }

    private final long f(long j) {
        if (j <= 0) {
            return 0L;
        }
        long j2 = this.b;
        long j3 = j / j2;
        if (this.c != 1 && j3 % 2 != 0) {
            return ((j3 + 1) * j2) - j;
        }
        java.lang.Long.signum(j3);
        return j - (j3 * j2);
    }

    private final defpackage.aep g(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        long j2 = this.b;
        return j > j2 ? this.a.d(j2, aepVar, aepVar3, aepVar2) : aepVar2;
    }

    @Override // defpackage.agu
    public final long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.agu
    public final /* synthetic */ defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return d(Long.MAX_VALUE, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.c(f(j), aepVar, aepVar2, g(j, aepVar, aepVar3, aepVar2));
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.d(f(j), aepVar, aepVar2, g(j, aepVar, aepVar3, aepVar2));
    }

    @Override // defpackage.agu
    public final boolean e() {
        return true;
    }
}
