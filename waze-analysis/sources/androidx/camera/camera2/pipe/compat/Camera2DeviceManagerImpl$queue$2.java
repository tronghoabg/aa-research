package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.q;
import h.g.b.u;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class Camera2DeviceManagerImpl$queue$2 extends u implements q<CameraRequest, am<? extends ab>, h.c.e<? super ab>, Object> {
    Camera2DeviceManagerImpl$queue$2(Object obj) {
        super(3, obj, Camera2DeviceManagerImpl.class, "process", "process(Landroidx/camera/camera2/pipe/compat/CameraRequest;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // h.g.a.q
    public /* bridge */ /* synthetic */ Object invoke(CameraRequest cameraRequest, am<? extends ab> amVar, h.c.e<? super ab> eVar) {
        return invoke2(cameraRequest, (am<ab>) amVar, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CameraRequest cameraRequest, am<ab> amVar, h.c.e<? super ab> eVar) {
        return ((Camera2DeviceManagerImpl) this.receiver).process(cameraRequest, amVar, eVar);
    }
}
