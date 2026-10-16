package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.media.ImageSources;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamGraphImpl_Factory implements c<StreamGraphImpl> {
    private final e<CameraController> cameraControllerProvider;
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<CameraGraph.Config> graphConfigProvider;
    private final e<ImageSources> imageSourcesProvider;

    private StreamGraphImpl_Factory(e<CameraMetadata> eVar, e<CameraGraph.Config> eVar2, e<ImageSources> eVar3, e<CameraController> eVar4) {
        this.cameraMetadataProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.imageSourcesProvider = eVar3;
        this.cameraControllerProvider = eVar4;
    }

    public static StreamGraphImpl_Factory create(e<CameraMetadata> eVar, e<CameraGraph.Config> eVar2, e<ImageSources> eVar3, e<CameraController> eVar4) {
        return new StreamGraphImpl_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static StreamGraphImpl newInstance(CameraMetadata cameraMetadata, CameraGraph.Config config, ImageSources imageSources, g.a.a<CameraController> aVar) {
        return new StreamGraphImpl(cameraMetadata, config, imageSources, aVar);
    }

    @Override // g.a.a, f.a.a
    public StreamGraphImpl get() {
        return newInstance(this.cameraMetadataProvider.get(), this.graphConfigProvider.get(), this.imageSourcesProvider.get(), this.cameraControllerProvider);
    }
}
