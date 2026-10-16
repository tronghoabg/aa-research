package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import androidx.core.util.Preconditions;
import e.c.d.a;
import h.a.i;
import h.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamUseCaseUtil {
    public static final StreamUseCaseUtil INSTANCE = new StreamUseCaseUtil();
    private static final Config.Option<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION;
    private static final Map<Long, Set<UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
    private static final Map<Long, Set<UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Class cls = Long.TYPE;
        x.c(cls);
        Config.Option<Long> optionCreate = Config.Option.create("camera2.streamSpec.streamUseCase", cls);
        x.e(optionCreate, "create(...)");
        STREAM_USE_CASE_STREAM_SPEC_OPTION = optionCreate;
        Map mapC = r.c();
        if (Build.VERSION.SDK_INT >= 33) {
            mapC.put(4L, a.r(UseCaseConfigFactory.CaptureType.PREVIEW, UseCaseConfigFactory.CaptureType.METERING_REPEATING, UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS));
            mapC.put(1L, a.r(UseCaseConfigFactory.CaptureType.PREVIEW, UseCaseConfigFactory.CaptureType.METERING_REPEATING, UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS));
            mapC.put(2L, a.o(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE));
            mapC.put(3L, a.o(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = r.b(mapC);
        Map mapC2 = r.c();
        if (Build.VERSION.SDK_INT >= 33) {
            mapC2.put(4L, a.r(UseCaseConfigFactory.CaptureType.PREVIEW, UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE));
            mapC2.put(3L, a.r(UseCaseConfigFactory.CaptureType.PREVIEW, UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = r.b(mapC2);
    }

    private StreamUseCaseUtil() {
    }

    private final boolean areStreamUseCasesAvailable(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(Long.valueOf(it.next().longValue()))) {
                return false;
            }
        }
        return true;
    }

    private final int getSessionConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int i2) {
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
        int iOrdinal = captureType.ordinal();
        return iOrdinal != 0 ? (iOrdinal == 3 || iOrdinal == 4) ? 3 : 1 : i2 == 2 ? 5 : 1;
    }

    private final Config getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(Config config, Long l2) {
        Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (config.containsOption(option) && x.n(config.retrieveOption(option), l2)) {
            return null;
        }
        MutableOptionsBundle mutableOptionsBundleFrom = MutableOptionsBundle.from(config);
        x.e(mutableOptionsBundleFrom, "from(...)");
        mutableOptionsBundleFrom.insertOption(option, l2);
        return new Camera2ImplConfig(mutableOptionsBundleFrom);
    }

    private final boolean isEligibleCaptureType(UseCaseConfigFactory.CaptureType captureType, long j2, List<? extends UseCaseConfigFactory.CaptureType> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            Map<Long, Set<UseCaseConfigFactory.CaptureType>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            Long lValueOf = Long.valueOf(j2);
            if (!map.containsKey(lValueOf)) {
                return false;
            }
            Set<UseCaseConfigFactory.CaptureType> set = map.get(lValueOf);
            x.c(set);
            return set.contains(captureType);
        }
        Map<Long, Set<UseCaseConfigFactory.CaptureType>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        Long lValueOf2 = Long.valueOf(j2);
        if (!map2.containsKey(lValueOf2)) {
            return false;
        }
        Set<UseCaseConfigFactory.CaptureType> set2 = map2.get(lValueOf2);
        x.c(set2);
        Set<UseCaseConfigFactory.CaptureType> set3 = set2;
        if (list.size() != set3.size()) {
            return false;
        }
        Iterator<? extends UseCaseConfigFactory.CaptureType> it = list.iterator();
        while (it.hasNext()) {
            if (!set3.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isValidCamera2InteropOverride(java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> r10, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> r11, java.util.Set<java.lang.Long> r12) {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r10.hasNext()
            r2 = 0
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L4b
            java.lang.Object r10 = r10.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r10 = (androidx.camera.core.impl.AttachedSurfaceInfo) r10
            androidx.camera.core.impl.Config r1 = r10.getImplementationOptions()
            h.g.b.x.c(r1)
            androidx.camera.core.impl.Config$Option<java.lang.Long> r6 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r1 = r1.containsOption(r6)
            if (r1 != 0) goto L2d
        L2a:
            r1 = r4
            r10 = r5
            goto L4d
        L2d:
            androidx.camera.core.impl.Config r10 = r10.getImplementationOptions()
            h.g.b.x.c(r10)
            androidx.camera.core.impl.Config$Option<java.lang.Long> r1 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            java.lang.Object r10 = r10.retrieveOption(r1)
            h.g.b.x.c(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L48
            goto L2a
        L48:
            r10 = r4
            r1 = r5
            goto L4d
        L4b:
            r10 = r4
            r1 = r10
        L4d:
            java.util.Iterator r11 = r11.iterator()
        L51:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L93
            java.lang.Object r6 = r11.next()
            androidx.camera.core.impl.UseCaseConfig r6 = (androidx.camera.core.impl.UseCaseConfig) r6
            androidx.camera.core.impl.Config$Option<java.lang.Long> r7 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r7 = r6.containsOption(r7)
            if (r7 != 0) goto L6c
            if (r1 == 0) goto L6a
            r9.throwInvalidCamera2InteropOverrideException()
        L6a:
            r10 = r5
            goto L51
        L6c:
            androidx.camera.core.impl.Config$Option<java.lang.Long> r7 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            java.lang.Object r6 = r6.retrieveOption(r7)
            h.g.b.x.c(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L85
            if (r1 == 0) goto L6a
            r9.throwInvalidCamera2InteropOverrideException()
            goto L6a
        L85:
            if (r10 == 0) goto L8a
            r9.throwInvalidCamera2InteropOverrideException()
        L8a:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r0.add(r1)
            r1 = r5
            goto L51
        L93:
            if (r10 != 0) goto L9c
            boolean r9 = r9.areStreamUseCasesAvailable(r12, r0)
            if (r9 == 0) goto L9c
            return r5
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.StreamUseCaseUtil.isValidCamera2InteropOverride(java.util.List, java.util.List, java.util.Set):boolean");
    }

    private final boolean isZslUseCase(Config config, UseCaseConfigFactory.CaptureType captureType) {
        Object objRetrieveOption = config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, false);
        x.c(objRetrieveOption);
        if (((Boolean) objRetrieveOption).booleanValue() || !config.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            return false;
        }
        Object objRetrieveOption2 = config.retrieveOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE);
        x.c(objRetrieveOption2);
        return getSessionConfigTemplateType(captureType, ((Number) objRetrieveOption2).intValue()) == 5;
    }

    private final void throwInvalidCamera2InteropOverrideException() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public final boolean areCaptureTypesEligible(Map<Integer, ? extends AttachedSurfaceInfo> map, Map<Integer, ? extends UseCaseConfig<?>> map2, List<SurfaceConfig> list) {
        List<UseCaseConfigFactory.CaptureType> listH;
        x.f(map, "surfaceConfigIndexAttachedSurfaceInfoMap");
        x.f(map2, "surfaceConfigIndexUseCaseConfigMap");
        x.f(list, "surfaceConfigsWithStreamUseCase");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long value = list.get(i2).getStreamUseCase().getValue();
            Integer numValueOf = Integer.valueOf(i2);
            if (map.containsKey(numValueOf)) {
                AttachedSurfaceInfo attachedSurfaceInfo = map.get(numValueOf);
                x.c(attachedSurfaceInfo);
                UseCaseConfigFactory.CaptureType captureType = attachedSurfaceInfo.getCaptureTypes().size() == 1 ? attachedSurfaceInfo.getCaptureTypes().get(0) : UseCaseConfigFactory.CaptureType.STREAM_SHARING;
                x.c(captureType);
                List<UseCaseConfigFactory.CaptureType> captureTypes = attachedSurfaceInfo.getCaptureTypes();
                x.e(captureTypes, "getCaptureTypes(...)");
                if (!isEligibleCaptureType(captureType, value, captureTypes)) {
                    return false;
                }
            } else {
                if (!map2.containsKey(numValueOf)) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                UseCaseConfig<?> useCaseConfig = map2.get(numValueOf);
                x.c(useCaseConfig);
                UseCaseConfig<?> useCaseConfig2 = useCaseConfig;
                UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig2.getCaptureType();
                x.e(captureType2, "getCaptureType(...)");
                if (useCaseConfig2.getCaptureType() == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
                    listH = ((StreamSharingConfig) useCaseConfig2).getCaptureTypes();
                    x.e(listH, "getCaptureTypes(...)");
                } else {
                    listH = i.h();
                }
                if (!isEligibleCaptureType(captureType2, value, listH)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areStreamUseCasesAvailableForSurfaceConfigs(CameraMetadata cameraMetadata, List<SurfaceConfig> list) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(list, "surfaceConfigs");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        x.e(key, "SCALER_AVAILABLE_STREAM_USE_CASES");
        long[] jArr = (long[]) cameraMetadata.get(key);
        if (jArr == null || (jArr.length) == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j2 : jArr) {
            hashSet.add(Long.valueOf(j2));
        }
        Iterator<SurfaceConfig> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().getStreamUseCase().getValue()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsZslUseCase(java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> r8, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "attachedSurfaces"
            h.g.b.x.f(r8, r0)
            java.lang.String r0 = "newUseCaseConfigs"
            h.g.b.x.f(r9, r0)
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r1 == 0) goto L25
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L25
            goto L4a
        L25:
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r1 = (androidx.camera.core.impl.AttachedSurfaceInfo) r1
            androidx.camera.core.impl.Config r1 = r1.getImplementationOptions()
            if (r1 == 0) goto L46
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r6 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            java.lang.Object r1 = r1.retrieveOption(r6, r5)
            boolean r1 = h.g.b.x.n(r1, r3)
            goto L47
        L46:
            r1 = r4
        L47:
            if (r1 == 0) goto L29
            goto L77
        L4a:
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L5b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5b
            goto L78
        L5b:
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            androidx.camera.core.impl.UseCaseConfig r1 = (androidx.camera.core.impl.UseCaseConfig) r1
            androidx.camera.core.impl.Config$Option<java.lang.Boolean> r6 = androidx.camera.core.impl.UseCaseConfig.OPTION_ZSL_DISABLED
            java.lang.Object r1 = r1.retrieveOption(r6, r5)
            boolean r1 = h.g.b.x.n(r1, r3)
            if (r1 == 0) goto L5f
        L77:
            return r4
        L78:
            java.util.Iterator r8 = r8.iterator()
        L7c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r8.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r0 = (androidx.camera.core.impl.AttachedSurfaceInfo) r0
            java.util.List r1 = r0.getCaptureTypes()
            java.lang.String r3 = "getCaptureTypes(...)"
            h.g.b.x.e(r1, r3)
            java.lang.Object r1 = r1.get(r4)
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = (androidx.camera.core.impl.UseCaseConfigFactory.CaptureType) r1
            androidx.camera.core.impl.Config r0 = r0.getImplementationOptions()
            h.g.b.x.c(r0)
            h.g.b.x.c(r1)
            boolean r0 = r7.isZslUseCase(r0, r1)
            if (r0 == 0) goto L7c
            return r2
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lcb
            java.lang.Object r9 = r8.next()
            androidx.camera.core.impl.UseCaseConfig r9 = (androidx.camera.core.impl.UseCaseConfig) r9
            r0 = r9
            androidx.camera.core.impl.Config r0 = (androidx.camera.core.impl.Config) r0
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r9 = r9.getCaptureType()
            java.lang.String r1 = "getCaptureType(...)"
            h.g.b.x.e(r9, r1)
            boolean r9 = r7.isZslUseCase(r0, r9)
            if (r9 == 0) goto Lac
            return r2
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.StreamUseCaseUtil.containsZslUseCase(java.util.List, java.util.List):boolean");
    }

    public final Config.Option<Long> getSTREAM_USE_CASE_STREAM_SPEC_OPTION() {
        return STREAM_USE_CASE_STREAM_SPEC_OPTION;
    }

    public final Camera2ImplConfig getStreamSpecImplementationOptions(UseCaseConfig<?> useCaseConfig) {
        x.f(useCaseConfig, "useCaseConfig");
        MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
        x.e(mutableOptionsBundleCreate, "create(...)");
        if (useCaseConfig.containsOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION)) {
            Config.Option option = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
            mutableOptionsBundleCreate.insertOption(option, useCaseConfig.retrieveOption(option));
        }
        if (useCaseConfig.containsOption(UseCaseConfig.OPTION_ZSL_DISABLED)) {
            Config.Option option2 = UseCaseConfig.OPTION_ZSL_DISABLED;
            mutableOptionsBundleCreate.insertOption(option2, useCaseConfig.retrieveOption(option2));
        }
        if (useCaseConfig.containsOption(ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE)) {
            Config.Option option3 = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
            mutableOptionsBundleCreate.insertOption(option3, useCaseConfig.retrieveOption(option3));
        }
        if (useCaseConfig.containsOption(UseCaseConfig.OPTION_INPUT_FORMAT)) {
            Config.Option option4 = UseCaseConfig.OPTION_INPUT_FORMAT;
            mutableOptionsBundleCreate.insertOption(option4, useCaseConfig.retrieveOption(option4));
        }
        return new Camera2ImplConfig(mutableOptionsBundleCreate);
    }

    public final boolean isStreamUseCaseSupported(CameraMetadata cameraMetadata) {
        x.f(cameraMetadata, "cameraMetadata");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        x.e(key, "SCALER_AVAILABLE_STREAM_USE_CASES");
        long[] jArr = (long[]) cameraMetadata.get(key);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public final boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(CameraMetadata cameraMetadata, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, StreamSpec> map, Map<AttachedSurfaceInfo, StreamSpec> map2) {
        x.f(cameraMetadata, "cameraMetadata");
        x.f(list, "attachedSurfaces");
        x.f(map, "suggestedStreamSpecMap");
        x.f(map2, "attachedSurfaceStreamSpecMap");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        Iterator<? extends AttachedSurfaceInfo> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImplementationOptions() == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Iterator<? extends UseCaseConfig<?>> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StreamSpec streamSpec = map.get(it2.next());
            if (streamSpec == null || streamSpec.getImplementationOptions() == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        x.e(key, "SCALER_AVAILABLE_STREAM_USE_CASES");
        long[] jArr = (long[]) cameraMetadata.get(key);
        if (jArr != null && (jArr.length) != 0) {
            HashSet hashSet = new HashSet();
            for (long j2 : jArr) {
                hashSet.add(Long.valueOf(j2));
            }
            if (isValidCamera2InteropOverride(list, arrayList, hashSet)) {
                for (AttachedSurfaceInfo attachedSurfaceInfo : list) {
                    Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
                    x.c(implementationOptions);
                    Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions, (Long) implementationOptions.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                    if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                        map2.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                    }
                }
                for (UseCaseConfig<?> useCaseConfig : arrayList) {
                    StreamSpec streamSpec2 = map.get(useCaseConfig);
                    x.c(streamSpec2);
                    Config implementationOptions2 = streamSpec2.getImplementationOptions();
                    x.c(implementationOptions2);
                    Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions2, (Long) implementationOptions2.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                    if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                        map.put(useCaseConfig, streamSpec2.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(Map<UseCaseConfig<?>, StreamSpec> map, Map<AttachedSurfaceInfo, StreamSpec> map2, Map<Integer, ? extends AttachedSurfaceInfo> map3, Map<Integer, ? extends UseCaseConfig<?>> map4, List<SurfaceConfig> list) {
        x.f(map, "suggestedStreamSpecMap");
        x.f(map2, "attachedSurfaceStreamSpecMap");
        x.f(map3, "surfaceConfigIndexAttachedSurfaceInfoMap");
        x.f(map4, "surfaceConfigIndexUseCaseConfigMap");
        x.f(list, "surfaceConfigsWithStreamUseCase");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long value = list.get(i2).getStreamUseCase().getValue();
            Integer numValueOf = Integer.valueOf(i2);
            if (map3.containsKey(numValueOf)) {
                AttachedSurfaceInfo attachedSurfaceInfo = map3.get(numValueOf);
                x.c(attachedSurfaceInfo);
                Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
                x.c(implementationOptions);
                Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions, Long.valueOf(value));
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                    map2.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                }
            } else {
                if (!map4.containsKey(numValueOf)) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                UseCaseConfig<?> useCaseConfig = map4.get(numValueOf);
                x.c(useCaseConfig);
                UseCaseConfig<?> useCaseConfig2 = useCaseConfig;
                StreamSpec streamSpec = map.get(useCaseConfig2);
                x.c(streamSpec);
                Config implementationOptions2 = streamSpec.getImplementationOptions();
                x.c(implementationOptions2);
                Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions2, Long.valueOf(value));
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                    StreamSpec streamSpecBuild = streamSpec.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build();
                    x.e(streamSpecBuild, "build(...)");
                    map.put(useCaseConfig2, streamSpecBuild);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void populateSurfaceToStreamUseCaseMapping(Collection<SessionConfig> collection, Collection<? extends UseCaseConfig<?>> collection2, Map<DeferrableSurface, Long> map) {
        x.f(collection, "sessionConfigs");
        x.f(collection2, "useCaseConfigs");
        x.f(map, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(collection2);
        Iterator<SessionConfig> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SessionConfig next = it.next();
            Config implementationOptions = next.getImplementationOptions();
            Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (implementationOptions.containsOption(option) && next.getSurfaces().size() != 1) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled(Log.TAG)) {
                    android.util.Log.e(Camera2Logger.TRUNCATED_TAG, "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + next.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                    return;
                }
                return;
            }
            if (next.getImplementationOptions().containsOption(option)) {
                int i2 = 0;
                for (SessionConfig sessionConfig : collection) {
                    if (((UseCaseConfig) arrayList.get(i2)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                        x.e(sessionConfig.getSurfaces(), "getSurfaces(...)");
                        Preconditions.checkState(!r3.isEmpty(), "MeteringRepeating should contain a surface");
                        map.put(sessionConfig.getSurfaces().get(0), 1L);
                    } else {
                        Config implementationOptions2 = sessionConfig.getImplementationOptions();
                        Config.Option<Long> option2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (implementationOptions2.containsOption(option2)) {
                            List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
                            x.e(surfaces, "getSurfaces(...)");
                            if (!surfaces.isEmpty()) {
                                DeferrableSurface deferrableSurface = sessionConfig.getSurfaces().get(0);
                                Object objRetrieveOption = sessionConfig.getImplementationOptions().retrieveOption(option2);
                                x.c(objRetrieveOption);
                                map.put(deferrableSurface, objRetrieveOption);
                            }
                        }
                    }
                    i2++;
                }
            }
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(map);
            android.util.Log.d(str, "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = ".concat(String.valueOf(map)));
        }
    }

    public final boolean shouldUseStreamUseCase(SupportedSurfaceCombination.FeatureSettings featureSettings) {
        x.f(featureSettings, "featureSettings");
        return featureSettings.getCameraMode() == 0 && featureSettings.getRequiredMaxBitDepth() == 8 && !featureSettings.isHighSpeedOn();
    }

    public static /* synthetic */ void getSTREAM_USE_CASE_STREAM_SPEC_OPTION$annotations() {
    }
}
