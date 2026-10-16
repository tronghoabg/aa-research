package defpackage;

import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayUiFeatures;

/* loaded from: classes.dex */
public final /* synthetic */ class oxt implements rcg {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oxt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rcg
    public final void a(CarDisplayUiFeatures carDisplayUiFeatures) {
        if (this.b != 0) {
            carDisplayUiFeatures.getClass();
            ((nfr) this.a).g(carDisplayUiFeatures, "listener");
            return;
        }
        Object obj = this.a;
        boolean zL = oxu.l(carDisplayUiFeatures);
        oxu oxuVar = (oxu) obj;
        if (oxuVar.b == zL) {
            return;
        }
        oxuVar.b = zL;
        Intent intentH = oxuVar.h();
        Intent intentG = oxuVar.g();
        intentH.setAction("com.google.android.gms.car.ACTION_UPDATE_TURN_CARD_STATE");
        intentG.setAction("com.google.android.gms.car.ACTION_UPDATE_TURN_CARD_STATE");
        oxuVar.j(intentH, intentG);
    }
}
