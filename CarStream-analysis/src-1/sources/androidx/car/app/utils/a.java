package androidx.car.app.utils;

import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils.SurfaceCallbackStub b;
    public final /* synthetic */ Bundleable c;

    public /* synthetic */ a(RemoteUtils.SurfaceCallbackStub surfaceCallbackStub, Bundleable bundleable, int i) {
        this.a = i;
        this.b = surfaceCallbackStub;
        this.c = bundleable;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return this.b.lambda$onSurfaceDestroyed$3(this.c);
            default:
                return this.b.lambda$onSurfaceAvailable$0(this.c);
        }
    }
}
