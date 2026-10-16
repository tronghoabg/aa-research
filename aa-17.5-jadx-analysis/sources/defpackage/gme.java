package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class gme extends gej {
    final /* synthetic */ gmf f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gme(gmf gmfVar, geu geuVar, glf glfVar) {
        super(geuVar, glfVar);
        this.f = gmfVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        super.onFailure(bundleable);
        gks.b("CarApp.H", "OnAppCreate Failure");
        this.f.a.d(null);
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        super.onSuccess(bundleable);
        gmg gmgVar = this.f.a;
        gmgVar.f(glx.c);
        glf glfVar = gmgVar.o;
        glfVar.getClass();
        gev.c(new gnu(glfVar, 1));
    }
}
