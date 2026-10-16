package androidx.camera.lifecycle;

import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ConcurrentCamera;
import androidx.camera.core.SessionConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.lifecycle.LifecycleCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LifecycleOwner;
import com.google.d.m.a.bm;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface LifecycleCameraProvider extends CameraProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, SessionConfig sessionConfig);

    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCaseGroup useCaseGroup);

    Camera bindToLifecycle(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr);

    ConcurrentCamera bindToLifecycle(List<ConcurrentCamera.SingleCameraConfig> list);

    boolean isBound(SessionConfig sessionConfig);

    boolean isBound(UseCase useCase);

    void unbind(SessionConfig sessionConfig);

    void unbind(UseCase... useCaseArr);

    void unbindAll();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.lifecycle.LifecycleCameraProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object createInstance(Context context, CameraXConfig cameraXConfig, e<? super LifecycleCameraProvider> eVar) {
            return LifecycleCameraProvider.Companion.createInstance(context, cameraXConfig, eVar);
        }

        public static bm<LifecycleCameraProvider> createInstanceAsync(Context context) {
            return LifecycleCameraProvider.Companion.createInstanceAsync(context);
        }

        public static Object createInstance(Context context, e<? super LifecycleCameraProvider> eVar) {
            return LifecycleCameraProvider.Companion.createInstance(context, eVar);
        }

        public static bm<LifecycleCameraProvider> createInstanceAsync(Context context, CameraXConfig cameraXConfig) {
            return LifecycleCameraProvider.Companion.createInstanceAsync(context, cameraXConfig);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ Object createInstance$default(Companion companion, Context context, CameraXConfig cameraXConfig, e eVar, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                cameraXConfig = null;
            }
            return companion.createInstance(context, cameraXConfig, eVar);
        }

        public static /* synthetic */ bm createInstanceAsync$default(Companion companion, Context context, CameraXConfig cameraXConfig, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                cameraXConfig = null;
            }
            return companion.createInstanceAsync(context, cameraXConfig);
        }

        static final LifecycleCameraProvider createInstanceAsync$lambda$0(LifecycleCameraProviderImpl lifecycleCameraProviderImpl, Void r1) {
            return lifecycleCameraProviderImpl;
        }

        static final LifecycleCameraProvider createInstanceAsync$lambda$1(l lVar, Object obj) {
            return (LifecycleCameraProvider) lVar.invoke(obj);
        }

        public final Object createInstance(Context context, e<? super LifecycleCameraProvider> eVar) {
            return createInstance$default(this, context, null, eVar, 2, null);
        }

        public final bm<LifecycleCameraProvider> createInstanceAsync(Context context, CameraXConfig cameraXConfig) {
            x.f(context, "context");
            Preconditions.checkNotNull(context);
            final LifecycleCameraProviderImpl lifecycleCameraProviderImpl = new LifecycleCameraProviderImpl();
            bm<Void> bmVarInitAsync$camera_lifecycle = lifecycleCameraProviderImpl.initAsync$camera_lifecycle(context, cameraXConfig);
            final l lVar = new l() { // from class: androidx.camera.lifecycle.LifecycleCameraProvider$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return LifecycleCameraProvider.Companion.createInstanceAsync$lambda$0(lifecycleCameraProviderImpl, (Void) obj);
                }
            };
            bm<LifecycleCameraProvider> bmVarTransform = Futures.transform(bmVarInitAsync$camera_lifecycle, new Function() { // from class: androidx.camera.lifecycle.LifecycleCameraProvider$Companion$$ExternalSyntheticLambda1
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return LifecycleCameraProvider.Companion.createInstanceAsync$lambda$1(lVar, obj);
                }
            }, CameraXExecutors.directExecutor());
            x.e(bmVarTransform, "transform(...)");
            return bmVarTransform;
        }

        public final Object createInstance(Context context, CameraXConfig cameraXConfig, e<? super LifecycleCameraProvider> eVar) {
            return ListenableFutureKt.await(createInstanceAsync(context, cameraXConfig), eVar);
        }

        public final bm<LifecycleCameraProvider> createInstanceAsync(Context context) {
            x.f(context, "context");
            return createInstanceAsync$default(this, context, null, 2, null);
        }
    }
}
