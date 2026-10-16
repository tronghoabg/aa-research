package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.core.impl.Quirks;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideCameraQuirksValuesFactory implements c<Quirks> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private CameraModule_Companion_ProvideCameraQuirksValuesFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static CameraModule_Companion_ProvideCameraQuirksValuesFactory create(e<CameraQuirks> eVar) {
        return new CameraModule_Companion_ProvideCameraQuirksValuesFactory(eVar);
    }

    public static Quirks provideCameraQuirksValues(CameraQuirks cameraQuirks) {
        Quirks quirksProvideCameraQuirksValues = CameraModule.Companion.provideCameraQuirksValues(cameraQuirks);
        r.g(quirksProvideCameraQuirksValues);
        return quirksProvideCameraQuirksValues;
    }

    @Override // g.a.a, f.a.a
    public Quirks get() {
        return provideCameraQuirksValues(this.cameraQuirksProvider.get());
    }
}
