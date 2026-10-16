package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bae extends defpackage.cyc<defpackage.baf> {
    private final defpackage.afer a;
    private final defpackage.bad b;
    private final defpackage.apn c;
    private final boolean d;
    private final boolean f = false;

    public bae(defpackage.afer aferVar, defpackage.bad badVar, defpackage.apn apnVar, boolean z) {
        this.a = aferVar;
        this.b = badVar;
        this.c = apnVar;
        this.d = z;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.baf(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.baf bafVar = (defpackage.baf) cgeVar;
        bafVar.a = this.a;
        bafVar.b = this.b;
        defpackage.apn apnVar = bafVar.c;
        defpackage.apn apnVar2 = this.c;
        if (apnVar != apnVar2) {
            bafVar.c = apnVar2;
            defpackage.cjv.r(bafVar).J();
        }
        boolean z = this.d;
        if (bafVar.d == z) {
            return;
        }
        bafVar.d = z;
        bafVar.b();
        defpackage.cjv.r(bafVar).J();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bae)) {
            return false;
        }
        defpackage.bae baeVar = (defpackage.bae) obj;
        if (this.a != baeVar.a || !defpackage.afga.f(this.b, baeVar.b) || this.c != baeVar.c || this.d != baeVar.d) {
            return false;
        }
        boolean z = baeVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + (true != this.d ? 1237 : 1231)) * 31) + 1237;
    }
}
