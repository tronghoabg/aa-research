package androidx.camera.camera2.pipe.compat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 extends h.c.b.a.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2CameraAvailabilityMonitor$startMonitoring$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1(Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, h.c.e<? super Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1> eVar) {
        super(eVar);
        this.this$0 = camera2CameraAvailabilityMonitor$startMonitoring$2;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1007awaitAvailableCameraKLykuaI(0L, null, this);
    }
}
