package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidPSessionFactory_Factory implements c.b.c<AndroidPSessionFactory> {
    private final c.b.e<CameraGraph.Config> graphConfigProvider;
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<Threads> threadsProvider;

    private AndroidPSessionFactory_Factory(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3) {
        this.threadsProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.streamGraphProvider = eVar3;
    }

    public static AndroidPSessionFactory_Factory create(c.b.e<Threads> eVar, c.b.e<CameraGraph.Config> eVar2, c.b.e<StreamGraphImpl> eVar3) {
        return new AndroidPSessionFactory_Factory(eVar, eVar2, eVar3);
    }

    public static AndroidPSessionFactory newInstance(Threads threads, CameraGraph.Config config, StreamGraphImpl streamGraphImpl) {
        return new AndroidPSessionFactory(threads, config, streamGraphImpl);
    }

    @Override // g.a.a, f.a.a
    public AndroidPSessionFactory get() {
        return newInstance(this.threadsProvider.get(), this.graphConfigProvider.get(), this.streamGraphProvider.get());
    }
}
