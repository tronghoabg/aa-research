package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureSessionsModule_ProvideSessionFactoryFactory implements c.b.c<CaptureSessionFactory> {
    private final c.b.e<AndroidExtensionSessionFactory> androidExtensionProvider;
    private final c.b.e<AndroidMHighSpeedSessionFactory> androidMHighSpeedProvider;
    private final c.b.e<AndroidMSessionFactory> androidMProvider;
    private final c.b.e<AndroidNSessionFactory> androidNProvider;
    private final c.b.e<AndroidPSessionFactory> androidPProvider;
    private final c.b.e<CameraGraph.Config> graphConfigProvider;

    private Camera2CaptureSessionsModule_ProvideSessionFactoryFactory(c.b.e<AndroidMSessionFactory> eVar, c.b.e<AndroidMHighSpeedSessionFactory> eVar2, c.b.e<AndroidNSessionFactory> eVar3, c.b.e<AndroidPSessionFactory> eVar4, c.b.e<AndroidExtensionSessionFactory> eVar5, c.b.e<CameraGraph.Config> eVar6) {
        this.androidMProvider = eVar;
        this.androidMHighSpeedProvider = eVar2;
        this.androidNProvider = eVar3;
        this.androidPProvider = eVar4;
        this.androidExtensionProvider = eVar5;
        this.graphConfigProvider = eVar6;
    }

    public static Camera2CaptureSessionsModule_ProvideSessionFactoryFactory create(c.b.e<AndroidMSessionFactory> eVar, c.b.e<AndroidMHighSpeedSessionFactory> eVar2, c.b.e<AndroidNSessionFactory> eVar3, c.b.e<AndroidPSessionFactory> eVar4, c.b.e<AndroidExtensionSessionFactory> eVar5, c.b.e<CameraGraph.Config> eVar6) {
        return new Camera2CaptureSessionsModule_ProvideSessionFactoryFactory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static CaptureSessionFactory provideSessionFactory(g.a.a<AndroidMSessionFactory> aVar, g.a.a<AndroidMHighSpeedSessionFactory> aVar2, g.a.a<AndroidNSessionFactory> aVar3, g.a.a<AndroidPSessionFactory> aVar4, g.a.a<AndroidExtensionSessionFactory> aVar5, CameraGraph.Config config) {
        CaptureSessionFactory captureSessionFactoryProvideSessionFactory = Camera2CaptureSessionsModule.INSTANCE.provideSessionFactory(aVar, aVar2, aVar3, aVar4, aVar5, config);
        r.g(captureSessionFactoryProvideSessionFactory);
        return captureSessionFactoryProvideSessionFactory;
    }

    @Override // g.a.a, f.a.a
    public CaptureSessionFactory get() {
        return provideSessionFactory(this.androidMProvider, this.androidMHighSpeedProvider, this.androidNProvider, this.androidPProvider, this.androidExtensionProvider, this.graphConfigProvider.get());
    }
}
