package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraPresenceListener;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import androidx.tracing.Trace;
import com.google.d.m.a.bm;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.o.a;
import h.o.c;
import h.o.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ProcessCameraProvider implements CameraProvider {
    public static final Companion Companion = new Companion(null);
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider(new LifecycleCameraProviderImpl());
    private final LifecycleCameraProviderImpl lifecycleCameraProvider;

    private ProcessCameraProvider(LifecycleCameraProviderImpl lifecycleCameraProviderImpl) {
        this.lifecycleCameraProvider = lifecycleCameraProviderImpl;
    }

    /* renamed from: clearConfiguration-LRDsOJo, reason: not valid java name */
    public static final void m1424clearConfigurationLRDsOJo(long j2) {
        Companion.m1426clearConfigurationLRDsOJo(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configure(CameraXConfig cameraXConfig) {
        this.lifecycleCameraProvider.configure$camera_lifecycle(cameraXConfig);
    }

    public static final void configureInstance(CameraXConfig cameraXConfig) {
        Companion.configureInstance(cameraXConfig);
    }

    public static final bm<ProcessCameraProvider> getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bm<Void> initAsync(Context context) {
        return this.lifecycleCameraProvider.initAsync$camera_lifecycle(context, null);
    }

    public static final bm<Void> shutdown() {
        return Companion.shutdown();
    }

    @Override // androidx.camera.core.CameraProvider
    public void addCameraPresenceListener(Executor executor, CameraPresenceListener cameraPresenceListener) {
        x.f(executor, "executor");
        x.f(cameraPresenceListener, "listener");
        this.lifecycleCameraProvider.addCameraPresenceListener(executor, cameraPresenceListener);
    }

    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(useCaseArr, "useCases");
        return this.lifecycleCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
    }

    @Override // androidx.camera.core.CameraProvider
    public List<CameraInfo> getAvailableCameraInfos() {
        return this.lifecycleCameraProvider.getAvailableCameraInfos();
    }

    @Override // androidx.camera.core.CameraProvider
    public List<List<CameraInfo>> getAvailableConcurrentCameraInfos() {
        return this.lifecycleCameraProvider.getAvailableConcurrentCameraInfos();
    }

    @Override // androidx.camera.core.CameraProvider
    public CameraInfo getCameraInfo(CameraSelector cameraSelector, SessionConfig sessionConfig) {
        x.f(cameraSelector, "cameraSelector");
        x.f(sessionConfig, "sessionConfig");
        return this.lifecycleCameraProvider.getCameraInfo(cameraSelector, sessionConfig);
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean hasCamera(CameraSelector cameraSelector) {
        x.f(cameraSelector, "cameraSelector");
        return this.lifecycleCameraProvider.hasCamera(cameraSelector);
    }

    public final boolean isBound(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        return this.lifecycleCameraProvider.isBound(sessionConfig);
    }

    @Override // androidx.camera.core.CameraProvider
    public boolean isConcurrentCameraModeOn() {
        return this.lifecycleCameraProvider.isConcurrentCameraModeOn();
    }

    @Override // androidx.camera.core.CameraProvider
    public void removeCameraPresenceListener(CameraPresenceListener cameraPresenceListener) {
        x.f(cameraPresenceListener, "listener");
        this.lifecycleCameraProvider.removeCameraPresenceListener(cameraPresenceListener);
    }

    public final bm<Void> shutdownAsync() {
        return this.lifecycleCameraProvider.shutdownAsync$camera_lifecycle(1 == ((false ? 1 : 0) | (1 & 1)));
    }

    public final void unbind(UseCase... useCaseArr) {
        x.f(useCaseArr, "useCases");
        this.lifecycleCameraProvider.unbind((UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
    }

    public final void unbindAll() {
        this.lifecycleCameraProvider.unbindAll();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: clearConfiguration-LRDsOJo$default, reason: not valid java name */
        public static /* synthetic */ void m1425clearConfigurationLRDsOJo$default(Companion companion, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                c cVar = a.f48264a;
                j2 = c.i(10, d.f48273d);
            }
            companion.m1426clearConfigurationLRDsOJo(j2);
        }

        static final ProcessCameraProvider getInstance$lambda$1(l lVar, Object obj) {
            return (ProcessCameraProvider) lVar.invoke(obj);
        }

        /* renamed from: clearConfiguration-LRDsOJo, reason: not valid java name */
        public final void m1426clearConfigurationLRDsOJo(long j2) {
            ProcessCameraProvider.sAppInstance.shutdownAsync().get(a.o(j2), TimeUnit.NANOSECONDS);
        }

        public final void configureInstance(CameraXConfig cameraXConfig) {
            x.f(cameraXConfig, "cameraXConfig");
            Trace.beginSection("CX:configureInstance");
            try {
                ProcessCameraProvider.sAppInstance.configure(cameraXConfig);
            } finally {
                Trace.endSection();
            }
        }

        public final bm<ProcessCameraProvider> getInstance(Context context) {
            x.f(context, "context");
            Preconditions.checkNotNull(context);
            bm bmVarInitAsync = ProcessCameraProvider.sAppInstance.initAsync(context);
            final l lVar = new l() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ProcessCameraProvider.sAppInstance;
                }
            };
            bm<ProcessCameraProvider> bmVarTransform = Futures.transform(bmVarInitAsync, new Function() { // from class: androidx.camera.lifecycle.ProcessCameraProvider$Companion$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return ProcessCameraProvider.Companion.getInstance$lambda$1(lVar, obj);
                }
            }, CameraXExecutors.directExecutor());
            x.e(bmVarTransform, "transform(...)");
            return bmVarTransform;
        }

        public final bm<Void> shutdown() {
            return ProcessCameraProvider.sAppInstance.shutdownAsync();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final boolean isBound(UseCase useCase) {
        x.f(useCase, "useCase");
        return this.lifecycleCameraProvider.isBound(useCase);
    }

    @Override // androidx.camera.core.CameraProvider
    public CameraInfo getCameraInfo(CameraSelector cameraSelector) {
        x.f(cameraSelector, "cameraSelector");
        return this.lifecycleCameraProvider.getCameraInfo(cameraSelector);
    }

    public final void unbind(SessionConfig sessionConfig) {
        x.f(sessionConfig, "sessionConfig");
        this.lifecycleCameraProvider.unbind(sessionConfig);
    }

    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(useCaseGroup, "useCaseGroup");
        return this.lifecycleCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    public final Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, SessionConfig sessionConfig) {
        x.f(lifecycleOwner, "lifecycleOwner");
        x.f(cameraSelector, "cameraSelector");
        x.f(sessionConfig, "sessionConfig");
        return this.lifecycleCameraProvider.bindToLifecycle(lifecycleOwner, cameraSelector, sessionConfig);
    }

    public final ConcurrentCamera bindToLifecycle(List<ConcurrentCamera.SingleCameraConfig> list) {
        x.f(list, "singleCameraConfigs");
        return this.lifecycleCameraProvider.bindToLifecycle(list);
    }
}
