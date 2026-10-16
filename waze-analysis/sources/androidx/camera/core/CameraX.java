package androidx.camera.core;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.arch.core.util.Function;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraProviderExecutionState;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.camera.core.internal.StreamSpecsCalculatorImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.HandlerCompat;
import androidx.core.util.Preconditions;
import androidx.tracing.Trace;
import com.google.d.m.a.bm;
import h.f;
import h.g;
import h.g.a.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraX {
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    private final CameraPresenceProvider mCameraPresenceProvider;
    final CameraRepository mCameraRepository;
    private CameraUseCaseAdapterProvider mCameraUseCaseAdapterProvider;
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final bm<Void> mInitInternalFuture;
    private InternalInitState mInitState;
    private final Object mInitializeLock;
    private final Integer mMinLogLevel;
    private final RetryPolicy mRetryPolicy;
    private final f<RotationProvider> mRotationProvider;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private bm<Void> mShutdownInternalFuture;
    private StreamSpecsCalculator mStreamSpecsCalculator;
    private CameraDeviceSurfaceManager mSurfaceManager;
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();

    /* compiled from: WazeSource */
    enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    CameraX(Context context, CameraXConfig.Provider provider, Function<Context, QuirkSettings> function) throws PackageManager.NameNotFoundException {
        CameraXConfig cameraXConfig;
        this.mCameraRepository = new CameraRepository();
        this.mInitializeLock = new Object();
        this.mInitState = InternalInitState.UNINITIALIZED;
        this.mShutdownInternalFuture = Futures.immediateFuture(null);
        final Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
        if (provider != null) {
            cameraXConfig = provider.getCameraXConfig();
            this.mCameraXConfig = cameraXConfig;
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            cameraXConfig = configProvider.getCameraXConfig();
            this.mCameraXConfig = cameraXConfig;
        }
        updateQuirkSettings(persistentApplicationContext, cameraXConfig.getQuirkSettings(), function);
        Executor cameraExecutor = cameraXConfig.getCameraExecutor(null);
        Handler schedulerHandler = cameraXConfig.getSchedulerHandler(null);
        cameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        this.mCameraExecutor = cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            schedulerHandler = HandlerCompat.createAsync(handlerThread.getLooper());
            this.mSchedulerHandler = schedulerHandler;
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        Integer num = (Integer) cameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mRetryPolicy = new RetryPolicy.Builder(cameraXConfig.getCameraProviderInitRetryPolicy()).build();
        this.mCameraPresenceProvider = new CameraPresenceProvider(cameraExecutor, CameraXExecutors.newHandlerExecutor(schedulerHandler));
        this.mRotationProvider = g.a(new a() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return CameraX.lambda$new$0(persistentApplicationContext);
            }
        });
        this.mInitInternalFuture = initInternal(persistentApplicationContext);
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
            if (iIntValue == 0) {
                sparseArray.remove(num.intValue());
            } else {
                sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
            }
            updateOrResetMinLogLevel();
        }
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) throws PackageManager.NameNotFoundException {
        ComponentCallbacks2 application = ContextUtil.getApplication(context);
        if (application instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) application;
        }
        try {
            Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
            ServiceInfo serviceInfo = persistentApplicationContext.getPackageManager().getServiceInfo(new ComponentName(persistentApplicationContext, (Class<?>) MetadataHolderService.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            Logger.e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            Logger.e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e2);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num == null) {
                return;
            }
            Preconditions.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            updateOrResetMinLogLevel();
        }
    }

    private void initAndRetryRecursively(final Executor executor, final long j2, final int i2, final Context context, final CallbackToFutureAdapter.Completer<Void> completer) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1310lambda$initAndRetryRecursively$3$androidxcameracoreCameraX(context, executor, i2, completer, j2);
            }
        });
    }

    private bm<Void> initInternal(final Context context) {
        bm<Void> future;
        synchronized (this.mInitializeLock) {
            Preconditions.checkState(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda3
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.f$0.m1311lambda$initInternal$1$androidxcameracoreCameraX(context, completer);
                }
            });
        }
        return future;
    }

    static /* synthetic */ RotationProvider lambda$new$0(Context context) {
        return new RotationProvider(context);
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private bm<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int iOrdinal = this.mInitState.ordinal();
            if (iOrdinal == 0) {
                this.mInitState = InternalInitState.SHUTDOWN;
                return Futures.immediateFuture(null);
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.mInitState = InternalInitState.SHUTDOWN;
                decreaseMinLogLevelReference(this.mMinLogLevel);
                this.mShutdownInternalFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda5
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return this.f$0.m1313lambda$shutdownInternal$5$androidxcameracoreCameraX(completer);
                    }
                });
            }
            return this.mShutdownInternalFuture;
        }
    }

    private void traceExecutionState(RetryPolicy.ExecutionState executionState) {
        if (Trace.isEnabled()) {
            Trace.setCounter("CX:CameraProvider-RetryStatus", executionState != null ? executionState.getStatus() : -1);
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
            return;
        }
        if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    private static void updateQuirkSettings(Context context, QuirkSettings quirkSettings, Function<Context, QuirkSettings> function) {
        if (quirkSettings != null) {
            Objects.toString(quirkSettings);
            Logger.d(TAG, "QuirkSettings from CameraXConfig: ".concat(quirkSettings.toString()));
        } else {
            quirkSettings = function.apply(context);
            Objects.toString(quirkSettings);
            Logger.d(TAG, "QuirkSettings from app metadata: ".concat(String.valueOf(quirkSettings)));
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            Objects.toString(quirkSettings);
            Logger.d(TAG, "QuirkSettings by default: ".concat(String.valueOf(quirkSettings)));
        }
        QuirkSettingsHolder.instance().set(quirkSettings);
    }

    public CameraPresenceProvider getCameraAvailabilityProvider() {
        return this.mCameraPresenceProvider;
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public CameraUseCaseAdapterProvider getCameraUseCaseAdapterProvider() {
        CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider = this.mCameraUseCaseAdapterProvider;
        if (cameraUseCaseAdapterProvider != null) {
            return cameraUseCaseAdapterProvider;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public bm<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public RotationProvider getRotationProvider() {
        return this.mRotationProvider.getValue();
    }

    public StreamSpecsCalculator getStreamSpecsCalculator() {
        StreamSpecsCalculator streamSpecsCalculator = this.mStreamSpecsCalculator;
        if (streamSpecsCalculator != null) {
            return streamSpecsCalculator;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    boolean isInitialized() {
        boolean z;
        synchronized (this.mInitializeLock) {
            z = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z;
    }

    /* renamed from: lambda$initAndRetryRecursively$2$androidx-camera-core-CameraX, reason: not valid java name */
    /* synthetic */ void m1309lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(Executor executor, long j2, int i2, Context context, CallbackToFutureAdapter.Completer completer) {
        initAndRetryRecursively(executor, j2, i2 + 1, context, completer);
    }

    /* renamed from: lambda$initAndRetryRecursively$3$androidx-camera-core-CameraX, reason: not valid java name */
    /* synthetic */ void m1310lambda$initAndRetryRecursively$3$androidxcameracoreCameraX(final Context context, final Executor executor, final int i2, final CallbackToFutureAdapter.Completer completer, final long j2) {
        CameraFactory.Provider cameraFactoryProvider;
        Trace.beginSection("CX:initAndRetryRecursively");
        try {
            try {
                cameraFactoryProvider = this.mCameraXConfig.getCameraFactoryProvider(null);
            } finally {
                Trace.endSection();
            }
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e2) {
            CameraProviderExecutionState cameraProviderExecutionState = new CameraProviderExecutionState(j2, i2, e2);
            RetryPolicy.RetryConfig retryConfigOnRetryDecisionRequested = this.mRetryPolicy.onRetryDecisionRequested(cameraProviderExecutionState);
            traceExecutionState(cameraProviderExecutionState);
            if (!retryConfigOnRetryDecisionRequested.shouldRetry() || i2 >= Integer.MAX_VALUE) {
                synchronized (this.mInitializeLock) {
                    this.mInitState = InternalInitState.INITIALIZING_ERROR;
                }
                if (retryConfigOnRetryDecisionRequested.shouldCompleteWithoutFailure()) {
                    setStateToInitialized();
                    completer.set(null);
                } else if (e2 instanceof CameraValidator.CameraIdListIncorrectException) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator.CameraIdListIncorrectException) e2).getAvailableCameraCount();
                    Logger.e(TAG, str, e2);
                    completer.setException(new InitializationException(new CameraUnavailableException(3, str)));
                } else if (e2 instanceof InitializationException) {
                    completer.setException(e2);
                } else {
                    completer.setException(new InitializationException(e2));
                }
            } else {
                Logger.w(TAG, "Retry init. Start time " + j2 + " current time " + SystemClock.elapsedRealtime(), e2);
                HandlerCompat.postDelayed(this.mSchedulerHandler, new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1309lambda$initAndRetryRecursively$2$androidxcameracoreCameraX(executor, j2, i2, context, completer);
                    }
                }, RETRY_TOKEN, retryConfigOnRetryDecisionRequested.getRetryDelayInMillis());
            }
            this.mCameraPresenceProvider.shutdown();
        }
        if (cameraFactoryProvider == null) {
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        }
        CameraThreadConfig cameraThreadConfigCreate = CameraThreadConfig.create(this.mCameraExecutor, this.mSchedulerHandler);
        CameraSelector availableCamerasLimiter = this.mCameraXConfig.getAvailableCamerasLimiter(null);
        CameraValidator cameraValidatorCreate = CameraValidator.CC.create(context, availableCamerasLimiter);
        long cameraOpenRetryMaxTimeoutInMillisWhileResuming = this.mCameraXConfig.getCameraOpenRetryMaxTimeoutInMillisWhileResuming();
        UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = this.mCameraXConfig.getUseCaseConfigFactoryProvider(null);
        if (useCaseConfigFactoryProvider == null) {
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
        }
        this.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(context, this.mCameraXConfig.isPreviewResolutionBypassEnabled());
        StreamSpecsCalculatorImpl streamSpecsCalculatorImpl = new StreamSpecsCalculatorImpl(this.mDefaultConfigFactory, null);
        this.mStreamSpecsCalculator = streamSpecsCalculatorImpl;
        this.mCameraFactory = cameraFactoryProvider.newInstance(context, cameraThreadConfigCreate, availableCamerasLimiter, cameraOpenRetryMaxTimeoutInMillisWhileResuming, this.mCameraXConfig, streamSpecsCalculatorImpl);
        CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = this.mCameraXConfig.getDeviceSurfaceManagerProvider(null);
        if (deviceSurfaceManagerProvider == null) {
            throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
        }
        CameraDeviceSurfaceManager cameraDeviceSurfaceManagerNewInstance = deviceSurfaceManagerProvider.newInstance(context, this.mCameraFactory.getCameraManager(), this.mCameraFactory.getAvailableCameraIds(), this.mCameraXConfig.getExtraSupportedSurfaceCombinations());
        this.mSurfaceManager = cameraDeviceSurfaceManagerNewInstance;
        this.mStreamSpecsCalculator.setCameraDeviceSurfaceManager(cameraDeviceSurfaceManagerNewInstance);
        if (executor instanceof CameraExecutor) {
            ((CameraExecutor) executor).init(this.mCameraFactory);
        }
        this.mCameraRepository.init(this.mCameraFactory);
        CameraCoordinator cameraCoordinator = this.mCameraFactory.getCameraCoordinator();
        cameraCoordinator.init(this.mCameraRepository);
        this.mCameraUseCaseAdapterProvider = new CameraUseCaseAdapterProviderImpl(this.mCameraRepository, cameraCoordinator, this.mDefaultConfigFactory, this.mStreamSpecsCalculator);
        Iterator<CameraInternal> it = this.mCameraRepository.getCameras().iterator();
        while (it.hasNext()) {
            it.next().getCameraInfoInternal().setCameraUseCaseAdapterProvider(this.mCameraUseCaseAdapterProvider);
        }
        this.mCameraPresenceProvider.startup(cameraValidatorCreate, this.mCameraFactory, this.mCameraRepository);
        this.mCameraPresenceProvider.addDependentInternalListener(this.mSurfaceManager);
        this.mCameraPresenceProvider.addDependentInternalListener(this.mCameraFactory.getCameraCoordinator());
        cameraValidatorCreate.validateOnFirstInit(this.mCameraRepository);
        if (i2 > 1) {
            traceExecutionState(null);
        }
        setStateToInitialized();
        completer.set(null);
    }

    /* renamed from: lambda$initInternal$1$androidx-camera-core-CameraX, reason: not valid java name */
    /* synthetic */ Object m1311lambda$initInternal$1$androidxcameracoreCameraX(Context context, CallbackToFutureAdapter.Completer completer) {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), 1, context, completer);
        return "CameraX initInternal";
    }

    /* renamed from: lambda$shutdownInternal$4$androidx-camera-core-CameraX, reason: not valid java name */
    /* synthetic */ void m1312lambda$shutdownInternal$4$androidxcameracoreCameraX(CallbackToFutureAdapter.Completer completer) {
        this.mCameraFactory.shutdown();
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        completer.set(null);
    }

    /* renamed from: lambda$shutdownInternal$5$androidx-camera-core-CameraX, reason: not valid java name */
    /* synthetic */ Object m1313lambda$shutdownInternal$5$androidxcameracoreCameraX(final CallbackToFutureAdapter.Completer completer) {
        this.mCameraPresenceProvider.shutdown();
        if (this.mRotationProvider.isInitialized()) {
            this.mRotationProvider.getValue().shutdown();
        }
        this.mCameraRepository.deinit().addListener(new Runnable() { // from class: androidx.camera.core.CameraX$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1312lambda$shutdownInternal$4$androidxcameracoreCameraX(completer);
            }
        }, this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    public bm<Void> shutdown() {
        return shutdownInternal();
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        this(context, provider, new QuirkSettingsLoader());
    }
}
