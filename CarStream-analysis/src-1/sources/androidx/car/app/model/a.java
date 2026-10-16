package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ Binder b;

    public /* synthetic */ a(Binder binder, int i) {
        this.a = i;
        this.b = binder;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) this.b).lambda$onAlertDismissed$1();
            case 1:
                return ((OnClickDelegateImpl.OnClickListenerStub) this.b).lambda$onClick$0();
            default:
                return ((OnContentRefreshDelegateImpl.OnContentRefreshListenerStub) this.b).lambda$onContentRefreshRequested$0();
        }
    }
}
