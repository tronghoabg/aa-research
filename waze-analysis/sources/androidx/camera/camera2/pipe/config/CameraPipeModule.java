package androidx.camera.camera2.pipe.config;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackendFactory;
import androidx.camera.camera2.pipe.CameraBackendId;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.MemoryEstimator;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.config.CameraPipeModule;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.featurecombinationquery.CameraDeviceSetupCompatFactory;
import g.a.a;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.Map;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class CameraPipeModule {
    public static final Companion Companion = new Companion(null);

    public abstract CameraDevices bindCameras(CameraDevicesImpl cameraDevicesImpl);

    public abstract TimeSource bindTimeSource(SystemTimeSource systemTimeSource);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final CameraBackend provideCameraBackends$lambda$2(CameraBackend cameraBackend, CameraContext cameraContext) {
            x.f(cameraContext, "it");
            x.c(cameraBackend);
            return cameraBackend;
        }

        public final CameraBackends provideCameraBackends(CameraPipe.Config config, @DefaultCameraBackend a<CameraBackend> aVar, @CameraPipeContext Context context, Threads threads, CameraPipeLifetime cameraPipeLifetime) {
            x.f(config, "config");
            x.f(aVar, "defaultCameraBackend");
            x.f(context, "cameraPipeContext");
            x.f(threads, "threads");
            x.f(cameraPipeLifetime, "cameraPipeLifetime");
            final CameraBackend internalBackend = config.getCameraBackendConfig().getInternalBackend();
            if (internalBackend == null) {
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    internalBackend = aVar.get();
                } finally {
                    Trace.endSection();
                }
            }
            if (config.getCameraBackendConfig().getCameraBackends().containsKey(CameraBackendId.m382boximpl(internalBackend.mo362getIdQwmhuAM()))) {
                throw new IllegalStateException("CameraBackendConfig#cameraBackends should not contain a backend with " + CameraBackendId.m387toStringimpl(internalBackend.mo362getIdQwmhuAM()) + ". Use CameraBackendConfig#internalBackend field instead.");
            }
            Map mapP = r.p(config.getCameraBackendConfig().getCameraBackends(), new k(CameraBackendId.m382boximpl(internalBackend.mo362getIdQwmhuAM()), new CameraBackendFactory() { // from class: androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$$ExternalSyntheticLambda0
                @Override // androidx.camera.camera2.pipe.CameraBackendFactory
                public final CameraBackend create(CameraContext cameraContext) {
                    CameraBackend cameraBackend = internalBackend;
                    CameraPipeModule.Companion.provideCameraBackends$lambda$2(cameraBackend, cameraContext);
                    return cameraBackend;
                }
            }));
            String strM573getDefaultBackendAKmI2lo = config.getCameraBackendConfig().m573getDefaultBackendAKmI2lo();
            if (strM573getDefaultBackendAKmI2lo == null) {
                strM573getDefaultBackendAKmI2lo = internalBackend.mo362getIdQwmhuAM();
            }
            String str = strM573getDefaultBackendAKmI2lo;
            if (mapP.containsKey(CameraBackendId.m382boximpl(str))) {
                return new CameraBackendsImpl(str, mapP, context, threads, cameraPipeLifetime, null);
            }
            throw new IllegalStateException("Failed to find " + CameraBackendId.m387toStringimpl(str) + " in the list of available CameraPipe backends! Available values are " + mapP.keySet());
        }

        public final CameraContext provideCameraContext(@CameraPipeContext final Context context, final Threads threads, final CameraBackends cameraBackends) {
            x.f(context, "cameraPipeContext");
            x.f(threads, "threads");
            x.f(cameraBackends, "cameraBackends");
            return new CameraContext(context, threads, cameraBackends) { // from class: androidx.camera.camera2.pipe.config.CameraPipeModule$Companion$provideCameraContext$1
                private final Context appContext;
                private final CameraBackends cameraBackends;
                private final Threads threads;

                {
                    this.appContext = context;
                    this.threads = threads;
                    this.cameraBackends = cameraBackends;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public Context getAppContext() {
                    return this.appContext;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public CameraBackends getCameraBackends() {
                    return this.cameraBackends;
                }

                @Override // androidx.camera.camera2.pipe.CameraContext
                public Threads getThreads() {
                    return this.threads;
                }
            };
        }

        public final CameraDeviceSetupCompatFactory provideCameraDeviceSetupCompatFactory(@CameraPipeContext Context context) {
            x.f(context, "cameraPipeContext");
            return new CameraDeviceSetupCompatFactory(context);
        }

        public final CameraManager provideCameraManager(@CameraPipeContext Context context) {
            x.f(context, "cameraPipeContext");
            Object systemService = context.getSystemService("camera");
            x.d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            return (CameraManager) systemService;
        }

        @CameraPipeJob
        public final br provideCameraPipeJob() {
            return o.i();
        }

        public final CameraSurfaceManager provideCameraSurfaceManager() {
            return new CameraSurfaceManager();
        }

        @CameraPipeContext
        public final Context provideContext(CameraPipe.Config config) {
            x.f(config, "config");
            return config.getAppContext();
        }

        public final DevicePolicyManagerWrapper provideDevicePolicyManagerWrapper(@CameraPipeContext Context context) {
            x.f(context, "cameraPipeContext");
            Object systemService = context.getSystemService("device_policy");
            x.d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
            return new AndroidDevicePolicyManagerWrapper((DevicePolicyManager) systemService);
        }

        public final MemoryEstimator provideMemoryEstimator(CameraPipe.Config config) {
            x.f(config, "config");
            return config.getMemoryEstimator();
        }

        public final PackageManager providePackageManager(@CameraPipeContext Context context) {
            x.f(context, "cameraPipeContext");
            PackageManager packageManager = context.getPackageManager();
            x.e(packageManager, "getPackageManager(...)");
            return packageManager;
        }

        public final StrictMode provideStrictMode(CameraPipe.Flags flags) {
            x.f(flags, "flags");
            return new StrictMode(flags.getStrictModeEnabled());
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
