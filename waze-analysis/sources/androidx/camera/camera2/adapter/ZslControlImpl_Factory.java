package androidx.camera.camera2.adapter;

import androidx.camera.camera2.impl.CameraProperties;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZslControlImpl_Factory implements c<ZslControlImpl> {
    private final e<CameraProperties> cameraPropertiesProvider;

    private ZslControlImpl_Factory(e<CameraProperties> eVar) {
        this.cameraPropertiesProvider = eVar;
    }

    public static ZslControlImpl_Factory create(e<CameraProperties> eVar) {
        return new ZslControlImpl_Factory(eVar);
    }

    public static ZslControlImpl newInstance(CameraProperties cameraProperties) {
        return new ZslControlImpl(cameraProperties);
    }

    @Override // g.a.a, f.a.a
    public ZslControlImpl get() {
        return newInstance(this.cameraPropertiesProvider.get());
    }
}
