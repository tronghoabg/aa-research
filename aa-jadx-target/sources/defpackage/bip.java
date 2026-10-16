package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class bip implements defpackage.djy {
    public defpackage.bin b;

    @Override // defpackage.djy
    public /* synthetic */ void b(defpackage.cjj cjjVar) {
        throw null;
    }

    @Override // defpackage.djy
    public /* synthetic */ void c() {
        throw null;
    }

    public abstract void e();

    @Override // defpackage.djy
    public /* synthetic */ void h(defpackage.dkd dkdVar, defpackage.djv djvVar, defpackage.dga dgaVar, defpackage.affc affcVar, defpackage.cjj cjjVar, defpackage.cjj cjjVar2) {
        throw null;
    }

    @Override // defpackage.djy
    public final void i() {
        defpackage.sr srVarB;
        defpackage.bin binVar = this.b;
        if (binVar == null || (srVarB = binVar.b()) == null) {
            return;
        }
        srVarB.q();
    }

    @Override // defpackage.djy
    public final void j() {
        defpackage.sr srVarB;
        defpackage.bin binVar = this.b;
        if (binVar == null || (srVarB = binVar.b()) == null) {
            return;
        }
        srVarB.r();
    }

    public final void k(defpackage.bin binVar) {
        if (this.b != null) {
            defpackage.asq.d("Expected textInputModifierNode to be null");
        }
        this.b = binVar;
    }

    public final void l(defpackage.bin binVar) {
        defpackage.bin binVar2 = this.b;
        if (binVar2 != binVar) {
            defpackage.asq.d(defpackage.a.bs(binVar2, binVar, "Expected textInputModifierNode to be ", " but was "));
        }
        this.b = null;
    }
}
