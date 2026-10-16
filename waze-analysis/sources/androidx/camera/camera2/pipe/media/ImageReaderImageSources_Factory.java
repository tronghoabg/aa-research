package androidx.camera.camera2.pipe.media;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.core.Threads;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageReaderImageSources_Factory implements c<ImageReaderImageSources> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<CameraPipe.Config> cameraPipeConfigProvider;
    private final e<MemoryEstimator> memoryEstimatorProvider;
    private final e<Threads> threadsProvider;

    private ImageReaderImageSources_Factory(e<Threads> eVar, e<CameraPipe.Config> eVar2, e<CameraMetadata> eVar3, e<MemoryEstimator> eVar4) {
        this.threadsProvider = eVar;
        this.cameraPipeConfigProvider = eVar2;
        this.cameraMetadataProvider = eVar3;
        this.memoryEstimatorProvider = eVar4;
    }

    public static ImageReaderImageSources_Factory create(e<Threads> eVar, e<CameraPipe.Config> eVar2, e<CameraMetadata> eVar3, e<MemoryEstimator> eVar4) {
        return new ImageReaderImageSources_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static ImageReaderImageSources newInstance(Threads threads, CameraPipe.Config config, CameraMetadata cameraMetadata, MemoryEstimator memoryEstimator) {
        return new ImageReaderImageSources(threads, config, cameraMetadata, memoryEstimator);
    }

    @Override // g.a.a, f.a.a
    public ImageReaderImageSources get() {
        return newInstance(this.threadsProvider.get(), this.cameraPipeConfigProvider.get(), this.cameraMetadataProvider.get(), this.memoryEstimatorProvider.get());
    }
}
