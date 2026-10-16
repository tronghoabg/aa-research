package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class xge implements defpackage.nst {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xge(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.nst
    public final void a(defpackage.qsh qshVar, defpackage.ntb ntbVar) throws wfo {
        int i = this.b;
        if (i == 0) {
            defpackage.wfp.c();
            if (ntbVar != defpackage.nte.c().b()) {
                return;
            }
            defpackage.xgf xgfVar = (defpackage.xgf) this.a;
            if (xgfVar.c) {
                ((defpackage.yqj) defpackage.xgf.a.l().ai((char) 10248)).u("Resizing within lifetime");
                defpackage.nye.b().d();
                defpackage.mug.a().f();
                xgfVar.q(!xgfVar.d);
                xgfVar.p(true);
                return;
            }
            return;
        }
        if (i != 1) {
            defpackage.wfp.c();
            defpackage.xgf xgfVar2 = (defpackage.xgf) this.a;
            if (!xgfVar2.e) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.xgf.a.h()).ai((char) 10247)).u("Not restarting primary system UI since not in lifecycle");
                return;
            }
            if (ntbVar != defpackage.nte.c().b()) {
                return;
            }
            ((defpackage.yqj) defpackage.xgf.a.l().ai((char) 10245)).u("Resizing lifetime agnostic");
            defpackage.nza.a().b();
            defpackage.nza.a().c(qshVar);
            if (defpackage.lem.a().b()) {
                defpackage.msl.a().b();
                defpackage.msl.a().c(qshVar);
            }
            defpackage.nji.a().c();
            defpackage.nji.a().e(defpackage.mru.c(qshVar), qshVar);
            if (xgfVar2.b) {
                defpackage.nji.a().d();
                defpackage.nji.a().h(defpackage.mru.c(qshVar), qshVar);
                return;
            }
            return;
        }
        defpackage.wfp.c();
        com.google.android.gms.car.display.CarDisplayId carDisplayId = ntbVar.o;
        defpackage.msi msiVar = (defpackage.msi) this.a;
        java.util.Map map = msiVar.b;
        defpackage.ygw ygwVarS = ntbVar.s();
        defpackage.nrr nrrVar = (defpackage.nrr) map.get(carDisplayId);
        nrrVar.getClass();
        int size = ygwVarS.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) ygwVarS.get(i2);
            if (!msiVar.c.containsKey(carRegionId)) {
                msiVar.c.put(carRegionId, defpackage.msi.j(ntbVar, carRegionId, nrrVar));
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.google.android.gms.car.display.CarRegionId carRegionId2 : msiVar.c.keySet()) {
            if (carRegionId2.h.equals(carDisplayId) && !ygwVarS.contains(carRegionId2)) {
                ((defpackage.yqj) defpackage.msi.a.l().ai((char) 5251)).y("Removing the AaContext for %s", carRegionId2);
                hashSet.add(carRegionId2);
            }
        }
        msiVar.c.keySet().removeAll(hashSet);
    }
}
