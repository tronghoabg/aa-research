package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.HostCall;
import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.constraints.IConstraintHost;
import androidx.car.app.navigation.INavigationHost;
import androidx.car.app.navigation.NavigationManager;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements HostCall {
    public final /* synthetic */ int a;

    public /* synthetic */ n0(int i) {
        this.a = i;
    }

    @Override // androidx.car.app.HostCall
    public final Object dispatch(Object obj) {
        switch (this.a) {
            case 0:
                return AppManager.lambda$invalidate$1((IAppHost) obj);
            case 1:
                return CarContext.lambda$finishCarApp$2((ICarHost) obj);
            case 2:
                return Boolean.valueOf(((IConstraintHost) obj).isAppDrivenRefreshEnabled());
            case 3:
                return NavigationManager.lambda$navigationEnded$2((INavigationHost) obj);
            default:
                return NavigationManager.lambda$navigationStarted$1((INavigationHost) obj);
        }
    }
}
