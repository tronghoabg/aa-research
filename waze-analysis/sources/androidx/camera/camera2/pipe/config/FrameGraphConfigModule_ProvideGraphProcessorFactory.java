package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.graph.GraphProcessor;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphConfigModule_ProvideGraphProcessorFactory implements c<GraphProcessor> {
    private final FrameGraphConfigModule module;

    private FrameGraphConfigModule_ProvideGraphProcessorFactory(FrameGraphConfigModule frameGraphConfigModule) {
        this.module = frameGraphConfigModule;
    }

    public static FrameGraphConfigModule_ProvideGraphProcessorFactory create(FrameGraphConfigModule frameGraphConfigModule) {
        return new FrameGraphConfigModule_ProvideGraphProcessorFactory(frameGraphConfigModule);
    }

    public static GraphProcessor provideGraphProcessor(FrameGraphConfigModule frameGraphConfigModule) {
        GraphProcessor graphProcessorProvideGraphProcessor = frameGraphConfigModule.provideGraphProcessor();
        r.g(graphProcessorProvideGraphProcessor);
        return graphProcessorProvideGraphProcessor;
    }

    @Override // g.a.a, f.a.a
    public GraphProcessor get() {
        return provideGraphProcessor(this.module);
    }
}
