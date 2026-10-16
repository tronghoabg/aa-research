package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chv extends defpackage.cge implements defpackage.cwu, defpackage.cyp {
    public defpackage.cld a;
    public defpackage.cnh b;
    public defpackage.cng c;

    public chv(defpackage.cld cldVar, defpackage.cnh cnhVar) {
        this.a = cldVar;
        this.b = cnhVar;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        defpackage.cng cngVar;
        defpackage.cng cngVar2 = this.c;
        if (cngVar2 == null) {
            defpackage.cjq cjqVar = ((defpackage.czz) defpackage.cjv.t(this)).P;
            defpackage.cok cokVar = cjqVar.c;
            if (cokVar == null) {
                cokVar = new defpackage.cok((byte[]) null);
                cjqVar.c = cokVar;
            }
            defpackage.cng cngVar3 = new defpackage.cng(this.a, this.b, cokVar);
            this.c = cngVar3;
            cngVar = cngVar3;
        } else {
            cngVar = cngVar2;
        }
        cngVar.e(cxnVar, cxnVar.o(), 1.0f, null);
        cxnVar.q();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.chv)) {
            return false;
        }
        defpackage.chv chvVar = (defpackage.chv) obj;
        return defpackage.afga.f(this.a, chvVar.a) && defpackage.afga.f(this.b, chvVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.cyp
    public final void r() {
        this.c = null;
        defpackage.dai.G(this);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
