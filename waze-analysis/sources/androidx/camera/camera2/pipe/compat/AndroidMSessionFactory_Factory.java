package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidMSessionFactory_Factory implements c.b.c<AndroidMSessionFactory> {
    private final c.b.e<CameraGraph.Config> graphConfigProvider;
    private final c.b.e<StreamGraphImpl> streamGraphProvider;
    private final c.b.e<Threads> threadsProvider;

    private AndroidMSessionFactory_Factory(c.b.e<Threads> eVar, c.b.e<StreamGraphImpl> eVar2, c.b.e<CameraGraph.Config> eVar3) {
        this.threadsProvider = eVar;
        this.streamGraphProvider = eVar2;
        this.graphConfigProvider = eVar3;
    }

    public static AndroidMSessionFactory_Factory create(c.b.e<Threads> eVar, c.b.e<StreamGraphImpl> eVar2, c.b.e<CameraGraph.Config> eVar3) {
        return new AndroidMSessionFactory_Factory(eVar, eVar2, eVar3);
    }

    public static AndroidMSessionFactory newInstance(Threads threads, StreamGraphImpl streamGraphImpl, CameraGraph.Config config) {
        return new AndroidMSessionFactory(threads, streamGraphImpl, config);
    }

    @Override // g.a.a, f.a.a
    public AndroidMSessionFactory get() {
        return newInstance(this.threadsProvider.get(), this.streamGraphProvider.get(), this.graphConfigProvider.get());
    }
}
