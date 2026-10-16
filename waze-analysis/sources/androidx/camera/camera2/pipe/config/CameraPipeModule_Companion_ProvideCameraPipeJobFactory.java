package androidx.camera.camera2.pipe.config;

import c.b.c;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraPipeJobFactory implements c<br> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final CameraPipeModule_Companion_ProvideCameraPipeJobFactory INSTANCE = new CameraPipeModule_Companion_ProvideCameraPipeJobFactory();

        private InstanceHolder() {
        }
    }

    public static CameraPipeModule_Companion_ProvideCameraPipeJobFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static br provideCameraPipeJob() {
        return CameraPipeModule.Companion.provideCameraPipeJob();
    }

    @Override // g.a.a, f.a.a
    public br get() {
        return provideCameraPipeJob();
    }
}
