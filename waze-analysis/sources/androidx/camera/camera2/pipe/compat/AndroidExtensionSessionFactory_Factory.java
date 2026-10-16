package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidExtensionSessionFactory_Factory implements c.b.c<AndroidExtensionSessionFactory> {
    private final c.b.e<Camera2MetadataProvider> camera2MetadataProvider;
    private final c.b.e<CameraGraph.Config> graphConfigProvider;
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<StrictMode> strictModeProvider;
    private final c.b.e<Threads> threadsProvider;

    private AndroidExtensionSessionFactory_Factory(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3, c.b.e<Camera2MetadataProvider> eVar4, c.b.e<StrictMode> eVar5) {
        this.threadsProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.streamGraphProvider = eVar3;
        this.camera2MetadataProvider = eVar4;
        this.strictModeProvider = eVar5;
    }

    public static AndroidExtensionSessionFactory_Factory create(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3, c.b.e<Camera2MetadataProvider> eVar4, c.b.e<StrictMode> eVar5) {
        return new AndroidExtensionSessionFactory_Factory(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static AndroidExtensionSessionFactory newInstance(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl, Camera2MetadataProvider camera2MetadataProvider, StrictMode strictMode) {
        return new AndroidExtensionSessionFactory(threads, config, streamGraphImpl, camera2MetadataProvider, strictMode);
    }

    @Override // g.a.a, f.a.a
    public AndroidExtensionSessionFactory get() {
        return newInstance(this.threadsProvider.get(), this.graphConfigProvider.get(), this.streamGraphProvider.get(), this.camera2MetadataProvider.get(), this.strictModeProvider.get());
    }
}
