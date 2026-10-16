package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class now implements defpackage.nsx {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ now(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nsx
    public final void a(defpackage.qsh qshVar, defpackage.nta ntaVar, android.graphics.Rect rect) throws defpackage.qst {
        if (this.b != 0) {
            int i = defpackage.mpu.a;
            defpackage.mkp.a.g();
            com.google.android.gms.car.display.CarRegionId carRegionIdR = defpackage.nte.c().a(((defpackage.ntb) this.a).o).r(ntaVar);
            defpackage.rbf rbfVar = defpackage.rbf.t;
            defpackage.ref refVar = (defpackage.ref) ((defpackage.rbu) qshVar).a;
            if (!refVar.p(rbfVar)) {
                throw new java.lang.IllegalStateException("This API can only be used if multi-display is enabled");
            }
            refVar.f.g(new defpackage.rdv(refVar, carRegionIdR, rect, 1));
            return;
        }
        defpackage.noz nozVar = (defpackage.noz) this.a;
        defpackage.rct rctVar = nozVar.m;
        defpackage.sau sauVar = (defpackage.sau) nozVar.k.g.get(rctVar);
        if (sauVar == null) {
            defpackage.rrx.d(5, "CAR.WM", null, "attempting to update window layout, but inflater not found: %s", rctVar);
            return;
        }
        if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
            defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s updateWindowInsets(%s)", sauVar.a, rect);
        }
        sauVar.p(rect);
        try {
            sauVar.i.u(rect);
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException("updateWindowInsets RemoteException", e);
        }
    }
}
