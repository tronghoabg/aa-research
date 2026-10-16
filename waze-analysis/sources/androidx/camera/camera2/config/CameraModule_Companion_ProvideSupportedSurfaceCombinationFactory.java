package androidx.camera.camera2.config;

import android.content.Context;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.core.impl.EncoderProfilesProvider;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideSupportedSurfaceCombinationFactory implements c<SupportedSurfaceCombination> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<Context> contextProvider;
    private final e<EncoderProfilesProvider> encoderProfilesProvider;
    private final e<ExtraSupportedSurfaceCombinationsContainer> extraSupportedSurfaceCombinationsContainerProvider;

    private CameraModule_Companion_ProvideSupportedSurfaceCombinationFactory(e<Context> eVar, e<CameraProperties> eVar2, e<EncoderProfilesProvider> eVar3, e<ExtraSupportedSurfaceCombinationsContainer> eVar4) {
        this.contextProvider = eVar;
        this.cameraPropertiesProvider = eVar2;
        this.encoderProfilesProvider = eVar3;
        this.extraSupportedSurfaceCombinationsContainerProvider = eVar4;
    }

    public static CameraModule_Companion_ProvideSupportedSurfaceCombinationFactory create(e<Context> eVar, e<CameraProperties> eVar2, e<EncoderProfilesProvider> eVar3, e<ExtraSupportedSurfaceCombinationsContainer> eVar4) {
        return new CameraModule_Companion_ProvideSupportedSurfaceCombinationFactory(eVar, eVar2, eVar3, eVar4);
    }

    public static SupportedSurfaceCombination provideSupportedSurfaceCombination(Context context, CameraProperties cameraProperties, EncoderProfilesProvider encoderProfilesProvider, ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer) {
        return CameraModule.Companion.provideSupportedSurfaceCombination(context, cameraProperties, encoderProfilesProvider, extraSupportedSurfaceCombinationsContainer);
    }

    @Override // g.a.a, f.a.a
    public SupportedSurfaceCombination get() {
        return provideSupportedSurfaceCombination(this.contextProvider.get(), this.cameraPropertiesProvider.get(), this.encoderProfilesProvider.get(), this.extraSupportedSurfaceCombinationsContainerProvider.get());
    }
}
