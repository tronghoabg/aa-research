package androidx.camera.camera2.compat.quirk;

import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraQuirks_Factory implements c<CameraQuirks> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<StreamConfigurationMapCompat> streamConfigurationMapCompatProvider;

    private CameraQuirks_Factory(e<CameraMetadata> eVar, e<StreamConfigurationMapCompat> eVar2) {
        this.cameraMetadataProvider = eVar;
        this.streamConfigurationMapCompatProvider = eVar2;
    }

    public static CameraQuirks_Factory create(e<CameraMetadata> eVar, e<StreamConfigurationMapCompat> eVar2) {
        return new CameraQuirks_Factory(eVar, eVar2);
    }

    public static CameraQuirks newInstance(CameraMetadata cameraMetadata, StreamConfigurationMapCompat streamConfigurationMapCompat) {
        return new CameraQuirks(cameraMetadata, streamConfigurationMapCompat);
    }

    @Override // g.a.a, f.a.a
    public CameraQuirks get() {
        return newInstance(this.cameraMetadataProvider.get(), this.streamConfigurationMapCompatProvider.get());
    }
}
