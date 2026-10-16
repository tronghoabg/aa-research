package androidx.car.app;

import androidx.car.app.AppManager;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarContext b;

    public /* synthetic */ a(CarContext carContext, int i) {
        this.a = i;
        this.b = carContext;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return AppManager.AnonymousClass1.lambda$onBackPressed$0(this.b);
            case 1:
                return AppManager.AnonymousClass1.lambda$stopLocationUpdates$2(this.b);
            default:
                return AppManager.AnonymousClass1.lambda$startLocationUpdates$1(this.b);
        }
    }
}
