package androidx.camera.camera2.adapter;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.DeviceInfoLogger;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.NightModeIndicatorMonitor;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUseCaseAdapterProvider;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.ZoomState;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraExtensionCapabilities;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraSessionLifecycleCallback;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.strings.DisplayStrings;
import h.a.c;
import h.a.i;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import h.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraInfoAdapter implements CameraInfoInternal, UnsafeWrapper {
    public static final Companion Companion = new Companion(null);
    private final f _physicalCameraInfos$delegate;
    private final f camera2CameraInfo$delegate;
    private final CameraCallbackMap cameraCallbackMap;
    private final CameraConfig cameraConfig;
    private final CameraControlStateAdapter cameraControlStateAdapter;
    private final CameraProperties cameraProperties;
    private final CameraQuirks cameraQuirks;
    private final CameraSessionLifecycleAdapter cameraSessionLifecycleAdapter;
    private final CameraStateAdapter cameraStateAdapter;
    private final EncoderProfilesProvider encoderProfilesProvider;
    private final Map<Integer, CameraExtensionCapabilities> extensionCapabilitiesCache;
    private final FocusMeteringControl focusMeteringControl;
    private final IntrinsicZoomCalculator intrinsicZoomCalculator;
    private final f isLegacyDevice$delegate;
    private final Object lock;
    private final NightModeIndicatorMonitor nightModeIndicatorMonitor;
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;
    private final StreamSpecsCalculator streamSpecsCalculator;

    public CameraInfoAdapter(CameraProperties cameraProperties, CameraConfig cameraConfig, CameraStateAdapter cameraStateAdapter, CameraControlStateAdapter cameraControlStateAdapter, NightModeIndicatorMonitor nightModeIndicatorMonitor, CameraCallbackMap cameraCallbackMap, FocusMeteringControl focusMeteringControl, CameraQuirks cameraQuirks, EncoderProfilesProvider encoderProfilesProvider, StreamConfigurationMapCompat streamConfigurationMapCompat, IntrinsicZoomCalculator intrinsicZoomCalculator, StreamSpecsCalculator streamSpecsCalculator, CameraSessionLifecycleAdapter cameraSessionLifecycleAdapter) {
        x.f(cameraProperties, "cameraProperties");
        x.f(cameraConfig, "cameraConfig");
        x.f(cameraStateAdapter, "cameraStateAdapter");
        x.f(cameraControlStateAdapter, "cameraControlStateAdapter");
        x.f(nightModeIndicatorMonitor, "nightModeIndicatorMonitor");
        x.f(cameraCallbackMap, "cameraCallbackMap");
        x.f(focusMeteringControl, "focusMeteringControl");
        x.f(cameraQuirks, "cameraQuirks");
        x.f(encoderProfilesProvider, "encoderProfilesProvider");
        x.f(streamConfigurationMapCompat, "streamConfigurationMapCompat");
        x.f(intrinsicZoomCalculator, "intrinsicZoomCalculator");
        x.f(streamSpecsCalculator, "streamSpecsCalculator");
        x.f(cameraSessionLifecycleAdapter, "cameraSessionLifecycleAdapter");
        this.cameraProperties = cameraProperties;
        this.cameraConfig = cameraConfig;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraControlStateAdapter = cameraControlStateAdapter;
        this.nightModeIndicatorMonitor = nightModeIndicatorMonitor;
        this.cameraCallbackMap = cameraCallbackMap;
        this.focusMeteringControl = focusMeteringControl;
        this.cameraQuirks = cameraQuirks;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        this.intrinsicZoomCalculator = intrinsicZoomCalculator;
        this.streamSpecsCalculator = streamSpecsCalculator;
        this.cameraSessionLifecycleAdapter = cameraSessionLifecycleAdapter;
        this.lock = new Object();
        this.extensionCapabilitiesCache = new LinkedHashMap();
        DeviceInfoLogger.INSTANCE.logDeviceInfo(cameraProperties);
        this._physicalCameraInfos$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CameraInfoAdapter._physicalCameraInfos_delegate$lambda$0(this.f$0);
            }
        });
        this.isLegacyDevice$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(CameraMetadata.Companion.isHardwareLevelLegacy(this.f$0.cameraProperties.getMetadata()));
            }
        });
        this.camera2CameraInfo$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.CameraInfoAdapter$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Camera2CameraInfo.Companion.create(this.f$0.cameraProperties);
            }
        });
    }

    static final Set _physicalCameraInfos_delegate$lambda$0(CameraInfoAdapter cameraInfoAdapter) {
        Set<CameraId> physicalCameraIds = cameraInfoAdapter.cameraProperties.getMetadata().getPhysicalCameraIds();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = physicalCameraIds.iterator();
        while (it.hasNext()) {
            String strM553unboximpl = ((CameraId) it.next()).m553unboximpl();
            linkedHashSet.add(new PhysicalCameraInfoAdapter(new CameraPipeCameraProperties(new CameraConfig(strM553unboximpl, null), cameraInfoAdapter.cameraProperties.getMetadata().mo564awaitPhysicalMetadataEfqyGwQ(strM553unboximpl))));
        }
        return linkedHashSet;
    }

    private final int getCameraSelectorLensFacing(int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (!Logger.isWarnEnabled(Log.TAG)) {
                    return -1;
                }
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Unrecognized lens facing: " + i2 + "!");
                return -1;
            }
        }
        return i3;
    }

    private final Set<CameraInfo> get_physicalCameraInfos() {
        return (Set) this._physicalCameraInfos$delegate.getValue();
    }

    private final boolean isLegacyDevice() {
        return ((Boolean) this.isLegacyDevice$delegate.getValue()).booleanValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public void addCameraStateListener(Executor executor, Consumer<CameraState> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.cameraStateAdapter.addCameraStateListener$camera_camera2(executor, consumer);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        x.f(executor, "executor");
        x.f(cameraCaptureCallback, "callback");
        this.cameraCallbackMap.addCaptureCallback(cameraCaptureCallback, executor);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionLifecycleCallback(Executor executor, CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(executor, "executor");
        x.f(cameraSessionLifecycleCallback, "callback");
        this.cameraSessionLifecycleAdapter.addSessionLifecycleCallback$camera_camera2(executor, cameraSessionLifecycleCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Integer> getAvailableCapabilities() {
        Set<Integer> setAc;
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) metadata.get(key);
        return (iArr == null || (setAc = c.ac(iArr)) == null) ? e.c.d.a.p() : setAc;
    }

    public final Camera2CameraInfo getCamera2CameraInfo$camera_camera2() {
        return (Camera2CameraInfo) this.camera2CameraInfo$delegate.getValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CameraCharacteristics getCameraCharacteristics() {
        Object objUnwrapAs = this.cameraProperties.getMetadata().unwrapAs((Class<Object>) CameraCharacteristics.class);
        x.c(objUnwrapAs);
        return (CameraCharacteristics) objUnwrapAs;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CameraExtensionCapabilities getCameraExtensionCapabilities(int i2) {
        CameraExtensionCapabilities cameraExtensionCapabilities;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        Set<Integer> supportedExtensions = getSupportedExtensions();
        Integer numValueOf = Integer.valueOf(i2);
        if (!supportedExtensions.contains(numValueOf)) {
            return null;
        }
        synchronized (this.lock) {
            Map<Integer, CameraExtensionCapabilities> map = this.extensionCapabilitiesCache;
            CameraExtensionCapabilitiesAdapter cameraExtensionCapabilitiesAdapter = map.get(numValueOf);
            if (cameraExtensionCapabilitiesAdapter == null) {
                cameraExtensionCapabilitiesAdapter = new CameraExtensionCapabilitiesAdapter(this.cameraProperties.getMetadata().awaitExtensionMetadata(i2));
                map.put(numValueOf, cameraExtensionCapabilitiesAdapter);
            }
            cameraExtensionCapabilities = cameraExtensionCapabilitiesAdapter;
        }
        return cameraExtensionCapabilities;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.cameraConfig.m231getCameraIdDz_R5H8();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ CameraIdentifier getCameraIdentifier() {
        return CameraIdentifier.Factory.create(getCameraId());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Quirks getCameraQuirks() {
        return this.cameraQuirks.getQuirks();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ CameraSelector getCameraSelector() {
        return CameraInfoInternal.CC.$default$getCameraSelector(this);
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<CameraState> getCameraState() {
        return this.cameraStateAdapter.getCameraState$camera_camera2();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.encoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        return this.cameraControlStateAdapter.getExposureState();
    }

    @Override // androidx.camera.core.CameraInfo
    public String getImplementationType() {
        return true != isLegacyDevice() ? CameraInfo.IMPLEMENTATION_TYPE_CAMERA2 : CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY;
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        Float fCalculateIntrinsicZoomRatio = this.intrinsicZoomCalculator.calculateIntrinsicZoomRatio(this.cameraProperties.getMetadata());
        if (fCalculateIntrinsicZoomRatio != null) {
            return fCalculateIntrinsicZoomRatio.floatValue();
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled(Log.TAG)) {
            return 1.0f;
        }
        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Failed to calculate intrinsic zoom ratio for ".concat(CameraId.m552toStringimpl(this.cameraProperties.mo248getCameraIdDz_R5H8())));
        return 1.0f;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        x.e(key, "LENS_FACING");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return getCameraSelectorLensFacing(((Number) obj).intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getLowLightBoostState() {
        return this.cameraControlStateAdapter.getLowLightBoostState();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getMaxTorchStrengthLevel() {
        if (!isTorchStrengthSupported()) {
            return 0;
        }
        return CameraMetadata.Companion.getMaxTorchStrengthLevel(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getNightModeIndicator() {
        return this.nightModeIndicatorMonitor.getNightModeIndicatorLiveData();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Object getPhysicalCameraCharacteristics(String str) {
        x.f(str, "physicalCameraId");
        CameraId.m547constructorimpl(str);
        if (this.cameraProperties.getMetadata().getPhysicalCameraIds().contains(CameraId.m546boximpl(str))) {
            return this.cameraProperties.getMetadata().mo564awaitPhysicalMetadataEfqyGwQ(str).unwrapAs(CameraCharacteristics.class);
        }
        return null;
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<CameraInfo> getPhysicalCameraInfos() {
        return get_physicalCameraInfos();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Rect getSensorRect() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        x.e(key, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Rect rect = (Rect) metadata.get(key);
        if (x.n("robolectric", Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        x.c(rect);
        return rect;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i2) {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        x.e(key, "SENSOR_ORIENTATION");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(i2), ((Number) obj).intValue(), getLensFacing() == 1);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return DynamicRangeProfilesCompat.Companion.fromCameraMetaData(this.cameraProperties.getMetadata()).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Integer> getSupportedExtensions() {
        return this.cameraProperties.getMetadata().getSupportedExtensions();
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        Set<Range<Integer>> setAd;
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        x.e(key, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        Range[] rangeArr = (Range[]) metadata.get(key);
        return (rangeArr == null || (setAd = c.ad(rangeArr)) == null) ? e.c.d.a.p() : setAd;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighResolutions(int i2) {
        List<Size> listX;
        Size[] highResolutionOutputSizes = this.streamConfigurationMapCompat.getHighResolutionOutputSizes(i2);
        return (highResolutionOutputSizes == null || (listX = c.X(highResolutionOutputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Range<Integer>> getSupportedHighSpeedFrameRateRanges() {
        Set<Range<Integer>> setAd;
        Range<Integer>[] highSpeedVideoFpsRanges = this.streamConfigurationMapCompat.getHighSpeedVideoFpsRanges();
        return (highSpeedVideoFpsRanges == null || (setAd = c.ad(highSpeedVideoFpsRanges)) == null) ? e.c.d.a.p() : setAd;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Range<Integer>> getSupportedHighSpeedFrameRateRangesFor(Size size) {
        Object objA;
        x.f(size, "size");
        try {
            CameraInfoAdapter cameraInfoAdapter = this;
            Range<Integer>[] highSpeedVideoFpsRangesFor = this.streamConfigurationMapCompat.getHighSpeedVideoFpsRangesFor(size);
            objA = highSpeedVideoFpsRangesFor != null ? c.ad(highSpeedVideoFpsRangesFor) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Set<Range<Integer>> set = (Set) (true != (objA instanceof l) ? objA : null);
        return set == null ? e.c.d.a.p() : set;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighSpeedResolutions() {
        List<Size> listX;
        Size[] highSpeedVideoSizes = this.streamConfigurationMapCompat.getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (listX = c.X(highSpeedVideoSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedHighSpeedResolutionsFor(Range<Integer> range) {
        Object objA;
        x.f(range, "fpsRange");
        try {
            CameraInfoAdapter cameraInfoAdapter = this;
            Size[] highSpeedVideoSizesFor = this.streamConfigurationMapCompat.getHighSpeedVideoSizesFor(range);
            objA = highSpeedVideoSizesFor != null ? c.X(highSpeedVideoSizesFor) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        List<Size> list = (List) (true != (objA instanceof l) ? objA : null);
        return list == null ? i.h() : list;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Set<Integer> getSupportedOutputFormats() {
        Set<Integer> setAd;
        Integer[] outputFormats = this.streamConfigurationMapCompat.getOutputFormats();
        return (outputFormats == null || (setAd = c.ad(outputFormats)) == null) ? e.c.d.a.p() : setAd;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public List<Size> getSupportedResolutions(int i2) {
        List<Size> listX;
        Size[] outputSizes = this.streamConfigurationMapCompat.getOutputSizes(i2);
        return (outputSizes == null || (listX = c.X(outputSizes)) == null) ? i.h() : listX;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public Timebase getTimebase() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        x.e(key, "SENSOR_INFO_TIMESTAMP_SOURCE");
        Object obj = metadata.get((CameraCharacteristics.Key<Object>) key);
        x.c(obj);
        int iIntValue = ((Number) obj).intValue();
        return iIntValue != 0 ? iIntValue != 1 ? Timebase.UPTIME : Timebase.REALTIME : Timebase.UPTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchState() {
        return this.cameraControlStateAdapter.getTorchStateLiveData();
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<Integer> getTorchStrengthLevel() {
        return isTorchStrengthSupported() ? this.cameraControlStateAdapter.getTorchStrengthLiveData() : new MutableLiveData(0);
    }

    @Override // androidx.camera.core.CameraInfo
    public LiveData<ZoomState> getZoomState() {
        return this.cameraControlStateAdapter.getZoomStateLiveData();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return FlashAvailabilityCheckerKt.isFlashAvailable(this.cameraProperties, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isCaptureProcessProgressSupported() {
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isExternalCamera() {
        if (getLensFacing() == 2) {
            return true;
        }
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num = (Integer) metadata.get(key);
        return num != null && num.intValue() == 4;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(FocusMeteringAction focusMeteringAction) {
        x.f(focusMeteringAction, "action");
        return this.focusMeteringControl.isFocusMeteringSupported(focusMeteringAction);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isHighSpeedSupported() {
        return CameraMetadata.Companion.getSupportsHighSpeedVideo(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return CameraMetadata.Companion.getSupportsLogicalMultiCamera(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLowLightBoostSupported() {
        return CameraMetadata.Companion.getSupportsLowLightBoost(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isNightModeIndicatorSupported() {
        return this.nightModeIndicatorMonitor.isSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isPostviewSupported() {
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        return CameraMetadata.Companion.getSupportsPreviewStabilization(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return CameraMetadata.Companion.getSupportsPrivateReprocessing(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isResolvedFeatureGroupSupported(ResolvedFeatureGroup resolvedFeatureGroup, SessionConfig sessionConfig) {
        return CameraInfoInternal.CC.$default$isResolvedFeatureGroupSupported(this, resolvedFeatureGroup, sessionConfig);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ boolean isSessionConfigSupported(SessionConfig sessionConfig) {
        return CameraInfoInternal.CC.$default$isSessionConfigSupported(this, sessionConfig);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isTorchStrengthSupported() {
        return CameraMetadata.Companion.getSupportsTorchStrength(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isUseCaseCombinationSupported(List<? extends UseCase> list, int i2, boolean z, androidx.camera.core.impl.CameraConfig cameraConfig) {
        x.f(list, "useCases");
        x.f(cameraConfig, "cameraConfig");
        try {
            StreamSpecsCalculator.CC.calculateSuggestedStreamSpecs$default(this.streamSpecsCalculator, i2, this, list, null, cameraConfig, 0, null, z, false, DisplayStrings.DS_ONE_DAY_AGO, null);
            return true;
        } catch (IllegalArgumentException e2) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            IllegalArgumentException illegalArgumentException = e2;
            if (!Logger.isDebugEnabled(Log.TAG)) {
                return false;
            }
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "CameraInfoAdapter#isUseCaseCombinationSupported: calculateSuggestedStreamSpecs failed", illegalArgumentException);
            return false;
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        x.e(key, "CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES");
        int[] iArr = (int[]) metadata.get(key);
        return iArr != null && c.ah(iArr, 1);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        return isPrivateReprocessingSupported() && DeviceQuirks.INSTANCE.get(ZslDisablerQuirk.class) == null;
    }

    @Override // androidx.camera.core.CameraInfo
    public Set<DynamicRange> querySupportedDynamicRanges(Set<DynamicRange> set) {
        x.f(set, "candidateDynamicRanges");
        return DynamicRanges.findAllPossibleMatches(set, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.CameraInfo
    public void removeCameraStateListener(Consumer<CameraState> consumer) {
        x.f(consumer, "listener");
        this.cameraStateAdapter.removeCameraStateListener$camera_camera2(consumer);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
        x.f(cameraCaptureCallback, "callback");
        this.cameraCallbackMap.removeCaptureCallback(cameraCaptureCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionLifecycleCallback(CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(cameraSessionLifecycleCallback, "callback");
        this.cameraSessionLifecycleAdapter.removeSessionLifecycleCallback$camera_camera2(cameraSessionLifecycleCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ void setCameraUseCaseAdapterProvider(CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider) {
        UseCaseAdditionSimulator.setCameraUseCaseAdapterProvider(cameraUseCaseAdapterProvider);
    }

    public String toString() {
        return "CameraInfoAdapter<" + this.cameraConfig + ".cameraId>";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, Camera2CameraInfo.class)) {
            Object camera2CameraInfo$camera_camera2 = getCamera2CameraInfo$camera_camera2();
            x.d(camera2CameraInfo$camera_camera2, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
            return (T) camera2CameraInfo$camera_camera2;
        }
        if (x.n(cls, CameraProperties.class)) {
            CameraProperties cameraProperties = this.cameraProperties;
            x.d(cameraProperties, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
            return (T) cameraProperties;
        }
        boolean zN = x.n(cls, CameraMetadata.class);
        CameraProperties cameraProperties2 = this.cameraProperties;
        if (!zN) {
            return (T) cameraProperties2.getMetadata().unwrapAs(cls);
        }
        CameraMetadata metadata = cameraProperties2.getMetadata();
        x.d(metadata, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
        return (T) metadata;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCameraId-zjxgSG8, reason: not valid java name */
        public final String m181getCameraIdzjxgSG8(CameraInfo cameraInfo) {
            x.f(cameraInfo, "$this$cameraId");
            CameraMetadata cameraMetadata = (CameraMetadata) unwrapAs(cameraInfo, CameraMetadata.class);
            if (cameraMetadata != null) {
                return cameraMetadata.mo565getCameraDz_R5H8();
            }
            return null;
        }

        public final <T> T unwrapAs(CameraInfo cameraInfo, Class<T> cls) {
            x.f(cameraInfo, "<this>");
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            if (cameraInfo instanceof UnsafeWrapper) {
                return (T) ((UnsafeWrapper) cameraInfo).unwrapAs(cls);
            }
            if (!(cameraInfo instanceof CameraInfoInternal)) {
                return null;
            }
            CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
            if (cameraInfoInternal.getImplementation() == cameraInfo) {
                return null;
            }
            CameraInfoInternal implementation = cameraInfoInternal.getImplementation();
            x.e(implementation, "getImplementation(...)");
            return (T) unwrapAs(implementation, cls);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final /* synthetic */ <T> T unwrapAs(CameraInfo cameraInfo) {
            x.f(cameraInfo, "<this>");
            x.i();
            return (T) unwrapAs(cameraInfo, Object.class);
        }
    }

    public static /* synthetic */ void getCamera2CameraInfo$camera_camera2$annotations() {
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ CameraInfoInternal getImplementation() {
        return this;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public /* synthetic */ Set getSupportedFrameRateRanges(SessionConfig sessionConfig) {
        return CameraInfoInternal.CC.$default$getSupportedFrameRateRanges(this, sessionConfig);
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isUseCaseCombinationSupported(List list, int i2) {
        return isUseCaseCombinationSupported(list, i2, false);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isUseCaseCombinationSupported(List list, int i2, boolean z) {
        return isUseCaseCombinationSupported(list, i2, z, CameraConfigs.defaultConfig());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public /* synthetic */ boolean isUseCaseCombinationSupported(List list) {
        return isUseCaseCombinationSupported(list, 0);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
