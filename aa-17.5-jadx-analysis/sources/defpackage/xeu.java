package defpackage;

import android.content.Intent;
import com.google.android.projection.gearhead.service.CarSystemUiControllerService;

/* loaded from: classes3.dex */
public final class xeu extends kfn {
    public final /* synthetic */ CarSystemUiControllerService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeu(CarSystemUiControllerService carSystemUiControllerService) {
        super(null);
        this.a = carSystemUiControllerService;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        ((ype) CarSystemUiControllerService.a.l().ai((char) 10175)).u("Car connected.");
        CarSystemUiControllerService carSystemUiControllerService = this.a;
        Intent intent = carSystemUiControllerService.c;
        if (intent != null) {
            CarSystemUiControllerService.a(intent);
            carSystemUiControllerService.c = null;
        }
        try {
            carSystemUiControllerService.e = oni.f(qrnVar);
            if (carSystemUiControllerService.e.d(11)) {
                carSystemUiControllerService.d = new ljb(this, 7, null);
                carSystemUiControllerService.e.f(carSystemUiControllerService.d, 11, 0);
            }
        } catch (IllegalStateException | qrz | qsa unused) {
            ((ype) ((ype) CarSystemUiControllerService.a.f()).ai((char) 10176)).u("Unable to register sensor listener");
            CarSystemUiControllerService carSystemUiControllerService2 = this.a;
            carSystemUiControllerService2.d = null;
            carSystemUiControllerService2.e = null;
        }
    }
}
