package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StandardCamera2CaptureSequenceProcessorFactory_Factory implements c.b.c<StandardCamera2CaptureSequenceProcessorFactory> {
    private final c.b.e<CameraGraph.Config> graphConfigProvider;
    private final c.b.e<Camera2Quirks> quirksProvider;
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<StrictMode> strictModeProvider;
    private final c.b.e<Threads> threadsProvider;

    private StandardCamera2CaptureSequenceProcessorFactory_Factory(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3, c.b.e<Camera2Quirks> eVar4, c.b.e<StrictMode> eVar5) {
        this.threadsProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.streamGraphProvider = eVar3;
        this.quirksProvider = eVar4;
        this.strictModeProvider = eVar5;
    }

    public static StandardCamera2CaptureSequenceProcessorFactory_Factory create(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3, c.b.e<Camera2Quirks> eVar4, c.b.e<StrictMode> eVar5) {
        return new StandardCamera2CaptureSequenceProcessorFactory_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static StandardCamera2CaptureSequenceProcessorFactory newInstance(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl, Camera2Quirks camera2Quirks, StrictMode strictMode) {
        return new StandardCamera2CaptureSequenceProcessorFactory(threads, config, streamGraphImpl, camera2Quirks, strictMode);
    }

    @Override // g.a.a, f.a.a
    public StandardCamera2CaptureSequenceProcessorFactory get() {
        return newInstance(this.threadsProvider.get(), this.graphConfigProvider.get(), this.streamGraphProvider.get(), this.quirksProvider.get(), this.strictModeProvider.get());
    }
}
