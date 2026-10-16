package androidx.car.app.model;

import android.os.Binder;
import androidx.car.app.model.AlertCallbackDelegateImpl;
import androidx.car.app.model.OnSelectedDelegateImpl;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Binder c;

    public /* synthetic */ b(Binder binder, int i, int i2) {
        this.a = i2;
        this.c = binder;
        this.b = i;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return ((AlertCallbackDelegateImpl.AlertCallbackStub) this.c).lambda$onAlertCancelled$0(this.b);
            default:
                return ((OnSelectedDelegateImpl.OnSelectedListenerStub) this.c).lambda$onSelected$0(this.b);
        }
    }
}
