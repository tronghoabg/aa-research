package androidx.camera.video;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider;
import androidx.camera.video.internal.QualityExploredEncoderProfilesProvider;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityAddedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import h.a.i;
import h.g.b.x;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class EncoderProfilesProviderResolver {
    public static final EncoderProfilesProviderResolver INSTANCE = new EncoderProfilesProviderResolver();
    private static final String TAG = "EncoderProfilesResolver";

    private EncoderProfilesProviderResolver() {
    }

    private final boolean isHlg10Supported(CameraInfoInternal cameraInfoInternal) {
        Set<DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        x.e(supportedDynamicRanges, "getSupportedDynamicRanges(...)");
        Set<DynamicRange> set = supportedDynamicRanges;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (DynamicRange dynamicRange : set) {
            if (dynamicRange.getEncoding() == 3 && dynamicRange.getBitDepth() == 10) {
                return true;
            }
        }
        return false;
    }

    public final EncoderProfilesProvider resolve(CameraInfoInternal cameraInfoInternal, int i2, int i3, VideoEncoderInfo.Finder finder) {
        VideoEncoderInfo.Finder finder2;
        x.f(cameraInfoInternal, "cameraInfo");
        x.f(finder, "videoEncoderInfoFinder");
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Not a supported video capabilities source: " + i2);
        }
        DefaultEncoderProfilesProvider encoderProfilesProvider = cameraInfoInternal.getEncoderProfilesProvider();
        x.e(encoderProfilesProvider, "getEncoderProfilesProvider(...)");
        if (i3 == 2) {
            if (cameraInfoInternal.isHighSpeedSupported()) {
                return encoderProfilesProvider;
            }
            EncoderProfilesProvider encoderProfilesProvider2 = EncoderProfilesProvider.EMPTY;
            x.e(encoderProfilesProvider2, "EMPTY");
            return encoderProfilesProvider2;
        }
        if (!CapabilitiesByQuality.containsSupportedQuality(encoderProfilesProvider, i3)) {
            Logger.w(TAG, "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            encoderProfilesProvider = new DefaultEncoderProfilesProvider(cameraInfoInternal, i.i(Quality.FHD, Quality.HD, Quality.SD), finder);
        }
        Quirks all = DeviceQuirks.getAll();
        x.e(all, "getAll(...)");
        QualityExploredEncoderProfilesProvider qualityAddedEncoderProfilesProvider = new QualityAddedEncoderProfilesProvider(encoderProfilesProvider, all, cameraInfoInternal, finder);
        if (i2 == 1) {
            finder2 = finder;
            qualityAddedEncoderProfilesProvider = new QualityExploredEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, Quality.getSortedQualities(), Collections.singleton(DynamicRange.SDR), cameraInfoInternal.getSupportedResolutions(34), finder2);
        } else {
            finder2 = finder;
        }
        BackupHdrProfileEncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider = new QualityResolutionModifiedEncoderProfilesProvider(qualityAddedEncoderProfilesProvider, all);
        if (isHlg10Supported(cameraInfoInternal)) {
            qualityResolutionModifiedEncoderProfilesProvider = new BackupHdrProfileEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, finder2);
        }
        return new QualityValidatedEncoderProfilesProvider(qualityResolutionModifiedEncoderProfilesProvider, cameraInfoInternal, all);
    }
}
