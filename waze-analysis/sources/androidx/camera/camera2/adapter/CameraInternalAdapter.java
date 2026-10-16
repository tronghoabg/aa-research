package androidx.camera.camera2.adapter;

import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionProcessor;
import com.google.d.m.a.bm;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.e.b;
import h.g.a.p;
import h.g.b.x;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraInternalAdapter implements CameraInternal {
    private final CameraControlInternal cameraController;
    private final String cameraId;
    private final CameraInfoInternal cameraInfo;
    private final CameraStateAdapter cameraStateAdapter;
    private CameraConfig coreCameraConfig;
    private final int debugId;
    private final kotlinx.a.a isRemoved;
    private SessionProcessor sessionProcessor;
    private final UseCaseThreads threads;
    private final UseCaseManager useCaseManager;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.CameraInternalAdapter$onRemoved$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraInternalAdapter.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                CameraInternalAdapter.this.cameraStateAdapter.onRemoved();
                this.label = 1;
                if (CameraInternalAdapter.this.useCaseManager.close(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.adapter.CameraInternalAdapter$release$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraInternalAdapter.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (CameraInternalAdapter.this.useCaseManager.close(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            aj.h(CameraInternalAdapter.this.threads.getScope(), null);
            return ab.f48028a;
        }
    }

    public CameraInternalAdapter(androidx.camera.camera2.config.CameraConfig cameraConfig, UseCaseManager useCaseManager, CameraInfoInternal cameraInfoInternal, CameraControlInternal cameraControlInternal, UseCaseThreads useCaseThreads, CameraStateAdapter cameraStateAdapter) {
        x.f(cameraConfig, "config");
        x.f(useCaseManager, "useCaseManager");
        x.f(cameraInfoInternal, "cameraInfo");
        x.f(cameraControlInternal, "cameraController");
        x.f(useCaseThreads, "threads");
        x.f(cameraStateAdapter, "cameraStateAdapter");
        this.useCaseManager = useCaseManager;
        this.cameraInfo = cameraInfoInternal;
        this.cameraController = cameraControlInternal;
        this.threads = useCaseThreads;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraId = cameraConfig.m231getCameraIdDz_R5H8();
        CameraConfig cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
        x.e(cameraConfigDefaultConfig, "defaultConfig(...)");
        this.coreCameraConfig = cameraConfigDefaultConfig;
        this.debugId = CameraInternalAdapterKt.getCameraAdapterIds().e();
        this.isRemoved = b.e(false);
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Created " + this + " for " + CameraId.m552toStringimpl(this.cameraId));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(Collection<UseCase> collection) {
        x.f(collection, "useCasesToAdd");
        this.useCaseManager.attach(i.ao(collection));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            toString();
            android.util.Log.d(str, toString().concat("#close"));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(Collection<UseCase> collection) {
        x.f(collection, "useCasesToRemove");
        this.useCaseManager.detach(i.ao(collection));
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal getCameraControlInternal() {
        return this.cameraController;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public /* synthetic */ CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraInfoInternal getCameraInfoInternal() {
        return this.cameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public Observable<CameraInternal.State> getCameraState() {
        return this.cameraStateAdapter.getCameraInternalState$camera_camera2();
    }

    public final CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        return this.useCaseManager.getDeferredCameraGraphConfig$camera_camera2();
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.coreCameraConfig;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean getHasTransform() {
        return true;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public /* synthetic */ boolean isFrontFacing() {
        return CameraInternal.CC.$default$isFrontFacing(this);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean isRemoved() {
        return this.isRemoved.c();
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(true, useCaseArr);
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupportedByFramework(UseCase... useCaseArr) {
        return isUseCasesCombinationSupported(false, useCaseArr);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void onRemoved() {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            toString();
            android.util.Log.d(str, toString().concat(" received removed signal. Cleaning up."));
        }
        if (this.isRemoved.b(false, true)) {
            aj.z(this.threads.getScope(), null, null, new AnonymousClass2(null), 3);
        }
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(UseCase useCase) {
        x.f(useCase, "useCase");
        this.useCaseManager.activate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(UseCase useCase) {
        x.f(useCase, "useCase");
        this.useCaseManager.deactivate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(UseCase useCase) {
        x.f(useCase, "useCase");
        this.useCaseManager.reset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(UseCase useCase) {
        x.f(useCase, "useCase");
        this.useCaseManager.update(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            toString();
            android.util.Log.d(str, toString().concat("#open"));
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public bm<Void> release() {
        return CoroutineAdaptersKt.asListenableFuture$default(aj.z(this.threads.getScope(), null, null, new AnonymousClass1(null), 3), (Object) null, 1, (Object) null);
    }

    public final void resumeDeferredCameraGraphCreation$camera_camera2(CameraGraph cameraGraph) {
        x.f(cameraGraph, "cameraGraph");
        this.useCaseManager.resumeDeferredComponentCreation$camera_camera2(cameraGraph);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(boolean z) {
        this.useCaseManager.setActiveResumeMode(z);
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean z) {
        this.useCaseManager.setCameraGraphCreationMode$camera_camera2(z);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(CameraConfig cameraConfig) {
        CameraConfig cameraConfigDefaultConfig;
        if (cameraConfig == null) {
            cameraConfigDefaultConfig = CameraConfigs.defaultConfig();
            x.e(cameraConfigDefaultConfig, "defaultConfig(...)");
        } else {
            cameraConfigDefaultConfig = cameraConfig;
        }
        this.coreCameraConfig = cameraConfigDefaultConfig;
        SessionProcessor sessionProcessor = cameraConfig != null ? cameraConfig.getSessionProcessor(null) : null;
        this.sessionProcessor = sessionProcessor;
        this.useCaseManager.setSessionProcessor$camera_camera2(sessionProcessor);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z) {
        this.useCaseManager.setPrimary(z);
    }

    public String toString() {
        return "CameraInternalAdapter<" + CameraId.m552toStringimpl(this.cameraId) + "(" + this.debugId + ")>";
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ boolean isUseCasesCombinationSupported(boolean z, UseCase... useCaseArr) {
        return true;
    }

    @Override // androidx.camera.core.Camera
    public /* synthetic */ void setCompositionSettings(List list) {
    }
}
