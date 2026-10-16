package defpackage;

import android.os.RemoteException;
import androidx.car.app.IAppManager;
import androidx.car.app.ICarApp;
import androidx.car.app.navigation.INavigationManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class gss implements gdn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gss(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gdn
    public final void a(Object obj, glf glfVar) throws RemoteException {
        int i = this.b;
        if (i == 0) {
            ((INavigationManager) obj).onStopNavigation(new gst((geu) this.a, glfVar));
            return;
        }
        if (i == 1) {
            fug fugVar = (fug) this.a;
            ((ICarApp) obj).onConfigurationChanged(fugVar.e.getResources().getConfiguration(), new gej(fugVar.e, glfVar));
            return;
        }
        if (i == 2) {
            hhz hhzVar = (hhz) this.a;
            ((ICarApp) obj).getAppTheme(new hht(hhzVar, hhzVar.a, glfVar));
            return;
        }
        if (i == 3) {
            hhz hhzVar2 = (hhz) this.a;
            gnj gnjVar = (gnj) hhzVar2.a.l(gnj.class);
            gnjVar.getClass();
            gnjVar.a.b();
            gnjVar.b.b();
            ((IAppManager) obj).getTemplate(new hhu(hhzVar2, hhzVar2.a, glfVar, gnjVar));
            return;
        }
        if (i == 4) {
            ((IAppManager) obj).stopLocationUpdates(new gej((geu) this.a, glfVar));
        } else if (i != 5) {
            ((IAppManager) obj).onBackPressed(new gej((geu) this.a, glfVar));
        } else {
            ((IAppManager) obj).startLocationUpdates(new gej((geu) this.a, glfVar));
        }
    }
}
