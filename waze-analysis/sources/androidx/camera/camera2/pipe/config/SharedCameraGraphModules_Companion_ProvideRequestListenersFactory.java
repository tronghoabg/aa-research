package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import c.b.c;
import c.b.e;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ProvideRequestListenersFactory implements c<List<Request.Listener>> {
    private final e<FrameDistributor> frameDistributorProvider;
    private final e<CameraGraph.Config> graphConfigProvider;
    private final e<Listener3A> listener3AProvider;

    private SharedCameraGraphModules_Companion_ProvideRequestListenersFactory(e<CameraGraph.Config> eVar, e<Listener3A> eVar2, e<FrameDistributor> eVar3) {
        this.graphConfigProvider = eVar;
        this.listener3AProvider = eVar2;
        this.frameDistributorProvider = eVar3;
    }

    public static SharedCameraGraphModules_Companion_ProvideRequestListenersFactory create(e<CameraGraph.Config> eVar, e<Listener3A> eVar2, e<FrameDistributor> eVar3) {
        return new SharedCameraGraphModules_Companion_ProvideRequestListenersFactory(eVar, eVar2, eVar3);
    }

    public static List<Request.Listener> provideRequestListeners(CameraGraph.Config config, Listener3A listener3A, FrameDistributor frameDistributor) {
        return SharedCameraGraphModules.Companion.provideRequestListeners(config, listener3A, frameDistributor);
    }

    @Override // g.a.a, f.a.a
    public List<Request.Listener> get() {
        return provideRequestListeners(this.graphConfigProvider.get(), this.listener3AProvider.get(), this.frameDistributorProvider.get());
    }
}
