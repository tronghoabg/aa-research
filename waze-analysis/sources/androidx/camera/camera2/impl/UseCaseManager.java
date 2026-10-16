package androidx.camera.camera2.impl;

import android.content.Context;
import android.media.MediaCodec;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.config.UseCaseCameraComponent;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.MeteringRepeating;
import androidx.camera.camera2.internal.DynamicRangeResolver;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.UseCaseUtil;
import androidx.camera.core.streamsharing.StreamSharing;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import com.waze.strings.DisplayStrings;
import g.a.a;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class UseCaseManager {
    private volatile UseCaseCameraComponent _activeComponent;
    private boolean activeResumeEnabled;
    private final Set<UseCase> activeUseCases;
    private final Set<UseCaseCameraControl> allControls;
    private final Set<UseCase> attachedUseCases;
    private final UseCaseCameraComponent.Builder builder;
    private final Camera2CameraControl camera2CameraControl;
    private final CameraCoordinator cameraCoordinator;
    private final CameraGraphConfigProvider cameraGraphConfigProvider;
    private final a<CameraInfoInternal> cameraInfoInternal;
    private final a<CameraInternal> cameraInternal;
    private final CameraPipe cameraPipe;
    private final CameraProperties cameraProperties;
    private final CameraStateAdapter cameraStateAdapter;
    private final CameraXConfig cameraXConfig;
    private final List<br> closingCameraJobs;
    private final Set<UseCaseCameraControl> controls;
    private final l<CameraGraph.Config, CameraGraph> defaultCameraGraphFactory;
    private UseCaseCameraConfig deferredUseCaseCameraConfig;
    private final DynamicRangeResolver dynamicRangeResolver;
    private final EncoderProfilesProvider encoderProfilesProvider;
    private boolean isPrimary;
    private final Object lock;
    private final LowLightBoostControl lowLightBoostControl;
    private final MeteringRepeating meteringRepeating;
    private final Set<UseCase> pendingUseCasesToNotifyCameraControlReady;
    private SessionProcessor sessionProcessor;
    private boolean shouldCreateCameraGraphImmediately;
    private final SupportedSurfaceCombination supportedSurfaceCombination;
    private final a<UseCaseThreads> useCaseThreads;
    private final ZslControl zslControl;

    /* compiled from: WazeSource */
    public interface RunningUseCasesChangeListener {
        void onRunningUseCasesChanged(Set<? extends UseCase> set);
    }

    public static /* synthetic */ CameraGraph $r8$lambda$VpH9M1AGkIirqgAsBEVcikv2Vtc(CameraGraph cameraGraph, CameraGraph.Config config) {
        resumeDeferredComponentCreation$lambda$0$0(cameraGraph, config);
        return cameraGraph;
    }

    public UseCaseManager(CameraPipe cameraPipe, CameraCoordinator cameraCoordinator, UseCaseCameraComponent.Builder builder, ZslControl zslControl, LowLightBoostControl lowLightBoostControl, Set<UseCaseCameraControl> set, Camera2CameraControl camera2CameraControl, CameraStateAdapter cameraStateAdapter, a<CameraInternal> aVar, a<UseCaseThreads> aVar2, a<CameraInfoInternal> aVar3, EncoderProfilesProvider encoderProfilesProvider, CameraProperties cameraProperties, CameraXConfig cameraXConfig, CameraGraphConfigProvider cameraGraphConfigProvider, SupportedSurfaceCombination supportedSurfaceCombination, Context context, DisplayInfoManager displayInfoManager) {
        x.f(cameraPipe, "cameraPipe");
        x.f(cameraCoordinator, "cameraCoordinator");
        x.f(builder, "builder");
        x.f(zslControl, "zslControl");
        x.f(lowLightBoostControl, "lowLightBoostControl");
        x.f(set, "controls");
        x.f(camera2CameraControl, "camera2CameraControl");
        x.f(cameraStateAdapter, "cameraStateAdapter");
        x.f(aVar, "cameraInternal");
        x.f(aVar2, "useCaseThreads");
        x.f(aVar3, "cameraInfoInternal");
        x.f(encoderProfilesProvider, "encoderProfilesProvider");
        x.f(cameraProperties, "cameraProperties");
        x.f(cameraXConfig, "cameraXConfig");
        x.f(cameraGraphConfigProvider, "cameraGraphConfigProvider");
        x.f(supportedSurfaceCombination, "supportedSurfaceCombination");
        x.f(context, "context");
        x.f(displayInfoManager, "displayInfoManager");
        this.cameraPipe = cameraPipe;
        this.cameraCoordinator = cameraCoordinator;
        this.builder = builder;
        this.zslControl = zslControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.controls = set;
        this.camera2CameraControl = camera2CameraControl;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraInternal = aVar;
        this.useCaseThreads = aVar2;
        this.cameraInfoInternal = aVar3;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.cameraProperties = cameraProperties;
        this.cameraXConfig = cameraXConfig;
        this.cameraGraphConfigProvider = cameraGraphConfigProvider;
        this.supportedSurfaceCombination = supportedSurfaceCombination;
        this.lock = new Object();
        this.attachedUseCases = new LinkedHashSet();
        this.activeUseCases = new LinkedHashSet();
        this.shouldCreateCameraGraphImmediately = true;
        this.isPrimary = true;
        this.pendingUseCasesToNotifyCameraControlReady = new LinkedHashSet();
        this.meteringRepeating = new MeteringRepeating.Builder(cameraProperties, displayInfoManager).build();
        this.dynamicRangeResolver = new DynamicRangeResolver(cameraProperties.getMetadata());
        this.defaultCameraGraphFactory = new l() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return UseCaseManager.defaultCameraGraphFactory$lambda$0(this.f$0, (CameraGraph.Config) obj);
            }
        };
        this.closingCameraJobs = new ArrayList();
        Set<UseCaseCameraControl> setAt = i.at(set);
        setAt.add(camera2CameraControl);
        this.allControls = setAt;
    }

    private final boolean addOrRemoveRepeatingUseCase(Set<? extends UseCase> set) {
        if (shouldAddRepeatingUseCase(set)) {
            addRepeatingUseCase();
            return true;
        }
        if (!shouldRemoveRepeatingUseCase(set)) {
            return false;
        }
        removeRepeatingUseCase();
        return true;
    }

    private final void addRepeatingUseCase() {
        this.meteringRepeating.bindToCamera(this.cameraInternal.get(), null, null, null);
        this.meteringRepeating.setupSession();
        attach(i.d(this.meteringRepeating));
        activate(this.meteringRepeating);
    }

    private final void beginComponentCreation(UseCaseCameraConfig useCaseCameraConfig) {
        this._activeComponent = this.builder.config(useCaseCameraConfig).build();
        UseCaseCamera camera = getCamera();
        if (camera == null) {
            throw new IllegalStateException("Required value was null.");
        }
        camera.start();
        Iterator<UseCaseCameraControl> it = this.allControls.iterator();
        while (it.hasNext()) {
            it.next().setRequestControl(camera.getRequestControl());
        }
        camera.setActiveResumeMode(this.activeResumeEnabled);
        updateRunningUseCases(getRunningUseCases());
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Notifying " + this.pendingUseCasesToNotifyCameraControlReady + " camera control ready");
        }
        Iterator<UseCase> it2 = this.pendingUseCasesToNotifyCameraControlReady.iterator();
        while (it2.hasNext()) {
            it2.next().onCameraControlReady();
        }
        this.pendingUseCasesToNotifyCameraControlReady.clear();
    }

    private final void closeCurrentUseCases() {
        final br brVarClose;
        UseCaseCamera camera = getCamera();
        this._activeComponent = null;
        this.cameraCoordinator.removePendingCameraInfo(this.cameraInfoInternal.get());
        if (camera != null && (brVarClose = camera.close()) != null) {
            this.closingCameraJobs.add(brVarClose);
            brVarClose.bY(new l() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return UseCaseManager.closeCurrentUseCases$lambda$0$0$0(this.f$0, brVarClose, (Throwable) obj);
                }
            });
        }
        SessionProcessor sessionProcessor$camera_camera2 = getSessionProcessor$camera_camera2();
        if (sessionProcessor$camera_camera2 != null) {
            sessionProcessor$camera_camera2.deInitSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab closeCurrentUseCases$lambda$0$0$0(UseCaseManager useCaseManager, br brVar, Throwable th) {
        synchronized (useCaseManager.lock) {
            useCaseManager.closingCameraJobs.remove(brVar);
        }
        return ab.f48028a;
    }

    private final SurfaceConfig createMeteringRepeatingSurfaceConfig() {
        MeteringRepeating meteringRepeating = this.meteringRepeating;
        int cameraMode = getCameraMode();
        int imageFormat = meteringRepeating.getImageFormat();
        Size attachedSurfaceResolution = meteringRepeating.getAttachedSurfaceResolution();
        x.c(attachedSurfaceResolution);
        StreamUseCase streamUseCase = this.meteringRepeating.getCurrentConfig().getStreamUseCase();
        x.e(streamUseCase, "getStreamUseCase(...)");
        return this.supportedSurfaceCombination.transformSurfaceConfig(cameraMode, imageFormat, attachedSurfaceResolution, streamUseCase);
    }

    static final CameraGraph defaultCameraGraphFactory$lambda$0(UseCaseManager useCaseManager, CameraGraph.Config config) {
        x.f(config, "config");
        return useCaseManager.cameraPipe.createCameraGraph(config);
    }

    private final List<AttachedSurfaceInfo> getAttachedSurfaceInfoList(Collection<? extends UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase useCase : collection) {
            Size attachedSurfaceResolution = useCase.getAttachedSurfaceResolution();
            StreamSpec attachedStreamSpec = useCase.getAttachedStreamSpec();
            if (attachedSurfaceResolution == null || attachedStreamSpec == null) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Invalid surface resolution or stream spec is found.");
                }
                arrayList.clear();
                return arrayList;
            }
            SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
            int cameraMode = getCameraMode();
            int inputFormat = useCase.getCurrentConfig().getInputFormat();
            StreamUseCase streamUseCase = useCase.getCurrentConfig().getStreamUseCase();
            x.e(streamUseCase, "getStreamUseCase(...)");
            SurfaceConfig surfaceConfigTransformSurfaceConfig = supportedSurfaceCombination.transformSurfaceConfig(cameraMode, inputFormat, attachedSurfaceResolution, streamUseCase);
            int inputFormat2 = useCase.getCurrentConfig().getInputFormat();
            DynamicRange dynamicRange = attachedStreamSpec.getDynamicRange();
            List<UseCaseConfigFactory.CaptureType> captureTypes = getCaptureTypes(useCase);
            MutableOptionsBundle implementationOptions = attachedStreamSpec.getImplementationOptions();
            if (implementationOptions == null) {
                MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
                x.e(mutableOptionsBundleCreate, "create(...)");
                implementationOptions = mutableOptionsBundleCreate;
            }
            AttachedSurfaceInfo attachedSurfaceInfoCreate = AttachedSurfaceInfo.create(surfaceConfigTransformSurfaceConfig, inputFormat2, attachedSurfaceResolution, dynamicRange, captureTypes, implementationOptions, attachedStreamSpec.getSessionType(), attachedStreamSpec.getExpectedFrameRateRange(), useCase.getCurrentConfig().isStrictFrameRateRequired(), useCase.getCurrentConfig().getCustomMaxFrameRate(attachedSurfaceResolution));
            x.e(attachedSurfaceInfoCreate, "create(...)");
            arrayList.add(attachedSurfaceInfoCreate);
        }
        return arrayList;
    }

    private final int getCameraMode() {
        synchronized (this.lock) {
            return this.cameraCoordinator.getCameraOperatingMode() == 2 ? 1 : 0;
        }
    }

    private final List<UseCaseConfigFactory.CaptureType> getCaptureTypes(UseCase useCase) {
        if (!(useCase instanceof StreamSharing)) {
            return i.d(useCase.getCurrentConfig().getCaptureType());
        }
        UseCaseConfig<?> currentConfig = ((StreamSharing) useCase).getCurrentConfig();
        x.d(currentConfig, "null cannot be cast to non-null type androidx.camera.core.streamsharing.StreamSharingConfig");
        List<UseCaseConfigFactory.CaptureType> captureTypes = ((StreamSharingConfig) currentConfig).getCaptureTypes();
        x.c(captureTypes);
        return captureTypes;
    }

    private final int getRequiredMaxBitDepth(List<? extends AttachedSurfaceInfo> list) {
        Iterator<Map.Entry<UseCaseConfig<?>, DynamicRange>> it = this.dynamicRangeResolver.resolveAndValidateDynamicRanges(list, i.d(this.meteringRepeating.getCurrentConfig()), i.d(0)).entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getBitDepth() == 10) {
                return 10;
            }
        }
        return 8;
    }

    private final Set<UseCase> getRunningUseCases() {
        return i.as(this.attachedUseCases, this.activeUseCases);
    }

    private final List<SurfaceConfig> getSessionSurfacesConfigs(Collection<? extends UseCase> collection) {
        ArrayList arrayList = new ArrayList();
        for (UseCase useCase : collection) {
            List<DeferrableSurface> surfaces = useCase.getSessionConfig().getSurfaces();
            x.e(surfaces, "getSurfaces(...)");
            for (DeferrableSurface deferrableSurface : surfaces) {
                SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
                int cameraMode = getCameraMode();
                int inputFormat = useCase.getCurrentConfig().getInputFormat();
                Size prescribedSize = deferrableSurface.getPrescribedSize();
                x.e(prescribedSize, "getPrescribedSize(...)");
                StreamUseCase streamUseCase = useCase.getCurrentConfig().getStreamUseCase();
                x.e(streamUseCase, "getStreamUseCase(...)");
                arrayList.add(supportedSurfaceCombination.transformSurfaceConfig(cameraMode, inputFormat, prescribedSize, streamUseCase));
            }
        }
        return arrayList;
    }

    private final boolean isMeteringCombinationSupported(Collection<? extends UseCase> collection) {
        if (this.meteringRepeating.getAttachedSurfaceResolution() == null) {
            this.meteringRepeating.setupSession();
        }
        List<AttachedSurfaceInfo> attachedSurfaceInfoList = getAttachedSurfaceInfoList(collection);
        if (attachedSurfaceInfoList.isEmpty()) {
            return false;
        }
        List<SurfaceConfig> sessionSurfacesConfigs = getSessionSurfacesConfigs(collection);
        SupportedSurfaceCombination supportedSurfaceCombination = this.supportedSurfaceCombination;
        SupportedSurfaceCombination.FeatureSettings featureSettings = new SupportedSurfaceCombination.FeatureSettings(getCameraMode(), getRequiredMaxBitDepth(attachedSurfaceInfoList), UseCaseUtil.containsVideoCapture(collection), UseCaseUtil.getVideoStabilization$default(collection, null, 1, null), isUltraHdrOn(collection), false, false, false, null, false, DisplayStrings.DS_ACCOUNT_DETAILS, null);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(sessionSurfacesConfigs);
        arrayList.add(createMeteringRepeatingSurfaceConfig());
        boolean zCheckSupported$default = SupportedSurfaceCombination.checkSupported$default(supportedSurfaceCombination, featureSettings, arrayList, null, null, null, 28, null);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Combination of " + sessionSurfacesConfigs + " + " + this.meteringRepeating + " is supported: " + zCheckSupported$default);
        }
        return zCheckSupported$default;
    }

    private final boolean isMeteringRepeatingRequired(Set<? extends UseCase> set) {
        if (!this.cameraXConfig.isRepeatingStreamForced()) {
            return false;
        }
        Set<? extends UseCase> set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UseCase useCase = (UseCase) it.next();
                if (!x.n(useCase, this.meteringRepeating)) {
                    List<DeferrableSurface> surfaces = useCase.getSessionConfig().getSurfaces();
                    x.e(surfaces, "getSurfaces(...)");
                    if (!surfaces.isEmpty()) {
                        Set<UseCase> set3 = this.attachedUseCases;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : set3) {
                            if (!x.n((UseCase) obj, this.meteringRepeating)) {
                                arrayList.add(obj);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            return false;
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!shouldForceRepeatingStream(arrayList3) || !isMeteringCombinationSupported(arrayList3)) {
                            break;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final boolean isUltraHdrOn(Collection<? extends UseCase> collection) {
        UseCaseConfig<?> currentConfig;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof ImageCapture) {
                arrayList.add(obj);
            }
        }
        ImageCapture imageCapture = (ImageCapture) i.R(arrayList);
        return (imageCapture == null || (currentConfig = imageCapture.getCurrentConfig()) == null || currentConfig.getInputFormat() != 4101) ? false : true;
    }

    private final void refreshAttachedUseCases(Set<? extends UseCase> set) {
        Pair<Integer, Integer> implementationType;
        Integer num;
        closeCurrentUseCases();
        List listAo = i.ao(set);
        if (listAo.isEmpty()) {
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                useCaseCameraControl.setRequestControl(null);
                useCaseCameraControl.reset();
            }
            return;
        }
        if (!this.shouldCreateCameraGraphImmediately) {
            Iterator<UseCaseCameraControl> it = this.allControls.iterator();
            while (it.hasNext()) {
                it.next().setRequestControl(null);
            }
        }
        SessionProcessor sessionProcessor$camera_camera2 = getSessionProcessor$camera_camera2();
        Integer num2 = (sessionProcessor$camera_camera2 == null || (implementationType = sessionProcessor$camera_camera2.getImplementationType()) == null || (num = (Integer) implementationType.first) == null || num.intValue() != 1) ? null : (Integer) implementationType.second;
        if (num2 != null) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Setting up UseCaseManager with OperatingMode.EXTENSION");
            }
            SessionProcessor sessionProcessor$camera_camera22 = getSessionProcessor$camera_camera2();
            x.c(sessionProcessor$camera_camera22);
            sessionProcessor$camera_camera22.initSession(this.cameraInfoInternal.get(), null);
        }
        tryResumeUseCaseManager(createUseCaseCameraConfig$camera_camera2(new SessionConfigAdapter(listAo, this.isPrimary), num2));
    }

    private final void refreshRunningUseCases() {
        if (this.attachedUseCases.isEmpty()) {
            return;
        }
        Set<UseCase> runningUseCases = getRunningUseCases();
        if (shouldAddRepeatingUseCase(runningUseCases)) {
            addRepeatingUseCase();
        } else if (shouldRemoveRepeatingUseCase(runningUseCases)) {
            removeRepeatingUseCase();
        } else {
            updateRunningUseCases(runningUseCases);
        }
    }

    private final void removeRepeatingUseCase() {
        deactivate(this.meteringRepeating);
        detach(i.d(this.meteringRepeating));
        this.meteringRepeating.unbindFromCamera(this.cameraInternal.get());
    }

    private static final CameraGraph resumeDeferredComponentCreation$lambda$0$0(CameraGraph cameraGraph, CameraGraph.Config config) {
        x.f(config, "<unused var>");
        return cameraGraph;
    }

    private final boolean shouldAddRepeatingUseCase(Set<? extends UseCase> set) {
        return this.cameraXConfig.isRepeatingStreamForced() && !this.attachedUseCases.contains(this.meteringRepeating) && isMeteringRepeatingRequired(set);
    }

    private final boolean shouldForceRepeatingStream(Collection<? extends UseCase> collection) {
        boolean z;
        if (collection.isEmpty()) {
            return false;
        }
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            validatingBuilder.add(((UseCase) it.next()).getSessionConfig());
        }
        SessionConfig sessionConfigBuild = validatingBuilder.build();
        x.e(sessionConfigBuild, "build(...)");
        List<DeferrableSurface> surfaces = sessionConfigBuild.getRepeatingCaptureConfig().getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        List<DeferrableSurface> surfaces2 = sessionConfigBuild.getSurfaces();
        x.e(surfaces2, "getSurfaces(...)");
        if (surfaces2.isEmpty()) {
            return false;
        }
        List<DeferrableSurface> list = surfaces2;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!x.n(((DeferrableSurface) it2.next()).getContainerClass(), MediaCodec.class)) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z || surfaces.isEmpty();
    }

    private final boolean shouldRemoveRepeatingUseCase(Set<? extends UseCase> set) {
        return set.contains(this.meteringRepeating) && !isMeteringRepeatingRequired(set);
    }

    private final void tryResumeUseCaseManager(UseCaseCameraConfig useCaseCameraConfig) {
        if (this.shouldCreateCameraGraphImmediately) {
            beginComponentCreation(useCaseCameraConfig);
        } else {
            this.deferredUseCaseCameraConfig = useCaseCameraConfig;
            this.cameraCoordinator.addPendingCameraInfo(this.cameraInfoInternal.get());
        }
    }

    private final void updateRunningUseCases(Set<? extends UseCase> set) {
        UseCaseCamera camera = getCamera();
        if (camera != null) {
            camera.updateRepeatingRequestAsync(this.isPrimary, set);
            for (UseCaseCameraControl useCaseCameraControl : this.allControls) {
                if (useCaseCameraControl instanceof RunningUseCasesChangeListener) {
                    ((RunningUseCasesChangeListener) useCaseCameraControl).onRunningUseCasesChanged(set);
                }
            }
        }
    }

    private final void updateZslDisabledByUseCaseConfigStatus() {
        Set<UseCase> set = this.attachedUseCases;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((UseCase) it.next()).getCurrentConfig().isZslDisabled(false)) {
                    z = true;
                    break;
                }
            }
        }
        this.zslControl.setZslDisabledByUserCaseConfig(z);
    }

    public final void activate(UseCase useCase) {
        x.f(useCase, "useCase");
        synchronized (this.lock) {
            if (this.activeUseCases.add(useCase)) {
                refreshRunningUseCases();
            }
        }
    }

    public final void attach(List<? extends UseCase> list) {
        x.f(list, "useCases");
        synchronized (this.lock) {
            if (list.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Attach [] from " + this + " (Ignored)");
                }
            } else {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Attaching " + list + " from " + this);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!this.attachedUseCases.contains((UseCase) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((UseCase) it.next()).onSessionStart();
                }
                if (this.attachedUseCases.addAll(list) && !addOrRemoveRepeatingUseCase(getRunningUseCases())) {
                    updateZslDisabledByUseCaseConfigStatus();
                    this.lowLightBoostControl.onSessionConfigChanged(i.ao(this.attachedUseCases));
                    refreshAttachedUseCases(this.attachedUseCases);
                }
                if (this.shouldCreateCameraGraphImmediately) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((UseCase) it2.next()).onCameraControlReady();
                    }
                } else {
                    this.pendingUseCasesToNotifyCameraControlReady.addAll(arrayList2);
                }
            }
        }
    }

    public final Object close(e<? super ab> eVar) {
        List listAo;
        synchronized (this.lock) {
            closeCurrentUseCases();
            this.meteringRepeating.onUnbind();
            listAo = i.ao(this.closingCameraJobs);
        }
        Object objE = aj.E(listAo, eVar);
        return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
    }

    public final UseCaseCameraConfig createUseCaseCameraConfig$camera_camera2(SessionConfigAdapter sessionConfigAdapter, Integer num) {
        x.f(sessionConfigAdapter, "sessionConfigAdapter");
        return UseCaseCameraConfig.Companion.create(sessionConfigAdapter, this.cameraGraphConfigProvider, this.defaultCameraGraphFactory, this.cameraStateAdapter, getSessionProcessor$camera_camera2(), num);
    }

    public final void deactivate(UseCase useCase) {
        x.f(useCase, "useCase");
        synchronized (this.lock) {
            if (this.activeUseCases.remove(useCase)) {
                refreshRunningUseCases();
            }
        }
    }

    public final void detach(List<? extends UseCase> list) {
        x.f(list, "useCases");
        synchronized (this.lock) {
            if (list.isEmpty()) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Detaching [] from " + this + " (Ignored)");
                }
            } else {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Detaching " + list + " from " + this);
                }
                this.activeUseCases.removeAll(list);
                for (UseCase useCase : list) {
                    if (this.attachedUseCases.contains(useCase)) {
                        useCase.onSessionStop();
                    }
                }
                List<? extends UseCase> list2 = list;
                if (!this.attachedUseCases.removeAll(list2)) {
                    this.pendingUseCasesToNotifyCameraControlReady.removeAll(list2);
                } else if (!addOrRemoveRepeatingUseCase(getRunningUseCases())) {
                    if (this.attachedUseCases.isEmpty()) {
                        this.zslControl.setZslDisabledByUserCaseConfig(false);
                        this.lowLightBoostControl.onSessionConfigChanged(i.h());
                    } else {
                        updateZslDisabledByUseCaseConfigStatus();
                        this.lowLightBoostControl.onSessionConfigChanged(i.ao(this.attachedUseCases));
                    }
                    refreshAttachedUseCases(this.attachedUseCases);
                    this.pendingUseCasesToNotifyCameraControlReady.removeAll(list2);
                }
            }
        }
    }

    public final UseCaseCamera getCamera() {
        UseCaseCameraComponent useCaseCameraComponent = this._activeComponent;
        if (useCaseCameraComponent != null) {
            return useCaseCameraComponent.getUseCaseCamera();
        }
        return null;
    }

    public final CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        CameraGraph.Config cameraGraphConfig;
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            cameraGraphConfig = useCaseCameraConfig != null ? useCaseCameraConfig.getCameraGraphConfig() : null;
        }
        return cameraGraphConfig;
    }

    public final Set<UseCase> getRunningUseCasesForTest() {
        Set<UseCase> runningUseCases;
        synchronized (this.lock) {
            runningUseCases = getRunningUseCases();
        }
        return runningUseCases;
    }

    public final SessionProcessor getSessionProcessor$camera_camera2() {
        SessionProcessor sessionProcessor;
        synchronized (this.lock) {
            sessionProcessor = this.sessionProcessor;
        }
        return sessionProcessor;
    }

    public final void reset(UseCase useCase) {
        x.f(useCase, "useCase");
        synchronized (this.lock) {
            if (this.attachedUseCases.contains(useCase)) {
                refreshAttachedUseCases(this.attachedUseCases);
            }
        }
    }

    public final void resumeDeferredComponentCreation$camera_camera2(final CameraGraph cameraGraph) {
        x.f(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            UseCaseCameraConfig useCaseCameraConfig = this.deferredUseCaseCameraConfig;
            if (useCaseCameraConfig == null) {
                throw new IllegalStateException("Required value was null.");
            }
            beginComponentCreation(UseCaseCameraConfig.copy$default(useCaseCameraConfig, new l() { // from class: androidx.camera.camera2.impl.UseCaseManager$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    CameraGraph cameraGraph2 = cameraGraph;
                    UseCaseManager.$r8$lambda$VpH9M1AGkIirqgAsBEVcikv2Vtc(cameraGraph2, (CameraGraph.Config) obj);
                    return cameraGraph2;
                }
            }, null, null, null, null, 30, null));
        }
    }

    public final ab setActiveResumeMode(boolean z) {
        ab abVar;
        synchronized (this.lock) {
            this.activeResumeEnabled = z;
            UseCaseCamera camera = getCamera();
            if (camera != null) {
                camera.setActiveResumeMode(z);
                abVar = ab.f48028a;
            } else {
                abVar = null;
            }
        }
        return abVar;
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean z) {
        synchronized (this.lock) {
            this.shouldCreateCameraGraphImmediately = z;
            if (z) {
                this.deferredUseCaseCameraConfig = null;
            }
        }
    }

    public final void setPrimary(boolean z) {
        synchronized (this.lock) {
            this.isPrimary = z;
        }
    }

    public final void setSessionProcessor$camera_camera2(SessionProcessor sessionProcessor) {
        synchronized (this.lock) {
            this.sessionProcessor = sessionProcessor;
        }
    }

    public String toString() {
        return "UseCaseManager<" + this.cameraGraphConfigProvider + ">";
    }

    public final void update(UseCase useCase) {
        x.f(useCase, "useCase");
        synchronized (this.lock) {
            if (this.attachedUseCases.contains(useCase)) {
                refreshRunningUseCases();
            }
        }
    }
}
