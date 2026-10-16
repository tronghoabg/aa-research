package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class VirtualCameraState$connect$2$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ k<CameraState> $state;
    int label;
    final /* synthetic */ VirtualCameraState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    VirtualCameraState$connect$2$1(k<? extends CameraState> kVar, VirtualCameraState virtualCameraState, h.c.e<? super VirtualCameraState$connect$2$1> eVar) {
        super(2, eVar);
        this.$state = kVar;
        this.this$0 = virtualCameraState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new VirtualCameraState$connect$2$1(this.$state, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((VirtualCameraState$connect$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            k<CameraState> kVar = this.$state;
            final VirtualCameraState virtualCameraState = this.this$0;
            this.label = 1;
            if (kVar.collect(new l() { // from class: androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1.1
                public final Object emit(CameraState cameraState, h.c.e<? super ab> eVar) {
                    VirtualCameraState virtualCameraState2 = virtualCameraState;
                    synchronized (virtualCameraState2.lock) {
                        if (cameraState instanceof CameraStateOpen) {
                            CameraDeviceWrapper cameraDevice = ((CameraStateOpen) cameraState).getCameraDevice();
                            x.d(cameraDevice, "null cannot be cast to non-null type androidx.camera.camera2.pipe.compat.AndroidCameraDevice");
                            VirtualAndroidCameraDevice virtualAndroidCameraDevice = new VirtualAndroidCameraDevice((AndroidCameraDevice) cameraDevice);
                            virtualCameraState2.currentVirtualAndroidCamera = virtualAndroidCameraDevice;
                            virtualCameraState2.emitState(new CameraStateOpen(virtualAndroidCameraDevice));
                        } else {
                            virtualCameraState2.emitState(cameraState);
                        }
                    }
                    return ab.f48028a;
                }

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ Object emit(Object obj2, h.c.e eVar) {
                    return emit((CameraState) obj2, (h.c.e<? super ab>) eVar);
                }
            }, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
        }
        return ab.f48028a;
    }
}
