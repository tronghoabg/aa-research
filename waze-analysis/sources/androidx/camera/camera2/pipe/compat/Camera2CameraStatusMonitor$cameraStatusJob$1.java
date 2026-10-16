package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraStatusMonitor$cameraStatusJob$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    int label;
    final /* synthetic */ Camera2CameraStatusMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraStatusMonitor$cameraStatusJob$1(Camera2CameraStatusMonitor camera2CameraStatusMonitor, h.c.e<? super Camera2CameraStatusMonitor$cameraStatusJob$1> eVar) {
        super(2, eVar);
        this.this$0 = camera2CameraStatusMonitor;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new Camera2CameraStatusMonitor$cameraStatusJob$1(this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((Camera2CameraStatusMonitor$cameraStatusJob$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            final Camera2CameraStatusMonitor camera2CameraStatusMonitor = this.this$0;
            this.label = 1;
            if (camera2CameraStatusMonitor.cameraStatus.collect(new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1.1
                public final Object emit(CameraStatusMonitor.CameraStatus cameraStatus, h.c.e<? super ab> eVar) {
                    if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) {
                        Object objEmit = camera2CameraStatusMonitor._cameraAvailability.emit(cameraStatus, eVar);
                        if (objEmit == h.c.a.a.f48038a) {
                            return objEmit;
                        }
                    } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable) {
                        Object objEmit2 = camera2CameraStatusMonitor._cameraAvailability.emit(cameraStatus, eVar);
                        if (objEmit2 == h.c.a.a.f48038a) {
                            return objEmit2;
                        }
                    } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged) {
                        bm bmVar = camera2CameraStatusMonitor._cameraPriorities;
                        ab abVar = ab.f48028a;
                        Object objEmit3 = bmVar.emit(abVar, eVar);
                        return objEmit3 == h.c.a.a.f48038a ? objEmit3 : abVar;
                    }
                    return ab.f48028a;
                }

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ Object emit(Object obj2, h.c.e eVar) {
                    return emit((CameraStatusMonitor.CameraStatus) obj2, (h.c.e<? super ab>) eVar);
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
