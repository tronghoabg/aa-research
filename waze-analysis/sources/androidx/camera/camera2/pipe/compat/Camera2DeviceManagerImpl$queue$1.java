package androidx.camera.camera2.pipe.compat;

import h.g.a.p;
import h.g.b.u;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class Camera2DeviceManagerImpl$queue$1 extends u implements p<List<CameraRequest>, CameraRequest, Boolean> {
    Camera2DeviceManagerImpl$queue$1(Object obj) {
        super(2, obj, Camera2DeviceManagerImpl.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;Landroidx/camera/camera2/pipe/compat/CameraRequest;)Z", 0);
    }

    @Override // h.g.a.p
    public final Boolean invoke(List<CameraRequest> list, CameraRequest cameraRequest) {
        x.f(list, "p0");
        return Boolean.valueOf(((Camera2DeviceManagerImpl) this.receiver).prune$camera_camera2_pipe(list, cameraRequest));
    }
}
