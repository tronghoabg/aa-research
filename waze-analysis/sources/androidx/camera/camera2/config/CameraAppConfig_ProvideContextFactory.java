package androidx.camera.camera2.config;

import android.content.Context;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideContextFactory implements c<Context> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideContextFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideContextFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideContextFactory(cameraAppConfig);
    }

    public static Context provideContext(CameraAppConfig cameraAppConfig) {
        Context contextProvideContext = cameraAppConfig.provideContext();
        r.g(contextProvideContext);
        return contextProvideContext;
    }

    @Override // g.a.a, f.a.a
    public Context get() {
        return provideContext(this.module);
    }
}
