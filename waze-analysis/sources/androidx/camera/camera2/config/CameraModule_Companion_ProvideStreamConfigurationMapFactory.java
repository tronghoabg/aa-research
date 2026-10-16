package androidx.camera.camera2.config;

import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideStreamConfigurationMapFactory implements c<StreamConfigurationMap> {
    private final e<CameraMetadata> cameraMetadataProvider;

    private CameraModule_Companion_ProvideStreamConfigurationMapFactory(e<CameraMetadata> eVar) {
        this.cameraMetadataProvider = eVar;
    }

    public static CameraModule_Companion_ProvideStreamConfigurationMapFactory create(e<CameraMetadata> eVar) {
        return new CameraModule_Companion_ProvideStreamConfigurationMapFactory(eVar);
    }

    public static StreamConfigurationMap provideStreamConfigurationMap(CameraMetadata cameraMetadata) {
        return CameraModule.Companion.provideStreamConfigurationMap(cameraMetadata);
    }

    @Override // g.a.a, f.a.a
    public StreamConfigurationMap get() {
        return provideStreamConfigurationMap(this.cameraMetadataProvider.get());
    }
}
