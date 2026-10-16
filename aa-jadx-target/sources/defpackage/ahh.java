package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ahh implements defpackage.agy {
    private final /* synthetic */ defpackage.aha a;

    public ahh(float f, float f2, defpackage.aep aepVar) {
        int[] iArr = defpackage.agw.a;
        this.a = new defpackage.aha((aepVar == null && f == 1.0f && f2 == 1500.0f) ? defpackage.aew.a : aepVar != null ? new defpackage.agv(aepVar, f, f2, 1) : new defpackage.agv(f, f2, 0));
    }

    @Override // defpackage.agu
    public final long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.a(aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.b(aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.c(j, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.a.d(j, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final boolean e() {
        return false;
    }
}
