package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.adapter.ZoomValue;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.internal.ZoomMath;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.d.m.a.bm;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class ZoomControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;
    private final f _zoomState$delegate;
    private final f defaultZoomState$delegate;
    private boolean isInitialized;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private CompletableDeferred<ab> updateSignal;
    private final ZoomCompat zoomCompat;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract UseCaseCameraControl provideControls(ZoomControl zoomControl);
    }

    public ZoomControl(ZoomCompat zoomCompat) {
        x.f(zoomCompat, "zoomCompat");
        this.zoomCompat = zoomCompat;
        this.minZoomRatio = zoomCompat.getMinZoomRatio();
        this.maxZoomRatio = zoomCompat.getMaxZoomRatio();
        this.defaultZoomState$delegate = g.a(new a() { // from class: androidx.camera.camera2.impl.ZoomControl$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ZoomControl.defaultZoomState_delegate$lambda$0(this.f$0);
            }
        });
        this._zoomState$delegate = g.a(new a() { // from class: androidx.camera.camera2.impl.ZoomControl$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return ZoomControl._zoomState_delegate$lambda$0(this.f$0);
            }
        });
    }

    static final MutableLiveData _zoomState_delegate$lambda$0(ZoomControl zoomControl) {
        return new MutableLiveData(zoomControl.getDefaultZoomState());
    }

    public static /* synthetic */ bm applyZoomState$default(ZoomControl zoomControl, ZoomState zoomState, boolean z, boolean z2, int i2, Object obj) {
        return zoomControl.applyZoomState(zoomState, z | (!((i2 & 2) == 0)), z2 | (!((i2 & 4) == 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab applyZoomState$lambda$1$0(CompletableDeferred completableDeferred, Throwable th) {
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }

    static final ZoomValue defaultZoomState_delegate$lambda$0(ZoomControl zoomControl) {
        return new ZoomValue(1.0f, zoomControl.minZoomRatio, zoomControl.maxZoomRatio);
    }

    private final MutableLiveData<ZoomState> get_zoomState() {
        return (MutableLiveData) this._zoomState$delegate.getValue();
    }

    private final void setZoomState(ZoomState zoomState) {
        if (Threads.isMainThread()) {
            get_zoomState().setValue(zoomState);
        } else {
            get_zoomState().postValue(zoomState);
        }
    }

    private final float toZoomRatio(float f2) {
        return ZoomMath.INSTANCE.getZoomRatioFromLinearZoom(f2, this.minZoomRatio, this.maxZoomRatio);
    }

    public final bm<Void> applyZoomState(ZoomState zoomState, boolean z, boolean z2) {
        x.f(zoomState, "zoomState");
        final CompletableDeferred<ab> completableDeferredJ = bo.j();
        CompletableDeferred<ab> completableDeferred = this.updateSignal;
        if (completableDeferred != null) {
            if (z) {
                completableDeferred.b(new CameraControl.OperationCanceledException("Cancelled due to another zoom value being set."));
            } else {
                CoroutineAdaptersKt.propagateTo(completableDeferredJ, completableDeferred);
            }
        }
        this.updateSignal = completableDeferredJ;
        setZoomState(zoomState);
        UseCaseCameraRequestControl requestControl = getRequestControl();
        if (requestControl != null) {
            float zoomRatio = zoomState.getZoomRatio();
            ZoomCompat zoomCompat = this.zoomCompat;
            (z2 ? zoomCompat.applyAsync(zoomRatio, requestControl) : zoomCompat.resetAsync(requestControl)).bY(new l() { // from class: androidx.camera.camera2.impl.ZoomControl$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ZoomControl.applyZoomState$lambda$1$0(completableDeferredJ, (Throwable) obj);
                }
            });
        } else {
            completableDeferredJ.b(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        bm<Void> bmVarNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default((br) completableDeferredJ, (Object) null, 1, (Object) null));
        x.e(bmVarNonCancellationPropagating, "nonCancellationPropagating(...)");
        return bmVarNonCancellationPropagating;
    }

    public final ZoomValue getDefaultZoomState() {
        return (ZoomValue) this.defaultZoomState$delegate.getValue();
    }

    public final float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    public final float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public UseCaseCameraRequestControl getRequestControl() {
        return this._requestControl;
    }

    public final LiveData<ZoomState> getZoomStateLiveData() {
        return get_zoomState();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        applyZoomState$default(this, getDefaultZoomState(), false, false, 6, null);
    }

    public final bm<Void> setLinearZoom(float f2) {
        if (f2 <= 1.0f && f2 >= 0.0f) {
            return applyZoomState$default(this, new ZoomValue(new ZoomValue.LinearZoom(f2), this.minZoomRatio, this.maxZoomRatio), false, false, 6, null);
        }
        bm<Void> bmVarImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalArgumentException("Requested linearZoom " + f2 + " is not within valid range [0, 1]"));
        x.e(bmVarImmediateFailedFuture, "immediateFailedFuture(...)");
        return bmVarImmediateFailedFuture;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        ZoomValue value = get_zoomState().getValue();
        if (value == null) {
            value = getDefaultZoomState();
        }
        applyZoomState(value, false, this.isInitialized || value.getZoomRatio() != 1.0f);
        this.isInitialized = true;
    }

    public final bm<Void> setZoomRatio(float f2) {
        float f3 = this.maxZoomRatio;
        if (f2 <= f3) {
            float f4 = this.minZoomRatio;
            if (f2 >= f4) {
                return applyZoomState$default(this, new ZoomValue(f2, f4, f3), false, false, 6, null);
            }
        }
        bm<Void> bmVarImmediateFailedFuture = Futures.immediateFailedFuture(new IllegalArgumentException("Requested zoomRatio " + f2 + " is not within valid range [" + this.minZoomRatio + ", " + f3 + "]"));
        x.e(bmVarImmediateFailedFuture, "immediateFailedFuture(...)");
        return bmVarImmediateFailedFuture;
    }

    public final float toLinearZoom(float f2) {
        return ZoomMath.INSTANCE.getLinearZoomFromZoomRatio(f2, this.minZoomRatio, this.maxZoomRatio);
    }
}
