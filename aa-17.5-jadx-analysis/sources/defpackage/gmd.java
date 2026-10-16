package defpackage;

import androidx.car.app.ICarApp;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class gmd extends gej {
    final /* synthetic */ ICarApp f;
    final /* synthetic */ gmf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd(gmf gmfVar, geu geuVar, glf glfVar, ICarApp iCarApp) {
        super(geuVar, glfVar);
        this.f = iCarApp;
        this.g = gmfVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        super.onSuccess(bundleable);
        gmf gmfVar = this.g;
        gmg gmgVar = gmfVar.a;
        gmgVar.g.t().c(new glz(gmgVar, 0), gnk.f, new gma(gmfVar, this.f, 2));
    }
}
