package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.ExtraSupportedSurfaceCombinationsContainer;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.config.CameraAppComponent;
import androidx.camera.camera2.config.CameraModule;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.FeatureCombinationQueryImpl;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.featuregroup.impl.FeatureCombinationQuery;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraUpdateException;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceStreamSpecQueryResult;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import androidx.core.util.Preconditions;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraSurfaceAdapter implements CameraDeviceSurfaceManager {
    private final CameraAppComponent component;
    private final Context context;
    private final String extraSupportedSurfaceCombinations;
    private final ExtraSupportedSurfaceCombinationsContainer extraSupportedSurfaceCombinationsContainer;
    private final Object lock;
    private Map<String, SupportedSurfaceCombination> supportedSurfaceCombinationMap;

    public CameraSurfaceAdapter(Context context, Object obj, Set<String> set, String str) throws InitializationException {
        x.f(context, "context");
        x.f(set, "availableCameraIds");
        this.context = context;
        this.extraSupportedSurfaceCombinations = str;
        x.d(obj, "null cannot be cast to non-null type androidx.camera.camera2.config.CameraAppComponent");
        this.component = (CameraAppComponent) obj;
        this.lock = new Object();
        this.extraSupportedSurfaceCombinationsContainer = new ExtraSupportedSurfaceCombinationsContainer(str);
        this.supportedSurfaceCombinationMap = r.j();
        try {
            onCamerasUpdated(i.ao(set));
        } catch (CameraUpdateException e2) {
            throw new InitializationException(e2);
        }
    }

    private final Map<String, SupportedSurfaceCombination> buildSurfaceCombinations(List<String> list) throws CameraUpdateException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!list.isEmpty()) {
            try {
                for (String str : list) {
                    CameraDevices cameraDevices = this.component.getCameraDevices();
                    CameraId.m547constructorimpl(str);
                    CameraMetadata cameraMetadataMo434awaitCameraMetadataEfqyGwQ = cameraDevices.mo434awaitCameraMetadataEfqyGwQ(str);
                    if (cameraMetadataMo434awaitCameraMetadataEfqyGwQ != null) {
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        x.e(key, "SCALER_STREAM_CONFIGURATION_MAP");
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraMetadataMo434awaitCameraMetadataEfqyGwQ.get(key);
                        CameraQuirks cameraQuirks = new CameraQuirks(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, streamConfigurationMap)));
                        linkedHashMap.put(str, new SupportedSurfaceCombination(this.context, cameraMetadataMo434awaitCameraMetadataEfqyGwQ, CameraModule.Companion.provideEncoderProfilesProvider(str, cameraQuirks), Build.VERSION.SDK_INT >= 35 ? new FeatureCombinationQueryImpl(cameraMetadataMo434awaitCameraMetadataEfqyGwQ, this.component.getCameraPipe(), cameraQuirks) : FeatureCombinationQuery.NO_OP_FEATURE_COMBINATION_QUERY, this.extraSupportedSurfaceCombinationsContainer));
                    }
                }
            } catch (DoNotDisturbException e2) {
                throw new CameraUpdateException("Failed to query camera metadata", e2);
            } catch (Exception e3) {
                throw new CameraUpdateException("Failed to build surface combinations", e3);
            }
        }
        return linkedHashMap;
    }

    public final boolean checkIfSupportedCombinationExist$camera_camera2(String str) {
        x.f(str, "cameraId");
        return this.supportedSurfaceCombinationMap.containsKey(str);
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public SurfaceStreamSpecQueryResult getSuggestedStreamSpecs(int i2, String str, List<? extends AttachedSurfaceInfo> list, Map<UseCaseConfig<?>, ? extends List<Size>> map, VideoStabilization videoStabilization, boolean z, boolean z2, boolean z3) {
        SupportedSurfaceCombination supportedSurfaceCombination;
        x.f(str, "cameraId");
        x.f(list, "existingSurfaces");
        x.f(map, "newUseCaseConfigsSupportedSizeMap");
        x.f(videoStabilization, "videoStabilization");
        Preconditions.checkArgument(checkIfSupportedCombinationExist$camera_camera2(str), "No such camera id in supported combination list: ".concat(String.valueOf(str)));
        synchronized (this.lock) {
            supportedSurfaceCombination = this.supportedSurfaceCombinationMap.get(str);
        }
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.getSuggestedStreamSpecifications(i2, list, map, videoStabilization, z, z2, z3);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: ".concat(String.valueOf(str)));
    }

    @Override // androidx.camera.core.impl.InternalCameraPresenceListener
    public void onCamerasUpdated(List<String> list) throws CameraUpdateException {
        List<String> listAd;
        x.f(list, "cameraIds");
        synchronized (this.lock) {
            listAd = i.ad(list, this.supportedSurfaceCombinationMap.keySet());
        }
        if (!listAd.isEmpty()) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                String str = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(listAd);
                android.util.Log.d(str, "Creating new surface combinations for: ".concat(String.valueOf(listAd)));
            }
        }
        Map<String, SupportedSurfaceCombination> mapBuildSurfaceCombinations = buildSurfaceCombinations(listAd);
        synchronized (this.lock) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : list) {
                if (this.supportedSurfaceCombinationMap.containsKey(str2)) {
                    SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombinationMap.get(str2);
                    x.c(supportedSurfaceCombination);
                    linkedHashMap.put(str2, supportedSurfaceCombination);
                }
            }
            linkedHashMap.putAll(mapBuildSurfaceCombinations);
            this.supportedSurfaceCombinationMap = linkedHashMap;
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Committed new surface combination map. Total cameras: " + linkedHashMap.size());
            }
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public SurfaceConfig transformSurfaceConfig(int i2, String str, int i3, Size size, StreamUseCase streamUseCase) {
        SupportedSurfaceCombination supportedSurfaceCombination;
        x.f(str, "cameraId");
        x.f(size, "size");
        x.f(streamUseCase, "streamUseCase");
        Preconditions.checkArgument(checkIfSupportedCombinationExist$camera_camera2(str), "No such camera id in supported combination list: ".concat(String.valueOf(str)));
        synchronized (this.lock) {
            supportedSurfaceCombination = this.supportedSurfaceCombinationMap.get(str);
        }
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(i2, i3, size, streamUseCase);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: ".concat(String.valueOf(str)));
    }

    public /* synthetic */ CameraSurfaceAdapter(Context context, Object obj, Set set, String str, int i2, o oVar) {
        this(context, obj, set, (i2 & 8) != 0 ? null : str);
    }
}
