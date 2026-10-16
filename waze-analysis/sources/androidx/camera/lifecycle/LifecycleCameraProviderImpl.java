package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.CompositionSettings;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.Preview;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.d.m.a.bm;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import h.k;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LifecycleCameraProviderImpl implements LifecycleCameraProvider, CameraPresenceListener {
    private final Map<CameraIdentifier, AdapterCameraInfo> cameraInfoMap;
    private CameraX cameraX;
    private CameraXConfig.Provider cameraXConfigProvider;
    private bm<Void> cameraXInitializeFuture;
    private bm<Void> cameraXShutdownFuture;
    private Context context;
    private final HashSet<LifecycleCameraRepository.Key> lifecycleCameraKeys;
    private LifecycleCameraRepository lifecycleCameraRepository;
    private final Object lock = new Object();

    public static /* synthetic */ Void $r8$lambda$fGSKVcSoAXbK7NEn8opAT2ioUoU(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, CameraX cameraX, Context context, Void r3) {
        initAsync$lambda$0$3(lifecycleCameraProviderImpl, cameraX, context, r3);
        return r3;
    }

    public LifecycleCameraProviderImpl() {
        bm<Void> bmVarImmediateFuture = Futures.immediateFuture(null);
        x.e(bmVarImmediateFuture, "immediateFuture(...)");
        this.cameraXShutdownFuture = bmVarImmediateFuture;
        this.cameraInfoMap = new HashMap();
        this.lifecycleCameraKeys = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Camera bindToLifecycleInternal(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, CameraSelector cameraSelector2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2, SessionConfig sessionConfig) {
        CameraInternal cameraInternal;
        AdapterCameraInfo adapterCameraInfo;
        Trace.beginSection("CX:bindToLifecycle-internal");
        try {
            Threads.checkMainThread();
            k selectorsWithSessionFilter = getSelectorsWithSessionFilter(sessionConfig, cameraSelector, cameraSelector2);
            CameraSelector cameraSelector3 = (CameraSelector) selectorsWithSessionFilter.a();
            CameraSelector cameraSelector4 = (CameraSelector) selectorsWithSessionFilter.b();
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            CameraInternal cameraInternalSelect = cameraSelector3.select(cameraX.getCameraRepository().getCameras());
            x.e(cameraInternalSelect, "select(...)");
            cameraInternalSelect.setPrimary(true);
            AdapterCameraInfo adapterCameraInfo2 = (AdapterCameraInfo) getCameraInfo(cameraSelector3);
            boolean z = false;
            if (cameraSelector4 != null) {
                CameraX cameraX2 = this.cameraX;
                x.c(cameraX2);
                CameraInternal cameraInternalSelect2 = cameraSelector4.select(cameraX2.getCameraRepository().getCameras());
                cameraInternalSelect2.setPrimary(false);
                adapterCameraInfo = (AdapterCameraInfo) getCameraInfo(cameraSelector4);
                cameraInternal = cameraInternalSelect2;
            } else {
                cameraInternal = null;
                adapterCameraInfo = null;
            }
            CameraIdentifier cameraIdentifierFromAdapterInfos = CameraIdentifier.Factory.fromAdapterInfos(adapterCameraInfo2, adapterCameraInfo);
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            x.c(lifecycleCameraRepository);
            LifecycleCamera lifecycleCamera = lifecycleCameraRepository.getLifecycleCamera(lifecycleOwner, cameraIdentifierFromAdapterInfos);
            LifecycleCameraRepository lifecycleCameraRepository2 = this.lifecycleCameraRepository;
            x.c(lifecycleCameraRepository2);
            Collection<LifecycleCamera> lifecycleCameras = lifecycleCameraRepository2.getLifecycleCameras();
            for (UseCase useCase : sessionConfig.getUseCases()) {
                for (LifecycleCamera lifecycleCamera2 : lifecycleCameras) {
                    boolean z2 = z;
                    x.e(lifecycleCamera2, "next(...)");
                    LifecycleCamera lifecycleCamera3 = lifecycleCamera2;
                    if (lifecycleCamera3.isBound(useCase) && !x.n(lifecycleCamera3.getLifecycleOwner(), lifecycleOwner)) {
                        Object[] objArr = new Object[1];
                        objArr[z2 ? 1 : 0] = useCase;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(objArr, 1));
                        x.e(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                    z = z2 ? 1 : 0;
                }
            }
            if (lifecycleCamera == null) {
                LifecycleCameraRepository lifecycleCameraRepository3 = this.lifecycleCameraRepository;
                x.c(lifecycleCameraRepository3);
                CameraX cameraX3 = this.cameraX;
                x.c(cameraX3);
                CameraUseCaseAdapter cameraUseCaseAdapterProvide = cameraX3.getCameraUseCaseAdapterProvider().provide(cameraInternalSelect, cameraInternal, adapterCameraInfo2, adapterCameraInfo, compositionSettings, compositionSettings2);
                CameraX cameraX4 = this.cameraX;
                x.c(cameraX4);
                lifecycleCamera = lifecycleCameraRepository3.createLifecycleCamera(lifecycleOwner, cameraUseCaseAdapterProvide, cameraX4.getRotationProvider());
            }
            if (!sessionConfig.getUseCases().isEmpty()) {
                LifecycleCameraRepository lifecycleCameraRepository4 = this.lifecycleCameraRepository;
                x.c(lifecycleCameraRepository4);
                CameraX cameraX5 = this.cameraX;
                x.c(cameraX5);
                lifecycleCameraRepository4.bindToLifecycleCamera(lifecycleCamera, sessionConfig, cameraX5.getCameraFactory().getCameraCoordinator());
                this.lifecycleCameraKeys.add(LifecycleCameraRepository.Key.create(lifecycleOwner, cameraIdentifierFromAdapterInfos));
            }
            Trace.endSection();
            return lifecycleCamera;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    static /* synthetic */ Camera bindToLifecycleInternal$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, CameraSelector cameraSelector2, CompositionSettings compositionSettings, CompositionSettings compositionSettings2, SessionConfig sessionConfig, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            compositionSettings = CompositionSettings.DEFAULT;
            x.e(compositionSettings, "DEFAULT");
        }
        CompositionSettings compositionSettings3 = compositionSettings;
        if ((i2 & 16) != 0) {
            compositionSettings2 = CompositionSettings.DEFAULT;
            x.e(compositionSettings2, "DEFAULT");
        }
        CompositionSettings compositionSettings4 = compositionSettings2;
        if ((i2 & 4) != 0) {
            cameraSelector2 = null;
        }
        return lifecycleCameraProviderImpl.bindToLifecycleInternal(lifecycleOwner, cameraSelector, cameraSelector2, compositionSettings3, compositionSettings4, sessionConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CameraInfo> getActiveConcurrentCameraInfos() {
        if (!isInitialized()) {
            return i.h();
        }
        CameraX cameraX = this.cameraX;
        x.c(cameraX);
        List<CameraInfo> activeConcurrentCameraInfos = cameraX.getCameraFactory().getCameraCoordinator().getActiveConcurrentCameraInfos();
        x.e(activeConcurrentCameraInfos, "getActiveConcurrentCameraInfos(...)");
        return activeConcurrentCameraInfos;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraConfig getCameraConfig(CameraSelector cameraSelector, CameraInfo cameraInfo) {
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        x.e(it, "iterator(...)");
        CameraConfig cameraConfig = null;
        while (it.hasNext()) {
            CameraFilter next = it.next();
            x.e(next, "next(...)");
            CameraFilter cameraFilter = next;
            if (!x.n(cameraFilter.getIdentifier(), CameraFilter.DEFAULT_ID)) {
                CameraConfigProvider configProvider = ExtendedCameraConfigProviderStore.getConfigProvider(cameraFilter.getIdentifier());
                Context context = this.context;
                x.c(context);
                CameraConfig config = configProvider.getConfig(cameraInfo, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? CameraConfigs.defaultConfig() : cameraConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCameraOperatingMode() {
        if (!isInitialized()) {
            return 0;
        }
        CameraX cameraX = this.cameraX;
        x.c(cameraX);
        return cameraX.getCameraFactory().getCameraCoordinator().getCameraOperatingMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k<CameraSelector, CameraSelector> getSelectorsWithSessionFilter(SessionConfig sessionConfig, CameraSelector cameraSelector, CameraSelector cameraSelector2) {
        CameraFilter cameraFilter = sessionConfig.getCameraFilter();
        if (cameraFilter != null) {
            CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
            builderFromSelector.addCameraFilter(cameraFilter);
            cameraSelector = builderFromSelector.build();
            x.e(cameraSelector, "build(...)");
            if (cameraSelector2 != null) {
                CameraSelector.Builder builderFromSelector2 = CameraSelector.Builder.fromSelector(cameraSelector2);
                builderFromSelector2.addCameraFilter(cameraFilter);
                cameraSelector2 = builderFromSelector2.build();
            } else {
                cameraSelector2 = null;
            }
        }
        return new k<>(cameraSelector, cameraSelector2);
    }

    public static /* synthetic */ bm initAsync$camera_lifecycle$default(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, Context context, CameraXConfig cameraXConfig, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            cameraXConfig = null;
        }
        return lifecycleCameraProviderImpl.initAsync$camera_lifecycle(context, cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm initAsync$lambda$0$1(CameraX cameraX, Void r1) {
        return cameraX.getInitializeFuture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm initAsync$lambda$0$2(l lVar, Object obj) {
        return (bm) lVar.invoke(obj);
    }

    private static final Void initAsync$lambda$0$3(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, CameraX cameraX, Context context, Void r3) {
        lifecycleCameraProviderImpl.initInternal(cameraX, ContextUtil.getPersistentApplicationContext(context));
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void initAsync$lambda$0$4(l lVar, Object obj) {
        return (Void) lVar.invoke(obj);
    }

    private final void initInternal(CameraX cameraX, Context context) {
        CameraPresenceProvider cameraAvailabilityProvider;
        synchronized (this.lock) {
            this.cameraX = cameraX;
            this.context = context;
            if (cameraX != null && (cameraAvailabilityProvider = cameraX.getCameraAvailabilityProvider()) != null) {
                ScheduledExecutorService scheduledExecutorServiceMainThreadExecutor = CameraXExecutors.mainThreadExecutor();
                x.e(scheduledExecutorServiceMainThreadExecutor, "mainThreadExecutor(...)");
                cameraAvailabilityProvider.addCameraPresenceListener(this, scheduledExecutorServiceMainThreadExecutor);
            }
        }
    }

    private final boolean isInitialized() {
        return this.cameraX != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreview(UseCase useCase) {
        return useCase instanceof Preview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVideoCapture(UseCase useCase) {
        return useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setActiveConcurrentCameraInfos(List<? extends CameraInfo> list) {
        if (isInitialized()) {
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().setActiveConcurrentCameraInfos(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCameraOperatingMode(int i2) {
        if (isInitialized()) {
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            cameraX.getCameraFactory().getCameraCoordinator().setCameraOperatingMode(i2);
        }
    }

    static final void shutdownAsync$lambda$0(LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        if (lifecycleCameraProviderImpl.isInitialized()) {
            lifecycleCameraProviderImpl.unbindAll();
            LifecycleCameraRepository lifecycleCameraRepository = lifecycleCameraProviderImpl.lifecycleCameraRepository;
            x.c(lifecycleCameraRepository);
            lifecycleCameraRepository.removeLifecycleCameras(lifecycleCameraProviderImpl.lifecycleCameraKeys);
        }
    }

    private final void shutdownInternal() {
        initInternal(null, null);
    }

    @Override // androidx.camera.core.CameraProvider
    public void addCameraPresenceListener(Executor executor, CameraPresenceListener cameraPresenceListener) {
        x.f(executor, "executor");
        x.f(cameraPresenceListener, "listener");
        CameraX cameraX = this.cameraX;
        x.c(cameraX);
        cameraX.getCameraAvailabilityProvider().addCameraPresenceListener(cameraPresenceListener, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0258 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:3:0x0010, B:5:0x0017, B:8:0x004f, B:10:0x0059, B:12:0x0063, B:14:0x0069, B:16:0x006f, B:18:0x007d, B:20:0x0093, B:22:0x00a9, B:23:0x00d7, B:25:0x00dd, B:26:0x00f2, B:28:0x00f8, B:30:0x010d, B:31:0x0111, B:32:0x0124, B:85:0x02ea, B:33:0x013d, B:34:0x0144, B:35:0x0145, B:36:0x014c, B:37:0x014d, B:38:0x0152, B:39:0x0153, B:40:0x0168, B:42:0x016e, B:43:0x0186, B:44:0x0189, B:46:0x0193, B:93:0x0305, B:94:0x030c, B:48:0x019c, B:49:0x01a0, B:51:0x01a6, B:53:0x01b6, B:55:0x01c9, B:57:0x01dc, B:59:0x01e2, B:61:0x01ee, B:64:0x01f9, B:65:0x0200, B:66:0x0201, B:69:0x021c, B:71:0x022a, B:73:0x024f, B:79:0x0267, B:84:0x02e5, B:75:0x0258, B:77:0x025e, B:80:0x02a5, B:81:0x02a9, B:83:0x02af, B:88:0x02f3, B:89:0x02f8, B:90:0x02f9, B:91:0x0300, B:96:0x030e, B:97:0x0317, B:98:0x0318, B:99:0x031f), top: B:103:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02af A[Catch: all -> 0x0320, LOOP:4: B:81:0x02a9->B:83:0x02af, LOOP_END, TryCatch #0 {all -> 0x0320, blocks: (B:3:0x0010, B:5:0x0017, B:8:0x004f, B:10:0x0059, B:12:0x0063, B:14:0x0069, B:16:0x006f, B:18:0x007d, B:20:0x0093, B:22:0x00a9, B:23:0x00d7, B:25:0x00dd, B:26:0x00f2, B:28:0x00f8, B:30:0x010d, B:31:0x0111, B:32:0x0124, B:85:0x02ea, B:33:0x013d, B:34:0x0144, B:35:0x0145, B:36:0x014c, B:37:0x014d, B:38:0x0152, B:39:0x0153, B:40:0x0168, B:42:0x016e, B:43:0x0186, B:44:0x0189, B:46:0x0193, B:93:0x0305, B:94:0x030c, B:48:0x019c, B:49:0x01a0, B:51:0x01a6, B:53:0x01b6, B:55:0x01c9, B:57:0x01dc, B:59:0x01e2, B:61:0x01ee, B:64:0x01f9, B:65:0x0200, B:66:0x0201, B:69:0x021c, B:71:0x022a, B:73:0x024f, B:79:0x0267, B:84:0x02e5, B:75:0x0258, B:77:0x025e, B:80:0x02a5, B:81:0x02a9, B:83:0x02af, B:88:0x02f3, B:89:0x02f8, B:90:0x02f9, B:91:0x0300, B:96:0x030e, B:97:0x0317, B:98:0x0318, B:99:0x031f), top: B:103:0x0010, inners: #1 }] */
    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.camera.core.ConcurrentCamera bindToLifecycle(java.util.List<androidx.camera.core.ConcurrentCamera.SingleCameraConfig> r18) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCameraProviderImpl.bindToLifecycle(java.util.List):androidx.camera.core.ConcurrentCamera");
    }

    public final void configure$camera_lifecycle(final CameraXConfig cameraXConfig) {
        x.f(cameraXConfig, "cameraXConfig");
        Trace.beginSection("CX:configureInstanceInternal");
        try {
            synchronized (this.lock) {
                Preconditions.checkNotNull(cameraXConfig);
                Preconditions.checkState(getCameraXConfigProvider$camera_lifecycle() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                setCameraXConfigProvider$camera_lifecycle(new CameraXConfig.Provider() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$configure$1$1$1
                    @Override // androidx.camera.core.CameraXConfig.Provider
                    public final CameraXConfig getCameraXConfig() {
                        return cameraXConfig;
                    }
                });
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        Trace.beginSection("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            LinkedHashSet<CameraInternal> cameras = cameraX.getCameraRepository().getCameras();
            x.e(cameras, "getCameras(...)");
            Iterator<CameraInternal> it = cameras.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = it.next().getCameraInfo();
                x.e(cameraInfo, "getCameraInfo(...)");
                arrayList.add(cameraInfo);
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        Trace.beginSection("CX:getAvailableConcurrentCameraInfos");
        try {
            Objects.requireNonNull(this.cameraX);
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            Objects.requireNonNull(cameraX.getCameraFactory().getCameraCoordinator());
            CameraX cameraX2 = this.cameraX;
            x.c(cameraX2);
            List<List<CameraSelector>> concurrentCameraSelectors = cameraX2.getCameraFactory().getCameraCoordinator().getConcurrentCameraSelectors();
            x.e(concurrentCameraSelectors, "getConcurrentCameraSelectors(...)");
            ArrayList arrayList = new ArrayList();
            for (List<CameraSelector> list : concurrentCameraSelectors) {
                ArrayList arrayList2 = new ArrayList();
                for (CameraSelector cameraSelector : list) {
                    try {
                        x.c(cameraSelector);
                        arrayList2.add(getCameraInfo(cameraSelector));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (arrayList2.size() == 2) {
                    arrayList.add(arrayList2);
                }
            }
            return arrayList;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        Object adapterCameraInfo;
        x.f(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:getCameraInfo");
        try {
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            CameraInfoInternal cameraInfoInternal = cameraSelector.select(cameraX.getCameraRepository().getCameras()).getCameraInfoInternal();
            x.e(cameraInfoInternal, "getCameraInfoInternal(...)");
            CameraConfig cameraConfig = getCameraConfig(cameraSelector, cameraInfoInternal);
            String cameraId = cameraInfoInternal.getCameraId();
            x.e(cameraId, "getCameraId(...)");
            CameraIdentifier cameraIdentifierCreate = CameraIdentifier.Factory.create(cameraId, null, cameraConfig.getCompatibilityId());
            synchronized (this.lock) {
                adapterCameraInfo = this.cameraInfoMap.get(cameraIdentifierCreate);
                if (adapterCameraInfo == null) {
                    adapterCameraInfo = new AdapterCameraInfo(cameraInfoInternal, cameraConfig);
                    this.cameraInfoMap.put(cameraIdentifierCreate, adapterCameraInfo);
                }
            }
            AdapterCameraInfo adapterCameraInfo2 = (AdapterCameraInfo) adapterCameraInfo;
            Trace.endSection();
            return adapterCameraInfo2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final CameraXConfig.Provider getCameraXConfigProvider$camera_lifecycle() {
        return this.cameraXConfigProvider;
    }

    public final Context getContext$camera_lifecycle() {
        return this.context;
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) {
        boolean z;
        x.f(cameraSelector, "cameraSelector");
        Trace.beginSection("CX:hasCamera");
        try {
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            cameraSelector.select(cameraX.getCameraRepository().getCameras());
            z = true;
        } catch (IllegalArgumentException unused) {
            z = false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        Trace.endSection();
        return z;
    }

    public final bm<Void> initAsync$camera_lifecycle(final Context context, CameraXConfig cameraXConfig) {
        x.f(context, "context");
        synchronized (this.lock) {
            this.lifecycleCameraRepository = LifecycleCameraRepositories.getInstance$camera_lifecycle(ContextUtil.getDeviceId(context));
            bm<Void> bmVar = this.cameraXInitializeFuture;
            if (bmVar != null) {
                return bmVar;
            }
            if (cameraXConfig != null) {
                configure$camera_lifecycle(cameraXConfig);
            }
            final CameraX cameraX = new CameraX(context, this.cameraXConfigProvider);
            FutureChain futureChainFrom = FutureChain.from(this.cameraXShutdownFuture);
            final l lVar = new l() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return LifecycleCameraProviderImpl.initAsync$lambda$0$1(cameraX, (Void) obj);
                }
            };
            FutureChain futureChainTransformAsync = futureChainFrom.transformAsync(new AsyncFunction() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final bm apply(Object obj) {
                    return LifecycleCameraProviderImpl.initAsync$lambda$0$2(lVar, obj);
                }
            }, CameraXExecutors.directExecutor());
            final l lVar2 = new l() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    Void r3 = (Void) obj;
                    LifecycleCameraProviderImpl.$r8$lambda$fGSKVcSoAXbK7NEn8opAT2ioUoU(this.f$0, cameraX, context, r3);
                    return r3;
                }
            };
            FutureChain futureChainTransform = futureChainTransformAsync.transform(new Function() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return LifecycleCameraProviderImpl.initAsync$lambda$0$4(lVar2, obj);
                }
            }, CameraXExecutors.directExecutor());
            x.e(futureChainTransform, "transform(...)");
            FutureChain futureChain = futureChainTransform;
            this.cameraXInitializeFuture = futureChain;
            Futures.addCallback(futureChain, new FutureCallback<Void>() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$initAsync$1$2
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(Throwable th) {
                    x.f(th, "t");
                    this.this$0.shutdownAsync$camera_lifecycle(false);
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public /* bridge */ /* synthetic */ void onSuccess(Void r1) {
                }

                /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
                public void onSuccess2(Void r1) {
                }
            }, CameraXExecutors.directExecutor());
            bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(futureChain);
            x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
            return bmVarNonCancellationPropagating;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
        x.c(lifecycleCameraRepository);
        for (LifecycleCamera lifecycleCamera : lifecycleCameraRepository.getLifecycleCameras()) {
            x.e(lifecycleCamera, "next(...)");
            if (lifecycleCamera.isBound(sessionConfig)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean isConcurrentCameraModeOn() {
        return getCameraOperatingMode() == 2;
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public void onCamerasAdded(Set<CameraIdentifier> set) {
        x.f(set, "addedCameraIds");
    }

    @Override // androidx.camera.core.CameraPresenceListener
    public void onCamerasRemoved(Set<CameraIdentifier> set) {
        x.f(set, "removedCameraIds");
        Threads.checkMainThread();
        synchronized (this.lock) {
            for (CameraIdentifier cameraIdentifier : set) {
                Set<CameraIdentifier> setKeySet = this.cameraInfoMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    if (x.n(((CameraIdentifier) obj).getCameraIds(), cameraIdentifier.getCameraIds())) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.cameraInfoMap.remove((CameraIdentifier) it.next());
                }
            }
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public void removeCameraPresenceListener(CameraPresenceListener cameraPresenceListener) {
        x.f(cameraPresenceListener, "listener");
        CameraX cameraX = this.cameraX;
        x.c(cameraX);
        cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(cameraPresenceListener);
    }

    public final void setCameraXConfigProvider$camera_lifecycle(CameraXConfig.Provider provider) {
        this.cameraXConfigProvider = provider;
    }

    public final void setContext$camera_lifecycle(Context context) {
        this.context = context;
    }

    public final bm<Void> shutdownAsync$camera_lifecycle(boolean z) {
        bm<Void> bmVarImmediateFuture;
        Threads.runOnMainSync(new Runnable() { // from class: androidx.camera.lifecycle.LifecycleCameraProviderImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                LifecycleCameraProviderImpl.shutdownAsync$lambda$0(this.f$0);
            }
        });
        if (isInitialized()) {
            CameraX cameraX = this.cameraX;
            x.c(cameraX);
            cameraX.getCameraAvailabilityProvider().removeCameraPresenceListener(this);
            CameraX cameraX2 = this.cameraX;
            x.c(cameraX2);
            bmVarImmediateFuture = cameraX2.shutdown();
        } else {
            bmVarImmediateFuture = Futures.immediateFuture(null);
        }
        x.c(bmVarImmediateFuture);
        synchronized (this.lock) {
            if (z) {
                this.cameraXConfigProvider = null;
                this.cameraXInitializeFuture = null;
                this.cameraXShutdownFuture = bmVarImmediateFuture;
                this.cameraInfoMap.clear();
                this.lifecycleCameraKeys.clear();
            } else {
                this.cameraXInitializeFuture = null;
                this.cameraXShutdownFuture = bmVarImmediateFuture;
                this.cameraInfoMap.clear();
                this.lifecycleCameraKeys.clear();
            }
        }
        shutdownInternal();
        return bmVarImmediateFuture;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(UseCase... useCaseArr) {
        x.f(useCaseArr, "useCases");
        Trace.beginSection("CX:unbind");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            x.c(lifecycleCameraRepository);
            lifecycleCameraRepository.unbind(new LegacySessionConfig(c.R(useCaseArr), null, null, 6, null), this.lifecycleCameraKeys);
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbindAll() {
        Trace.beginSection("CX:unbindAll");
        try {
            Threads.checkMainThread();
            setCameraOperatingMode(0);
            LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
            x.c(lifecycleCameraRepository);
            lifecycleCameraRepository.unbindAll(this.lifecycleCameraKeys);
        } finally {
            Trace.endSection();
        }
    }

    public static /* synthetic */ void getCameraXConfigProvider$camera_lifecycle$annotations() {
    }

    public static /* synthetic */ void getContext$camera_lifecycle$annotations() {
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public boolean isBound(UseCase useCase) {
        x.f(useCase, "useCase");
        LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
        x.c(lifecycleCameraRepository);
        for (LifecycleCamera lifecycleCamera : lifecycleCameraRepository.getLifecycleCameras()) {
            x.e(lifecycleCamera, "next(...)");
            if (lifecycleCamera.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public void unbind(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:unbind-sessionConfig");
        try {
            Threads.checkMainThread();
            if (getCameraOperatingMode() != 2) {
                LifecycleCameraRepository lifecycleCameraRepository = this.lifecycleCameraRepository;
                x.c(lifecycleCameraRepository);
                lifecycleCameraRepository.unbind(sessionConfig, this.lifecycleCameraKeys);
                return;
            }
            throw new UnsupportedOperationException("Unbind SessionConfig is not supported in concurrent camera mode call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public CameraInfo getCameraInfo(CameraSelector cameraSelector, SessionConfig sessionConfig) {
        x.f(cameraSelector, "cameraSelector");
        x.f(sessionConfig, "sessionConfig");
        CameraFilter cameraFilter = sessionConfig.getCameraFilter();
        if (cameraFilter != null) {
            CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
            builderFromSelector.addCameraFilter(cameraFilter);
            CameraSelector cameraSelectorBuild = builderFromSelector.build();
            x.e(cameraSelectorBuild, "build(...)");
            return getCameraInfo(cameraSelectorBuild);
        }
        return getCameraInfo(cameraSelector);
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(useCaseGroup, "useCaseGroup");
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                return bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(useCaseGroup), 28, null);
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(useCaseArr, "useCases");
        Trace.beginSection("CX:bindToLifecycle");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                return bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, new LegacySessionConfig(c.R(useCaseArr), null, null, 6, null), 28, null);
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, SessionConfig sessionConfig) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(sessionConfig, "sessionConfig");
        Trace.beginSection("CX:bindToLifecycle-SessionConfig");
        try {
            if (getCameraOperatingMode() != 2) {
                setCameraOperatingMode(1);
                return bindToLifecycleInternal$default(this, lifecycleOwner, cameraSelector, null, null, null, sessionConfig, 28, null);
            }
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
        } finally {
            Trace.endSection();
        }
    }
}
