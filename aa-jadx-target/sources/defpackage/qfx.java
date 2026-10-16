package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qfx extends defpackage.kfp {
    public final /* synthetic */ com.google.android.gearhead.appdecor.AppDecorService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfx(com.google.android.gearhead.appdecor.AppDecorService appDecorService) {
        super(null);
        this.a = appDecorService;
    }

    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) {
        ((defpackage.yqj) com.google.android.gearhead.appdecor.AppDecorService.a.l().ai((char) 7044)).u("Car connected.");
        com.google.android.gearhead.appdecor.AppDecorService appDecorService = this.a;
        defpackage.kgu.d(new defpackage.mjh(appDecorService, qshVar, 7, null), "ADU.AppDecorService", defpackage.zbe.APP_DECOR, defpackage.zbd.pq, "Unable to register for car sensor updates", new java.lang.Object[0]);
        appDecorService.g = new defpackage.lyw(this, 2);
        defpackage.ler.b().k(appDecorService.g);
    }

    @Override // defpackage.kfp
    public final void d(rcp rcpVar) {
        int i = rcpVar.a;
        java.lang.String strO = sqg.o(i);
        if (i == 0) {
            throw null;
        }
        throw new java.lang.IllegalStateException("AppDecorService failed to connect to Car Service: ".concat(strO));
    }
}
