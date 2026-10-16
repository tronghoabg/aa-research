package defpackage;

import com.google.android.gearhead.appdecor.AppDecorService;

/* loaded from: classes.dex */
public final class qfc extends kfn {
    public final /* synthetic */ AppDecorService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfc(AppDecorService appDecorService) {
        super(null);
        this.a = appDecorService;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        ((ype) AppDecorService.a.l().ai((char) 7019)).u("Car connected.");
        AppDecorService appDecorService = this.a;
        kgq.d(new mjc(appDecorService, qrnVar, 7, null), "ADU.AppDecorService", yzz.APP_DECOR, yzy.po, "Unable to register for car sensor updates", new Object[0]);
        appDecorService.g = new lyq(this, 2);
        lbh.c().k(appDecorService.g);
    }

    @Override // defpackage.kfn
    public final void d(rbu rbuVar) {
        int i = rbuVar.a;
        String strO = qrv.o(i);
        if (i == 0) {
            throw null;
        }
        throw new IllegalStateException("AppDecorService failed to connect to Car Service: ".concat(strO));
    }
}
