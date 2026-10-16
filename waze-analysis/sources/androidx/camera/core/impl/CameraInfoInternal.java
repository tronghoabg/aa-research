package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUseCaseAdapterProvider;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.featuregroup.GroupableFeature;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.utils.RangeUtil;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    void addSessionLifecycleCallback(Executor executor, CameraSessionLifecycleCallback cameraSessionLifecycleCallback);

    Set<Integer> getAvailableCapabilities();

    Object getCameraCharacteristics();

    CameraExtensionCapabilities getCameraExtensionCapabilities(int i2);

    String getCameraId();

    @Override // androidx.camera.core.CameraInfo
    CameraIdentifier getCameraIdentifier();

    Quirks getCameraQuirks();

    @Override // androidx.camera.core.CameraInfo
    CameraSelector getCameraSelector();

    EncoderProfilesProvider getEncoderProfilesProvider();

    CameraInfoInternal getImplementation();

    Object getPhysicalCameraCharacteristics(String str);

    Rect getSensorRect();

    Set<DynamicRange> getSupportedDynamicRanges();

    Set<Integer> getSupportedExtensions();

    @Override // androidx.camera.core.CameraInfo
    Set<Range<Integer>> getSupportedFrameRateRanges(androidx.camera.core.SessionConfig sessionConfig);

    List<Size> getSupportedHighResolutions(int i2);

    Set<Range<Integer>> getSupportedHighSpeedFrameRateRanges();

    Set<Range<Integer>> getSupportedHighSpeedFrameRateRangesFor(Size size);

    List<Size> getSupportedHighSpeedResolutions();

    List<Size> getSupportedHighSpeedResolutionsFor(Range<Integer> range);

    Set<Integer> getSupportedOutputFormats();

    List<Size> getSupportedResolutions(int i2);

    Timebase getTimebase();

    boolean isCaptureProcessProgressSupported();

    boolean isExternalCamera();

    boolean isHighSpeedSupported();

    boolean isPostviewSupported();

    boolean isPreviewStabilizationSupported();

    boolean isResolvedFeatureGroupSupported(ResolvedFeatureGroup resolvedFeatureGroup, androidx.camera.core.SessionConfig sessionConfig);

    @Override // androidx.camera.core.CameraInfo
    boolean isSessionConfigSupported(androidx.camera.core.SessionConfig sessionConfig);

    boolean isUseCaseCombinationSupported(List<UseCase> list);

    boolean isUseCaseCombinationSupported(List<UseCase> list, int i2);

    boolean isUseCaseCombinationSupported(List<UseCase> list, int i2, boolean z);

    boolean isUseCaseCombinationSupported(List<UseCase> list, int i2, boolean z, CameraConfig cameraConfig);

    boolean isVideoStabilizationSupported();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);

    void removeSessionLifecycleCallback(CameraSessionLifecycleCallback cameraSessionLifecycleCallback);

    void setCameraUseCaseAdapterProvider(CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraInfoInternal$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CameraExtensionCapabilities $default$getCameraExtensionCapabilities(CameraInfoInternal cameraInfoInternal, int i2) {
            return null;
        }

        public static CameraSelector $default$getCameraSelector(final CameraInfoInternal cameraInfoInternal) {
            CameraSelector.Builder builder = new CameraSelector.Builder();
            builder.addCameraFilter(new CameraFilter() { // from class: androidx.camera.core.impl.CameraInfoInternal$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.CameraFilter
                public final List filter(List list) {
                    return CameraInfoInternal.CC.$private$lambda$getCameraSelector$0(cameraInfoInternal, list);
                }

                @Override // androidx.camera.core.CameraFilter
                public /* synthetic */ Identifier getIdentifier() {
                    return CameraFilter.DEFAULT_ID;
                }
            });
            builder.addCameraFilter(new LensFacingCameraFilter(cameraInfoInternal.getLensFacing()));
            return builder.build();
        }

        public static Set $default$getSupportedFrameRateRanges(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
            try {
                int maxSupportedFrameRate = UseCaseAdditionSimulator.simulateAddUseCases(cameraInfoInternal, sessionConfig, true).getPrimaryStreamSpecResult().getMaxSupportedFrameRate();
                Set<Range<Integer>> setFilterFixedRanges = sessionConfig.getSessionType() == 1 ? RangeUtil.filterFixedRanges(cameraInfoInternal.getSupportedHighSpeedFrameRateRanges()) : cameraInfoInternal.getSupportedFrameRateRanges();
                if (setFilterFixedRanges.isEmpty()) {
                    return Collections.EMPTY_SET;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Range<Integer> range : setFilterFixedRanges) {
                    if (((Integer) range.getUpper()).intValue() <= maxSupportedFrameRate) {
                        linkedHashSet.add(range);
                    }
                }
                return linkedHashSet;
            } catch (Throwable th) {
                Objects.toString(sessionConfig);
                Logger.w("CameraInfoInternal", "Failed to get max supported frameRate by SessionConfig: ".concat(String.valueOf(sessionConfig)), th);
                return Collections.EMPTY_SET;
            }
        }

        public static boolean $default$isCaptureProcessProgressSupported(CameraInfoInternal cameraInfoInternal) {
            return false;
        }

        public static boolean $default$isExternalCamera(CameraInfoInternal cameraInfoInternal) {
            return cameraInfoInternal.getLensFacing() == 2;
        }

        public static boolean $default$isPostviewSupported(CameraInfoInternal cameraInfoInternal) {
            return false;
        }

        public static boolean $default$isResolvedFeatureGroupSupported(CameraInfoInternal cameraInfoInternal, ResolvedFeatureGroup resolvedFeatureGroup, androidx.camera.core.SessionConfig sessionConfig) {
            for (GroupableFeature groupableFeature : resolvedFeatureGroup.getFeatures()) {
                if (!groupableFeature.isSupportedIndividually(cameraInfoInternal, sessionConfig)) {
                    Objects.toString(groupableFeature);
                    Logger.d("CameraInfoInternal", String.valueOf(groupableFeature).concat(" is not supported."));
                    return false;
                }
            }
            try {
                UseCaseAdditionSimulator.simulateAddUseCases(cameraInfoInternal, sessionConfig, false, resolvedFeatureGroup);
                return true;
            } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException e2) {
                Logger.d("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e2);
                return false;
            }
        }

        public static boolean $default$isSessionConfigSupported(CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
            try {
                CameraFilter cameraFilter = sessionConfig.getCameraFilter();
                if (cameraFilter != null && cameraFilter.filter(Collections.singletonList(cameraInfoInternal)).isEmpty()) {
                    return false;
                }
                UseCaseAdditionSimulator.simulateAddUseCases(cameraInfoInternal, sessionConfig, false);
                return true;
            } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException e2) {
                Logger.d("CameraInfoInternal", "CameraInfoInternal.isSessionConfigSupported failed", e2);
                return false;
            }
        }

        public static /* synthetic */ List $private$lambda$getCameraSelector$0(CameraInfoInternal cameraInfoInternal, List list) {
            String cameraId = cameraInfoInternal.getCameraId();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = (CameraInfo) it.next();
                Preconditions.checkArgument(cameraInfo instanceof CameraInfoInternal);
                if (((CameraInfoInternal) cameraInfo).getCameraId().equals(cameraId)) {
                    return Collections.singletonList(cameraInfo);
                }
            }
            throw new IllegalStateException("Unable to find camera with id " + cameraId + " from list of available cameras.");
        }

        public static boolean $default$isUseCaseCombinationSupported(CameraInfoInternal cameraInfoInternal, List list, int i2, boolean z, CameraConfig cameraConfig) {
            return false;
        }

        public static CameraInfoInternal $default$getImplementation(CameraInfoInternal cameraInfoInternal) {
            return cameraInfoInternal;
        }

        public static void $default$removeSessionLifecycleCallback(CameraInfoInternal cameraInfoInternal, CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        }

        public static void $default$addSessionLifecycleCallback(CameraInfoInternal cameraInfoInternal, Executor executor, CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        }
    }
}
