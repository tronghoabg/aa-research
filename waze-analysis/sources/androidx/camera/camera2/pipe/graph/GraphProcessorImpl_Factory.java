package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphProcessorImpl_Factory implements c<GraphProcessorImpl> {
    private final e<Camera2Quirks> camera2QuirksProvider;
    private final e<CameraGraph.Config> cameraGraphConfigProvider;
    private final e<CameraGraphId> cameraGraphIdProvider;
    private final e<Listener3A> graphListener3AProvider;
    private final e<List<Request.Listener>> graphListenersProvider;
    private final e<Threads> threadsProvider;

    private GraphProcessorImpl_Factory(e<Threads> eVar, e<CameraGraphId> eVar2, e<CameraGraph.Config> eVar3, e<Listener3A> eVar4, e<List<Request.Listener>> eVar5, e<Camera2Quirks> eVar6) {
        this.threadsProvider = eVar;
        this.cameraGraphIdProvider = eVar2;
        this.cameraGraphConfigProvider = eVar3;
        this.graphListener3AProvider = eVar4;
        this.graphListenersProvider = eVar5;
        this.camera2QuirksProvider = eVar6;
    }

    public static GraphProcessorImpl_Factory create(e<Threads> eVar, e<CameraGraphId> eVar2, e<CameraGraph.Config> eVar3, e<Listener3A> eVar4, e<List<Request.Listener>> eVar5, e<Camera2Quirks> eVar6) {
        return new GraphProcessorImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static GraphProcessorImpl newInstance(Threads threads, CameraGraphId cameraGraphId, CameraGraph.Config config, Listener3A listener3A, List<Request.Listener> list, Camera2Quirks camera2Quirks) {
        return new GraphProcessorImpl(threads, cameraGraphId, config, listener3A, list, camera2Quirks);
    }

    @Override // g.a.a, f.a.a
    public GraphProcessorImpl get() {
        return newInstance(this.threadsProvider.get(), this.cameraGraphIdProvider.get(), this.cameraGraphConfigProvider.get(), this.graphListener3AProvider.get(), this.graphListenersProvider.get(), this.camera2QuirksProvider.get());
    }
}
