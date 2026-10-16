package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class agc implements defpackage.agu {
    private final defpackage.agu a;
    private final long b;

    public agc(defpackage.agu aguVar, long j) {
        this.a = aguVar;
        this.b = j;
    }

    @Override // defpackage.agu
    public final long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.a(aepVar, aepVar2, aepVar3) + this.b;
    }

    @Override // defpackage.agu
    public final /* synthetic */ defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return d(a(aepVar, aepVar2, aepVar3), aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        long j2 = this.b;
        return j < j2 ? aepVar : this.a.c(j - j2, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        long j2 = this.b;
        return j < j2 ? aepVar3 : this.a.d(j - j2, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.agc)) {
            return false;
        }
        defpackage.agc agcVar = (defpackage.agc) obj;
        return agcVar.b == this.b && defpackage.afga.f(agcVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
