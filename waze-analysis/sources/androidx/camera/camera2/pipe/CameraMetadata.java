package androidx.camera.camera2.pipe;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.ColorSpaceProfiles;
import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.support.v7.widget.bi$$ExternalSyntheticApiModelOutline0;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.compat.Api33Compat;
import androidx.camera.camera2.pipe.compat.Api34Compat;
import androidx.camera.camera2.pipe.compat.Api35Compat;
import androidx.camera.camera2.pipe.compat.Camera2ColorSpaceProfiles;
import androidx.camera.camera2.pipe.compat.Camera2MultiResolutionStreamConfigurationMap;
import androidx.camera.camera2.pipe.compat.Camera2StreamConfigurationMap;
import androidx.core.view.DisplayCompat$$ExternalSyntheticApiModelOutline1;
import h.a.c;
import h.c.e;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraMetadata extends Metadata, UnsafeWrapper {
    public static final int CAPABILITIES_BURST_CAPTURE = 6;
    public static final int CAPABILITIES_COLOR_SPACE_PROFILES = 20;
    public static final int CAPABILITIES_CONSTRAINED_HIGH_SPEED_VIDEO = 9;
    public static final int CAPABILITIES_DEPTH_OUTPUT = 8;
    public static final int CAPABILITIES_DYNAMIC_RANGE_TEN_BIT = 18;
    public static final int CAPABILITIES_LOGICAL_MULTI_CAMERA = 11;
    public static final int CAPABILITIES_MANUAL_POST_PROCESSING = 2;
    public static final int CAPABILITIES_MANUAL_SENSOR = 1;
    public static final int CAPABILITIES_MONOCHROME = 12;
    public static final int CAPABILITIES_MOTION_TRACKING = 10;
    public static final int CAPABILITIES_OFFLINE_REPROCESSING = 15;
    public static final int CAPABILITIES_PRIVATE_REPROCESSING = 4;
    public static final int CAPABILITIES_RAW = 3;
    public static final int CAPABILITIES_READ_SENSOR_SETTINGS = 5;
    public static final int CAPABILITIES_REMOSAIC_REPROCESSING = 17;
    public static final int CAPABILITIES_SECURE_IMAGE_DATA = 13;
    public static final int CAPABILITIES_STREAM_USE_CASE = 19;
    public static final int CAPABILITIES_SYSTEM_CAMERA = 14;
    public static final int CAPABILITIES_ULTRA_HIGH_RESOLUTION_SENSOR = 16;
    public static final int CAPABILITIES_YUV_REPROCESSING = 7;
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraMetadata$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = CameraMetadata.Companion;
        }

        public static int[] getAvailableCapabilities(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getAvailableCapabilities(cameraMetadata);
        }

        public static CameraColorSpaceProfiles getAvailableColorSpaceProfiles(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getAvailableColorSpaceProfiles(cameraMetadata);
        }

        public static int[] getAvailableVideoStabilizationModes(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getAvailableVideoStabilizationModes(cameraMetadata);
        }

        public static Metadata.Key<CameraColorSpaceProfiles> getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES() {
            return CameraMetadata.Companion.getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES();
        }

        public static Metadata.Key<CameraMultiResolutionStreamConfigurationMap> getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP() {
            return CameraMetadata.Companion.getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP();
        }

        public static Metadata.Key<CameraStreamConfigurationMap> getCAMERA_STREAM_CONFIGURATION_MAP() {
            return CameraMetadata.Companion.getCAMERA_STREAM_CONFIGURATION_MAP();
        }

        public static int getDefaultTorchStrengthLevel(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getDefaultTorchStrengthLevel(cameraMetadata);
        }

        public static int getMaxTorchStrengthLevel(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getMaxTorchStrengthLevel(cameraMetadata);
        }

        public static CameraMultiResolutionStreamConfigurationMap getMultiResolutionStreamConfigurationMap(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getMultiResolutionStreamConfigurationMap(cameraMetadata);
        }

        public static CameraStreamConfigurationMap getStreamConfigurationMap(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getStreamConfigurationMap(cameraMetadata);
        }

        public static boolean getSupportsAeLock(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsAeLock(cameraMetadata);
        }

        public static boolean getSupportsAutoFocusTrigger(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsAutoFocusTrigger(cameraMetadata);
        }

        public static boolean getSupportsAwbLock(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsAwbLock(cameraMetadata);
        }

        public static boolean getSupportsBurstCapture(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsBurstCapture(cameraMetadata);
        }

        public static boolean getSupportsColorSpaceProfiles(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsColorSpaceProfiles(cameraMetadata);
        }

        public static boolean getSupportsDepthOutput(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsDepthOutput(cameraMetadata);
        }

        public static boolean getSupportsDynamicRangeTenBit(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsDynamicRangeTenBit(cameraMetadata);
        }

        public static boolean getSupportsHighSpeedVideo(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsHighSpeedVideo(cameraMetadata);
        }

        public static boolean getSupportsLogicalMultiCamera(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsLogicalMultiCamera(cameraMetadata);
        }

        public static boolean getSupportsLowLightBoost(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsLowLightBoost(cameraMetadata);
        }

        public static boolean getSupportsManualPostProcessing(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsManualPostProcessing(cameraMetadata);
        }

        public static boolean getSupportsManualSensor(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsManualSensor(cameraMetadata);
        }

        public static boolean getSupportsMonochrome(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsMonochrome(cameraMetadata);
        }

        public static boolean getSupportsMotionTracking(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsMotionTracking(cameraMetadata);
        }

        public static boolean getSupportsOfflineReprocessing(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsOfflineReprocessing(cameraMetadata);
        }

        public static boolean getSupportsPreviewStabilization(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsPreviewStabilization(cameraMetadata);
        }

        public static boolean getSupportsPrivateReprocessing(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsPrivateReprocessing(cameraMetadata);
        }

        public static boolean getSupportsRaw(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsRaw(cameraMetadata);
        }

        public static boolean getSupportsRemosaicProcessing(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsRemosaicProcessing(cameraMetadata);
        }

        public static boolean getSupportsSecureImageData(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsSecureImageData(cameraMetadata);
        }

        public static boolean getSupportsSensorSettings(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsSensorSettings(cameraMetadata);
        }

        public static boolean getSupportsStreamUseCase(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsStreamUseCase(cameraMetadata);
        }

        public static boolean getSupportsSystemCamera(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsSystemCamera(cameraMetadata);
        }

        public static boolean getSupportsTorchStrength(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsTorchStrength(cameraMetadata);
        }

        public static boolean getSupportsUltraHighResolutionSensor(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsUltraHighResolutionSensor(cameraMetadata);
        }

        public static boolean getSupportsYuvReprocessing(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsYuvReprocessing(cameraMetadata);
        }

        public static boolean getSupportsZoomOverride(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.getSupportsZoomOverride(cameraMetadata);
        }

        public static boolean isHardwareLevel3(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.isHardwareLevel3(cameraMetadata);
        }

        public static boolean isHardwareLevelExternal(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.isHardwareLevelExternal(cameraMetadata);
        }

        public static boolean isHardwareLevelFull(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.isHardwareLevelFull(cameraMetadata);
        }

        public static boolean isHardwareLevelLegacy(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
        }

        public static boolean isHardwareLevelLimited(CameraMetadata cameraMetadata) {
            return CameraMetadata.Companion.isHardwareLevelLimited(cameraMetadata);
        }
    }

    CameraExtensionMetadata awaitExtensionMetadata(int i2);

    /* renamed from: awaitPhysicalMetadata-EfqyGwQ, reason: not valid java name */
    CameraMetadata mo564awaitPhysicalMetadataEfqyGwQ(String str);

    <T> T get(CameraCharacteristics.Key<T> key);

    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    String mo565getCameraDz_R5H8();

    Object getExtensionMetadata(int i2, e<? super CameraExtensionMetadata> eVar);

    Set<CameraCharacteristics.Key<?>> getKeys();

    <T> T getOrDefault(CameraCharacteristics.Key<T> key, T t);

    Set<CameraId> getPhysicalCameraIds();

    /* renamed from: getPhysicalMetadata-0r8Bogc, reason: not valid java name */
    Object mo566getPhysicalMetadata0r8Bogc(String str, e<? super CameraMetadata> eVar);

    Set<CaptureRequest.Key<?>> getPhysicalRequestKeys();

    Set<CaptureRequest.Key<?>> getRequestKeys();

    Set<CaptureResult.Key<?>> getResultKeys();

    Set<CameraCharacteristics.Key<?>> getSessionCharacteristicsKeys();

    Set<CaptureRequest.Key<?>> getSessionKeys();

    Set<Integer> getSupportedExtensions();

    boolean isRedacted();

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Metadata.Key<CameraColorSpaceProfiles> CAMERA_AVAILABLE_COLOR_SPACE_PROFILES;
        private static final Metadata.Key<CameraMultiResolutionStreamConfigurationMap> CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;
        private static final Metadata.Key<CameraStreamConfigurationMap> CAMERA_STREAM_CONFIGURATION_MAP;
        public static final int CAPABILITIES_BURST_CAPTURE = 6;
        public static final int CAPABILITIES_COLOR_SPACE_PROFILES = 20;
        public static final int CAPABILITIES_CONSTRAINED_HIGH_SPEED_VIDEO = 9;
        public static final int CAPABILITIES_DEPTH_OUTPUT = 8;
        public static final int CAPABILITIES_DYNAMIC_RANGE_TEN_BIT = 18;
        public static final int CAPABILITIES_LOGICAL_MULTI_CAMERA = 11;
        public static final int CAPABILITIES_MANUAL_POST_PROCESSING = 2;
        public static final int CAPABILITIES_MANUAL_SENSOR = 1;
        public static final int CAPABILITIES_MONOCHROME = 12;
        public static final int CAPABILITIES_MOTION_TRACKING = 10;
        public static final int CAPABILITIES_OFFLINE_REPROCESSING = 15;
        public static final int CAPABILITIES_PRIVATE_REPROCESSING = 4;
        public static final int CAPABILITIES_RAW = 3;
        public static final int CAPABILITIES_READ_SENSOR_SETTINGS = 5;
        public static final int CAPABILITIES_REMOSAIC_REPROCESSING = 17;
        public static final int CAPABILITIES_SECURE_IMAGE_DATA = 13;
        public static final int CAPABILITIES_STREAM_USE_CASE = 19;
        public static final int CAPABILITIES_SYSTEM_CAMERA = 14;
        public static final int CAPABILITIES_ULTRA_HIGH_RESOLUTION_SENSOR = 16;
        public static final int CAPABILITIES_YUV_REPROCESSING = 7;
        private static int[] EMPTY_INT_ARRAY;

        static {
            Metadata.Key.Companion companion = Metadata.Key.Companion;
            int i2 = ar.f48106a;
            CAMERA_STREAM_CONFIGURATION_MAP = companion.create("androidx.camera.camera2.pipe.scalar.streamConfigurationMap", new m(CameraStreamConfigurationMap.class));
            CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP = Metadata.Key.Companion.create("androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap", new m(CameraMultiResolutionStreamConfigurationMap.class));
            CAMERA_AVAILABLE_COLOR_SPACE_PROFILES = Metadata.Key.Companion.create("androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap", new m(CameraColorSpaceProfiles.class));
            EMPTY_INT_ARRAY = new int[0];
        }

        private Companion() {
        }

        public final int[] getAvailableCapabilities(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
            x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
            int[] iArr = (int[]) cameraMetadata.get(key);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        public final CameraColorSpaceProfiles getAvailableColorSpaceProfiles(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraColorSpaceProfiles cameraColorSpaceProfiles = (CameraColorSpaceProfiles) cameraMetadata.get(CAMERA_AVAILABLE_COLOR_SPACE_PROFILES);
            if (cameraColorSpaceProfiles != null) {
                return cameraColorSpaceProfiles;
            }
            if (Build.VERSION.SDK_INT < 34) {
                return UnsupportedCameraColorSpaceProfiles.INSTANCE;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_COLOR_SPACE_PROFILES;
            x.e(key, "REQUEST_AVAILABLE_COLOR_SPACE_PROFILES");
            ColorSpaceProfiles colorSpaceProfilesM11777m = DisplayCompat$$ExternalSyntheticApiModelOutline1.m11777m(cameraMetadata.get(key));
            return colorSpaceProfilesM11777m != null ? new Camera2ColorSpaceProfiles(colorSpaceProfilesM11777m) : null;
        }

        public final int[] getAvailableVideoStabilizationModes(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
            x.e(key, "CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES");
            int[] iArr = (int[]) cameraMetadata.get(key);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        public final Metadata.Key<CameraColorSpaceProfiles> getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES() {
            return CAMERA_AVAILABLE_COLOR_SPACE_PROFILES;
        }

        public final Metadata.Key<CameraMultiResolutionStreamConfigurationMap> getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP() {
            return CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;
        }

        public final Metadata.Key<CameraStreamConfigurationMap> getCAMERA_STREAM_CONFIGURATION_MAP() {
            return CAMERA_STREAM_CONFIGURATION_MAP;
        }

        public final int getDefaultTorchStrengthLevel(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Compat.getDefaultTorchStrengthLevel(cameraMetadata);
            }
            return 1;
        }

        public final int[] getEMPTY_INT_ARRAY() {
            return EMPTY_INT_ARRAY;
        }

        public final int getMaxTorchStrengthLevel(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Compat.getMaxTorchStrengthLevel(cameraMetadata);
            }
            return 1;
        }

        public final CameraMultiResolutionStreamConfigurationMap getMultiResolutionStreamConfigurationMap(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraMultiResolutionStreamConfigurationMap cameraMultiResolutionStreamConfigurationMap = (CameraMultiResolutionStreamConfigurationMap) cameraMetadata.get(CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP);
            if (cameraMultiResolutionStreamConfigurationMap != null) {
                return cameraMultiResolutionStreamConfigurationMap;
            }
            if (Build.VERSION.SDK_INT < 31) {
                return null;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;
            x.e(key, "SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP");
            MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMapM122m = bi$$ExternalSyntheticApiModelOutline0.m122m(cameraMetadata.get(key));
            return multiResolutionStreamConfigurationMapM122m != null ? new Camera2MultiResolutionStreamConfigurationMap(multiResolutionStreamConfigurationMapM122m) : null;
        }

        public final CameraStreamConfigurationMap getStreamConfigurationMap(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraStreamConfigurationMap cameraStreamConfigurationMap = (CameraStreamConfigurationMap) cameraMetadata.get(CAMERA_STREAM_CONFIGURATION_MAP);
            if (cameraStreamConfigurationMap != null) {
                return cameraStreamConfigurationMap;
            }
            CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
            x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(key);
            return streamConfigurationMap != null ? new Camera2StreamConfigurationMap(streamConfigurationMap) : null;
        }

        public final boolean getSupportsAeLock(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE;
            x.e(key, "CONTROL_AE_LOCK_AVAILABLE");
            Boolean bool = (Boolean) cameraMetadata.get(key);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final boolean getSupportsAutoFocusTrigger(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
            x.e(key, "LENS_INFO_MINIMUM_FOCUS_DISTANCE");
            Float f2 = (Float) cameraMetadata.get(key);
            if (f2 != null) {
                return f2.floatValue() > 0.0f;
            }
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            x.e(key2, "CONTROL_AF_AVAILABLE_MODES");
            int[] iArr = (int[]) cameraMetadata.get(key2);
            if (iArr == null) {
                return false;
            }
            return c.ah(iArr, 1) || c.ah(iArr, 2) || c.ah(iArr, 4) || c.ah(iArr, 3);
        }

        public final boolean getSupportsAwbLock(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_LOCK_AVAILABLE;
            x.e(key, "CONTROL_AWB_LOCK_AVAILABLE");
            Boolean bool = (Boolean) cameraMetadata.get(key);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public final boolean getSupportsBurstCapture(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 6);
        }

        public final boolean getSupportsColorSpaceProfiles(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 20);
        }

        public final boolean getSupportsDepthOutput(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 8);
        }

        public final boolean getSupportsDynamicRangeTenBit(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 18);
        }

        public final boolean getSupportsHighSpeedVideo(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 9);
        }

        public final boolean getSupportsLogicalMultiCamera(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 11);
        }

        public final boolean getSupportsLowLightBoost(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            x.e(key, "CONTROL_AE_AVAILABLE_MODES");
            int[] iArr = (int[]) cameraMetadata.get(key);
            if (iArr == null) {
                return false;
            }
            return c.ah(iArr, 6);
        }

        public final boolean getSupportsManualPostProcessing(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 2);
        }

        public final boolean getSupportsManualSensor(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 1);
        }

        public final boolean getSupportsMonochrome(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 12);
        }

        public final boolean getSupportsMotionTracking(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 10);
        }

        public final boolean getSupportsOfflineReprocessing(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 15);
        }

        public final boolean getSupportsPreviewStabilization(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            if (Build.VERSION.SDK_INT >= 33) {
                return Api33Compat.INSTANCE.supportsPreviewStabilization(cameraMetadata);
            }
            return false;
        }

        public final boolean getSupportsPrivateReprocessing(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 4);
        }

        public final boolean getSupportsRaw(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 3);
        }

        public final boolean getSupportsRemosaicProcessing(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 17);
        }

        public final boolean getSupportsSecureImageData(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 13);
        }

        public final boolean getSupportsSensorSettings(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 5);
        }

        public final boolean getSupportsStreamUseCase(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 19);
        }

        public final boolean getSupportsSystemCamera(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 14);
        }

        public final boolean getSupportsTorchStrength(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return Build.VERSION.SDK_INT >= 35 && Api35Compat.isTorchStrengthSupported(cameraMetadata);
        }

        public final boolean getSupportsUltraHighResolutionSensor(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 16);
        }

        public final boolean getSupportsYuvReprocessing(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return c.ah(getAvailableCapabilities(cameraMetadata), 7);
        }

        public final boolean getSupportsZoomOverride(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            return Build.VERSION.SDK_INT >= 34 && Api34Compat.isZoomOverrideSupported(cameraMetadata);
        }

        public final boolean isHardwareLevel3(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 3;
        }

        public final boolean isHardwareLevelExternal(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 4;
        }

        public final boolean isHardwareLevelFull(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 1;
        }

        public final boolean isHardwareLevelLegacy(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 2;
        }

        public final boolean isHardwareLevelLimited(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "<this>");
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
            x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
            Integer num = (Integer) cameraMetadata.get(key);
            return num != null && num.intValue() == 0;
        }

        public final void setEMPTY_INT_ARRAY(int[] iArr) {
            x.f(iArr, "<set-?>");
            EMPTY_INT_ARRAY = iArr;
        }

        public static /* synthetic */ void getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES$annotations() {
        }

        public static /* synthetic */ void getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP$annotations() {
        }

        public static /* synthetic */ void getCAMERA_STREAM_CONFIGURATION_MAP$annotations() {
        }
    }
}
