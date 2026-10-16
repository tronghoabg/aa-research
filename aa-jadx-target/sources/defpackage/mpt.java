package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mpt implements defpackage.nst {
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.nst
    public final void a(defpackage.qsh qshVar, defpackage.ntb ntbVar) throws wfo, defpackage.qst {
        int i = defpackage.mpu.a;
        defpackage.mps.c();
        defpackage.wfp.c();
        com.google.android.gms.car.lifecycle.CarActivityLayoutConfig carActivityLayoutConfigB = defpackage.mps.b(qshVar, java.util.Arrays.asList(ntbVar));
        defpackage.mkp.a.g();
        defpackage.rbf rbfVar = defpackage.rbf.t;
        defpackage.rcz rczVar = ((defpackage.rbu) qshVar).a;
        defpackage.ref refVar = (defpackage.ref) rczVar;
        if (!refVar.p(rbfVar)) {
            throw new java.lang.IllegalStateException("This API can only be used if multi-display is enabled");
        }
        refVar.f.g(new defpackage.rdp(rczVar, carActivityLayoutConfigB, 1, null));
    }
}
