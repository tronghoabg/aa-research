package androidx.camera.camera2.compat;

import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.impl.CameraProperties;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory implements c<ZoomCompat> {
    private final e<CameraProperties> cameraPropertiesProvider;

    private ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory(e<CameraProperties> eVar) {
        this.cameraPropertiesProvider = eVar;
    }

    public static ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory create(e<CameraProperties> eVar) {
        return new ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory(eVar);
    }

    public static ZoomCompat provideZoomCompat(CameraProperties cameraProperties) {
        return ZoomCompat.Bindings.Companion.provideZoomCompat(cameraProperties);
    }

    @Override // g.a.a, f.a.a
    public ZoomCompat get() {
        return provideZoomCompat(this.cameraPropertiesProvider.get());
    }
}
