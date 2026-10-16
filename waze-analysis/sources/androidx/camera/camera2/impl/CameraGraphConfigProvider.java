package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import androidx.camera.camera2.compat.workaround.CloseCameraOnCameraGraphClose;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.internal.DynamicRangeConversions;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ImageSourceConfig;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import h.a.c;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraGraphConfigProvider {
    private final CameraCallbackMap callbackMap;
    private final CameraConfig cameraConfig;
    private final CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository;
    private final CameraMetadata cameraMetadata;
    private final CameraQuirks cameraQuirks;
    private final CameraXConfig cameraXConfig;
    private final CloseCameraOnCameraGraphClose closeCameraOnCameraGraphClose;
    private final ComboRequestListener requestListener;
    private final DynamicRangeProfiles supportedDynamicRangeProfiles;
    private final TemplateParamsOverride templateParamsOverride;
    private final ZslControl zslControl;

    public CameraGraphConfigProvider(CameraCallbackMap cameraCallbackMap, ComboRequestListener comboRequestListener, CameraConfig cameraConfig, CameraQuirks cameraQuirks, ZslControl zslControl, TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        DynamicRangeProfilesCompat dynamicRangeProfilesCompatFromCameraMetaData;
        x.f(cameraCallbackMap, "callbackMap");
        x.f(comboRequestListener, "requestListener");
        x.f(cameraConfig, "cameraConfig");
        x.f(cameraQuirks, "cameraQuirks");
        x.f(zslControl, "zslControl");
        x.f(templateParamsOverride, "templateParamsOverride");
        this.callbackMap = cameraCallbackMap;
        this.requestListener = comboRequestListener;
        this.cameraConfig = cameraConfig;
        this.cameraQuirks = cameraQuirks;
        this.zslControl = zslControl;
        this.templateParamsOverride = templateParamsOverride;
        this.cameraMetadata = cameraMetadata;
        this.cameraXConfig = cameraXConfig;
        this.cameraInteropStateCallbackRepository = cameraInteropStateCallbackRepository;
        this.closeCameraOnCameraGraphClose = new CloseCameraOnCameraGraphClose();
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (Build.VERSION.SDK_INT >= 33 && cameraMetadata != null && (dynamicRangeProfilesCompatFromCameraMetaData = DynamicRangeProfilesCompat.Companion.fromCameraMetaData(cameraMetadata)) != null) {
            dynamicRangeProfiles = dynamicRangeProfilesCompatFromCameraMetaData.toDynamicRangeProfiles();
        }
        this.supportedDynamicRangeProfiles = dynamicRangeProfiles;
    }

    /* renamed from: create-79VDu0o$default, reason: not valid java name */
    public static /* synthetic */ GraphConfigBundle m236create79VDu0o$default(CameraGraphConfigProvider cameraGraphConfigProvider, int i2, SessionConfig sessionConfig, boolean z, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, Integer num, Map map, Map map2, int i3, Object obj) {
        GraphStateToCameraStateAdapter graphStateToCameraStateAdapter2;
        CameraGraphConfigProvider cameraGraphConfigProvider2;
        int i4;
        SessionConfig sessionConfig2;
        boolean z2;
        if ((i3 & 32) != 0) {
            map = r.j();
        }
        Map map3 = map;
        Map mapJ = (i3 & 64) != 0 ? r.j() : map2;
        int i5 = i3 & 8;
        Integer num2 = (i3 & 16) != 0 ? null : num;
        if (i5 != 0) {
            graphStateToCameraStateAdapter2 = null;
            cameraGraphConfigProvider2 = cameraGraphConfigProvider;
            sessionConfig2 = sessionConfig;
            z2 = z;
            i4 = i2;
        } else {
            graphStateToCameraStateAdapter2 = graphStateToCameraStateAdapter;
            cameraGraphConfigProvider2 = cameraGraphConfigProvider;
            i4 = i2;
            sessionConfig2 = sessionConfig;
            z2 = z;
        }
        return cameraGraphConfigProvider2.m240create79VDu0o(i4, sessionConfig2, z2, graphStateToCameraStateAdapter2, num2, map3, mapJ);
    }

    private final CameraGraph.Flags createCameraGraphFlags(CameraQuirks cameraQuirks, boolean z) {
        if (cameraQuirks.getQuirks().contains(CaptureSessionStuckQuirk.class)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CameraPipe should be enabling CaptureSessionStuckQuirk by default");
            }
        }
        int iM222getBehaviorBm6Tfm4 = FinalizeSessionOnCloseQuirk.Companion.m222getBehaviorBm6Tfm4();
        boolean zShouldCloseCameraDevice = this.closeCameraOnCameraGraphClose.shouldCloseCameraDevice(z);
        boolean z2 = false;
        if ((!z || DeviceQuirks.INSTANCE.get(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && DeviceQuirks.INSTANCE.get(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30) {
            z2 = true;
        }
        return new CameraGraph.Flags(false, z2, new CameraGraph.RepeatingRequestRequirementsBeforeCapture(cameraQuirks.getQuirks().contains(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST, null), null, iM222getBehaviorBm6Tfm4, true, zShouldCloseCameraDevice, true, 9, null);
    }

    private final CameraStream.Config createPostviewStream(SessionConfig.OutputConfig outputConfig, String str) {
        String str2;
        OutputStream.MirrorMode mirrorModeM794boximpl;
        OutputStream.MirrorMode mirrorMode;
        DeferrableSurface surface = outputConfig.getSurface();
        x.e(surface, "getSurface(...)");
        if (str == null) {
            str = outputConfig.getPhysicalCameraId();
        }
        int mirrorMode2 = outputConfig.getMirrorMode();
        OutputStream.Config.Companion companion = OutputStream.Config.Companion;
        Size prescribedSize = surface.getPrescribedSize();
        x.e(prescribedSize, "getPrescribedSize(...)");
        int prescribedStreamFormat = surface.getPrescribedStreamFormat();
        if (str == null) {
            str2 = null;
        } else {
            CameraId.m547constructorimpl(str);
            str2 = str;
        }
        if (mirrorMode2 == 0) {
            mirrorModeM794boximpl = OutputStream.MirrorMode.m794boximpl(1);
        } else {
            if (mirrorMode2 != 1) {
                mirrorMode = null;
                return CameraStream.Config.Companion.create$default(CameraStream.Config.Companion, OutputStream.Config.Companion.m770createvBYXiEU$default(companion, prescribedSize, prescribedStreamFormat, str2, null, mirrorMode, null, null, null, null, null, 1000, null), (ImageSourceConfig) null, 2, (Object) null);
            }
            mirrorModeM794boximpl = OutputStream.MirrorMode.m794boximpl(2);
        }
        mirrorMode = mirrorModeM794boximpl;
        return CameraStream.Config.Companion.create$default(CameraStream.Config.Companion, OutputStream.Config.Companion.m770createvBYXiEU$default(companion, prescribedSize, prescribedStreamFormat, str2, null, mirrorMode, null, null, null, null, null, 1000, null), (ImageSourceConfig) null, 2, (Object) null);
    }

    /* renamed from: getStreamUseCase-MhLBY4I, reason: not valid java name */
    private final OutputStream.StreamUseCase m237getStreamUseCaseMhLBY4I(DeferrableSurface deferrableSurface, Map<DeferrableSurface, Long> map, CameraMetadata cameraMetadata) {
        Long l2 = map.get(deferrableSurface);
        OutputStream.StreamUseCase streamUseCaseM814boximpl = l2 != null ? OutputStream.StreamUseCase.m814boximpl(l2.longValue()) : null;
        if (Build.VERSION.SDK_INT >= 33 && streamUseCaseM814boximpl != null && cameraMetadata != null) {
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            x.e(key, "SCALER_AVAILABLE_STREAM_USE_CASES");
            long[] jArr = (long[]) cameraMetadata.get(key);
            if (jArr != null && c.ai(jArr, streamUseCaseM814boximpl.m820unboximpl())) {
                return streamUseCaseM814boximpl;
            }
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled(Log.TAG)) {
            return null;
        }
        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Expected stream use case for " + deferrableSurface + ", " + streamUseCaseM814boximpl + " cannot be set!");
        return null;
    }

    /* renamed from: getStreamUseHint-kVKJKLA, reason: not valid java name */
    private final OutputStream.StreamUseHint m238getStreamUseHintkVKJKLA(DeferrableSurface deferrableSurface, Map<DeferrableSurface, Long> map) {
        Long l2 = map.get(deferrableSurface);
        if (l2 != null) {
            return OutputStream.StreamUseHint.m828boximpl(l2.longValue());
        }
        return null;
    }

    private final Integer getVideoStabilizationModeFromCaptureConfig(CaptureConfig captureConfig) {
        int previewStabilizationMode = captureConfig.getPreviewStabilizationMode();
        int videoStabilizationMode = captureConfig.getVideoStabilizationMode();
        if (previewStabilizationMode == 1 || videoStabilizationMode == 1) {
            return 0;
        }
        if (previewStabilizationMode == 2) {
            return 2;
        }
        return videoStabilizationMode != 2 ? null : 1;
    }

    private final Camera2ImplConfig toCamera2ImplConfig(SessionConfig sessionConfig) {
        Config implementationOptions = sessionConfig.getImplementationOptions();
        x.e(implementationOptions, "getImplementationOptions(...)");
        return new Camera2ImplConfig(implementationOptions);
    }

    /* renamed from: toDynamicRangeProfile--zsJmt4, reason: not valid java name */
    private final OutputStream.DynamicRangeProfile m239toDynamicRangeProfilezsJmt4(DynamicRange dynamicRange) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        OutputStream.DynamicRangeProfile dynamicRangeProfileM774boximpl = OutputStream.DynamicRangeProfile.m774boximpl(OutputStream.DynamicRangeProfile.Companion.m793getSTANDARDfFAQAUE());
        DynamicRangeProfiles dynamicRangeProfiles = this.supportedDynamicRangeProfiles;
        if (dynamicRangeProfiles != null) {
            Long lDynamicRangeToFirstSupportedProfile = DynamicRangeConversions.INSTANCE.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (lDynamicRangeToFirstSupportedProfile != null) {
                return OutputStream.DynamicRangeProfile.m774boximpl(lDynamicRangeToFirstSupportedProfile.longValue());
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled(Log.TAG)) {
                String str = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(dynamicRange);
                android.util.Log.e(str, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n ".concat(String.valueOf(dynamicRange)));
            }
        }
        return dynamicRangeProfileM774boximpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* renamed from: create-79VDu0o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.camera2.impl.GraphConfigBundle m240create79VDu0o(int r36, androidx.camera.core.impl.SessionConfig r37, boolean r38, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter r39, java.lang.Integer r40, java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r41, java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r42) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CameraGraphConfigProvider.m240create79VDu0o(int, androidx.camera.core.impl.SessionConfig, boolean, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter, java.lang.Integer, java.util.Map, java.util.Map):androidx.camera.camera2.impl.GraphConfigBundle");
    }

    public String toString() {
        return "CameraGraphConfigProvider<" + CameraId.m552toStringimpl(this.cameraConfig.m231getCameraIdDz_R5H8()) + ">";
    }

    public /* synthetic */ CameraGraphConfigProvider(CameraCallbackMap cameraCallbackMap, ComboRequestListener comboRequestListener, CameraConfig cameraConfig, CameraQuirks cameraQuirks, ZslControl zslControl, TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, int i2, o oVar) {
        this(cameraCallbackMap, comboRequestListener, cameraConfig, cameraQuirks, zslControl, templateParamsOverride, cameraMetadata, (i2 & 128) != 0 ? null : cameraXConfig, (i2 & 256) != 0 ? null : cameraInteropStateCallbackRepository);
    }
}
