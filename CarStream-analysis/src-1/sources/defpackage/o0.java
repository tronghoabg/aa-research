package defpackage;

import androidx.car.app.AppManager;
import androidx.car.app.HostCall;
import androidx.car.app.IAppHost;
import androidx.car.app.constraints.ConstraintManager;
import androidx.car.app.constraints.IConstraintHost;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // androidx.car.app.HostCall
    public final Object dispatch(Object obj) {
        switch (this.a) {
            case 0:
                return AppManager.lambda$dismissAlert$4(this.b, (IAppHost) obj);
            default:
                return ConstraintManager.lambda$getContentLimit$0(this.b, (IConstraintHost) obj);
        }
    }
}
