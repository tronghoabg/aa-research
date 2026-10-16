package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory implements c<MeteringRegionCorrection> {
    private final e<CameraQuirks> cameraQuirksProvider;

    private MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory(e<CameraQuirks> eVar) {
        this.cameraQuirksProvider = eVar;
    }

    public static MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory create(e<CameraQuirks> eVar) {
        return new MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory(eVar);
    }

    public static MeteringRegionCorrection provideMeteringRegionCorrection(CameraQuirks cameraQuirks) {
        MeteringRegionCorrection meteringRegionCorrectionProvideMeteringRegionCorrection = MeteringRegionCorrection.Bindings.Companion.provideMeteringRegionCorrection(cameraQuirks);
        r.g(meteringRegionCorrectionProvideMeteringRegionCorrection);
        return meteringRegionCorrectionProvideMeteringRegionCorrection;
    }

    @Override // g.a.a, f.a.a
    public MeteringRegionCorrection get() {
        return provideMeteringRegionCorrection(this.cameraQuirksProvider.get());
    }
}
