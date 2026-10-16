package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.CameraBackends;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraDevicesImpl_Factory implements c<CameraDevicesImpl> {
    private final e<CameraBackends> cameraBackendsProvider;

    private CameraDevicesImpl_Factory(e<CameraBackends> eVar) {
        this.cameraBackendsProvider = eVar;
    }

    public static CameraDevicesImpl_Factory create(e<CameraBackends> eVar) {
        return new CameraDevicesImpl_Factory(eVar);
    }

    public static CameraDevicesImpl newInstance(CameraBackends cameraBackends) {
        return new CameraDevicesImpl(cameraBackends);
    }

    @Override // g.a.a, f.a.a
    public CameraDevicesImpl get() {
        return newInstance(this.cameraBackendsProvider.get());
    }
}
