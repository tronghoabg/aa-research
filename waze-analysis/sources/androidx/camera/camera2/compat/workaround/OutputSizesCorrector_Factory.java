package androidx.camera.camera2.compat.workaround;

import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OutputSizesCorrector_Factory implements c<OutputSizesCorrector> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<StreamConfigurationMap> streamConfigurationMapProvider;

    private OutputSizesCorrector_Factory(e<CameraMetadata> eVar, e<StreamConfigurationMap> eVar2) {
        this.cameraMetadataProvider = eVar;
        this.streamConfigurationMapProvider = eVar2;
    }

    public static OutputSizesCorrector_Factory create(e<CameraMetadata> eVar, e<StreamConfigurationMap> eVar2) {
        return new OutputSizesCorrector_Factory(eVar, eVar2);
    }

    public static OutputSizesCorrector newInstance(CameraMetadata cameraMetadata, StreamConfigurationMap streamConfigurationMap) {
        return new OutputSizesCorrector(cameraMetadata, streamConfigurationMap);
    }

    @Override // g.a.a, f.a.a
    public OutputSizesCorrector get() {
        return newInstance(this.cameraMetadataProvider.get(), this.streamConfigurationMapProvider.get());
    }
}
