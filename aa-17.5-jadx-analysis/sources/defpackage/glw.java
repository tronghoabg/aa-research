package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class glw extends gej {
    final /* synthetic */ dzg f;
    final /* synthetic */ gmg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glw(gmg gmgVar, geu geuVar, glf glfVar, dzg dzgVar) {
        super(geuVar, glfVar);
        this.f = dzgVar;
        this.g = gmgVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        bundleable.getClass();
        super.onSuccess(bundleable);
        try {
            this.f.a(bundleable.a());
        } catch (xr e) {
            geb gebVarF = this.g.g.f();
            gdp gdpVar = new gdp();
            gdpVar.a = e;
            gebVarF.a(new gdq(gdpVar));
        }
    }
}
