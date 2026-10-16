package androidx.camera.camera2.config;

import android.content.Context;
import androidx.camera.camera2.impl.DisplayInfoManager;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideDisplayInfoManagerFactory implements c<DisplayInfoManager> {
    private final e<Context> contextProvider;
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideDisplayInfoManagerFactory(CameraAppConfig cameraAppConfig, e<Context> eVar) {
        this.module = cameraAppConfig;
        this.contextProvider = eVar;
    }

    public static CameraAppConfig_ProvideDisplayInfoManagerFactory create(CameraAppConfig cameraAppConfig, e<Context> eVar) {
        return new CameraAppConfig_ProvideDisplayInfoManagerFactory(cameraAppConfig, eVar);
    }

    public static DisplayInfoManager provideDisplayInfoManager(CameraAppConfig cameraAppConfig, Context context) {
        return cameraAppConfig.provideDisplayInfoManager(context);
    }

    @Override // g.a.a, f.a.a
    public DisplayInfoManager get() {
        return provideDisplayInfoManager(this.module, this.contextProvider.get());
    }
}
