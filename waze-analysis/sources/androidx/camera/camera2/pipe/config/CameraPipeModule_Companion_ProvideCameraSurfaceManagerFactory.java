package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraSurfaceManager;
import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory implements c<CameraSurfaceManager> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory INSTANCE = new CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory();

        private InstanceHolder() {
        }
    }

    public static CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CameraSurfaceManager provideCameraSurfaceManager() {
        return CameraPipeModule.Companion.provideCameraSurfaceManager();
    }

    @Override // g.a.a, f.a.a
    public CameraSurfaceManager get() {
        return provideCameraSurfaceManager();
    }
}
