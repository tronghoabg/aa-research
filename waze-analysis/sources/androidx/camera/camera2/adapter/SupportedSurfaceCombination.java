package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.compat.workaround.ResolutionCorrector;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.internal.DynamicRangeResolver;
import androidx.camera.camera2.internal.HighSpeedResolver;
import androidx.camera.camera2.internal.StreamUseCaseUtil;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.featuregroup.impl.feature.FpsRangeFeature;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraMode;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.AspectRatioUtil;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.core.util.Preconditions;
import com.waze.strings.DisplayStrings;
import h.a.c;
import h.a.i;
import h.a.r;
import h.d.b;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SupportedSurfaceCombination {
    public static final Companion Companion = new Companion(null);
    private final String cameraId;
    private final CameraMetadata cameraMetadata;
    private final List<SurfaceCombination> concurrentSurfaceCombinations;
    private final DisplayInfoManager displayInfoManager;
    private final DynamicRangeResolver dynamicRangeResolver;
    private final EncoderProfilesProvider encoderProfilesProvider;
    private final ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer;
    private final FeatureCombinationQuery featureCombinationQuery;
    private final Map<FeatureSettings, List<SurfaceCombination>> featureSettingsToSupportedCombinationsMap;
    private final int hardwareLevel;
    private final HighSpeedResolver highSpeedResolver;
    private final List<SurfaceCombination> highSpeedSurfaceCombinations;
    private boolean isBurstCaptureSupported;
    private final boolean isConcurrentCameraModeSupported;
    private boolean isManualSensorSupported;
    private boolean isPreviewStabilizationSupported;
    private boolean isRawSupported;
    private final boolean isStreamUseCaseSupported;
    private boolean isUltraHighResolutionSensorSupported;
    private final List<SurfaceCombination> previewStabilizationSurfaceCombinations;
    private final ResolutionCorrector resolutionCorrector;
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;
    private final List<SurfaceCombination> surfaceCombinations;
    private final List<SurfaceCombination> surfaceCombinations10Bit;
    private final List<SurfaceCombination> surfaceCombinationsStreamUseCase;
    private final List<SurfaceCombination> surfaceCombinationsUltraHdr;
    public SurfaceSizeDefinition surfaceSizeDefinition;
    private final List<Integer> surfaceSizeDefinitionFormats;
    private final TargetAspectRatio targetAspectRatio;
    private final List<SurfaceCombination> ultraHighSurfaceCombinations;

    /* compiled from: WazeSource */
    public final class BestSizesAndMaxFpsForConfigs {
        private final List<Size> bestSizes;
        private final List<Size> bestSizesForStreamUseCase;
        private final int maxFpsForAllSizes;
        private final int maxFpsForBestSizes;
        private final int maxFpsForStreamUseCase;

        public BestSizesAndMaxFpsForConfigs(List<Size> list, List<Size> list2, int i2, int i3, int i4) {
            x.f(list, "bestSizes");
            this.bestSizes = list;
            this.bestSizesForStreamUseCase = list2;
            this.maxFpsForBestSizes = i2;
            this.maxFpsForStreamUseCase = i3;
            this.maxFpsForAllSizes = i4;
        }

        public static /* synthetic */ BestSizesAndMaxFpsForConfigs copy$default(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, List list, List list2, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                list = bestSizesAndMaxFpsForConfigs.bestSizes;
            }
            if ((i5 & 2) != 0) {
                list2 = bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase;
            }
            if ((i5 & 4) != 0) {
                i2 = bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes;
            }
            if ((i5 & 8) != 0) {
                i3 = bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase;
            }
            if ((i5 & 16) != 0) {
                i4 = bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
            }
            int i6 = i4;
            int i7 = i2;
            return bestSizesAndMaxFpsForConfigs.copy(list, list2, i7, i3, i6);
        }

        public final List<Size> component1() {
            return this.bestSizes;
        }

        public final List<Size> component2() {
            return this.bestSizesForStreamUseCase;
        }

        public final int component3() {
            return this.maxFpsForBestSizes;
        }

        public final int component4() {
            return this.maxFpsForStreamUseCase;
        }

        public final int component5() {
            return this.maxFpsForAllSizes;
        }

        public final BestSizesAndMaxFpsForConfigs copy(List<Size> list, List<Size> list2, int i2, int i3, int i4) {
            x.f(list, "bestSizes");
            return new BestSizesAndMaxFpsForConfigs(list, list2, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BestSizesAndMaxFpsForConfigs)) {
                return false;
            }
            BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs = (BestSizesAndMaxFpsForConfigs) obj;
            return x.n(this.bestSizes, bestSizesAndMaxFpsForConfigs.bestSizes) && x.n(this.bestSizesForStreamUseCase, bestSizesAndMaxFpsForConfigs.bestSizesForStreamUseCase) && this.maxFpsForBestSizes == bestSizesAndMaxFpsForConfigs.maxFpsForBestSizes && this.maxFpsForStreamUseCase == bestSizesAndMaxFpsForConfigs.maxFpsForStreamUseCase && this.maxFpsForAllSizes == bestSizesAndMaxFpsForConfigs.maxFpsForAllSizes;
        }

        public final List<Size> getBestSizes() {
            return this.bestSizes;
        }

        public final List<Size> getBestSizesForStreamUseCase() {
            return this.bestSizesForStreamUseCase;
        }

        public final int getMaxFpsForAllSizes() {
            return this.maxFpsForAllSizes;
        }

        public final int getMaxFpsForBestSizes() {
            return this.maxFpsForBestSizes;
        }

        public final int getMaxFpsForStreamUseCase() {
            return this.maxFpsForStreamUseCase;
        }

        public int hashCode() {
            int iHashCode = this.bestSizes.hashCode() * 31;
            List<Size> list = this.bestSizesForStreamUseCase;
            return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.maxFpsForBestSizes) * 31) + this.maxFpsForStreamUseCase) * 31) + this.maxFpsForAllSizes;
        }

        public String toString() {
            return "BestSizesAndMaxFpsForConfigs(bestSizes=" + this.bestSizes + ", bestSizesForStreamUseCase=" + this.bestSizesForStreamUseCase + ", maxFpsForBestSizes=" + this.maxFpsForBestSizes + ", maxFpsForStreamUseCase=" + this.maxFpsForStreamUseCase + ", maxFpsForAllSizes=" + this.maxFpsForAllSizes + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class CheckingMethod {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ CheckingMethod[] $VALUES;
        public static final CheckingMethod WITHOUT_FEATURE_COMBO = new CheckingMethod("WITHOUT_FEATURE_COMBO", 0);
        public static final CheckingMethod WITH_FEATURE_COMBO = new CheckingMethod("WITH_FEATURE_COMBO", 1);
        public static final CheckingMethod WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT = new CheckingMethod("WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT", 2);

        private static final /* synthetic */ CheckingMethod[] $values() {
            return new CheckingMethod[]{WITHOUT_FEATURE_COMBO, WITH_FEATURE_COMBO, WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT};
        }

        static {
            CheckingMethod[] checkingMethodArr$values = $values();
            $VALUES = checkingMethodArr$values;
            $ENTRIES = b.a(checkingMethodArr$values);
        }

        private CheckingMethod(String str, int i2) {
        }

        public static h.d.a<CheckingMethod> getEntries() {
            return $ENTRIES;
        }

        public static CheckingMethod valueOf(String str) {
            return (CheckingMethod) Enum.valueOf(CheckingMethod.class, str);
        }

        public static CheckingMethod[] values() {
            return (CheckingMethod[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckingMethod.values().length];
            try {
                iArr[CheckingMethod.WITHOUT_FEATURE_COMBO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckingMethod.WITH_FEATURE_COMBO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SupportedSurfaceCombination(Context context, CameraMetadata cameraMetadata, EncoderProfilesProvider encoderProfilesProvider, FeatureCombinationQuery featureCombinationQuery, ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer) throws NumberFormatException {
        x.f(context, "context");
        x.f(cameraMetadata, "cameraMetadata");
        x.f(encoderProfilesProvider, "encoderProfilesProvider");
        x.f(featureCombinationQuery, "featureCombinationQuery");
        x.f(extraSupportedSurfaceCombinationsContainer, "extraSupportedSurfaceCombinationsContainer");
        this.cameraMetadata = cameraMetadata;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.featureCombinationQuery = featureCombinationQuery;
        this.extraSupportedSurfaceCombinationsContainer = extraSupportedSurfaceCombinationsContainer;
        this.cameraId = cameraMetadata.mo565getCameraDz_R5H8();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        x.e(key, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num = (Integer) cameraMetadata.get(key);
        this.hardwareLevel = num != null ? num.intValue() : 2;
        this.concurrentSurfaceCombinations = new ArrayList();
        this.surfaceCombinations = new ArrayList();
        this.surfaceCombinationsStreamUseCase = new ArrayList();
        this.ultraHighSurfaceCombinations = new ArrayList();
        this.previewStabilizationSurfaceCombinations = new ArrayList();
        this.highSpeedSurfaceCombinations = new ArrayList();
        this.featureSettingsToSupportedCombinationsMap = new LinkedHashMap();
        this.surfaceCombinations10Bit = new ArrayList();
        this.surfaceCombinationsUltraHdr = new ArrayList();
        this.isPreviewStabilizationSupported = CameraMetadata.Companion.getSupportsPreviewStabilization(cameraMetadata);
        this.surfaceSizeDefinitionFormats = new ArrayList();
        this.streamConfigurationMapCompat = getStreamConfigurationMapCompat();
        this.displayInfoManager = DisplayInfoManager.Companion.getInstance(context);
        this.resolutionCorrector = new ResolutionCorrector();
        this.targetAspectRatio = new TargetAspectRatio();
        DynamicRangeResolver dynamicRangeResolver = new DynamicRangeResolver(cameraMetadata);
        this.dynamicRangeResolver = dynamicRangeResolver;
        this.highSpeedResolver = new HighSpeedResolver(cameraMetadata);
        checkCapabilities();
        generateSupportedCombinationList();
        if (this.isUltraHighResolutionSensorSupported) {
            generateUltraHighResolutionSupportedCombinationList();
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        this.isConcurrentCameraModeSupported = zHasSystemFeature;
        if (zHasSystemFeature) {
            generateConcurrentSupportedCombinationList();
        }
        if (dynamicRangeResolver.is10BitDynamicRangeSupported()) {
            generate10BitSupportedCombinationList();
        }
        if (this.isPreviewStabilizationSupported) {
            generatePreviewStabilizationSupportedCombinationList();
        }
        boolean zIsStreamUseCaseSupported = StreamUseCaseUtil.INSTANCE.isStreamUseCaseSupported(cameraMetadata);
        this.isStreamUseCaseSupported = zIsStreamUseCaseSupported;
        if (zIsStreamUseCaseSupported) {
            generateStreamUseCaseSupportedCombinationList();
        }
        generateSurfaceSizeDefinition();
    }

    private final void checkCapabilities() {
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        x.e(key, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) this.cameraMetadata.get(key);
        if (iArr != null) {
            this.isRawSupported = c.ah(iArr, 3);
            this.isBurstCaptureSupported = c.ah(iArr, 6);
            this.isUltraHighResolutionSensorSupported = c.ah(iArr, 16);
            this.isManualSensorSupported = c.ah(iArr, 1);
        }
    }

    public static /* synthetic */ boolean checkSupported$default(SupportedSurfaceCombination supportedSurfaceCombination, FeatureSettings featureSettings, List list, Map map, List list2, List list3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        Map map2 = map;
        if ((i2 & 8) != 0) {
            list2 = i.h();
        }
        List list4 = list2;
        if ((i2 & 16) != 0) {
            list3 = i.h();
        }
        return supportedSurfaceCombination.checkSupported(featureSettings, list, map2, list4, list3);
    }

    private final Range<Integer> compareIntersectingRanges(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        Range<Integer> rangeIntersect = range2.intersect(range);
        x.e(rangeIntersect, "intersect(...)");
        double rangeLength = getRangeLength(rangeIntersect);
        Range<Integer> rangeIntersect2 = range3.intersect(range);
        x.e(rangeIntersect2, "intersect(...)");
        double rangeLength2 = getRangeLength(rangeIntersect2);
        double rangeLength3 = rangeLength2 / getRangeLength(range3);
        double rangeLength4 = rangeLength / getRangeLength(range2);
        return (rangeLength2 <= rangeLength ? rangeLength2 != rangeLength ? rangeLength4 >= 0.5d || rangeLength3 <= rangeLength4 : rangeLength3 <= rangeLength4 && (rangeLength3 != rangeLength4 || ((Number) range3.getLower()).intValue() <= ((Number) range2.getLower()).intValue()) : rangeLength3 < 0.5d && rangeLength3 < rangeLength4) ? range2 : range3;
    }

    private final SessionConfig createFeatureComboSessionConfig(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<SurfaceConfig, DynamicRange> map, List<? extends UseCaseConfig<?>> list2, List<Integer> list3) {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.p();
            }
            SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
            Size resolution = surfaceConfig.getResolution(getUpdatedSurfaceSizeDefinitionByFormat(surfaceConfig.getImageFormat()));
            UseCaseConfig<?> useCaseConfig = list2.get(list3.get(i2).intValue());
            FeatureCombinationQuery.Companion companion = FeatureCombinationQuery.Companion;
            DynamicRange dynamicRange = map.get(surfaceConfig);
            if (dynamicRange == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            SessionConfig.Builder builderCreateSessionConfigBuilder = companion.createSessionConfigBuilder(useCaseConfig, resolution, dynamicRange);
            Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
            boolean z = !x.n(targetFpsRange, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            Boolean.valueOf(z).getClass();
            if (true != z) {
                targetFpsRange = null;
            }
            if (targetFpsRange == null) {
                targetFpsRange = FpsRangeFeature.DEFAULT_FPS_RANGE;
            }
            builderCreateSessionConfigBuilder.setExpectedFrameRateRange(targetFpsRange);
            if (featureSettings.getVideoStabilization() == VideoStabilization.PREVIEW) {
                builderCreateSessionConfigBuilder.setPreviewStabilization(2);
            } else if (featureSettings.getVideoStabilization() == VideoStabilization.ON) {
                builderCreateSessionConfigBuilder.setVideoStabilization(2);
            }
            validatingBuilder.add(builderCreateSessionConfigBuilder.build());
            Preconditions.checkState(validatingBuilder.isValid(), "Cannot create a combined SessionConfig for feature combo after adding " + useCaseConfig + " with " + surfaceConfig + " due to [" + validatingBuilder.getInvalidReason() + "]; surfaceConfigList = " + list + ", featureSettings = " + featureSettings + ", newUseCaseConfigs = " + list2);
            i2 = i3;
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        x.e(sessionConfigBuild, "build(...)");
        return sessionConfigBuild;
    }

    private final FeatureSettings createFeatureSettings(int i2, boolean z, Map<UseCaseConfig<?>, DynamicRange> map, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range<Integer> range, boolean z6) {
        FeatureSettings featureSettings = new FeatureSettings(i2, getRequiredMaxBitDepth(map), z, videoStabilization, z2, z3, z4, z5, range, z6);
        validateSelf(featureSettings);
        return featureSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0118 A[PHI: r13 r14 r17
  0x0118: PHI (r13v3 int) = (r13v1 int), (r13v1 int), (r13v5 int), (r13v6 int) binds: [B:33:0x00f4, B:35:0x00fa, B:41:0x0107, B:45:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r14v2 boolean) = (r14v1 boolean), (r14v1 boolean), (r14v1 boolean), (r14v3 boolean) binds: [B:33:0x00f4, B:35:0x00fa, B:41:0x0107, B:45:0x0114] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r17v3 java.util.List<android.util.Size>) = 
  (r17v1 java.util.List<android.util.Size>)
  (r17v1 java.util.List<android.util.Size>)
  (r17v5 java.util.List<android.util.Size>)
  (r17v6 java.util.List<android.util.Size>)
 binds: [B:33:0x00f4, B:35:0x00fa, B:41:0x0107, B:45:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.BestSizesAndMaxFpsForConfigs findBestSizesAndFps(java.util.List<? extends java.util.List<android.util.Size>> r26, java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> r27, final java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> r28, int r29, final java.util.List<java.lang.Integer> r30, final androidx.camera.camera2.adapter.SupportedSurfaceCombination.FeatureSettings r31, java.util.List<androidx.camera.core.impl.SurfaceConfig> r32, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.DynamicRange> r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.findBestSizesAndFps(java.util.List, java.util.List, java.util.List, int, java.util.List, androidx.camera.camera2.adapter.SupportedSurfaceCombination$FeatureSettings, java.util.List, java.util.Map, boolean):androidx.camera.camera2.adapter.SupportedSurfaceCombination$BestSizesAndMaxFpsForConfigs");
    }

    private static final boolean findBestSizesAndFps$lambda$2(f<Boolean> fVar) {
        return fVar.getValue().booleanValue();
    }

    private final void generate10BitSupportedCombinationList() {
        this.surfaceCombinations10Bit.addAll(GuaranteedConfigurationsUtil.get10BitSupportedCombinationList());
    }

    private final void generateConcurrentSupportedCombinationList() {
        this.concurrentSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getConcurrentSupportedCombinationList());
    }

    private final void generateHighSpeedSupportedCombinationList() {
        if (this.highSpeedResolver.isHighSpeedSupported()) {
            this.highSpeedSurfaceCombinations.clear();
            Size maxSize = this.highSpeedResolver.getMaxSize();
            if (maxSize != null) {
                this.highSpeedSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateHighSpeedSupportedCombinationList(maxSize, getUpdatedSurfaceSizeDefinitionByFormat(34)));
            }
        }
    }

    private final void generatePreviewStabilizationSupportedCombinationList() {
        this.previewStabilizationSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getPreviewStabilizationSupportedCombinationList());
    }

    private final void generateStreamUseCaseSupportedCombinationList() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.surfaceCombinationsStreamUseCase.addAll(GuaranteedConfigurationsUtil.INSTANCE.getStreamUseCaseSupportedCombinationList());
        }
    }

    private final Map<UseCaseConfig<?>, StreamSpec> generateSuggestedStreamSpecMap(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, List<? extends UseCaseConfig<?>> list, List<Integer> list2, Map<UseCaseConfig<?>, DynamicRange> map, FeatureSettings featureSettings) {
        Range<Integer>[] frameRateRangesFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Range<Integer> closestSupportedDeviceFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        if (!x.n(featureSettings.getTargetFpsRange(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (featureSettings.isHighSpeedOn()) {
                frameRateRangesFor = this.highSpeedResolver.getFrameRateRangesFor(bestSizesAndMaxFpsForConfigs.getBestSizes());
            } else {
                CameraMetadata cameraMetadata = this.cameraMetadata;
                CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
                x.e(key, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
                frameRateRangesFor = (Range[]) cameraMetadata.get(key);
            }
            Range<Integer> closestSupportedDeviceFrameRate2 = getClosestSupportedDeviceFrameRate(featureSettings.getTargetFpsRange(), bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes(), frameRateRangesFor);
            if ((featureSettings.isFeatureComboInvocation() || featureSettings.isStrictFpsRequired()) && !x.n(closestSupportedDeviceFrameRate2, featureSettings.getTargetFpsRange())) {
                Range<Integer> targetFpsRange = featureSettings.getTargetFpsRange();
                int maxFpsForBestSizes = bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes();
                String string = Arrays.toString(frameRateRangesFor);
                x.e(string, "toString(...)");
                throw new IllegalArgumentException("Target FPS range " + targetFpsRange + " is not supported. Max FPS supported by the calculated best combination: " + maxFpsForBestSizes + ". Calculated best FPS range for device: " + closestSupportedDeviceFrameRate2 + ". Device supported FPS ranges: " + string + ".");
            }
            closestSupportedDeviceFrameRate = closestSupportedDeviceFrameRate2;
        } else if (featureSettings.isHighSpeedOn()) {
            closestSupportedDeviceFrameRate = getClosestSupportedDeviceFrameRate(HighSpeedResolver.Companion.getDEFAULT_FPS(), bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes(), this.highSpeedResolver.getFrameRateRangesFor(bestSizesAndMaxFpsForConfigs.getBestSizes()));
        }
        int i2 = 0;
        for (UseCaseConfig<?> useCaseConfig : list) {
            int i3 = i2 + 1;
            StreamSpec.Builder builder = StreamSpec.builder(bestSizesAndMaxFpsForConfigs.getBestSizes().get(list2.indexOf(Integer.valueOf(i2))));
            builder.setSessionType(featureSettings.isHighSpeedOn() ? 1 : 0);
            DynamicRange dynamicRange = map.get(useCaseConfig);
            if (dynamicRange == null) {
                throw new IllegalStateException("Required value was null.");
            }
            builder.setDynamicRange(dynamicRange);
            builder.setImplementationOptions(StreamUseCaseUtil.INSTANCE.getStreamSpecImplementationOptions(useCaseConfig));
            builder.setZslDisabled(featureSettings.getHasVideoCapture());
            x.e(builder, "setZslDisabled(...)");
            if (!x.n(closestSupportedDeviceFrameRate, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                builder.setExpectedFrameRateRange(closestSupportedDeviceFrameRate);
            }
            linkedHashMap.put(useCaseConfig, builder.build());
            i2 = i3;
        }
        return linkedHashMap;
    }

    private final void generateSupportedCombinationList() {
        this.surfaceCombinations.addAll(GuaranteedConfigurationsUtil.generateSupportedCombinationList(this.hardwareLevel, this.isRawSupported, this.isBurstCaptureSupported));
        this.surfaceCombinations.addAll(this.extraSupportedSurfaceCombinationsContainer.get(this.cameraId));
    }

    private final void generateSurfaceSizeDefinition() throws NumberFormatException {
        SurfaceSizeDefinition surfaceSizeDefinitionCreate = SurfaceSizeDefinition.create(SizeUtil.RESOLUTION_VGA, new LinkedHashMap(), this.displayInfoManager.getPreviewSize(), new LinkedHashMap(), getRecordSize(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
        x.e(surfaceSizeDefinitionCreate, "create(...)");
        setSurfaceSizeDefinition$camera_camera2(surfaceSizeDefinitionCreate);
    }

    private final void generateUltraHdrSupportedCombinationList() {
        this.surfaceCombinationsUltraHdr.addAll(GuaranteedConfigurationsUtil.getUltraHdrSupportedCombinationList());
    }

    private final void generateUltraHighResolutionSupportedCombinationList() {
        this.ultraHighSurfaceCombinations.addAll(GuaranteedConfigurationsUtil.getUltraHighResolutionSupportedCombinationList());
    }

    private final List<List<Size>> getAllPossibleSizeArrangements(List<? extends List<Size>> list) {
        Iterator<? extends List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int size3 = list.size();
        int i3 = size;
        int i4 = 0;
        while (i4 < size3) {
            int i5 = i4 + 1;
            List<Size> list2 = list.get(i4);
            for (int i6 = 0; i6 < size; i6++) {
                ((List) arrayList.get(i6)).add(list2.get((i6 % i3) / size2));
            }
            if (i4 < list.size() - 1) {
                i3 = size2;
                size2 /= list.get(i5).size();
            }
            i4 = i5;
        }
        return arrayList;
    }

    private final boolean getAndValidateIsStrictFpsRequired(boolean z, Boolean bool) {
        if (bool == null || x.n(bool, Boolean.valueOf(z))) {
            return z;
        }
        throw new IllegalStateException("All isStrictFpsRequired should be the same");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod getCheckingMethod(java.util.Collection<androidx.camera.core.DynamicRange> r1, android.util.Range<java.lang.Integer> r2, androidx.camera.core.impl.stabilization.VideoStabilization r3, boolean r4, boolean r5) {
        /*
            r0 = this;
            if (r5 != 0) goto L5
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r0 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO
            return r0
        L5:
            androidx.camera.core.DynamicRange r0 = androidx.camera.core.DynamicRange.HLG_10_BIT
            boolean r0 = r1.contains(r0)
            if (r2 == 0) goto L1f
            java.lang.Comparable r1 = r2.getUpper()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L1f
            int r1 = r1.intValue()
            r2 = 60
            if (r1 != r2) goto L1f
            int r0 = r0 + 1
        L1f:
            androidx.camera.core.impl.stabilization.VideoStabilization r1 = androidx.camera.core.impl.stabilization.VideoStabilization.ON
            if (r3 == r1) goto L27
            androidx.camera.core.impl.stabilization.VideoStabilization r1 = androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW
            if (r3 != r1) goto L29
        L27:
            int r0 = r0 + 1
        L29:
            if (r4 == 0) goto L2d
            int r0 = r0 + 1
        L2d:
            r1 = 1
            if (r0 <= r1) goto L33
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r0 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITH_FEATURE_COMBO
            return r0
        L33:
            if (r0 != r1) goto L38
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r0 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO_FIRST_AND_THEN_WITH_IT
            return r0
        L38:
            androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod r0 = androidx.camera.camera2.adapter.SupportedSurfaceCombination.CheckingMethod.WITHOUT_FEATURE_COMBO
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.getCheckingMethod(java.util.Collection, android.util.Range, androidx.camera.core.impl.stabilization.VideoStabilization, boolean, boolean):androidx.camera.camera2.adapter.SupportedSurfaceCombination$CheckingMethod");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Range<java.lang.Integer> getClosestSupportedDeviceFrameRate(android.util.Range<java.lang.Integer> r7, int r8, android.util.Range<java.lang.Integer>[] r9) {
        /*
            r6 = this;
            android.util.Range<java.lang.Integer> r0 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r0 = h.g.b.x.n(r7, r0)
            java.lang.String r1 = "FRAME_RATE_RANGE_UNSPECIFIED"
            if (r0 == 0) goto L10
            android.util.Range<java.lang.Integer> r6 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            h.g.b.x.e(r6, r1)
            return r6
        L10:
            if (r9 != 0) goto L18
            android.util.Range<java.lang.Integer> r6 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            h.g.b.x.e(r6, r1)
            return r6
        L18:
            android.util.Range r0 = new android.util.Range
            java.lang.Comparable r1 = r7.getLower()
            java.lang.String r2 = "getLower(...)"
            h.g.b.x.e(r1, r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = java.lang.Math.min(r1, r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r7 = r7.getUpper()
            java.lang.String r2 = "getUpper(...)"
            h.g.b.x.e(r7, r2)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Comparable r7 = (java.lang.Comparable) r7
            r0.<init>(r1, r7)
            android.util.Range<java.lang.Integer> r7 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            r1 = 0
            r2 = r1
        L53:
            int r3 = r9.length
            if (r1 >= r3) goto Le4
            r3 = r9[r1]
            java.lang.Comparable r4 = r3.getLower()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r8 < r4) goto Le0
            android.util.Range<java.lang.Integer> r4 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED
            boolean r4 = h.g.b.x.n(r7, r4)
            r5 = 1
            if (r5 != r4) goto L6e
            r7 = r3
        L6e:
            boolean r4 = h.g.b.x.n(r3, r0)
            if (r4 == 0) goto L77
            r7 = r3
            goto Le4
        L77:
            android.util.Range r4 = r3.intersect(r0)     // Catch: java.lang.IllegalArgumentException -> L9e
            h.g.b.x.c(r4)     // Catch: java.lang.IllegalArgumentException -> L9e
            int r4 = r6.getRangeLength(r4)     // Catch: java.lang.IllegalArgumentException -> L9e
            if (r2 != 0) goto L87
            r7 = r3
            r2 = r4
            goto Le0
        L87:
            if (r4 < r2) goto Le0
            h.g.b.x.c(r7)     // Catch: java.lang.IllegalArgumentException -> L9e
            android.util.Range r7 = r6.compareIntersectingRanges(r0, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L9e
            android.util.Range r4 = r0.intersect(r7)     // Catch: java.lang.IllegalArgumentException -> L9e
            java.lang.String r5 = "intersect(...)"
            h.g.b.x.e(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L9e
            int r2 = r6.getRangeLength(r4)     // Catch: java.lang.IllegalArgumentException -> L9e
            goto Le0
        L9e:
            if (r2 != 0) goto Le0
            int r4 = r6.getRangeDistance(r3, r0)
            h.g.b.x.c(r7)
            int r5 = r6.getRangeDistance(r7, r0)
            if (r4 >= r5) goto Lae
            goto Ldf
        Lae:
            int r4 = r6.getRangeDistance(r3, r0)
            h.g.b.x.c(r7)
            int r5 = r6.getRangeDistance(r7, r0)
            if (r4 != r5) goto Le0
            java.lang.Comparable r4 = r3.getLower()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Comparable r5 = r7.getUpper()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r4 <= r5) goto Ld2
            goto Ldf
        Ld2:
            int r4 = r6.getRangeLength(r3)
            h.g.b.x.c(r7)
            int r5 = r6.getRangeLength(r7)
            if (r4 >= r5) goto Le0
        Ldf:
            r7 = r3
        Le0:
            int r1 = r1 + 1
            goto L53
        Le4:
            h.g.b.x.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.getClosestSupportedDeviceFrameRate(android.util.Range, int, android.util.Range[]):android.util.Range");
    }

    private final int getCombinedMaximumFps(int i2, int i3, Size size, boolean z, int i4) {
        return Math.min(i2, getMaxFrameRate(i3, size, z, i4));
    }

    private final int getCurrentConfigFrameRateCeiling(List<Size> list, List<? extends UseCaseConfig<?>> list2, List<Integer> list3, int i2, boolean z) {
        int i3 = 0;
        int combinedMaximumFps = i2;
        for (Size size : list) {
            int i4 = i3 + 1;
            UseCaseConfig<?> useCaseConfig = list2.get(list3.get(i3).intValue());
            combinedMaximumFps = getCombinedMaximumFps(combinedMaximumFps, useCaseConfig.getInputFormat(), size, z, useCaseConfig.getCustomMaxFrameRate(size));
            i3 = i4;
        }
        return combinedMaximumFps;
    }

    private final int getMaxFrameRate(int i2, Size size) {
        long outputMinFrameDuration = getStreamConfigurationMapCompat().getOutputMinFrameDuration(i2, size);
        if (outputMinFrameDuration > 0) {
            return (int) (1.0E9d / outputMinFrameDuration);
        }
        if (!this.isManualSensorSupported) {
            return Integer.MAX_VALUE;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled(Log.TAG)) {
            return 0;
        }
        android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "minFrameDuration: " + outputMinFrameDuration + " is invalid for imageFormat = " + i2 + ", size = " + size);
        return 0;
    }

    public static /* synthetic */ Size getMaxOutputSizeByFormat$camera_camera2$default(SupportedSurfaceCombination supportedSurfaceCombination, StreamConfigurationMap streamConfigurationMap, int i2, boolean z, Rational rational, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            rational = null;
        }
        return supportedSurfaceCombination.getMaxOutputSizeByFormat$camera_camera2(streamConfigurationMap, i2, z, rational);
    }

    private final int getMaxSupportedFpsFromAttachedSurfaces(List<? extends AttachedSurfaceInfo> list, boolean z) {
        int combinedMaximumFps = Integer.MAX_VALUE;
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            int imageFormat = attachedSurfaceInfo.getImageFormat();
            Size size = attachedSurfaceInfo.getSize();
            x.e(size, "getSize(...)");
            combinedMaximumFps = getCombinedMaximumFps(combinedMaximumFps, imageFormat, size, z, attachedSurfaceInfo.getCustomMaxFrameRate());
        }
        return combinedMaximumFps;
    }

    private final List<SurfaceConfig> getOrderedSupportedStreamUseCaseSurfaceConfigList(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        if (!StreamUseCaseUtil.INSTANCE.shouldUseStreamUseCase(featureSettings)) {
            return null;
        }
        for (SurfaceCombination surfaceCombination : this.surfaceCombinationsStreamUseCase) {
            x.c(list);
            final List<SurfaceConfig> orderedSupportedSurfaceConfigList = surfaceCombination.getOrderedSupportedSurfaceConfigList(list);
            if (orderedSupportedSurfaceConfigList != null) {
                boolean zAreCaptureTypesEligible = StreamUseCaseUtil.INSTANCE.areCaptureTypesEligible(map, map2, orderedSupportedSurfaceConfigList);
                f fVarA = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.adapter.SupportedSurfaceCombination$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(StreamUseCaseUtil.INSTANCE.areStreamUseCasesAvailableForSurfaceConfigs(this.f$0.cameraMetadata, orderedSupportedSurfaceConfigList));
                    }
                });
                if (zAreCaptureTypesEligible && ((Boolean) fVarA.getValue()).booleanValue()) {
                    return orderedSupportedSurfaceConfigList;
                }
            }
        }
        return null;
    }

    private final List<SurfaceConfig> getOrderedSurfaceConfigListForStreamUseCase(List<? extends List<Size>> list, List<? extends AttachedSurfaceInfo> list2, List<? extends UseCaseConfig<?>> list3, List<Integer> list4, FeatureSettings featureSettings, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2) {
        Iterator<? extends List<Size>> it = list.iterator();
        List<SurfaceConfig> orderedSupportedStreamUseCaseSurfaceConfigList = null;
        while (it.hasNext()) {
            orderedSupportedStreamUseCaseSurfaceConfigList = getOrderedSupportedStreamUseCaseSurfaceConfigList(featureSettings, getSurfaceConfigList(featureSettings.getCameraMode(), list2, it.next(), list3, list4, map, map2, false), map, map2);
            if (orderedSupportedStreamUseCaseSurfaceConfigList != null) {
                break;
            }
            map.clear();
            map2.clear();
        }
        return orderedSupportedStreamUseCaseSurfaceConfigList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Size[] getOutputSizes(android.hardware.camera2.params.StreamConfigurationMap r5, int r6, android.util.Rational r7) {
        /*
            r4 = this;
            r0 = 0
            androidx.camera.camera2.adapter.SupportedSurfaceCombination r4 = (androidx.camera.camera2.adapter.SupportedSurfaceCombination) r4     // Catch: java.lang.Throwable -> L19
            r4 = 34
            if (r6 != r4) goto L10
            if (r5 == 0) goto L17
            java.lang.Class<android.graphics.SurfaceTexture> r4 = android.graphics.SurfaceTexture.class
            android.util.Size[] r4 = r5.getOutputSizes(r4)     // Catch: java.lang.Throwable -> L19
            goto L1e
        L10:
            if (r5 == 0) goto L17
            android.util.Size[] r4 = r5.getOutputSizes(r6)     // Catch: java.lang.Throwable -> L19
            goto L1e
        L17:
            r4 = r0
            goto L1e
        L19:
            r4 = move-exception
            java.lang.Object r4 = e.b.c.a(r4)
        L1e:
            boolean r5 = r4 instanceof h.l
            r6 = 1
            if (r6 != r5) goto L24
            r4 = r0
        L24:
            android.util.Size[] r4 = (android.util.Size[]) r4
            if (r4 == 0) goto L53
            if (r7 == 0) goto L52
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            int r6 = r4.length
            r0 = 0
            r1 = r0
        L34:
            if (r1 >= r6) goto L44
            r2 = r4[r1]
            boolean r3 = androidx.camera.core.impl.utils.AspectRatioUtil.hasMatchingAspectRatio(r2, r7)
            if (r3 == 0) goto L41
            r5.add(r2)
        L41:
            int r1 = r1 + 1
            goto L34
        L44:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            android.util.Size[] r4 = new android.util.Size[r0]
            java.lang.Object[] r4 = r5.toArray(r4)
            r0 = r4
            android.util.Size[] r0 = (android.util.Size[]) r0
            goto L53
        L52:
            r0 = r4
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.SupportedSurfaceCombination.getOutputSizes(android.hardware.camera2.params.StreamConfigurationMap, int, android.util.Rational):android.util.Size[]");
    }

    static /* synthetic */ Size[] getOutputSizes$default(SupportedSurfaceCombination supportedSurfaceCombination, StreamConfigurationMap streamConfigurationMap, int i2, Rational rational, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            rational = null;
        }
        return supportedSurfaceCombination.getOutputSizes(streamConfigurationMap, i2, rational);
    }

    private final int getRangeDistance(Range<Integer> range, Range<Integer> range2) {
        int iIntValue;
        int iIntValue2;
        if (range.contains((Range<Integer>) range2.getUpper()) || range.contains((Range<Integer>) range2.getLower())) {
            throw new IllegalArgumentException("Ranges must not intersect");
        }
        if (((Number) range.getLower()).intValue() > ((Number) range2.getUpper()).intValue()) {
            iIntValue = ((Number) range.getLower()).intValue();
            Object upper = range2.getUpper();
            x.e(upper, "getUpper(...)");
            iIntValue2 = ((Number) upper).intValue();
        } else {
            iIntValue = ((Number) range2.getLower()).intValue();
            Object upper2 = range.getUpper();
            x.e(upper2, "getUpper(...)");
            iIntValue2 = ((Number) upper2).intValue();
        }
        return iIntValue - iIntValue2;
    }

    private final int getRangeLength(Range<Integer> range) {
        int iIntValue = ((Number) range.getUpper()).intValue();
        Object lower = range.getLower();
        x.e(lower, "getLower(...)");
        return (iIntValue - ((Number) lower).intValue()) + 1;
    }

    private final Size getRecordSize() throws NumberFormatException {
        try {
            Integer.parseInt(this.cameraId);
            Size recordSizeFromCamcorderProfile = getRecordSizeFromCamcorderProfile();
            if (recordSizeFromCamcorderProfile != null) {
                return recordSizeFromCamcorderProfile;
            }
        } catch (NumberFormatException unused) {
        }
        Size recordSizeFromStreamConfigurationMapCompat = getRecordSizeFromStreamConfigurationMapCompat();
        if (recordSizeFromStreamConfigurationMapCompat != null) {
            return recordSizeFromStreamConfigurationMapCompat;
        }
        Size size = SizeUtil.RESOLUTION_480P;
        x.e(size, "RESOLUTION_480P");
        return size;
    }

    private final Size getRecordSizeFromCamcorderProfile() {
        EncoderProfilesProxy all;
        Iterator it = i.i(1, 13, 10, 8, 12, 6, 5, 4).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (this.encoderProfilesProvider.hasProfile(iIntValue) && (all = this.encoderProfilesProvider.getAll(iIntValue)) != null) {
                List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles = all.getVideoProfiles();
                x.e(videoProfiles, "getVideoProfiles(...)");
                if (!videoProfiles.isEmpty()) {
                    EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = all.getVideoProfiles().get(0);
                    x.c(videoProfileProxy);
                    return videoProfileProxy.getResolution();
                }
            }
        }
        return null;
    }

    private final Size getRecordSizeFromStreamConfigurationMapCompat() {
        Object objA;
        StreamConfigurationMap streamConfigurationMap = this.streamConfigurationMapCompat.toStreamConfigurationMap();
        try {
            SupportedSurfaceCombination supportedSurfaceCombination = this;
            objA = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(MediaRecorder.class) : null;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        if (true == (objA instanceof l)) {
            objA = null;
        }
        Size[] sizeArr = (Size[]) objA;
        if (sizeArr == null) {
            return null;
        }
        Arrays.sort(sizeArr, new CompareSizesByArea(true));
        for (Size size : sizeArr) {
            if (size.getWidth() <= SizeUtil.RESOLUTION_1080P.getWidth() && size.getHeight() <= SizeUtil.RESOLUTION_1080P.getHeight()) {
                return size;
            }
        }
        return null;
    }

    private final int getRequiredMaxBitDepth(Map<UseCaseConfig<?>, DynamicRange> map) {
        Iterator<DynamicRange> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.cameraMetadata.get(key);
        if (streamConfigurationMap != null) {
            return new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    public static /* synthetic */ SurfaceStreamSpecQueryResult getSuggestedStreamSpecifications$default(SupportedSurfaceCombination supportedSurfaceCombination, int i2, List list, Map map, VideoStabilization videoStabilization, boolean z, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            videoStabilization = VideoStabilization.UNSPECIFIED;
        }
        return supportedSurfaceCombination.getSuggestedStreamSpecifications(i2, list, map, videoStabilization, ((i3 & 16) == 0) & z, z2, z3);
    }

    private final List<List<Size>> getSupportedOutputSizesList(Map<UseCaseConfig<?>, ? extends List<Size>> map, List<? extends UseCaseConfig<?>> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            List<Size> list3 = map.get(list.get(iIntValue));
            x.c(list3);
            arrayList.add(applyResolutionSelectionOrderRelatedWorkarounds(list3, list.get(iIntValue).getInputFormat()));
        }
        return arrayList;
    }

    private final List<SurfaceCombination> getSurfaceCombinationsByFeatureSettings(FeatureSettings featureSettings) {
        if (this.featureSettingsToSupportedCombinationsMap.containsKey(featureSettings)) {
            List<SurfaceCombination> list = this.featureSettingsToSupportedCombinationsMap.get(featureSettings);
            x.c(list);
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (featureSettings.getRequiresFeatureComboQuery()) {
            arrayList.addAll(GuaranteedConfigurationsUtil.INSTANCE.getQueryableFcqCombinations$camera_camera2(this.cameraMetadata, featureSettings.getVideoStabilization()));
        } else if (featureSettings.isUltraHdrOn()) {
            if (this.surfaceCombinationsUltraHdr.isEmpty()) {
                generateUltraHdrSupportedCombinationList();
            }
            if (featureSettings.getCameraMode() == 0) {
                arrayList.addAll(this.surfaceCombinationsUltraHdr);
            }
        } else if (featureSettings.isHighSpeedOn()) {
            if (this.highSpeedSurfaceCombinations.isEmpty()) {
                generateHighSpeedSupportedCombinationList();
            }
            arrayList.addAll(this.highSpeedSurfaceCombinations);
        } else if (featureSettings.getRequiredMaxBitDepth() == 8) {
            int cameraMode = featureSettings.getCameraMode();
            if (cameraMode == 1) {
                arrayList = this.concurrentSurfaceCombinations;
            } else if (cameraMode != 2) {
                arrayList.addAll(featureSettings.getVideoStabilization() == VideoStabilization.PREVIEW ? this.previewStabilizationSurfaceCombinations : this.surfaceCombinations);
            } else {
                arrayList.addAll(this.ultraHighSurfaceCombinations);
                arrayList.addAll(this.surfaceCombinations);
            }
        } else if (featureSettings.getRequiredMaxBitDepth() == 10 && featureSettings.getCameraMode() == 0) {
            arrayList.addAll(this.surfaceCombinations10Bit);
        }
        this.featureSettingsToSupportedCombinationsMap.put(featureSettings, arrayList);
        return arrayList;
    }

    private final List<SurfaceConfig> getSurfaceConfigList(int i2, List<? extends AttachedSurfaceInfo> list, List<Size> list2, List<? extends UseCaseConfig<?>> list3, List<Integer> list4, Map<Integer, AttachedSurfaceInfo> map, Map<Integer, UseCaseConfig<?>> map2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
            SurfaceConfig surfaceConfig = attachedSurfaceInfo.getSurfaceConfig();
            x.e(surfaceConfig, "getSurfaceConfig(...)");
            arrayList.add(surfaceConfig);
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), attachedSurfaceInfo);
            }
        }
        int i3 = 0;
        for (Size size : list2) {
            int i4 = i3 + 1;
            UseCaseConfig<?> useCaseConfig = list3.get(list4.get(i3).intValue());
            int inputFormat = useCaseConfig.getInputFormat();
            StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            x.e(streamUseCase, "getStreamUseCase(...)");
            arrayList.add(SurfaceConfig.Companion.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), i2, z ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), useCaseConfig);
            }
            i3 = i4;
        }
        return arrayList;
    }

    private final Range<Integer> getTargetFpsRange(List<? extends AttachedSurfaceInfo> list, List<? extends UseCaseConfig<?>> list2, List<Integer> list3, boolean z) {
        Range<Integer> updatedTargetFrameRate = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        x.e(updatedTargetFrameRate, "FRAME_RATE_RANGE_UNSPECIFIED");
        Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            Range<Integer> targetFrameRate = it.next().getTargetFrameRate();
            x.e(targetFrameRate, "getTargetFrameRate(...)");
            updatedTargetFrameRate = getUpdatedTargetFrameRate(targetFrameRate, updatedTargetFrameRate, z);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            Range<Integer> targetFrameRate2 = list2.get(it2.next().intValue()).getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            x.c(targetFrameRate2);
            updatedTargetFrameRate = getUpdatedTargetFrameRate(targetFrameRate2, updatedTargetFrameRate, z);
        }
        return updatedTargetFrameRate;
    }

    private final Range<Integer> getUpdatedTargetFrameRate(Range<Integer> range, Range<Integer> range2, boolean z) {
        if (x.n(range2, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) && x.n(range, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            Range<Integer> range3 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            x.e(range3, "FRAME_RATE_RANGE_UNSPECIFIED");
            return range3;
        }
        if (x.n(range2, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            return range;
        }
        if (!x.n(range, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
            if (z) {
                Preconditions.checkState(x.n(range, range2), "All targetFrameRate should be the same if strict fps is required");
                return range;
            }
            try {
                Range rangeIntersect = range2.intersect(range);
                x.c(rangeIntersect);
                return rangeIntersect;
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private final List<Integer> getUseCasesPriorityOrder(List<? extends UseCaseConfig<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends UseCaseConfig<?>> it = list.iterator();
        while (it.hasNext()) {
            Integer numValueOf = Integer.valueOf(it.next().getSurfaceOccupancyPriority(0));
            if (!arrayList2.contains(numValueOf)) {
                arrayList2.add(numValueOf);
            }
        }
        i.s(arrayList2);
        i.F(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            for (UseCaseConfig<?> useCaseConfig : list) {
                if (iIntValue == useCaseConfig.getSurfaceOccupancyPriority(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(useCaseConfig)));
                }
            }
        }
        return arrayList;
    }

    private final boolean isConfigFrameRateAcceptable(int i2, Range<Integer> range, int i3) {
        return x.n(range, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || i3 >= i2 || i3 >= ((Number) range.getUpper()).intValue();
    }

    private final boolean isStrictFpsRequired(List<? extends AttachedSurfaceInfo> list, List<? extends UseCaseConfig<?>> list2) {
        Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
        Boolean boolValueOf = null;
        while (it.hasNext()) {
            boolean zIsStrictFrameRateRequired = it.next().isStrictFrameRateRequired();
            getAndValidateIsStrictFpsRequired(zIsStrictFrameRateRequired, boolValueOf);
            boolValueOf = Boolean.valueOf(zIsStrictFrameRateRequired);
        }
        Iterator<? extends UseCaseConfig<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            boolean zIsStrictFrameRateRequired2 = it2.next().isStrictFrameRateRequired();
            getAndValidateIsStrictFpsRequired(zIsStrictFrameRateRequired2, boolValueOf);
            boolValueOf = Boolean.valueOf(zIsStrictFrameRateRequired2);
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private final boolean isUseCasesCombinationSupported(FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            SurfaceConfig surfaceConfig = it.next().getSurfaceConfig();
            x.e(surfaceConfig, "getSurfaceConfig(...)");
            arrayList.add(surfaceConfig);
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        for (UseCaseConfig<?> useCaseConfig : map.keySet()) {
            List<Size> list2 = map.get(useCaseConfig);
            if (list2 == null || list2.isEmpty()) {
                throw new IllegalArgumentException("No available output size is found for " + useCaseConfig + ".");
            }
            Size size = (Size) Collections.min(list2, compareSizesByArea);
            int inputFormat = useCaseConfig.getInputFormat();
            StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
            x.e(streamUseCase, "getStreamUseCase(...)");
            SurfaceConfig.Companion companion = SurfaceConfig.Companion;
            x.c(size);
            arrayList.add(companion.transformSurfaceConfig(inputFormat, size, getUpdatedSurfaceSizeDefinitionByFormat(inputFormat), featureSettings.getCameraMode(), SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase));
        }
        return checkSupported$default(this, featureSettings, arrayList, null, null, null, 28, null);
    }

    private final void populateReducedSizeListAndUniqueMaxFpsMap(FeatureSettings featureSettings, Size size, int i2, int i3, StreamUseCase streamUseCase, boolean z, Map<SurfaceConfig.ConfigSize, Set<Integer>> map, List<Size> list) {
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.Companion.transformSurfaceConfig(i2, size, getUpdatedSurfaceSizeDefinitionByFormat(i2), featureSettings.getCameraMode(), featureSettings.getRequiresFeatureComboQuery() ? SurfaceConfig.ConfigSource.FEATURE_COMBINATION_TABLE : SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase).getConfigSize();
        int maxFrameRate = (!x.n(featureSettings.getTargetFpsRange(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) || z) ? getMaxFrameRate(i2, size, featureSettings.isHighSpeedOn(), i3) : Integer.MAX_VALUE;
        if (featureSettings.isFeatureComboInvocation()) {
            if (configSize == SurfaceConfig.ConfigSize.NOT_SUPPORT) {
                return;
            }
            if (!x.n(featureSettings.getTargetFpsRange(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED) && maxFrameRate < ((Number) featureSettings.getTargetFpsRange().getUpper()).intValue()) {
                return;
            }
        }
        LinkedHashSet linkedHashSet = map.get(configSize);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(configSize, linkedHashSet);
        }
        Integer numValueOf = Integer.valueOf(maxFrameRate);
        if (linkedHashSet.contains(numValueOf)) {
            return;
        }
        list.add(size);
        linkedHashSet.add(numValueOf);
    }

    private final void populateStreamUseCaseIfSameSavedSizes(BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigs, List<SurfaceConfig> list, List<? extends AttachedSurfaceInfo> list2, Map<AttachedSurfaceInfo, StreamSpec> map, Map<UseCaseConfig<?>, StreamSpec> map2, Map<Integer, AttachedSurfaceInfo> map3, Map<Integer, UseCaseConfig<?>> map4) {
        if (list == null || bestSizesAndMaxFpsForConfigs.getMaxFpsForBestSizes() != bestSizesAndMaxFpsForConfigs.getMaxFpsForStreamUseCase()) {
            return;
        }
        int size = bestSizesAndMaxFpsForConfigs.getBestSizes().size();
        List<Size> bestSizesForStreamUseCase = bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase();
        x.c(bestSizesForStreamUseCase);
        if (size == bestSizesForStreamUseCase.size()) {
            List<k> listAr = i.ar(bestSizesAndMaxFpsForConfigs.getBestSizes(), bestSizesAndMaxFpsForConfigs.getBestSizesForStreamUseCase());
            if (!(listAr instanceof Collection) || !listAr.isEmpty()) {
                for (k kVar : listAr) {
                    if (!x.n(kVar.c(), kVar.d())) {
                        return;
                    }
                }
            }
            if (StreamUseCaseUtil.INSTANCE.populateStreamUseCaseStreamSpecOptionWithInteropOverride(this.cameraMetadata, list2, map2, map)) {
                return;
            }
            StreamUseCaseUtil.INSTANCE.populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(map2, map, map3, map4, list);
        }
    }

    private final void refreshPreviewSize() throws NumberFormatException {
        this.displayInfoManager.refreshPreviewSize();
        if (this.surfaceSizeDefinition == null) {
            generateSurfaceSizeDefinition();
            return;
        }
        SurfaceSizeDefinition surfaceSizeDefinitionCreate = SurfaceSizeDefinition.create(getSurfaceSizeDefinition$camera_camera2().getAnalysisSize(), getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap(), this.displayInfoManager.getPreviewSize(), getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap(), getSurfaceSizeDefinition$camera_camera2().getRecordSize(), getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap(), getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap(), getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap());
        x.e(surfaceSizeDefinitionCreate, "create(...)");
        setSurfaceSizeDefinition$camera_camera2(surfaceSizeDefinitionCreate);
    }

    private final SurfaceStreamSpecQueryResult resolveSpecsByCheckingMethod(CheckingMethod checkingMethod, FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map, List<? extends UseCaseConfig<?>> list2, List<Integer> list3, Map<UseCaseConfig<?>, DynamicRange> map2, boolean z) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(checkingMethod);
            android.util.Log.d(str, "resolveSpecsByCheckingMethod: checkingMethod = ".concat(String.valueOf(checkingMethod)));
        }
        CheckingMethod checkingMethod2 = CheckingMethod.WITHOUT_FEATURE_COMBO;
        int iOrdinal = checkingMethod.ordinal();
        if (iOrdinal == 0) {
            FeatureSettings featureSettingsCopy$default = FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, DisplayStrings.DS_REPORTED, null);
            validateSelf(featureSettingsCopy$default);
            return resolveSpecsBySettings(featureSettingsCopy$default, list, map, list2, list3, map2, z);
        }
        if (iOrdinal == 1) {
            Range<Integer> targetFpsRange = (featureSettings.isFeatureComboInvocation() && featureSettings.getTargetFpsRange() == StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED && featureSettings.getRequiresFeatureComboQuery()) ? FpsRangeFeature.DEFAULT_FPS_RANGE : featureSettings.getTargetFpsRange();
            FeatureSettings featureSettingsCopy$default2 = FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, targetFpsRange, false, DisplayStrings.DS_ARE_YOU_SURE_YOU_WANT_TO_REPORT_THIS_USERSS_ABUSEQ, null);
            validateSelf(featureSettingsCopy$default2);
            return resolveSpecsBySettings(featureSettingsCopy$default2, list, map, list2, list3, map2, z);
        }
        if (iOrdinal != 2) {
            throw new h.i();
        }
        try {
            FeatureSettings featureSettingsCopy$default3 = FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, false, null, false, DisplayStrings.DS_REPORTED, null);
            validateSelf(featureSettingsCopy$default3);
            return resolveSpecsBySettings(featureSettingsCopy$default3, list, map, list2, list3, map2, z);
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Failed to find a supported combination without feature combo, trying again with feature combo", illegalArgumentException);
            }
            FeatureSettings featureSettingsCopy$default4 = FeatureSettings.copy$default(featureSettings, 0, 0, false, null, false, false, false, true, null, false, DisplayStrings.DS_REPORTED, null);
            validateSelf(featureSettingsCopy$default4);
            return resolveSpecsBySettings(featureSettingsCopy$default4, list, map, list2, list3, map2, z);
        }
    }

    private final SurfaceStreamSpecQueryResult resolveSpecsBySettings(FeatureSettings featureSettings, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map, List<? extends UseCaseConfig<?>> list2, List<Integer> list3, Map<UseCaseConfig<?>, DynamicRange> map2, boolean z) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(featureSettings);
            android.util.Log.d(str, "resolveSpecsBySettings: featureSettings = ".concat(String.valueOf(featureSettings)));
        }
        if (!featureSettings.isFeatureComboInvocation() && !isUseCasesCombinationSupported(featureSettings, list, map)) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.cameraId + ". May be attempting to bind too many use cases. Existing surfaces: " + list + ". New configs: " + list2 + ". GroupableFeature settings: " + featureSettings + ".");
        }
        List<List<Size>> supportedOutputSizesList = getSupportedOutputSizesList(filterSupportedSizes$camera_camera2(map, featureSettings, z), list2, list3);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        List<List<Size>> sizeArrangements = featureSettings.isHighSpeedOn() ? this.highSpeedResolver.getSizeArrangements(supportedOutputSizesList) : getAllPossibleSizeArrangements(supportedOutputSizesList);
        boolean zContainsZslUseCase = StreamUseCaseUtil.INSTANCE.containsZslUseCase(list, list2);
        List<SurfaceConfig> orderedSurfaceConfigListForStreamUseCase = null;
        if (!this.isStreamUseCaseSupported || zContainsZslUseCase) {
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
        } else {
            orderedSurfaceConfigListForStreamUseCase = getOrderedSurfaceConfigListForStreamUseCase(sizeArrangements, list, list2, list3, featureSettings, linkedHashMap3, linkedHashMap4);
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap4;
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str2 = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(orderedSurfaceConfigListForStreamUseCase);
                android.util.Log.d(str2, "orderedSurfaceConfigListForStreamUseCase = ".concat(String.valueOf(orderedSurfaceConfigListForStreamUseCase)));
            }
        }
        List<SurfaceConfig> list4 = orderedSurfaceConfigListForStreamUseCase;
        BestSizesAndMaxFpsForConfigs bestSizesAndMaxFpsForConfigsFindBestSizesAndFps = findBestSizesAndFps(sizeArrangements, list, list2, getMaxSupportedFpsFromAttachedSurfaces(list, featureSettings.isHighSpeedOn()), list3, featureSettings, list4, map2, z);
        if (bestSizesAndMaxFpsForConfigsFindBestSizesAndFps != null) {
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str3 = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps);
                android.util.Log.d(str3, "resolveSpecsBySettings: bestSizesAndFps = ".concat(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.toString()));
            }
            Map<UseCaseConfig<?>, StreamSpec> mapGenerateSuggestedStreamSpecMap = generateSuggestedStreamSpecMap(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps, list2, list3, map2, featureSettings);
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            populateStreamUseCaseIfSameSavedSizes(bestSizesAndMaxFpsForConfigsFindBestSizesAndFps, list4, list, linkedHashMap5, mapGenerateSuggestedStreamSpecMap, linkedHashMap, linkedHashMap2);
            return new SurfaceStreamSpecQueryResult(mapGenerateSuggestedStreamSpecMap, linkedHashMap5, bestSizesAndMaxFpsForConfigsFindBestSizesAndFps.getMaxFpsForAllSizes());
        }
        throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.cameraId + " and Hardware level: " + this.hardwareLevel + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + ". New configs: " + list2 + ".");
    }

    private final void updateMaximumSizeByFormat(Map<Integer, Size> map, int i2, Rational rational) {
        Size maxOutputSizeByFormat$camera_camera2 = getMaxOutputSizeByFormat$camera_camera2(this.streamConfigurationMapCompat.toStreamConfigurationMap(), i2, true, rational);
        if (maxOutputSizeByFormat$camera_camera2 != null) {
            map.put(Integer.valueOf(i2), maxOutputSizeByFormat$camera_camera2);
        }
    }

    static /* synthetic */ void updateMaximumSizeByFormat$default(SupportedSurfaceCombination supportedSurfaceCombination, Map map, int i2, Rational rational, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            rational = null;
        }
        supportedSurfaceCombination.updateMaximumSizeByFormat(map, i2, rational);
    }

    private final void updateS720pOrS1440pSizeByFormat(Map<Integer, Size> map, Size size, int i2) {
        if (this.isConcurrentCameraModeSupported) {
            Size maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, this.streamConfigurationMapCompat.toStreamConfigurationMap(), i2, false, null, 8, null);
            Integer numValueOf = Integer.valueOf(i2);
            if (maxOutputSizeByFormat$camera_camera2$default != null) {
                size = (Size) Collections.min(i.i(size, maxOutputSizeByFormat$camera_camera2$default), new CompareSizesByArea());
            }
            map.put(numValueOf, size);
        }
    }

    private final void updateUltraMaximumSizeByFormat(Map<Integer, Size> map, int i2) {
        Size maxOutputSizeByFormat$camera_camera2$default;
        if (Build.VERSION.SDK_INT < 31 || !this.isUltraHighResolutionSensorSupported) {
            return;
        }
        CameraMetadata cameraMetadata = this.cameraMetadata;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadata.get(key);
        if (streamConfigurationMap == null || (maxOutputSizeByFormat$camera_camera2$default = getMaxOutputSizeByFormat$camera_camera2$default(this, streamConfigurationMap, i2, true, null, 8, null)) == null) {
            return;
        }
        map.put(Integer.valueOf(i2), maxOutputSizeByFormat$camera_camera2$default);
    }

    private final FeatureSettings validateSelf(FeatureSettings featureSettings) {
        if (featureSettings.getCameraMode() != 0 && featureSettings.isUltraHdrOn()) {
            throw new IllegalArgumentException("Camera device Id is " + this.cameraId + ". Ultra HDR is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.");
        }
        if (featureSettings.getCameraMode() != 0 && featureSettings.getRequiredMaxBitDepth() == 10) {
            throw new IllegalArgumentException("Camera device Id is " + this.cameraId + ". 10 bit dynamic range is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.");
        }
        if (featureSettings.getCameraMode() == 0 || !featureSettings.isFeatureComboInvocation()) {
            if (featureSettings.isHighSpeedOn() && featureSettings.isFeatureComboInvocation()) {
                throw new IllegalArgumentException("High-speed session is not supported with feature combination");
            }
            if (!featureSettings.isHighSpeedOn() || this.highSpeedResolver.isHighSpeedSupported()) {
                return featureSettings;
            }
            throw new IllegalArgumentException("High-speed session is not supported on this device.");
        }
        throw new IllegalArgumentException("Camera device Id is " + this.cameraId + ". feature combination is not currently supported in " + CameraMode.toLabelString(featureSettings.getCameraMode()) + " camera mode.");
    }

    public final List<Size> applyResolutionSelectionOrderRelatedWorkarounds(List<Size> list, int i2) {
        List<Size> listAq;
        Size maximumSize;
        x.f(list, "sizeList");
        Rational rational = null;
        if (this.targetAspectRatio.get(this.cameraMetadata, this.streamConfigurationMapCompat) == 2 && (maximumSize = getUpdatedSurfaceSizeDefinitionByFormat(256).getMaximumSize(256)) != null) {
            rational = new Rational(maximumSize.getWidth(), maximumSize.getHeight());
        }
        if (rational == null) {
            listAq = i.aq(list);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (AspectRatioUtil.hasMatchingAspectRatio(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            listAq = arrayList2;
        }
        return this.resolutionCorrector.insertOrPrioritize(SurfaceConfig.Companion.getConfigType(i2), listAq);
    }

    public final boolean checkSupported(FeatureSettings featureSettings, List<SurfaceConfig> list, Map<SurfaceConfig, DynamicRange> map, List<? extends UseCaseConfig<?>> list2, List<Integer> list3) {
        x.f(featureSettings, "featureSettings");
        x.f(list, "surfaceConfigList");
        x.f(map, "dynamicRangesBySurfaceConfig");
        x.f(list2, "newUseCaseConfigs");
        x.f(list3, "useCasesPriorityOrder");
        List<SurfaceCombination> surfaceCombinationsByFeatureSettings = getSurfaceCombinationsByFeatureSettings(featureSettings);
        boolean z = false;
        if (!(surfaceCombinationsByFeatureSettings instanceof Collection) || !surfaceCombinationsByFeatureSettings.isEmpty()) {
            Iterator<T> it = surfaceCombinationsByFeatureSettings.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((SurfaceCombination) it.next()).getOrderedSupportedSurfaceConfigList(list) != null) {
                    z = true;
                    break;
                }
            }
        }
        if (!z || !featureSettings.getRequiresFeatureComboQuery()) {
            return z;
        }
        SessionConfig sessionConfigCreateFeatureComboSessionConfig = createFeatureComboSessionConfig(featureSettings, list, map, list2, list3);
        boolean zIsSupported = this.featureCombinationQuery.isSupported(sessionConfigCreateFeatureComboSessionConfig);
        List<DeferrableSurface> surfaces = sessionConfigCreateFeatureComboSessionConfig.getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        Iterator<T> it2 = surfaces.iterator();
        while (it2.hasNext()) {
            ((DeferrableSurface) it2.next()).close();
        }
        return zIsSupported;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<UseCaseConfig<?>, List<Size>> filterSupportedSizes$camera_camera2(Map<UseCaseConfig<?>, ? extends List<Size>> map, FeatureSettings featureSettings, boolean z) {
        x.f(map, "newUseCaseConfigsSupportedSizeMap");
        x.f(featureSettings, "featureSettings");
        if (featureSettings.isHighSpeedOn()) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UseCaseConfig useCaseConfig : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = map.get(useCaseConfig);
            x.c(obj);
            for (Size size : (List) obj) {
                int inputFormat = useCaseConfig.getInputFormat();
                int customMaxFrameRate = useCaseConfig.getCustomMaxFrameRate(size);
                StreamUseCase streamUseCase = useCaseConfig.getStreamUseCase();
                x.e(streamUseCase, "getStreamUseCase(...)");
                populateReducedSizeListAndUniqueMaxFpsMap(featureSettings, size, inputFormat, customMaxFrameRate, streamUseCase, z, linkedHashMap2, arrayList);
            }
            linkedHashMap.put(useCaseConfig, arrayList);
        }
        return linkedHashMap;
    }

    public final Size getMaxOutputSizeByFormat$camera_camera2(StreamConfigurationMap streamConfigurationMap, int i2, boolean z, Rational rational) {
        Size[] outputSizes = getOutputSizes(streamConfigurationMap, i2, rational);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        CompareSizesByArea compareSizesByArea = new CompareSizesByArea();
        Size size = (Size) Collections.max(c.i(outputSizes), compareSizesByArea);
        Size size2 = SizeUtil.RESOLUTION_ZERO;
        if (z) {
            Size[] highResolutionOutputSizes = streamConfigurationMap != null ? streamConfigurationMap.getHighResolutionOutputSizes(i2) : null;
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length != 0) {
                size2 = (Size) Collections.max(c.i(highResolutionOutputSizes), compareSizesByArea);
            }
        }
        return (Size) Collections.max(i.i(size, size2), compareSizesByArea);
    }

    public final SurfaceStreamSpecQueryResult getSuggestedStreamSpecifications(int i2, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map, VideoStabilization videoStabilization, boolean z, boolean z2, boolean z3) throws NumberFormatException {
        k kVar;
        boolean z4;
        Map<UseCaseConfig<?>, ? extends List<Size>> mapFilterCommonSupportedSizes = map;
        x.f(list, "attachedSurfaces");
        x.f(mapFilterCommonSupportedSizes, "newUseCaseConfigsSupportedSizeMap");
        x.f(videoStabilization, "videoStabilization");
        refreshPreviewSize();
        boolean zIsHighSpeedOn = HighSpeedResolver.Companion.isHighSpeedOn(list, mapFilterCommonSupportedSizes.keySet());
        if (zIsHighSpeedOn) {
            mapFilterCommonSupportedSizes = this.highSpeedResolver.filterCommonSupportedSizes(mapFilterCommonSupportedSizes);
        }
        Map<UseCaseConfig<?>, ? extends List<Size>> map2 = mapFilterCommonSupportedSizes;
        List<? extends UseCaseConfig<?>> listAo = i.ao(map2.keySet());
        List<Integer> useCasesPriorityOrder = getUseCasesPriorityOrder(listAo);
        Map<UseCaseConfig<?>, DynamicRange> mapResolveAndValidateDynamicRanges = this.dynamicRangeResolver.resolveAndValidateDynamicRanges(list, listAo, useCasesPriorityOrder);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(mapResolveAndValidateDynamicRanges);
            android.util.Log.d(str, "resolvedDynamicRanges = ".concat(mapResolveAndValidateDynamicRanges.toString()));
        }
        boolean zIsUltraHdrOn = Companion.isUltraHdrOn(list, map2);
        if (z3) {
            kVar = new k(false, StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        } else {
            boolean zIsStrictFpsRequired = isStrictFpsRequired(list, listAo);
            kVar = new k(Boolean.valueOf(zIsStrictFpsRequired), getTargetFpsRange(list, listAo, useCasesPriorityOrder, zIsStrictFpsRequired));
        }
        boolean zBooleanValue = ((Boolean) kVar.a()).booleanValue();
        Range<Integer> range = (Range) kVar.b();
        VideoStabilization videoStabilization2 = VideoStabilization.PREVIEW;
        if (Logger.isDebugEnabled(Log.TAG)) {
            z4 = zIsUltraHdrOn;
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "getSuggestedStreamSpecifications: isPreviewStabilizationSupported = " + this.isPreviewStabilizationSupported + ", isFeatureComboInvocation = " + z2);
        } else {
            z4 = zIsUltraHdrOn;
        }
        if (videoStabilization == videoStabilization2 && !this.isPreviewStabilizationSupported && z2) {
            throw new IllegalArgumentException("Preview stabilization is not supported by the camera.");
        }
        x.c(range);
        boolean z5 = z4;
        return resolveSpecsByCheckingMethod(getCheckingMethod(mapResolveAndValidateDynamicRanges.values(), range, videoStabilization, z5, z2), createFeatureSettings(i2, z, mapResolveAndValidateDynamicRanges, videoStabilization, z5, zIsHighSpeedOn, z2, false, range, zBooleanValue), list, map2, listAo, useCasesPriorityOrder, mapResolveAndValidateDynamicRanges, z3);
    }

    public final SurfaceSizeDefinition getSurfaceSizeDefinition$camera_camera2() {
        SurfaceSizeDefinition surfaceSizeDefinition = this.surfaceSizeDefinition;
        if (surfaceSizeDefinition != null) {
            return surfaceSizeDefinition;
        }
        x.j("surfaceSizeDefinition");
        return null;
    }

    public final SurfaceSizeDefinition getUpdatedSurfaceSizeDefinitionByFormat(int i2) {
        SupportedSurfaceCombination supportedSurfaceCombination;
        List<Integer> list = this.surfaceSizeDefinitionFormats;
        Integer numValueOf = Integer.valueOf(i2);
        if (list.contains(numValueOf)) {
            supportedSurfaceCombination = this;
        } else {
            Map<Integer, Size> s720pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS720pSizeMap();
            x.e(s720pSizeMap, "getS720pSizeMap(...)");
            Size size = SizeUtil.RESOLUTION_720P;
            x.e(size, "RESOLUTION_720P");
            updateS720pOrS1440pSizeByFormat(s720pSizeMap, size, i2);
            Map<Integer, Size> s1440pSizeMap = getSurfaceSizeDefinition$camera_camera2().getS1440pSizeMap();
            x.e(s1440pSizeMap, "getS1440pSizeMap(...)");
            Size size2 = SizeUtil.RESOLUTION_1440P;
            x.e(size2, "RESOLUTION_1440P");
            updateS720pOrS1440pSizeByFormat(s1440pSizeMap, size2, i2);
            Map<Integer, Size> maximumSizeMap = getSurfaceSizeDefinition$camera_camera2().getMaximumSizeMap();
            x.e(maximumSizeMap, "getMaximumSizeMap(...)");
            supportedSurfaceCombination = this;
            updateMaximumSizeByFormat$default(supportedSurfaceCombination, maximumSizeMap, i2, null, 4, null);
            Map<Integer, Size> maximum4x3SizeMap = supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().getMaximum4x3SizeMap();
            x.e(maximum4x3SizeMap, "getMaximum4x3SizeMap(...)");
            supportedSurfaceCombination.updateMaximumSizeByFormat(maximum4x3SizeMap, i2, AspectRatioUtil.ASPECT_RATIO_4_3);
            Map<Integer, Size> maximum16x9SizeMap = supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().getMaximum16x9SizeMap();
            x.e(maximum16x9SizeMap, "getMaximum16x9SizeMap(...)");
            supportedSurfaceCombination.updateMaximumSizeByFormat(maximum16x9SizeMap, i2, AspectRatioUtil.ASPECT_RATIO_16_9);
            Map<Integer, Size> ultraMaximumSizeMap = supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2().getUltraMaximumSizeMap();
            x.e(ultraMaximumSizeMap, "getUltraMaximumSizeMap(...)");
            supportedSurfaceCombination.updateUltraMaximumSizeByFormat(ultraMaximumSizeMap, i2);
            supportedSurfaceCombination.surfaceSizeDefinitionFormats.add(numValueOf);
        }
        return supportedSurfaceCombination.getSurfaceSizeDefinition$camera_camera2();
    }

    public final void setSurfaceSizeDefinition$camera_camera2(SurfaceSizeDefinition surfaceSizeDefinition) {
        x.f(surfaceSizeDefinition, "<set-?>");
        this.surfaceSizeDefinition = surfaceSizeDefinition;
    }

    public final SurfaceConfig transformSurfaceConfig(int i2, int i3, Size size, StreamUseCase streamUseCase) {
        x.f(size, "size");
        x.f(streamUseCase, "streamUseCase");
        return SurfaceConfig.Companion.transformSurfaceConfig(i3, size, getUpdatedSurfaceSizeDefinitionByFormat(i3), i2, SurfaceConfig.ConfigSource.CAPTURE_SESSION_TABLES, streamUseCase);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isUltraHdrOn(List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map) {
            Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getImageFormat() == 4101) {
                    return true;
                }
            }
            Iterator<UseCaseConfig<?>> it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getInputFormat() == 4101) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private final int getMaxFrameRate(int i2, Size size, boolean z, int i3) {
        int maxFrameRate;
        if (!z) {
            maxFrameRate = getMaxFrameRate(i2, size);
        } else if (i2 == 34) {
            maxFrameRate = this.highSpeedResolver.getMaxFrameRate(size);
        } else {
            throw new IllegalStateException("Check failed.");
        }
        return Math.min(i3, maxFrameRate);
    }

    /* compiled from: WazeSource */
    public final class FeatureSettings {
        private final int cameraMode;
        private final boolean hasVideoCapture;
        private final boolean isFeatureComboInvocation;
        private final boolean isHighSpeedOn;
        private final boolean isStrictFpsRequired;
        private final boolean isUltraHdrOn;
        private final int requiredMaxBitDepth;
        private final boolean requiresFeatureComboQuery;
        private final Range<Integer> targetFpsRange;
        private final VideoStabilization videoStabilization;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FeatureSettings(int i2, int i3, boolean z, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6, int i4, o oVar) {
            Range range2;
            VideoStabilization videoStabilization2 = (i4 & 8) != 0 ? VideoStabilization.UNSPECIFIED : videoStabilization;
            boolean z7 = ((i4 & 16) == 0) & z2;
            boolean z8 = ((i4 & 32) == 0) & z3;
            boolean z9 = ((i4 & 64) == 0) & z4;
            boolean z10 = ((i4 & 128) == 0) & z5;
            if ((i4 & 256) != 0) {
                Range<Integer> range3 = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
                x.e(range3, "FRAME_RATE_RANGE_UNSPECIFIED");
                range2 = range3;
            } else {
                range2 = range;
            }
            this(i2, i3, ((i4 & 4) == 0) & z, videoStabilization2, z7, z8, z9, z10, range2, ((i4 & 512) == 0) & z6);
        }

        public static /* synthetic */ FeatureSettings copy$default(FeatureSettings featureSettings, int i2, int i3, boolean z, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i2 = featureSettings.cameraMode;
            }
            if ((i4 & 2) != 0) {
                i3 = featureSettings.requiredMaxBitDepth;
            }
            if ((i4 & 4) != 0) {
                z = featureSettings.hasVideoCapture;
            }
            if ((i4 & 8) != 0) {
                videoStabilization = featureSettings.videoStabilization;
            }
            if ((i4 & 16) != 0) {
                z2 = featureSettings.isUltraHdrOn;
            }
            if ((i4 & 32) != 0) {
                z3 = featureSettings.isHighSpeedOn;
            }
            if ((i4 & 64) != 0) {
                z4 = featureSettings.isFeatureComboInvocation;
            }
            if ((i4 & 128) != 0) {
                z5 = featureSettings.requiresFeatureComboQuery;
            }
            if ((i4 & 256) != 0) {
                range = featureSettings.targetFpsRange;
            }
            if ((i4 & 512) != 0) {
                z6 = featureSettings.isStrictFpsRequired;
            }
            Range range2 = range;
            boolean z7 = z6;
            boolean z8 = z4;
            boolean z9 = z5;
            boolean z10 = z2;
            boolean z11 = z3;
            return featureSettings.copy(i2, i3, z, videoStabilization, z10, z11, z8, z9, range2, z7);
        }

        public final int component1() {
            return this.cameraMode;
        }

        public final boolean component10() {
            return this.isStrictFpsRequired;
        }

        public final int component2() {
            return this.requiredMaxBitDepth;
        }

        public final boolean component3() {
            return this.hasVideoCapture;
        }

        public final VideoStabilization component4() {
            return this.videoStabilization;
        }

        public final boolean component5() {
            return this.isUltraHdrOn;
        }

        public final boolean component6() {
            return this.isHighSpeedOn;
        }

        public final boolean component7() {
            return this.isFeatureComboInvocation;
        }

        public final boolean component8() {
            return this.requiresFeatureComboQuery;
        }

        public final Range<Integer> component9() {
            return this.targetFpsRange;
        }

        public final FeatureSettings copy(int i2, int i3, boolean z, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range<Integer> range, boolean z6) {
            x.f(videoStabilization, "videoStabilization");
            x.f(range, "targetFpsRange");
            return new FeatureSettings(i2, i3, z, videoStabilization, z2, z3, z4, z5, range, z6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeatureSettings)) {
                return false;
            }
            FeatureSettings featureSettings = (FeatureSettings) obj;
            return this.cameraMode == featureSettings.cameraMode && this.requiredMaxBitDepth == featureSettings.requiredMaxBitDepth && this.hasVideoCapture == featureSettings.hasVideoCapture && this.videoStabilization == featureSettings.videoStabilization && this.isUltraHdrOn == featureSettings.isUltraHdrOn && this.isHighSpeedOn == featureSettings.isHighSpeedOn && this.isFeatureComboInvocation == featureSettings.isFeatureComboInvocation && this.requiresFeatureComboQuery == featureSettings.requiresFeatureComboQuery && x.n(this.targetFpsRange, featureSettings.targetFpsRange) && this.isStrictFpsRequired == featureSettings.isStrictFpsRequired;
        }

        public final int getCameraMode() {
            return this.cameraMode;
        }

        public final boolean getHasVideoCapture() {
            return this.hasVideoCapture;
        }

        public final int getRequiredMaxBitDepth() {
            return this.requiredMaxBitDepth;
        }

        public final boolean getRequiresFeatureComboQuery() {
            return this.requiresFeatureComboQuery;
        }

        public final Range<Integer> getTargetFpsRange() {
            return this.targetFpsRange;
        }

        public final VideoStabilization getVideoStabilization() {
            return this.videoStabilization;
        }

        public int hashCode() {
            int i2 = this.cameraMode;
            VideoStabilization videoStabilization = this.videoStabilization;
            int iM = (((((i2 * 31) + this.requiredMaxBitDepth) * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(this.hasVideoCapture)) * 31) + videoStabilization.hashCode();
            Range<Integer> range = this.targetFpsRange;
            boolean z = this.requiresFeatureComboQuery;
            boolean z2 = this.isFeatureComboInvocation;
            return (((((((((((iM * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(this.isUltraHdrOn)) * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(this.isHighSpeedOn)) * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(z2)) * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(z)) * 31) + range.hashCode()) * 31) + SupportedSurfaceCombination$FeatureSettings$$ExternalSyntheticBackport0.m(this.isStrictFpsRequired);
        }

        public final boolean isFeatureComboInvocation() {
            return this.isFeatureComboInvocation;
        }

        public final boolean isHighSpeedOn() {
            return this.isHighSpeedOn;
        }

        public final boolean isStrictFpsRequired() {
            return this.isStrictFpsRequired;
        }

        public final boolean isUltraHdrOn() {
            return this.isUltraHdrOn;
        }

        public String toString() {
            return "FeatureSettings(cameraMode=" + this.cameraMode + ", requiredMaxBitDepth=" + this.requiredMaxBitDepth + ", hasVideoCapture=" + this.hasVideoCapture + ", videoStabilization=" + this.videoStabilization + ", isUltraHdrOn=" + this.isUltraHdrOn + ", isHighSpeedOn=" + this.isHighSpeedOn + ", isFeatureComboInvocation=" + this.isFeatureComboInvocation + ", requiresFeatureComboQuery=" + this.requiresFeatureComboQuery + ", targetFpsRange=" + this.targetFpsRange + ", isStrictFpsRequired=" + this.isStrictFpsRequired + ")";
        }

        public FeatureSettings(int i2, int i3, boolean z, VideoStabilization videoStabilization, boolean z2, boolean z3, boolean z4, boolean z5, Range<Integer> range, boolean z6) {
            x.f(videoStabilization, "videoStabilization");
            x.f(range, "targetFpsRange");
            this.cameraMode = i2;
            this.requiredMaxBitDepth = i3;
            this.hasVideoCapture = z;
            this.videoStabilization = videoStabilization;
            this.isUltraHdrOn = z2;
            this.isHighSpeedOn = z3;
            this.isFeatureComboInvocation = z4;
            this.requiresFeatureComboQuery = z5;
            this.targetFpsRange = range;
            this.isStrictFpsRequired = z6;
        }
    }

    public /* synthetic */ SupportedSurfaceCombination(Context context, CameraMetadata cameraMetadata, EncoderProfilesProvider encoderProfilesProvider, FeatureCombinationQuery featureCombinationQuery, ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer, int i2, o oVar) {
        this(context, cameraMetadata, encoderProfilesProvider, featureCombinationQuery, (i2 & 16) != 0 ? new ExtraSupportedSurfaceCombinationsContainer(null, 1, null) : extraSupportedSurfaceCombinationsContainer);
    }
}
