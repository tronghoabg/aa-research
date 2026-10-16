package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sxm extends defpackage.slw implements defpackage.sma {
    public sxm(android.content.Context context, defpackage.sxp sxpVar) {
        super(context, null, defpackage.sxq.a, sxpVar, defpackage.slv.a);
    }

    public final defpackage.swx a() {
        defpackage.sny snyVar = new defpackage.sny();
        snyVar.a = new defpackage.sxi();
        snyVar.c = 4501;
        return super.u(0, snyVar.a());
    }

    public final void b(defpackage.sxr sxrVar) {
        final defpackage.sno snoVarD = defpackage.sqg.d(sxrVar, this.g, "sxr");
        final defpackage.qxn qxnVar = ((defpackage.sxp) this.e).a;
        defpackage.snv snvVar = new defpackage.snv() { // from class: sxh
            @Override // defpackage.snv
            public final void a(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
                defpackage.qxn qxnVar2 = new defpackage.qxn(snoVarD, 3);
                ((defpackage.sxy) obj).H(qxnVar, qxnVar2, new defpackage.sxk(this.a, (defpackage.lhe) obj2, qxnVar2));
            }
        };
        defpackage.qqu qquVar = new defpackage.qqu(this, 17);
        defpackage.snu snuVar = new defpackage.snu();
        snuVar.a = snvVar;
        snuVar.b = qquVar;
        snuVar.c = snoVarD;
        snuVar.d = new com.google.android.gms.common.Feature[]{defpackage.sxg.a};
        snuVar.f = 4507;
        x(snuVar.a());
    }
}
