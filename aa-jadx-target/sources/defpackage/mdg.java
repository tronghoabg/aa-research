package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdg implements defpackage.eqt {
    final /* synthetic */ defpackage.mdi a;

    public mdg(defpackage.mdi mdiVar) {
        this.a = mdiVar;
    }

    @Override // defpackage.eqt
    public final /* bridge */ /* synthetic */ void ea(java.lang.Object obj) {
        defpackage.mdf mdfVar = (defpackage.mdf) obj;
        mdfVar.getClass();
        if (mdfVar.a == null || mdfVar.c) {
            return;
        }
        for (java.util.Map.Entry entry : mdfVar.b.entrySet()) {
            com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
            defpackage.mqj mqjVar = (defpackage.mqj) entry.getValue();
            if (mqjVar.c && defpackage.lyd.r().b(carRegionId)) {
                defpackage.nte nteVarC = defpackage.nte.c();
                com.google.android.gms.car.display.CarDisplayId carDisplayId = carRegionId.h;
                defpackage.ntb ntbVarA = nteVarC.a(carDisplayId);
                if (com.google.android.gms.car.display.CarDisplayId.b(carDisplayId) && ntbVarA.K()) {
                    defpackage.mdi.c.l().y("Stopping %s. Showing dashboard instead", mqjVar.a());
                    defpackage.nse.b().a().i();
                } else {
                    defpackage.mps.c();
                    android.content.ComponentName componentNameA = defpackage.mps.a(carDisplayId, ntbVarA.q, ntbVarA.k(carRegionId));
                    componentNameA.getClass();
                    defpackage.mdi.c.l().M("Stopping %s. Starting %s instead", mqjVar.a(), componentNameA);
                    defpackage.mpk mpkVarA = defpackage.mpk.a();
                    android.content.Intent intentA = defpackage.mpr.b(componentNameA).a();
                    defpackage.qrh qrhVar = new defpackage.qrh();
                    qrhVar.e = carRegionId;
                    mpkVarA.k(intentA, qrhVar);
                }
                this.a.b(ntbVarA.k(carRegionId));
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PARKED_APP, defpackage.zbd.LP);
                rrvVarH.p(mqjVar.a());
                oimVarU.F(rrvVarH.l());
            }
        }
    }
}
