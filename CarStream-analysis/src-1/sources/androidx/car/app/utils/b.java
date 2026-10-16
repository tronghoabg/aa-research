package androidx.car.app.utils;

import androidx.car.app.utils.RemoteUtils;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements RemoteUtils.HostCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ RemoteUtils.SurfaceCallbackStub b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ b(RemoteUtils.SurfaceCallbackStub surfaceCallbackStub, float f, float f2, int i) {
        this.a = i;
        this.b = surfaceCallbackStub;
        this.c = f;
        this.d = f2;
    }

    @Override // androidx.car.app.utils.RemoteUtils.HostCall
    public final Object dispatch() {
        switch (this.a) {
            case 0:
                return this.b.lambda$onClick$7(this.c, this.d);
            case 1:
                return this.b.lambda$onScroll$4(this.c, this.d);
            default:
                return this.b.lambda$onFling$5(this.c, this.d);
        }
    }
}
