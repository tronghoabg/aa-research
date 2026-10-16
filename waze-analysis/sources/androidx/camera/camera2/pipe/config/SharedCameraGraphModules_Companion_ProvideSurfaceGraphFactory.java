package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory implements c<SurfaceGraph> {
    private final e<CameraController> cameraControllerProvider;
    private final e<CameraSurfaceManager> cameraSurfaceManagerProvider;
    private final e<StreamGraphImpl> streamGraphImplProvider;

    private SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory(e<StreamGraphImpl> eVar, e<CameraController> eVar2, e<CameraSurfaceManager> eVar3) {
        this.streamGraphImplProvider = eVar;
        this.cameraControllerProvider = eVar2;
        this.cameraSurfaceManagerProvider = eVar3;
    }

    public static SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory create(e<StreamGraphImpl> eVar, e<CameraController> eVar2, e<CameraSurfaceManager> eVar3) {
        return new SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory(eVar, eVar2, eVar3);
    }

    public static SurfaceGraph provideSurfaceGraph(StreamGraphImpl streamGraphImpl, a<CameraController> aVar, CameraSurfaceManager cameraSurfaceManager) {
        return SharedCameraGraphModules.Companion.provideSurfaceGraph(streamGraphImpl, aVar, cameraSurfaceManager);
    }

    @Override // g.a.a, f.a.a
    public SurfaceGraph get() {
        return provideSurfaceGraph(this.streamGraphImplProvider.get(), this.cameraControllerProvider, this.cameraSurfaceManagerProvider.get());
    }
}
