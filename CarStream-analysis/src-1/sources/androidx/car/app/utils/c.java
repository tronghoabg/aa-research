package androidx.car.app.utils;

import android.graphics.Rect;
import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils.SurfaceCallbackStub b;
    public final /* synthetic */ Rect c;

    public /* synthetic */ c(RemoteUtils.SurfaceCallbackStub surfaceCallbackStub, Rect rect, int i) {
        this.a = i;
        this.b = surfaceCallbackStub;
        this.c = rect;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return this.b.lambda$onVisibleAreaChanged$1(this.c);
            default:
                return this.b.lambda$onStableAreaChanged$2(this.c);
        }
    }
}
