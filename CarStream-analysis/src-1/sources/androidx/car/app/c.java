package androidx.car.app;

import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ CarAppBinder b;

    public /* synthetic */ c(CarAppBinder carAppBinder, int i) {
        this.a = i;
        this.b = carAppBinder;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return this.b.lambda$onAppPause$3();
            case 1:
                return this.b.lambda$onAppStart$1();
            case 2:
                return this.b.lambda$onAppStop$4();
            default:
                return this.b.lambda$onAppResume$2();
        }
    }
}
