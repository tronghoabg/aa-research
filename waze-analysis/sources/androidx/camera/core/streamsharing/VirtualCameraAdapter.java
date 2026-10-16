package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualOutConfig;
import androidx.camera.core.processing.util.OutConfig;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
class VirtualCameraAdapter implements UseCase.StateChangeCallback {
    private static final String TAG = "VirtualCameraAdapter";
    final Set<UseCase> mChildren;
    private final Set<UseCaseConfig<?>> mChildrenConfigs;
    private final Map<UseCase, UseCaseConfig<?>> mChildrenConfigsMap;
    private final CameraInternal mParentCamera;
    private final ResolutionsMerger mResolutionsMerger;
    private final CameraInternal mSecondaryParentCamera;
    private ResolutionsMerger mSecondaryResolutionsMerger;
    private final UseCaseConfigFactory mUseCaseConfigFactory;
    final Map<UseCase, SurfaceEdge> mChildrenEdges = new HashMap();
    private final Map<UseCase, VirtualCamera> mChildrenVirtualCameras = new HashMap();
    final Map<UseCase, Boolean> mChildrenActiveState = new HashMap();
    private final CameraCaptureCallback mParentMetadataCallback = createCameraCaptureCallback();

    /* compiled from: WazeSource */
    class VirtualCameraCaptureCallback extends CameraCaptureCallback {
        private final WeakReference<VirtualCameraAdapter> mVirtualCameraAdapterRef;

        VirtualCameraCaptureCallback(VirtualCameraAdapter virtualCameraAdapter) {
            this.mVirtualCameraAdapterRef = new WeakReference<>(virtualCameraAdapter);
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureCompleted(int i2, CameraCaptureResult cameraCaptureResult) {
            VirtualCameraAdapter virtualCameraAdapter = this.mVirtualCameraAdapterRef.get();
            if (virtualCameraAdapter != null) {
                Iterator<UseCase> it = virtualCameraAdapter.mChildren.iterator();
                while (it.hasNext()) {
                    VirtualCameraAdapter.sendCameraCaptureResultToChild(cameraCaptureResult, it.next().getSessionConfig(), i2);
                }
            }
        }
    }

    VirtualCameraAdapter(CameraInternal cameraInternal, CameraInternal cameraInternal2, Set<UseCase> set, UseCaseConfigFactory useCaseConfigFactory, StreamSharing.Control control) {
        this.mParentCamera = cameraInternal;
        this.mSecondaryParentCamera = cameraInternal2;
        this.mUseCaseConfigFactory = useCaseConfigFactory;
        this.mChildren = set;
        Map<UseCase, UseCaseConfig<?>> childrenConfigsMap = toChildrenConfigsMap(cameraInternal, set, useCaseConfigFactory);
        this.mChildrenConfigsMap = childrenConfigsMap;
        HashSet hashSet = new HashSet(childrenConfigsMap.values());
        this.mChildrenConfigs = hashSet;
        this.mResolutionsMerger = new ResolutionsMerger(cameraInternal, hashSet);
        if (cameraInternal2 != null) {
            this.mSecondaryResolutionsMerger = new ResolutionsMerger(cameraInternal2, hashSet);
        }
        for (UseCase useCase : set) {
            this.mChildrenActiveState.put(useCase, false);
            this.mChildrenVirtualCameras.put(useCase, new VirtualCamera(cameraInternal, this, control));
        }
    }

    private OutConfig calculateOutConfig(UseCase useCase, ResolutionsMerger resolutionsMerger, CameraInternal cameraInternal, SurfaceEdge surfaceEdge, int i2, boolean z, boolean z2) {
        int sensorRotationDegrees = cameraInternal.getCameraInfo().getSensorRotationDegrees(i2);
        boolean zIsMirrored = TransformUtils.isMirrored(surfaceEdge.getSensorToBufferTransform());
        PreferredChildSize preferredChildSize = resolutionsMerger.getPreferredChildSize((UseCaseConfig) Objects.requireNonNull(this.mChildrenConfigsMap.get(useCase)), surfaceEdge.getCropRect(), TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z);
        Rect cropRectBeforeScaling = preferredChildSize.getCropRectBeforeScaling();
        Size childSizeToScale = preferredChildSize.getChildSizeToScale();
        int rotationDegrees = (surfaceEdge.getRotationDegrees() + getChildRotationDegrees(useCase, cameraInternal)) - sensorRotationDegrees;
        boolean zIsMirroringRequired = z2 ? false : useCase.isMirroringRequired(cameraInternal) ^ zIsMirrored;
        int iWithin360 = TransformUtils.within360(rotationDegrees);
        return OutConfig.of(getChildTargetType(useCase), getChildFormat(useCase), cropRectBeforeScaling, TransformUtils.rotateSize(childSizeToScale, iWithin360), iWithin360, zIsMirroringRequired);
    }

    private static void forceSetProvider(SurfaceEdge surfaceEdge, DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        surfaceEdge.invalidate();
        try {
            surfaceEdge.setProvider(deferrableSurface);
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            if (sessionConfig.getErrorListener() != null) {
                sessionConfig.getErrorListener().onError(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int getChildFormat(UseCase useCase) {
        return useCase instanceof ImageCapture ? 256 : 34;
    }

    private int getChildRotationDegrees(UseCase useCase, CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfo().getSensorRotationDegrees(((ImageOutputConfig) useCase.getCurrentConfig()).getTargetRotation(0));
    }

    private static StreamSpec getChildStreamSpec(UseCase useCase, StreamSpec streamSpec, Map<UseCase, Size> map) {
        StreamSpec.Builder builder = streamSpec.toBuilder();
        Size size = map.get(useCase);
        if (size != null) {
            builder.setOriginalConfiguredResolution(size);
        }
        return builder.build();
    }

    static DeferrableSurface getChildSurface(UseCase useCase) {
        List<DeferrableSurface> surfaces = useCase instanceof ImageCapture ? useCase.getSessionConfig().getSurfaces() : useCase.getSessionConfig().getRepeatingCaptureConfig().getSurfaces();
        Preconditions.checkState(surfaces.size() <= 1);
        if (surfaces.size() == 1) {
            return surfaces.get(0);
        }
        return null;
    }

    private static int getChildTargetType(UseCase useCase) {
        if (useCase instanceof Preview) {
            return 1;
        }
        return useCase instanceof ImageCapture ? 4 : 2;
    }

    private static int getHighestSurfacePriority(Set<UseCaseConfig<?>> set) {
        Iterator<UseCaseConfig<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getSurfaceOccupancyPriority(0));
        }
        return iMax;
    }

    private Preview getPreviewFromChildren() {
        for (UseCase useCase : this.mChildren) {
            if (useCase instanceof Preview) {
                return (Preview) useCase;
            }
        }
        return null;
    }

    private SurfaceEdge getUseCaseEdge(UseCase useCase) {
        return (SurfaceEdge) Objects.requireNonNull(this.mChildrenEdges.get(useCase));
    }

    private boolean isUseCaseActive(UseCase useCase) {
        return ((Boolean) Objects.requireNonNull(this.mChildrenActiveState.get(useCase))).booleanValue();
    }

    private static Range<Integer> resolveTargetFrameRate(Set<UseCaseConfig<?>> set) {
        Range<Integer> rangeIntersect = StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
        Iterator<UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> range = (Range) Objects.requireNonNull(it.next().getTargetFrameRate(rangeIntersect));
            if (StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED.equals(rangeIntersect)) {
                rangeIntersect = range;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(range);
                } catch (IllegalArgumentException unused) {
                    Logger.d(TAG, "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + range);
                    return rangeIntersect.extend(range);
                }
            }
        }
        return rangeIntersect;
    }

    static void sendCameraCaptureResultToChild(CameraCaptureResult cameraCaptureResult, SessionConfig sessionConfig, int i2) {
        Iterator<CameraCaptureCallback> it = sessionConfig.getRepeatingCameraCaptureCallbacks().iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(i2, new VirtualCameraCaptureResult(sessionConfig.getRepeatingCaptureConfig().getTagBundle(), cameraCaptureResult));
        }
    }

    private static Map<UseCase, UseCaseConfig<?>> toChildrenConfigsMap(CameraInternal cameraInternal, Set<UseCase> set, UseCaseConfigFactory useCaseConfigFactory) {
        HashMap map = new HashMap();
        for (UseCase useCase : set) {
            map.put(useCase, useCase.mergeConfigs(cameraInternal.getCameraInfoInternal(), null, useCase.getDefaultConfig(true, useCaseConfigFactory)));
        }
        return map;
    }

    private void updateVirtualCameraRotationDegrees(UseCase useCase) {
        Map<UseCase, VirtualCamera> map = this.mChildrenVirtualCameras;
        ((VirtualCamera) Objects.requireNonNull(map.get(useCase))).setRotationDegrees(getChildRotationDegrees(useCase, this.mParentCamera));
    }

    void bindChildren() {
        for (UseCase useCase : this.mChildren) {
            useCase.bindToCamera((CameraInternal) Objects.requireNonNull(this.mChildrenVirtualCameras.get(useCase)), null, null, useCase.getDefaultConfig(true, this.mUseCaseConfigFactory));
        }
    }

    CameraCaptureCallback createCameraCaptureCallback() {
        return new VirtualCameraCaptureCallback(this);
    }

    DualOutConfig getChildPreviewOutConfig(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, int i2, boolean z) {
        Preview previewFromChildren = getPreviewFromChildren();
        Preconditions.checkNotNull(previewFromChildren);
        return DualOutConfig.of(calculateOutConfig(previewFromChildren, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i2, z, false), calculateOutConfig(previewFromChildren, this.mResolutionsMerger, this.mSecondaryParentCamera, surfaceEdge2, i2, z, false));
    }

    Set<UseCase> getChildren() {
        return this.mChildren;
    }

    Map<UseCase, DualOutConfig> getChildrenOutConfigs(SurfaceEdge surfaceEdge, SurfaceEdge surfaceEdge2, int i2, boolean z) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            VirtualCameraAdapter virtualCameraAdapter = this;
            int i3 = i2;
            OutConfig outConfigCalculateOutConfig = virtualCameraAdapter.calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i3, z, false);
            SurfaceEdge surfaceEdge3 = surfaceEdge2;
            OutConfig outConfigCalculateOutConfig2 = virtualCameraAdapter.calculateOutConfig(useCase, (ResolutionsMerger) Objects.requireNonNull(virtualCameraAdapter.mSecondaryResolutionsMerger), (CameraInternal) Objects.requireNonNull(virtualCameraAdapter.mSecondaryParentCamera), surfaceEdge3, i3, z, false);
            virtualCameraAdapter.updateVirtualCameraRotationDegrees(useCase);
            map.put(useCase, DualOutConfig.of(outConfigCalculateOutConfig, outConfigCalculateOutConfig2));
            this = virtualCameraAdapter;
            surfaceEdge2 = surfaceEdge3;
            i2 = i3;
        }
        return map;
    }

    CameraCaptureCallback getParentMetadataCallback() {
        return this.mParentMetadataCallback;
    }

    Map<UseCase, Size> getSelectedChildSizes(SurfaceEdge surfaceEdge, boolean z) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            PreferredChildSize preferredChildSize = this.mResolutionsMerger.getPreferredChildSize((UseCaseConfig) Objects.requireNonNull(this.mChildrenConfigsMap.get(useCase)), surfaceEdge.getCropRect(), TransformUtils.getRotationDegrees(surfaceEdge.getSensorToBufferTransform()), z);
            map.put(useCase, preferredChildSize.getOriginalSelectedChildSize());
            Logger.d(TAG, "Selected child size: " + preferredChildSize.getOriginalSelectedChildSize() + ", useCase: " + useCase);
        }
        return map;
    }

    void mergeChildrenConfigs(MutableConfig mutableConfig) {
        mutableConfig.insertOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, this.mResolutionsMerger.getMergedResolutions(mutableConfig));
        mutableConfig.insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(getHighestSurfacePriority(this.mChildrenConfigs)));
        DynamicRange dynamicRangeResolveDynamicRange = DynamicRangeUtils.resolveDynamicRange(this.mChildrenConfigs);
        if (dynamicRangeResolveDynamicRange == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        mutableConfig.insertOption(ImageInputConfig.OPTION_INPUT_DYNAMIC_RANGE, dynamicRangeResolveDynamicRange);
        mutableConfig.insertOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, resolveTargetFrameRate(this.mChildrenConfigs));
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            UseCaseConfig useCaseConfig = (UseCaseConfig) Objects.requireNonNull(this.mChildrenConfigsMap.get(it.next()));
            if (useCaseConfig.getVideoStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(useCaseConfig.getVideoStabilizationMode()));
            }
            if (useCaseConfig.getPreviewStabilizationMode() != 0) {
                mutableConfig.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(useCaseConfig.getPreviewStabilizationMode()));
            }
        }
    }

    void notifyCameraControlReady() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onCameraControlReady();
        }
    }

    void notifySessionStart() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onSessionStart();
        }
    }

    void notifySessionStop() {
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            it.next().onSessionStop();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            return;
        }
        this.mChildrenActiveState.put(useCase, true);
        DeferrableSurface childSurface = getChildSurface(useCase);
        if (childSurface != null) {
            forceSetProvider(getUseCaseEdge(useCase), childSurface, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            this.mChildrenActiveState.put(useCase, false);
            getUseCaseEdge(useCase).disconnect();
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        DeferrableSurface childSurface;
        Threads.checkMainThread();
        SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
        if (isUseCaseActive(useCase) && (childSurface = getChildSurface(useCase)) != null) {
            forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        Threads.checkMainThread();
        if (isUseCaseActive(useCase)) {
            SurfaceEdge useCaseEdge = getUseCaseEdge(useCase);
            DeferrableSurface childSurface = getChildSurface(useCase);
            if (childSurface != null) {
                forceSetProvider(useCaseEdge, childSurface, useCase.getSessionConfig());
            } else {
                useCaseEdge.disconnect();
            }
        }
    }

    void resetChildren() {
        Threads.checkMainThread();
        Iterator<UseCase> it = this.mChildren.iterator();
        while (it.hasNext()) {
            onUseCaseReset(it.next());
        }
    }

    void setChildrenEdges(Map<UseCase, SurfaceEdge> map, Map<UseCase, Size> map2) {
        this.mChildrenEdges.clear();
        this.mChildrenEdges.putAll(map);
        for (Map.Entry<UseCase, SurfaceEdge> entry : this.mChildrenEdges.entrySet()) {
            UseCase key = entry.getKey();
            SurfaceEdge value = entry.getValue();
            key.setViewPortCropRect(value.getCropRect());
            key.setSensorToBufferTransformMatrix(value.getSensorToBufferTransform());
            key.updateSuggestedStreamSpec(getChildStreamSpec(key, value.getStreamSpec(), map2), null);
            key.notifyState();
        }
    }

    void unbindChildren() {
        for (UseCase useCase : this.mChildren) {
            useCase.unbindFromCamera((CameraInternal) Objects.requireNonNull(this.mChildrenVirtualCameras.get(useCase)));
        }
    }

    Map<UseCase, OutConfig> getChildrenOutConfigs(SurfaceEdge surfaceEdge, int i2, boolean z, boolean z2) {
        HashMap map = new HashMap();
        for (UseCase useCase : this.mChildren) {
            VirtualCameraAdapter virtualCameraAdapter = this;
            OutConfig outConfigCalculateOutConfig = virtualCameraAdapter.calculateOutConfig(useCase, this.mResolutionsMerger, this.mParentCamera, surfaceEdge, i2, z, z2);
            virtualCameraAdapter.updateVirtualCameraRotationDegrees(useCase);
            map.put(useCase, outConfigCalculateOutConfig);
            this = virtualCameraAdapter;
        }
        return map;
    }
}
