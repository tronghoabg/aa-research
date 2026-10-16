package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2DeviceManagerImpl$openCameraWithRetry$1 extends h.c.b.a.c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2DeviceManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2DeviceManagerImpl$openCameraWithRetry$1(Camera2DeviceManagerImpl camera2DeviceManagerImpl, h.c.e<? super Camera2DeviceManagerImpl$openCameraWithRetry$1> eVar) {
        super(eVar);
        this.this$0 = camera2DeviceManagerImpl;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m1028openCameraWithRetryQ2LEGo4(null, null, null, null, null, this);
    }
}
