package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ahi implements defpackage.agx {
    private final int a;
    private final int b;
    private final defpackage.aez c;
    private final defpackage.aha d;

    public ahi(int i, int i2, defpackage.aez aezVar) {
        this.a = i;
        this.b = i2;
        this.c = aezVar;
        this.d = new defpackage.aha(new defpackage.afi(i, i2, aezVar));
    }

    @Override // defpackage.agu
    public final /* synthetic */ long a(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return defpackage.afw.n(this);
    }

    @Override // defpackage.agu
    public final /* synthetic */ defpackage.aep b(defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return d(defpackage.afw.n(this), aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep c(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.d.c(j, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final defpackage.aep d(long j, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return this.d.d(j, aepVar, aepVar2, aepVar3);
    }

    @Override // defpackage.agu
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.agx
    public final int f() {
        return this.b;
    }

    @Override // defpackage.agx
    public final int g() {
        return this.a;
    }
}
