package androidx.camera.camera2.compat.quirk;

import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraQuirks {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CameraQuirks";
    private final CameraMetadata cameraMetadata;
    private final f quirks$delegate;
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;

    public CameraQuirks(CameraMetadata cameraMetadata, StreamConfigurationMapCompat streamConfigurationMapCompat) {
        x.f(streamConfigurationMapCompat, "streamConfigurationMapCompat");
        this.cameraMetadata = cameraMetadata;
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        this.quirks$delegate = g.a(new a() { // from class: androidx.camera.camera2.compat.quirk.CameraQuirks$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CameraQuirks.quirks_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final Quirks quirks_delegate$lambda$0(CameraQuirks cameraQuirks) {
        QuirkSettings quirkSettings = QuirkSettingsHolder.instance().get();
        x.e(quirkSettings, "get(...)");
        ArrayList arrayList = new ArrayList();
        CameraMetadata cameraMetadata = cameraQuirks.cameraMetadata;
        if (cameraMetadata == null) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled(Log.TAG)) {
                android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "Failed to enable quirks: camera metadata injection failed");
            }
            return new Quirks(arrayList);
        }
        if (quirkSettings.shouldEnableQuirk(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.Companion.isEnabled(cameraMetadata))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(cameraQuirks.cameraMetadata));
        }
        if (quirkSettings.shouldEnableQuirk(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        AspectRatioLegacyApi21Quirk.Companion.isEnabled(cameraQuirks.cameraMetadata);
        if (quirkSettings.shouldEnableQuirk(AspectRatioLegacyApi21Quirk.class, false)) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (quirkSettings.shouldEnableQuirk(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(cameraQuirks.streamConfigurationMapCompat));
        }
        if (quirkSettings.shouldEnableQuirk(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        CaptureSessionStuckQuirk.Companion.isEnabled();
        if (quirkSettings.shouldEnableQuirk(CaptureSessionStuckQuirk.class, false)) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        CloseCaptureSessionOnVideoQuirk.Companion.isEnabled();
        if (quirkSettings.shouldEnableQuirk(CloseCaptureSessionOnVideoQuirk.class, true)) {
            arrayList.add(new CloseCaptureSessionOnVideoQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        FinalizeSessionOnCloseQuirk.Companion.isEnabled();
        if (quirkSettings.shouldEnableQuirk(FinalizeSessionOnCloseQuirk.class, true)) {
            arrayList.add(new FinalizeSessionOnCloseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(FlashTooSlowQuirk.class, FlashTooSlowQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.Companion.isEnabled())) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.INSTANCE.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(JpegCaptureDownsizingQuirk.INSTANCE);
        }
        if (quirkSettings.shouldEnableQuirk(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        TextureViewIsClosedQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata);
        if (quirkSettings.shouldEnableQuirk(TextureViewIsClosedQuirk.class, false)) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(cameraQuirks.cameraMetadata));
        }
        if (quirkSettings.shouldEnableQuirk(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.Companion.isEnabled())) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.Companion.isEnabled())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.Companion.isEnabled())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.Companion.isEnabled())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(TemporalNoiseQuirk.class, TemporalNoiseQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.Companion.isEnabled())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.Companion.isEnabled())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(UltraWideFlashCaptureUnderexposureQuirk.class, UltraWideFlashCaptureUnderexposureQuirk.Companion.isEnabled(cameraQuirks.cameraMetadata))) {
            arrayList.add(new UltraWideFlashCaptureUnderexposureQuirk());
        }
        Quirks quirks = new Quirks(arrayList);
        Logger.d(TAG, "camera2 CameraQuirks = ".concat(Quirks.toString(quirks)));
        return quirks;
    }

    public final Quirks getQuirks() {
        return (Quirks) this.quirks$delegate.getValue();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
