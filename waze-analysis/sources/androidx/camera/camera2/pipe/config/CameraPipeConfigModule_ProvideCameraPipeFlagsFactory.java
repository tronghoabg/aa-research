package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeConfigModule_ProvideCameraPipeFlagsFactory implements c<CameraPipe.Flags> {
    private final CameraPipeConfigModule module;

    private CameraPipeConfigModule_ProvideCameraPipeFlagsFactory(CameraPipeConfigModule cameraPipeConfigModule) {
        this.module = cameraPipeConfigModule;
    }

    public static CameraPipeConfigModule_ProvideCameraPipeFlagsFactory create(CameraPipeConfigModule cameraPipeConfigModule) {
        return new CameraPipeConfigModule_ProvideCameraPipeFlagsFactory(cameraPipeConfigModule);
    }

    public static CameraPipe.Flags provideCameraPipeFlags(CameraPipeConfigModule cameraPipeConfigModule) {
        CameraPipe.Flags flagsProvideCameraPipeFlags = cameraPipeConfigModule.provideCameraPipeFlags();
        r.g(flagsProvideCameraPipeFlags);
        return flagsProvideCameraPipeFlags;
    }

    @Override // g.a.a, f.a.a
    public CameraPipe.Flags get() {
        return provideCameraPipeFlags(this.module);
    }
}
