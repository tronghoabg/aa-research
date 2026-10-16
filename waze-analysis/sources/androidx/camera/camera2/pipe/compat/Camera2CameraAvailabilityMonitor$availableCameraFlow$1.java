package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraId;
import h.ab;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.a.ad;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class Camera2CameraAvailabilityMonitor$availableCameraFlow$1 extends h.c.b.a.g implements p<ad<? super CameraId>, h.c.e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Camera2CameraAvailabilityMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2CameraAvailabilityMonitor$availableCameraFlow$1(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, h.c.e<? super Camera2CameraAvailabilityMonitor$availableCameraFlow$1> eVar) {
        super(2, eVar);
        this.this$0 = camera2CameraAvailabilityMonitor;
    }

    static final ab invokeSuspend$lambda$0(CameraManager cameraManager, Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1) {
        cameraManager.unregisterAvailabilityCallback(camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1);
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        Camera2CameraAvailabilityMonitor$availableCameraFlow$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1 = new Camera2CameraAvailabilityMonitor$availableCameraFlow$1(this.this$0, eVar);
        camera2CameraAvailabilityMonitor$availableCameraFlow$1.L$0 = obj;
        return camera2CameraAvailabilityMonitor$availableCameraFlow$1;
    }

    @Override // h.g.a.p
    public final Object invoke(ad<? super CameraId> adVar, h.c.e<? super ab> eVar) {
        return ((Camera2CameraAvailabilityMonitor$availableCameraFlow$1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            final ad adVar = (ad) this.L$0;
            final ?? r1 = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1
                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public void onCameraAvailable(String str) {
                    x.f(str, "cameraIdString");
                    ad<CameraId> adVar2 = adVar;
                    CameraId.m547constructorimpl(str);
                    kotlinx.coroutines.a.ab.e(adVar2, CameraId.m546boximpl(str));
                }
            };
            final CameraManager cameraManager = (CameraManager) this.this$0.cameraManager.get();
            x.c(cameraManager);
            Api28Compat.registerAvailabilityCallback(cameraManager, this.this$0.threads.getCamera2Executor(), (CameraManager.AvailabilityCallback) r1);
            this.label = 1;
            if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return Camera2CameraAvailabilityMonitor$availableCameraFlow$1.invokeSuspend$lambda$0(cameraManager, r1);
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
