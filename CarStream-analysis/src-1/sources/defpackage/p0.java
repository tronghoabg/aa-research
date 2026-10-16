package defpackage;

import androidx.activity.result.ActivityResultCallback;
import androidx.car.app.AppManager;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.HostCall;
import androidx.car.app.IAppHost;
import androidx.car.app.IOnRequestPermissionsListener;
import androidx.car.app.SurfaceCallback;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements HostCall, ActivityResultCallback {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.car.app.HostCall
    public Object dispatch(Object obj) {
        return ((AppManager) this.a).lambda$setSurfaceCallback$0((SurfaceCallback) this.b, (IAppHost) obj);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ((CarAppPermissionActivity) this.a).lambda$requestPermissions$0((IOnRequestPermissionsListener) this.b, (Map) obj);
    }
}
