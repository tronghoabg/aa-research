package androidx.camera.camera2.impl;

import android.util.Range;
import androidx.camera.camera2.adapter.EvCompValue;
import androidx.camera.camera2.compat.EvCompCompat;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.core.CameraControl;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class EvCompControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;
    private final EvCompCompat compat;
    private int evCompIndex;
    private EvCompValue exposureState;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(EvCompControl evCompControl);
    }

    public EvCompControl(EvCompCompat evCompCompat) {
        x.f(evCompCompat, "compat");
        this.compat = evCompCompat;
        this.exposureState = new EvCompValue(evCompCompat.getSupported(), this.evCompIndex, evCompCompat.getRange(), evCompCompat.getStep());
    }

    private final CompletableDeferred<Integer> createFailureResult(Exception exc) {
        CompletableDeferred<Integer> completableDeferredJ = bo.j();
        completableDeferredJ.b(exc);
        return completableDeferredJ;
    }

    private final void setEvCompIndex(int i2) {
        this.evCompIndex = i2;
        this.exposureState = this.exposureState.updateIndex$camera_camera2(i2);
    }

    public static /* synthetic */ am updateAsync$default(EvCompControl evCompControl, int i2, boolean z, int i3, Object obj) {
        return evCompControl.updateAsync(i2, z | (!((i3 & 2) == 0)));
    }

    public final EvCompValue getExposureState() {
        return this.exposureState;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        setEvCompIndex(0);
        updateAsync$default(this, 0, false, 2, null);
    }

    public final void setExposureState(EvCompValue evCompValue) {
        x.f(evCompValue, "<set-?>");
        this.exposureState = evCompValue;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        updateAsync(this.evCompIndex, false);
    }

    public final am<Integer> updateAsync(int i2, boolean z) {
        if (!this.compat.getSupported()) {
            return createFailureResult(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        if (this.compat.getRange().contains((Range<Integer>) Integer.valueOf(i2))) {
            UseCaseCameraRequestControl requestControl = getRequestControl();
            if (requestControl != null) {
                setEvCompIndex(i2);
                am<Integer> amVarApplyAsync = this.compat.applyAsync(i2, requestControl, z);
                if (amVarApplyAsync != null) {
                    return amVarApplyAsync;
                }
            }
            CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
            this.compat.stopRunningTask(operationCanceledException);
            return createFailureResult(operationCanceledException);
        }
        return createFailureResult(new IllegalArgumentException("Requested ExposureCompensation " + i2 + " is not within valid range [" + this.compat.getRange().getUpper() + " .. " + this.compat.getRange().getLower() + "]"));
    }
}
