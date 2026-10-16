package androidx.camera.camera2.interop;

import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseCameraControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.d.m.a.bm;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraControl implements UseCaseCameraControl {
    public static final Companion Companion = new Companion(null);
    private UseCaseCameraRequestControl _useCaseCameraRequestControl;
    private final Camera2CameraControlCompat compat;
    private final ComboRequestListener requestListener;
    private final UseCaseThreads threads;

    private Camera2CameraControl(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        this.compat = camera2CameraControlCompat;
        this.threads = useCaseThreads;
        this.requestListener = comboRequestListener;
    }

    public static final Camera2CameraControl create(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        return Companion.create(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
    }

    public static final Camera2CameraControl from(CameraControl cameraControl) {
        return Companion.from(cameraControl);
    }

    private final bm<Void> updateAsync(String str) {
        bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture(Camera2CameraControlCompat.CC.applyAsync$default(this.compat, getRequestControl(), false, 2, null), (Object) str));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    public final bm<Void> addCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        x.f(captureRequestOptions, "bundle");
        this.compat.addRequestOption(captureRequestOptions);
        return updateAsync("addCaptureRequestOptions");
    }

    public final bm<Void> clearCaptureRequestOptions() {
        this.compat.clearRequestOption();
        return updateAsync("clearCaptureRequestOptions");
    }

    public final CaptureRequestOptions getCaptureRequestOptions() {
        return this.compat.getRequestOption();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._useCaseCameraRequestControl;
    }

    public final ComboRequestListener getRequestListener$camera_camera2() {
        return this.requestListener;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this.compat.cancelCurrentTask();
        this.requestListener.removeListener(this.compat);
    }

    public final bm<Void> setCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        x.f(captureRequestOptions, "bundle");
        this.compat.clearRequestOption();
        this.compat.addRequestOption(captureRequestOptions);
        return updateAsync("setCaptureRequestOptions");
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._useCaseCameraRequestControl = useCaseCameraRequestControl;
        if (useCaseCameraRequestControl != null) {
            this.requestListener.removeListener(this.compat);
            this.requestListener.addListener(this.compat, this.threads.getSequentialExecutor());
            this.compat.applyAsync(useCaseCameraRequestControl, false);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Camera2CameraControl create(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
            x.f(camera2CameraControlCompat, "compat");
            x.f(useCaseThreads, "threads");
            x.f(comboRequestListener, "requestListener");
            return new Camera2CameraControl(camera2CameraControlCompat, useCaseThreads, comboRequestListener, null);
        }

        public final Camera2CameraControl from(CameraControl cameraControl) {
            x.f(cameraControl, "cameraControl");
            CameraControlInternal implementation = ((CameraControlInternal) cameraControl).getImplementation();
            x.e(implementation, "getImplementation(...)");
            Preconditions.checkArgument(implementation instanceof CameraControlAdapter, "CameraControl doesn't contain Camera2 implementation.");
            return ((CameraControlAdapter) implementation).getCamera2cameraControl();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Camera2CameraControl(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener, o oVar) {
        this(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
    }
}
