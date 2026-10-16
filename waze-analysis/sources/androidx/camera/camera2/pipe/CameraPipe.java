package androidx.camera.camera2.pipe;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.config.CameraPipeComponent;
import androidx.camera.camera2.pipe.config.CameraPipeConfigModule;
import androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent;
import androidx.camera.camera2.pipe.config.ThreadConfigModule;
import androidx.camera.camera2.pipe.media.ImageSources;
import h.a.r;
import h.c.e;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraPipe {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CameraPipe create(Config config) {
            x.f(config, "config");
            try {
                Trace.beginSection("CameraPipe");
                DaggerCameraPipeComponent.Builder builder = DaggerCameraPipeComponent.builder();
                builder.cameraPipeConfigModule(new CameraPipeConfigModule(config));
                builder.threadConfigModule(new ThreadConfigModule(config.getThreadConfig()));
                CameraPipeComponent cameraPipeComponentBuild = builder.build();
                Trace.endSection();
                return new CameraPipeImpl(cameraPipeComponentBuild);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    CameraSurfaceManager cameraSurfaceManager();

    CameraDevices cameras();

    CameraGraph create(CameraGraph.Config config);

    CameraGraph createCameraGraph(CameraGraph.Config config);

    List<CameraGraph> createCameraGraphs(CameraGraph.ConcurrentConfig concurrentConfig);

    FrameGraph createFrameGraph(FrameGraph.Config config);

    List<FrameGraph> createFrameGraphs(FrameGraph.ConcurrentConfig concurrentConfig);

    /* renamed from: getGlobalAudioRestrictionMode-_b5Q8KE, reason: not valid java name */
    int mo570getGlobalAudioRestrictionMode_b5Q8KE();

    /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    Object mo571isConfigSupportedNpXggIU(CameraGraph.Config config, e<? super ConfigQueryResult> eVar);

    void prewarmIsConfigSupported(CameraGraph.Config config);

    /* renamed from: setGlobalAudioRestrictionMode-LwUUkyU, reason: not valid java name */
    void mo572setGlobalAudioRestrictionModeLwUUkyU(int i2);

    void shutdown();

    /* compiled from: WazeSource */
    public final class Flags {
        private final boolean cameraOpenAbortEnabled;
        private final boolean strictModeEnabled;

        public /* synthetic */ Flags(boolean z, boolean z2, int i2, o oVar) {
            this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0));
        }

        public static /* synthetic */ Flags copy$default(Flags flags, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = flags.strictModeEnabled;
            }
            if ((i2 & 2) != 0) {
                z2 = flags.cameraOpenAbortEnabled;
            }
            return flags.copy(z, z2);
        }

        public final boolean component1() {
            return this.strictModeEnabled;
        }

        public final boolean component2() {
            return this.cameraOpenAbortEnabled;
        }

        public final Flags copy(boolean z, boolean z2) {
            return new Flags(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Flags)) {
                return false;
            }
            Flags flags = (Flags) obj;
            return this.strictModeEnabled == flags.strictModeEnabled && this.cameraOpenAbortEnabled == flags.cameraOpenAbortEnabled;
        }

        public final boolean getCameraOpenAbortEnabled() {
            return this.cameraOpenAbortEnabled;
        }

        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        public int hashCode() {
            return (CameraPipe$Flags$$ExternalSyntheticBackport0.m(this.strictModeEnabled) * 31) + CameraPipe$Flags$$ExternalSyntheticBackport0.m(this.cameraOpenAbortEnabled);
        }

        public String toString() {
            return "Flags(strictModeEnabled=" + this.strictModeEnabled + ", cameraOpenAbortEnabled=" + this.cameraOpenAbortEnabled + ")";
        }

        public Flags(boolean z, boolean z2) {
            this.strictModeEnabled = z;
            this.cameraOpenAbortEnabled = z2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Flags() {
            boolean z = false;
            this(z, z, 3, null);
        }
    }

    /* compiled from: WazeSource */
    public final class CameraInteropConfig {
        private final CameraInterop.CaptureSessionListener cameraCaptureSessionListener;
        private final CameraDevice.StateCallback cameraDeviceStateCallback;
        private final h.o.a cameraOpenRetryMaxTimeout;
        private final CameraInterop.CameraSystemCallbacks cameraSystemCallbacks;

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, h.o.a aVar, CameraInterop.CameraSystemCallbacks cameraSystemCallbacks, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : stateCallback, (i2 & 2) != 0 ? null : captureSessionListener, (i2 & 4) != 0 ? null : aVar, (i2 & 8) != 0 ? null : cameraSystemCallbacks, null);
        }

        /* renamed from: copy-5_5nbZA$default, reason: not valid java name */
        public static /* synthetic */ CameraInteropConfig m574copy5_5nbZA$default(CameraInteropConfig cameraInteropConfig, CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, h.o.a aVar, CameraInterop.CameraSystemCallbacks cameraSystemCallbacks, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                stateCallback = cameraInteropConfig.cameraDeviceStateCallback;
            }
            if ((i2 & 2) != 0) {
                captureSessionListener = cameraInteropConfig.cameraCaptureSessionListener;
            }
            if ((i2 & 4) != 0) {
                aVar = cameraInteropConfig.cameraOpenRetryMaxTimeout;
            }
            if ((i2 & 8) != 0) {
                cameraSystemCallbacks = cameraInteropConfig.cameraSystemCallbacks;
            }
            return cameraInteropConfig.m576copy5_5nbZA(stateCallback, captureSessionListener, aVar, cameraSystemCallbacks);
        }

        public final CameraDevice.StateCallback component1() {
            return this.cameraDeviceStateCallback;
        }

        public final CameraInterop.CaptureSessionListener component2() {
            return this.cameraCaptureSessionListener;
        }

        /* renamed from: component3-FghU774, reason: not valid java name */
        public final h.o.a m575component3FghU774() {
            return this.cameraOpenRetryMaxTimeout;
        }

        public final CameraInterop.CameraSystemCallbacks component4() {
            return this.cameraSystemCallbacks;
        }

        /* renamed from: copy-5_5nbZA, reason: not valid java name */
        public final CameraInteropConfig m576copy5_5nbZA(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, h.o.a aVar, CameraInterop.CameraSystemCallbacks cameraSystemCallbacks) {
            return new CameraInteropConfig(stateCallback, captureSessionListener, aVar, cameraSystemCallbacks, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CameraInteropConfig)) {
                return false;
            }
            CameraInteropConfig cameraInteropConfig = (CameraInteropConfig) obj;
            return x.n(this.cameraDeviceStateCallback, cameraInteropConfig.cameraDeviceStateCallback) && x.n(this.cameraCaptureSessionListener, cameraInteropConfig.cameraCaptureSessionListener) && x.n(this.cameraOpenRetryMaxTimeout, cameraInteropConfig.cameraOpenRetryMaxTimeout) && x.n(this.cameraSystemCallbacks, cameraInteropConfig.cameraSystemCallbacks);
        }

        public final CameraInterop.CaptureSessionListener getCameraCaptureSessionListener() {
            return this.cameraCaptureSessionListener;
        }

        public final CameraDevice.StateCallback getCameraDeviceStateCallback() {
            return this.cameraDeviceStateCallback;
        }

        /* renamed from: getCameraOpenRetryMaxTimeout-FghU774, reason: not valid java name */
        public final h.o.a m577getCameraOpenRetryMaxTimeoutFghU774() {
            return this.cameraOpenRetryMaxTimeout;
        }

        public final CameraInterop.CameraSystemCallbacks getCameraSystemCallbacks() {
            return this.cameraSystemCallbacks;
        }

        public int hashCode() {
            CameraDevice.StateCallback stateCallback = this.cameraDeviceStateCallback;
            int iHashCode = stateCallback == null ? 0 : stateCallback.hashCode();
            CameraInterop.CaptureSessionListener captureSessionListener = this.cameraCaptureSessionListener;
            int iHashCode2 = captureSessionListener == null ? 0 : captureSessionListener.hashCode();
            int i2 = iHashCode * 31;
            h.o.a aVar = this.cameraOpenRetryMaxTimeout;
            int iB = (((i2 + iHashCode2) * 31) + (aVar == null ? 0 : a.a.b(aVar.w()))) * 31;
            CameraInterop.CameraSystemCallbacks cameraSystemCallbacks = this.cameraSystemCallbacks;
            return iB + (cameraSystemCallbacks != null ? cameraSystemCallbacks.hashCode() : 0);
        }

        public String toString() {
            return "CameraInteropConfig(cameraDeviceStateCallback=" + this.cameraDeviceStateCallback + ", cameraCaptureSessionListener=" + this.cameraCaptureSessionListener + ", cameraOpenRetryMaxTimeout=" + this.cameraOpenRetryMaxTimeout + ", cameraSystemCallbacks=" + this.cameraSystemCallbacks + ")";
        }

        public /* synthetic */ CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, h.o.a aVar, CameraInterop.CameraSystemCallbacks cameraSystemCallbacks, o oVar) {
            this(stateCallback, captureSessionListener, aVar, cameraSystemCallbacks);
        }

        private CameraInteropConfig(CameraDevice.StateCallback stateCallback, CameraInterop.CaptureSessionListener captureSessionListener, h.o.a aVar, CameraInterop.CameraSystemCallbacks cameraSystemCallbacks) {
            this.cameraDeviceStateCallback = stateCallback;
            this.cameraCaptureSessionListener = captureSessionListener;
            this.cameraOpenRetryMaxTimeout = aVar;
            this.cameraSystemCallbacks = cameraSystemCallbacks;
        }
    }

    /* compiled from: WazeSource */
    public final class ThreadConfig {
        private final Executor defaultBackgroundExecutor;
        private final Executor defaultBlockingExecutor;
        private final Executor defaultCameraExecutor;
        private final Handler defaultCameraHandler;
        private final h.g.a.a<Handler> defaultCameraHandlerFn;
        private final Executor defaultLightweightExecutor;
        private final af testOnlyScope;

        public /* synthetic */ ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, h.g.a.a aVar, af afVar, int i2, o oVar) {
            this(1 == (i2 & 1) ? null : executor, (i2 & 2) != 0 ? null : executor2, (i2 & 4) != 0 ? null : executor3, (i2 & 8) != 0 ? null : executor4, (i2 & 16) != 0 ? null : handler, (i2 & 32) != 0 ? null : aVar, (i2 & 64) != 0 ? null : afVar);
        }

        public static /* synthetic */ ThreadConfig copy$default(ThreadConfig threadConfig, Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, h.g.a.a aVar, af afVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                executor = threadConfig.defaultLightweightExecutor;
            }
            if ((i2 & 2) != 0) {
                executor2 = threadConfig.defaultBackgroundExecutor;
            }
            if ((i2 & 4) != 0) {
                executor3 = threadConfig.defaultBlockingExecutor;
            }
            if ((i2 & 8) != 0) {
                executor4 = threadConfig.defaultCameraExecutor;
            }
            if ((i2 & 16) != 0) {
                handler = threadConfig.defaultCameraHandler;
            }
            if ((i2 & 32) != 0) {
                aVar = threadConfig.defaultCameraHandlerFn;
            }
            if ((i2 & 64) != 0) {
                afVar = threadConfig.testOnlyScope;
            }
            h.g.a.a aVar2 = aVar;
            af afVar2 = afVar;
            Handler handler2 = handler;
            Executor executor5 = executor3;
            return threadConfig.copy(executor, executor2, executor5, executor4, handler2, aVar2, afVar2);
        }

        public final Executor component1() {
            return this.defaultLightweightExecutor;
        }

        public final Executor component2() {
            return this.defaultBackgroundExecutor;
        }

        public final Executor component3() {
            return this.defaultBlockingExecutor;
        }

        public final Executor component4() {
            return this.defaultCameraExecutor;
        }

        public final Handler component5() {
            return this.defaultCameraHandler;
        }

        public final h.g.a.a<Handler> component6() {
            return this.defaultCameraHandlerFn;
        }

        public final af component7() {
            return this.testOnlyScope;
        }

        public final ThreadConfig copy(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, h.g.a.a<? extends Handler> aVar, af afVar) {
            return new ThreadConfig(executor, executor2, executor3, executor4, handler, aVar, afVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ThreadConfig)) {
                return false;
            }
            ThreadConfig threadConfig = (ThreadConfig) obj;
            return x.n(this.defaultLightweightExecutor, threadConfig.defaultLightweightExecutor) && x.n(this.defaultBackgroundExecutor, threadConfig.defaultBackgroundExecutor) && x.n(this.defaultBlockingExecutor, threadConfig.defaultBlockingExecutor) && x.n(this.defaultCameraExecutor, threadConfig.defaultCameraExecutor) && x.n(this.defaultCameraHandler, threadConfig.defaultCameraHandler) && x.n(this.defaultCameraHandlerFn, threadConfig.defaultCameraHandlerFn) && x.n(this.testOnlyScope, threadConfig.testOnlyScope);
        }

        public final Executor getDefaultBackgroundExecutor() {
            return this.defaultBackgroundExecutor;
        }

        public final Executor getDefaultBlockingExecutor() {
            return this.defaultBlockingExecutor;
        }

        public final Executor getDefaultCameraExecutor() {
            return this.defaultCameraExecutor;
        }

        public final Handler getDefaultCameraHandler() {
            return this.defaultCameraHandler;
        }

        public final h.g.a.a<Handler> getDefaultCameraHandlerFn() {
            return this.defaultCameraHandlerFn;
        }

        public final Executor getDefaultLightweightExecutor() {
            return this.defaultLightweightExecutor;
        }

        public final af getTestOnlyScope() {
            return this.testOnlyScope;
        }

        public int hashCode() {
            Executor executor = this.defaultLightweightExecutor;
            int iHashCode = executor == null ? 0 : executor.hashCode();
            Executor executor2 = this.defaultBackgroundExecutor;
            int iHashCode2 = executor2 == null ? 0 : executor2.hashCode();
            int i2 = iHashCode * 31;
            Executor executor3 = this.defaultBlockingExecutor;
            int iHashCode3 = (((i2 + iHashCode2) * 31) + (executor3 == null ? 0 : executor3.hashCode())) * 31;
            Executor executor4 = this.defaultCameraExecutor;
            int iHashCode4 = (iHashCode3 + (executor4 == null ? 0 : executor4.hashCode())) * 31;
            Handler handler = this.defaultCameraHandler;
            int iHashCode5 = (iHashCode4 + (handler == null ? 0 : handler.hashCode())) * 31;
            h.g.a.a<Handler> aVar = this.defaultCameraHandlerFn;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            af afVar = this.testOnlyScope;
            return iHashCode6 + (afVar != null ? afVar.hashCode() : 0);
        }

        public String toString() {
            return "ThreadConfig(defaultLightweightExecutor=" + this.defaultLightweightExecutor + ", defaultBackgroundExecutor=" + this.defaultBackgroundExecutor + ", defaultBlockingExecutor=" + this.defaultBlockingExecutor + ", defaultCameraExecutor=" + this.defaultCameraExecutor + ", defaultCameraHandler=" + this.defaultCameraHandler + ", defaultCameraHandlerFn=" + this.defaultCameraHandlerFn + ", testOnlyScope=" + this.testOnlyScope + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadConfig(Executor executor, Executor executor2, Executor executor3, Executor executor4, Handler handler, h.g.a.a<? extends Handler> aVar, af afVar) {
            this.defaultLightweightExecutor = executor;
            this.defaultBackgroundExecutor = executor2;
            this.defaultBlockingExecutor = executor3;
            this.defaultCameraExecutor = executor4;
            this.defaultCameraHandler = handler;
            this.defaultCameraHandlerFn = aVar;
            this.testOnlyScope = afVar;
        }

        public ThreadConfig() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    /* compiled from: WazeSource */
    public final class CameraBackendConfig {
        private final Map<CameraBackendId, CameraBackendFactory> cameraBackends;
        private final String defaultBackend;
        private final CameraBackend internalBackend;

        /* JADX WARN: Multi-variable type inference failed */
        private CameraBackendConfig(CameraBackend cameraBackend, String str, Map<CameraBackendId, ? extends CameraBackendFactory> map) {
            x.f(map, "cameraBackends");
            this.internalBackend = cameraBackend;
            this.defaultBackend = str;
            this.cameraBackends = map;
            if (str == null || map.containsKey(CameraBackendId.m382boximpl(str))) {
                return;
            }
            throw new IllegalStateException((str == null ? "null" : CameraBackendId.m387toStringimpl(str)) + " does not exist in cameraBackends! Available backends are: " + map.keySet());
        }

        public final Map<CameraBackendId, CameraBackendFactory> getCameraBackends() {
            return this.cameraBackends;
        }

        /* renamed from: getDefaultBackend-AKmI2lo, reason: not valid java name */
        public final String m573getDefaultBackendAKmI2lo() {
            return this.defaultBackend;
        }

        public final CameraBackend getInternalBackend() {
            return this.internalBackend;
        }

        public /* synthetic */ CameraBackendConfig(CameraBackend cameraBackend, String str, Map map, o oVar) {
            this(cameraBackend, str, map);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ CameraBackendConfig(CameraBackend cameraBackend, String str, Map map, int i2, o oVar) {
            map = (i2 & 4) != 0 ? r.j() : map;
            int i3 = i2 & 2;
            int i4 = i2 & 1;
            o oVar2 = null;
            this(1 == i4 ? null : cameraBackend, i3 != 0 ? null : str, map, oVar2);
        }
    }

    /* compiled from: WazeSource */
    public final class Config {
        private final Context appContext;
        private final CameraBackendConfig cameraBackendConfig;
        private final CameraInteropConfig cameraInteropConfig;
        private final Flags flags;
        private final ImageSources imageSources;
        private final MemoryEstimator memoryEstimator;
        private final PlatformApiCompat platformApiCompat;
        private final ThreadConfig threadConfig;

        public /* synthetic */ Config(Context context, ThreadConfig threadConfig, CameraBackendConfig cameraBackendConfig, CameraInteropConfig cameraInteropConfig, ImageSources imageSources, Flags flags, PlatformApiCompat platformApiCompat, MemoryEstimator memoryEstimator, int i2, o oVar) {
            Flags flags2;
            threadConfig = (i2 & 2) != 0 ? new ThreadConfig(null, null, null, null, null, null, null, 127, null) : threadConfig;
            cameraBackendConfig = (i2 & 4) != 0 ? new CameraBackendConfig(null, null, null, 7, null) : cameraBackendConfig;
            CameraInteropConfig cameraInteropConfig2 = (i2 & 8) != 0 ? new CameraInteropConfig(null, null, null, null, 15, null) : cameraInteropConfig;
            o oVar2 = null;
            ImageSources imageSources2 = (i2 & 16) != 0 ? null : imageSources;
            if ((i2 & 32) != 0) {
                boolean z = false;
                flags2 = new Flags(z, z, 3, oVar2);
            } else {
                flags2 = flags;
            }
            this(context, threadConfig, cameraBackendConfig, cameraInteropConfig2, imageSources2, flags2, (i2 & 64) != 0 ? null : platformApiCompat, (i2 & 128) != 0 ? MemoryEstimator.Companion.create$default(MemoryEstimator.Companion, 0L, 1, null) : memoryEstimator);
        }

        public static /* synthetic */ Config copy$default(Config config, Context context, ThreadConfig threadConfig, CameraBackendConfig cameraBackendConfig, CameraInteropConfig cameraInteropConfig, ImageSources imageSources, Flags flags, PlatformApiCompat platformApiCompat, MemoryEstimator memoryEstimator, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                context = config.appContext;
            }
            if ((i2 & 2) != 0) {
                threadConfig = config.threadConfig;
            }
            if ((i2 & 4) != 0) {
                cameraBackendConfig = config.cameraBackendConfig;
            }
            if ((i2 & 8) != 0) {
                cameraInteropConfig = config.cameraInteropConfig;
            }
            if ((i2 & 16) != 0) {
                imageSources = config.imageSources;
            }
            if ((i2 & 32) != 0) {
                flags = config.flags;
            }
            if ((i2 & 64) != 0) {
                platformApiCompat = config.platformApiCompat;
            }
            if ((i2 & 128) != 0) {
                memoryEstimator = config.memoryEstimator;
            }
            PlatformApiCompat platformApiCompat2 = platformApiCompat;
            MemoryEstimator memoryEstimator2 = memoryEstimator;
            ImageSources imageSources2 = imageSources;
            Flags flags2 = flags;
            return config.copy(context, threadConfig, cameraBackendConfig, cameraInteropConfig, imageSources2, flags2, platformApiCompat2, memoryEstimator2);
        }

        public final Context component1() {
            return this.appContext;
        }

        public final ThreadConfig component2() {
            return this.threadConfig;
        }

        public final CameraBackendConfig component3() {
            return this.cameraBackendConfig;
        }

        public final CameraInteropConfig component4() {
            return this.cameraInteropConfig;
        }

        public final ImageSources component5() {
            return this.imageSources;
        }

        public final Flags component6() {
            return this.flags;
        }

        public final PlatformApiCompat component7() {
            return this.platformApiCompat;
        }

        public final MemoryEstimator component8() {
            return this.memoryEstimator;
        }

        public final Config copy(Context context, ThreadConfig threadConfig, CameraBackendConfig cameraBackendConfig, CameraInteropConfig cameraInteropConfig, ImageSources imageSources, Flags flags, PlatformApiCompat platformApiCompat, MemoryEstimator memoryEstimator) {
            x.f(context, "appContext");
            x.f(threadConfig, "threadConfig");
            x.f(cameraBackendConfig, "cameraBackendConfig");
            x.f(cameraInteropConfig, "cameraInteropConfig");
            x.f(flags, "flags");
            x.f(memoryEstimator, "memoryEstimator");
            return new Config(context, threadConfig, cameraBackendConfig, cameraInteropConfig, imageSources, flags, platformApiCompat, memoryEstimator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return x.n(this.appContext, config.appContext) && x.n(this.threadConfig, config.threadConfig) && x.n(this.cameraBackendConfig, config.cameraBackendConfig) && x.n(this.cameraInteropConfig, config.cameraInteropConfig) && x.n(this.imageSources, config.imageSources) && x.n(this.flags, config.flags) && x.n(this.platformApiCompat, config.platformApiCompat) && x.n(this.memoryEstimator, config.memoryEstimator);
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final CameraBackendConfig getCameraBackendConfig() {
            return this.cameraBackendConfig;
        }

        public final CameraInteropConfig getCameraInteropConfig() {
            return this.cameraInteropConfig;
        }

        public final Flags getFlags() {
            return this.flags;
        }

        public final ImageSources getImageSources() {
            return this.imageSources;
        }

        public final MemoryEstimator getMemoryEstimator() {
            return this.memoryEstimator;
        }

        public final PlatformApiCompat getPlatformApiCompat() {
            return this.platformApiCompat;
        }

        public final ThreadConfig getThreadConfig() {
            return this.threadConfig;
        }

        public int hashCode() {
            int iHashCode = (((((this.appContext.hashCode() * 31) + this.threadConfig.hashCode()) * 31) + this.cameraBackendConfig.hashCode()) * 31) + this.cameraInteropConfig.hashCode();
            ImageSources imageSources = this.imageSources;
            int iHashCode2 = ((((iHashCode * 31) + (imageSources == null ? 0 : imageSources.hashCode())) * 31) + this.flags.hashCode()) * 31;
            PlatformApiCompat platformApiCompat = this.platformApiCompat;
            return ((iHashCode2 + (platformApiCompat != null ? platformApiCompat.hashCode() : 0)) * 31) + this.memoryEstimator.hashCode();
        }

        public String toString() {
            return "Config(appContext=" + this.appContext + ", threadConfig=" + this.threadConfig + ", cameraBackendConfig=" + this.cameraBackendConfig + ", cameraInteropConfig=" + this.cameraInteropConfig + ", imageSources=" + this.imageSources + ", flags=" + this.flags + ", platformApiCompat=" + this.platformApiCompat + ", memoryEstimator=" + this.memoryEstimator + ")";
        }

        public Config(Context context, ThreadConfig threadConfig, CameraBackendConfig cameraBackendConfig, CameraInteropConfig cameraInteropConfig, ImageSources imageSources, Flags flags, PlatformApiCompat platformApiCompat, MemoryEstimator memoryEstimator) {
            x.f(context, "appContext");
            x.f(threadConfig, "threadConfig");
            x.f(cameraBackendConfig, "cameraBackendConfig");
            x.f(cameraInteropConfig, "cameraInteropConfig");
            x.f(flags, "flags");
            x.f(memoryEstimator, "memoryEstimator");
            this.appContext = context;
            this.threadConfig = threadConfig;
            this.cameraBackendConfig = cameraBackendConfig;
            this.cameraInteropConfig = cameraInteropConfig;
            this.imageSources = imageSources;
            this.flags = flags;
            this.platformApiCompat = platformApiCompat;
            this.memoryEstimator = memoryEstimator;
        }
    }
}
