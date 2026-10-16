package defpackage;

import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;

/* loaded from: classes2.dex */
public final class kly extends kfn {
    final /* synthetic */ CarLocalMediaBrowserService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kly(CarLocalMediaBrowserService carLocalMediaBrowserService) {
        super(null);
        this.a = carLocalMediaBrowserService;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        CarLocalMediaBrowserService carLocalMediaBrowserService = this.a;
        if (carLocalMediaBrowserService.h == null) {
            ((ype) ((ype) CarLocalMediaBrowserService.g.e()).ai((char) 3211)).u("Stopped before connected");
            return;
        }
        if (!lej.a().d()) {
            ((ype) ((ype) CarLocalMediaBrowserService.g.e()).ai((char) 3210)).u("Car Local Media not enabled");
            carLocalMediaBrowserService.stopSelf();
        } else {
            yph yphVar = CarLocalMediaBrowserService.g;
            ((ype) ((ype) yphVar.e()).ai((char) 3209)).u("on car connected");
            kgq.d(new mjc(carLocalMediaBrowserService, qrnVar, 1, null), "GH.CarLocalMedia", yzz.LOCAL_MEDIA_APP, yzy.Ml, "Could not establish communication channel for car local media", new Object[0]);
            ((ype) ((ype) yphVar.f()).ai((char) 3214)).u("connected");
        }
    }

    @Override // defpackage.kfn
    public final void b() {
        yph yphVar = CarLocalMediaBrowserService.g;
        this.a.i();
    }
}
