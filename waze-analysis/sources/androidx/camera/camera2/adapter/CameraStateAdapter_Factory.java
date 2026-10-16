package androidx.camera.camera2.adapter;

import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateAdapter_Factory implements c<CameraStateAdapter> {
    private final e<CameraSessionLifecycleAdapter> sessionLifecycleAdapterProvider;

    private CameraStateAdapter_Factory(e<CameraSessionLifecycleAdapter> eVar) {
        this.sessionLifecycleAdapterProvider = eVar;
    }

    public static CameraStateAdapter_Factory create(e<CameraSessionLifecycleAdapter> eVar) {
        return new CameraStateAdapter_Factory(eVar);
    }

    public static CameraStateAdapter newInstance(CameraSessionLifecycleAdapter cameraSessionLifecycleAdapter) {
        return new CameraStateAdapter(cameraSessionLifecycleAdapter);
    }

    @Override // g.a.a, f.a.a
    public CameraStateAdapter get() {
        return newInstance(this.sessionLifecycleAdapterProvider.get());
    }
}
