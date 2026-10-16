package androidx.camera.core.internal;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.streamsharing.StreamSharing;
import h.a.r;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StreamSpecsCalculatorImpl implements StreamSpecsCalculator {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "StreamSpecsCalculatorImpl";
    private CameraDeviceSurfaceManager cameraDeviceSurfaceManager;
    private final UseCaseConfigFactory useCaseConfigFactory;

    public StreamSpecsCalculatorImpl(UseCaseConfigFactory useCaseConfigFactory, CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        x.f(useCaseConfigFactory, "useCaseConfigFactory");
        this.useCaseConfigFactory = useCaseConfigFactory;
        this.cameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
    }

    private final Pair<Map<UseCase, StreamSpec>, Map<AttachedSurfaceInfo, UseCase>> calculateSuggestedStreamSpecsForAttachedUseCases(int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list) {
        ArrayList arrayList = new ArrayList();
        String cameraId = cameraInfoInternal.getCameraId();
        x.e(cameraId, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (UseCase useCase : list) {
            StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
            if (attachedStreamSpec == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.cameraDeviceSurfaceManager;
            if (cameraDeviceSurfaceManager == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int imageFormat = useCase.getImageFormat();
            Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
            if (attachedSurfaceResolution == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            SurfaceConfig surfaceConfigTransformSurfaceConfig = cameraDeviceSurfaceManager.transformSurfaceConfig(i2, cameraId, imageFormat, attachedSurfaceResolution, useCase.getCurrentConfig().getStreamUseCase());
            x.e(surfaceConfigTransformSurfaceConfig, "transformSurfaceConfig(...)");
            int imageFormat2 = useCase.getImageFormat();
            Size attachedSurfaceResolution2 = useCase.getAttachedSurfaceResolution();
            x.c(attachedSurfaceResolution2);
            DynamicRange dynamicRange = attachedStreamSpec.getDynamicRange();
            List<UseCaseConfigFactory.CaptureType> captureTypes = StreamSharing.getCaptureTypes(useCase);
            Config implementationOptions = attachedStreamSpec.getImplementationOptions();
            int sessionType = useCase.getCurrentConfig().getSessionType(0);
            Range<Integer> targetFrameRate = useCase.getCurrentConfig().getTargetFrameRate(StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
            if (targetFrameRate == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            boolean zIsStrictFrameRateRequired = useCase.getCurrentConfig().isStrictFrameRateRequired();
            UseCaseConfig<?> currentConfig = useCase.getCurrentConfig();
            Size attachedSurfaceResolution3 = useCase.getAttachedSurfaceResolution();
            x.c(attachedSurfaceResolution3);
            AttachedSurfaceInfo attachedSurfaceInfoCreate = AttachedSurfaceInfo.create(surfaceConfigTransformSurfaceConfig, imageFormat2, attachedSurfaceResolution2, dynamicRange, captureTypes, implementationOptions, sessionType, targetFrameRate, zIsStrictFrameRateRequired, currentConfig.getCustomMaxFrameRate(attachedSurfaceResolution3));
            x.e(attachedSurfaceInfoCreate, "create(...)");
            arrayList.add(attachedSurfaceInfoCreate);
            linkedHashMap2.put(attachedSurfaceInfoCreate, useCase);
            linkedHashMap.put(useCase, attachedStreamSpec);
        }
        return new Pair<>(linkedHashMap, linkedHashMap2);
    }

    private final StreamSpecQueryResult calculateSuggestedStreamSpecsForNewUseCases(int i2, final CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, Map<AttachedSurfaceInfo, ? extends UseCase> map, final Map<UseCase, ? extends CameraUseCaseAdapter.ConfigPair> map2, boolean z, boolean z2) {
        int iComponent3;
        Rect sensorRect;
        String cameraId = cameraInfoInternal.getCameraId();
        x.e(cameraId, "getCameraId(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            iComponent3 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                sensorRect = cameraInfoInternal.getSensorRect();
            } catch (NullPointerException unused) {
                sensorRect = null;
            }
            SupportedOutputSizesSorter supportedOutputSizesSorter = new SupportedOutputSizesSorter(cameraInfoInternal, sensorRect != null ? TransformUtils.rectToSize(sensorRect) : null);
            for (UseCase useCase : list) {
                CameraUseCaseAdapter.ConfigPair configPair = map2.get(useCase);
                if (configPair == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                CameraUseCaseAdapter.ConfigPair configPair2 = configPair;
                UseCaseConfig<?> useCaseConfigMergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair2.mExtendedConfig, configPair2.mCameraConfig);
                x.e(useCaseConfigMergeConfigs, "mergeConfigs(...)");
                linkedHashMap2.put(useCaseConfigMergeConfigs, useCase);
                linkedHashMap3.put(useCaseConfigMergeConfigs, supportedOutputSizesSorter.getSortedSupportedOutputSizes(useCaseConfigMergeConfigs));
            }
            List<? extends UseCase> list2 = list;
            VideoStabilization videoStabilization = UseCaseUtil.getVideoStabilization(list2, new l() { // from class: androidx.camera.core.internal.StreamSpecsCalculatorImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return StreamSpecsCalculatorImpl.calculateSuggestedStreamSpecsForNewUseCases$lambda$0(map2, cameraInfoInternal, (UseCase) obj);
                }
            });
            CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.cameraDeviceSurfaceManager;
            if (cameraDeviceSurfaceManager == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SurfaceStreamSpecQueryResult suggestedStreamSpecs = cameraDeviceSurfaceManager.getSuggestedStreamSpecs(i2, cameraId, new ArrayList(map.keySet()), linkedHashMap3, videoStabilization, UseCaseUtil.containsVideoCapture(list2), z, z2);
            x.e(suggestedStreamSpecs, "getSuggestedStreamSpecs(...)");
            Map<UseCaseConfig<?>, StreamSpec> mapComponent1 = suggestedStreamSpecs.component1();
            Map<AttachedSurfaceInfo, StreamSpec> mapComponent2 = suggestedStreamSpecs.component2();
            iComponent3 = suggestedStreamSpecs.component3();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                StreamSpec streamSpec = mapComponent1.get(entry.getKey());
                if (streamSpec == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, streamSpec);
            }
            for (Map.Entry<AttachedSurfaceInfo, StreamSpec> entry2 : mapComponent2.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    UseCase useCase2 = map.get(entry2.getKey());
                    if (useCase2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(useCase2, entry2.getValue());
                }
            }
        }
        return new StreamSpecQueryResult(linkedHashMap, iComponent3);
    }

    static final UseCaseConfig calculateSuggestedStreamSpecsForNewUseCases$lambda$0(Map map, CameraInfoInternal cameraInfoInternal, UseCase useCase) {
        x.f(useCase, "it");
        Object obj = map.get(useCase);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CameraUseCaseAdapter.ConfigPair configPair = (CameraUseCaseAdapter.ConfigPair) obj;
        UseCaseConfig<?> useCaseConfigMergeConfigs = useCase.mergeConfigs(cameraInfoInternal, configPair.mExtendedConfig, configPair.mCameraConfig);
        x.e(useCaseConfigMergeConfigs, "mergeConfigs(...)");
        return useCaseConfigMergeConfigs;
    }

    @Override // androidx.camera.core.internal.StreamSpecsCalculator
    public StreamSpecQueryResult calculateSuggestedStreamSpecs(int i2, CameraInfoInternal cameraInfoInternal, List<? extends UseCase> list, List<? extends UseCase> list2, CameraConfig cameraConfig, int i3, Range<Integer> range, boolean z, boolean z2) {
        x.f(cameraInfoInternal, "cameraInfoInternal");
        x.f(list, "newUseCases");
        x.f(list2, "attachedUseCases");
        x.f(cameraConfig, "cameraConfig");
        x.f(range, "targetFrameRate");
        Pair<Map<UseCase, StreamSpec>, Map<AttachedSurfaceInfo, UseCase>> pairCalculateSuggestedStreamSpecsForAttachedUseCases = calculateSuggestedStreamSpecsForAttachedUseCases(i2, cameraInfoInternal, list2);
        Object obj = pairCalculateSuggestedStreamSpecsForAttachedUseCases.second;
        x.e(obj, "second");
        Map<UseCase, CameraUseCaseAdapter.ConfigPair> configs = CameraUseCaseAdapter.getConfigs(list, cameraConfig.getUseCaseConfigFactory(), this.useCaseConfigFactory, i3, range);
        x.e(configs, "getConfigs(...)");
        StreamSpecQueryResult streamSpecQueryResultCalculateSuggestedStreamSpecsForNewUseCases = calculateSuggestedStreamSpecsForNewUseCases(i2, cameraInfoInternal, list, (Map) obj, configs, z, z2);
        Object obj2 = pairCalculateSuggestedStreamSpecsForAttachedUseCases.first;
        x.e(obj2, "first");
        return new StreamSpecQueryResult(r.o((Map) obj2, streamSpecQueryResultCalculateSuggestedStreamSpecsForNewUseCases.getStreamSpecs()), streamSpecQueryResultCalculateSuggestedStreamSpecsForNewUseCases.getMaxSupportedFrameRate());
    }

    @Override // androidx.camera.core.internal.StreamSpecsCalculator
    public void setCameraDeviceSurfaceManager(CameraDeviceSurfaceManager cameraDeviceSurfaceManager) {
        x.f(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
        this.cameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ StreamSpecsCalculatorImpl(UseCaseConfigFactory useCaseConfigFactory, CameraDeviceSurfaceManager cameraDeviceSurfaceManager, int i2, o oVar) {
        this(useCaseConfigFactory, (i2 & 2) != 0 ? null : cameraDeviceSurfaceManager);
    }
}
