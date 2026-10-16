package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.config.Camera2ControllerScope;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureSessionsModule {
    public static final Camera2CaptureSessionsModule INSTANCE = new Camera2CaptureSessionsModule();

    private Camera2CaptureSessionsModule() {
    }

    @Camera2ControllerScope
    public final CaptureSessionFactory provideSessionFactory(g.a.a<AndroidMSessionFactory> aVar, g.a.a<AndroidMHighSpeedSessionFactory> aVar2, g.a.a<AndroidNSessionFactory> aVar3, g.a.a<AndroidPSessionFactory> aVar4, g.a.a<AndroidExtensionSessionFactory> aVar5, CameraGraph.Config config) {
        x.f(aVar, "androidMProvider");
        x.f(aVar2, "androidMHighSpeedProvider");
        x.f(aVar3, "androidNProvider");
        x.f(aVar4, "androidPProvider");
        x.f(aVar5, "androidExtensionProvider");
        x.f(config, "graphConfig");
        if (!CameraGraph.OperatingMode.m530equalsimpl0(config.m509getSessionMode2uNL3no(), CameraGraph.OperatingMode.Companion.m535getEXTENSION2uNL3no())) {
            AndroidPSessionFactory androidPSessionFactory = aVar4.get();
            x.e(androidPSessionFactory, "get(...)");
            return androidPSessionFactory;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Cannot use Extension sessions below Android S");
        }
        AndroidExtensionSessionFactory androidExtensionSessionFactory = aVar5.get();
        x.e(androidExtensionSessionFactory, "get(...)");
        return androidExtensionSessionFactory;
    }
}
