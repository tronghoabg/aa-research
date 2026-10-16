package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcc implements defpackage.aor {
    public final defpackage.bby a;
    private final defpackage.ars b;

    public bcc(defpackage.ars arsVar, defpackage.bby bbyVar) {
        this.b = arsVar;
        this.a = bbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aor
    public final java.lang.Object a(defpackage.apw apwVar, float f, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.bcb bcbVar;
        if (afdkVar instanceof defpackage.bcb) {
            bcbVar = (defpackage.bcb) afdkVar;
            int i = bcbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcbVar.c = i - Integer.MIN_VALUE;
            } else {
                bcbVar = new defpackage.bcb(this, afdkVar);
            }
        } else {
            bcbVar = new defpackage.bcb(this, afdkVar);
        }
        java.lang.Object objC = bcbVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = bcbVar.c;
        int i3 = 3;
        if (i2 == 0) {
            defpackage.afga.cz(objC);
            defpackage.ars arsVar = this.b;
            defpackage.bbs bbsVar = new defpackage.bbs(this, i3);
            bcbVar.c = 1;
            objC = arsVar.c(apwVar, f, bbsVar, bcbVar);
            if (objC == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objC);
        }
        float fFloatValue = ((java.lang.Number) objC).floatValue();
        defpackage.bby bbyVar = this.a;
        if (bbyVar.c() != 0.0f && java.lang.Math.abs(bbyVar.c()) < 0.001d) {
            int iJ = bbyVar.j();
            if (bbyVar.i()) {
                ahoc.d(((defpackage.bbo) bbyVar.n.a()).q, (defpackage.afdo) null, 0, new defpackage.ber(bbyVar, (defpackage.afdk) null, 1), 3);
            }
            bbyVar.t(iJ, 0.0f, false);
        } else {
            new java.lang.Float(bbyVar.c());
        }
        return new java.lang.Float(fFloatValue);
    }
}
