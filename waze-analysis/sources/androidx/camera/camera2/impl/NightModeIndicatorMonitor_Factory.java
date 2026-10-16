package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NightModeIndicatorMonitor_Factory implements c<NightModeIndicatorMonitor> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<ComboRequestListener> requestListenerProvider;

    private NightModeIndicatorMonitor_Factory(e<CameraMetadata> eVar, e<ComboRequestListener> eVar2) {
        this.cameraMetadataProvider = eVar;
        this.requestListenerProvider = eVar2;
    }

    public static NightModeIndicatorMonitor_Factory create(e<CameraMetadata> eVar, e<ComboRequestListener> eVar2) {
        return new NightModeIndicatorMonitor_Factory(eVar, eVar2);
    }

    public static NightModeIndicatorMonitor newInstance(CameraMetadata cameraMetadata, ComboRequestListener comboRequestListener) {
        return new NightModeIndicatorMonitor(cameraMetadata, comboRequestListener);
    }

    @Override // g.a.a, f.a.a
    public NightModeIndicatorMonitor get() {
        return newInstance(this.cameraMetadataProvider.get(), this.requestListenerProvider.get());
    }
}
