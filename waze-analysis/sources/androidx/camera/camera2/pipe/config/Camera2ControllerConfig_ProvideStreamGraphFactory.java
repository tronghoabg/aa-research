package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerConfig_ProvideStreamGraphFactory implements c<StreamGraphImpl> {
    private final Camera2ControllerConfig module;

    private Camera2ControllerConfig_ProvideStreamGraphFactory(Camera2ControllerConfig camera2ControllerConfig) {
        this.module = camera2ControllerConfig;
    }

    public static Camera2ControllerConfig_ProvideStreamGraphFactory create(Camera2ControllerConfig camera2ControllerConfig) {
        return new Camera2ControllerConfig_ProvideStreamGraphFactory(camera2ControllerConfig);
    }

    public static StreamGraphImpl provideStreamGraph(Camera2ControllerConfig camera2ControllerConfig) {
        StreamGraphImpl streamGraphImplProvideStreamGraph = camera2ControllerConfig.provideStreamGraph();
        r.g(streamGraphImplProvideStreamGraph);
        return streamGraphImplProvideStreamGraph;
    }

    @Override // g.a.a, f.a.a
    public StreamGraphImpl get() {
        return provideStreamGraph(this.module);
    }
}
