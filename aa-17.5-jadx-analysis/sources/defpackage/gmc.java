package defpackage;

import android.os.RemoteException;
import androidx.car.app.AppInfo;
import androidx.car.app.HandshakeInfo;
import androidx.car.app.ICarApp;
import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class gmc extends gej {
    final /* synthetic */ ICarApp f;
    final /* synthetic */ gmf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmc(gmf gmfVar, geu geuVar, glf glfVar, ICarApp iCarApp) {
        super(geuVar, glfVar);
        this.f = iCarApp;
        this.g = gmfVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        bundleable.getClass();
        super.onSuccess(bundleable);
        final gmf gmfVar = this.g;
        gmg gmgVar = gmfVar.a;
        ggl gglVarI = gmgVar.g.i();
        try {
            AppInfo appInfo = (AppInfo) bundleable.a();
            gns gnsVar = gmgVar.f;
            gnq gnqVarB = gnr.b(5, gmgVar.c);
            gnqVarB.a = xxh.h(appInfo.getLibraryDisplayVersion());
            gnsVar.d(gnqVarB);
            final ICarApp iCarApp = this.f;
            final HandshakeInfo handshakeInfo = new HandshakeInfo(gmgVar.g.getPackageName(), gglVarI.d(appInfo));
            gmgVar.g.t().c(new glz(gmgVar, 0), gnk.c, new gek() { // from class: gmb
                @Override // defpackage.gek
                public final void a(glf glfVar) throws RemoteException {
                    Bundleable bundleable2 = new Bundleable(handshakeInfo);
                    ICarApp iCarApp2 = iCarApp;
                    gmf gmfVar2 = gmfVar;
                    iCarApp2.onHandshakeCompleted(bundleable2, new gmd(gmfVar2, gmfVar2.a.g, glfVar, iCarApp2));
                }
            });
            gmgVar.l = appInfo;
        } catch (ggm e) {
            gmf gmfVar2 = this.g;
            gdp gdpVar = new gdp();
            gdpVar.e = 3;
            gdpVar.a = e;
            gmfVar2.a.h(new gdq(gdpVar));
        } catch (xr e2) {
            gmf gmfVar3 = this.g;
            gdp gdpVar2 = new gdp();
            gdpVar2.a = e2;
            gmfVar3.a.h(new gdq(gdpVar2));
        }
    }
}
