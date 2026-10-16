package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.GraphListener;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideGraphListenerFactory implements c<GraphListener> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideGraphListenerFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideGraphListenerFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideGraphListenerFactory(camera2ControllerConfig);
    }

    public static GraphListener provideGraphListener(Camera2ControllerConfig camera2ControllerConfig) {
        GraphListener graphListenerProvideGraphListener = camera2ControllerConfig.provideGraphListener();
        r.g(graphListenerProvideGraphListener);
        return graphListenerProvideGraphListener;
    }

    @Override // g.a.a, f.a.a
    public GraphListener get() {
        return provideGraphListener(this.module);
    }
}
