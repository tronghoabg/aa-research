package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qfy implements defpackage.epl {
    final /* synthetic */ com.google.android.gearhead.appdecor.AppDecorService a;

    public qfy(com.google.android.gearhead.appdecor.AppDecorService appDecorService) {
        this.a = appDecorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        defpackage.yha yhaVar = new defpackage.yha(4);
        java.util.Iterator it = ((java.util.List) defpackage.kgu.c(new defpackage.kyr(7), "ADU.AppDecorService", defpackage.zbe.APP_DECOR, defpackage.zbd.pr, true, "Unable to get car displays for creating SystemUiService binders", new java.lang.Object[0])).iterator();
        while (it.hasNext()) {
            defpackage.ntb ntbVarA = defpackage.nte.c().a(((com.google.android.gms.car.display.CarDisplay) it.next()).a);
            defpackage.ygw ygwVarS = ntbVarA.s();
            int size = ygwVarS.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) ygwVarS.get(i);
                yhaVar.f(carRegionId, new defpackage.raw(carRegionId));
            }
            ntbVarA.w(this.a.h);
        }
        this.a.i = yhaVar.d(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        com.google.android.gearhead.appdecor.AppDecorService appDecorService = this.a;
        defpackage.you youVarListIterator = ((defpackage.ygw) appDecorService.i.values()).listIterator(0);
        while (youVarListIterator.hasNext()) {
            ((defpackage.raw) youVarListIterator.next()).a();
        }
        appDecorService.i = defpackage.ync.a;
        defpackage.ygw ygwVarE = defpackage.nte.c().e();
        int size = ygwVarE.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ntb) ygwVarE.get(i)).A(appDecorService.h);
        }
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }
}
