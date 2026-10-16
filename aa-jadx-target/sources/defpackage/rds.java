package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rds implements defpackage.rej {
    public final /* synthetic */ defpackage.ref a;
    public final /* synthetic */ com.google.android.gms.car.display.CarDisplayId b;
    private final /* synthetic */ int c;

    public /* synthetic */ rds(defpackage.ref refVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, int i) {
        this.c = i;
        this.a = refVar;
        this.b = carDisplayId;
    }

    @Override // defpackage.rej
    public final java.lang.Object a() throws android.os.RemoteException {
        defpackage.rab rabVarL;
        int i = this.c;
        int i2 = 20;
        if (i == 0) {
            com.google.android.gms.car.display.CarDisplayId carDisplayId = this.b;
            defpackage.ref refVar = this.a;
            return new defpackage.ret(new defpackage.shg(refVar, carDisplayId), new defpackage.qfl(refVar, i2));
        }
        if (i == 1) {
            return new defpackage.row(this.a.M(this.b));
        }
        defpackage.ref refVar2 = this.a;
        defpackage.saw sawVar = new defpackage.saw(new defpackage.kpe(refVar2, 5), new defpackage.kpe(refVar2, 12), new defpackage.kpe(refVar2, 13), new defpackage.kpe(refVar2, 14), new defpackage.kpe(refVar2, 15), new defpackage.kpe(refVar2, 16), new defpackage.kpe(refVar2, 6), new defpackage.kpe(refVar2, 17), new defpackage.kpe(refVar2, 18), new defpackage.kpe(refVar2, 11), new defpackage.kpe(refVar2, 10), new defpackage.kpe(refVar2, 19), new defpackage.kpe(refVar2, i2), new defpackage.kpe(refVar2, 7), new defpackage.kpe(refVar2, 8), new defpackage.kpe(refVar2, 9));
        defpackage.mku mkuVar = new defpackage.mku();
        defpackage.rpt[] rptVarArr = {defpackage.rpt.FULLSCREEN_PRESENTATION, defpackage.rpt.PRESENTATION_CLEAR_PARENT_PADDING};
        for (int i3 = 0; i3 < 2; i3++) {
            defpackage.rpt rptVar = rptVarArr[i3];
            boolean zK = refVar2.K(rptVar);
            rptVar.getClass();
            ((defpackage.yha) mkuVar.b).f(rptVar, java.lang.Boolean.valueOf(zK));
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId2 = this.b;
        defpackage.rpu rpuVar = new defpackage.rpu(mkuVar);
        if (refVar2.p(defpackage.rbf.t)) {
            if (defpackage.omv.c("CAR.CLIENT", 3)) {
                defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarWindowManager for: %s", new defpackage.zkf(defpackage.zke.a, carDisplayId2));
            }
            defpackage.rkt rktVarE = refVar2.C().S().e(carDisplayId2);
            rktVarE.getClass();
            rabVarL = rktVarE.d();
        } else {
            defpackage.ysr.aY(com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId2), "Legacy ICarWindowManager should only be used for the primary car display.");
            rabVarL = refVar2.C().L();
        }
        return new defpackage.sax(refVar2.M(carDisplayId2), carDisplayId2, rabVarL, refVar2.c, sawVar, rpuVar, refVar2);
    }
}
