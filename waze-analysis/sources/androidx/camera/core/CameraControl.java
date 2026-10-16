package androidx.camera.core;

import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraControl {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.CameraControl$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    bm<Void> cancelFocusAndMetering();

    bm<Void> enableLowLightBoostAsync(boolean z);

    bm<Void> enableTorch(boolean z);

    bm<Integer> setExposureCompensationIndex(int i2);

    bm<Void> setLinearZoom(float f2);

    bm<Void> setTorchStrengthLevel(int i2);

    bm<Void> setZoomRatio(float f2);

    bm<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction);

    /* compiled from: WazeSource */
    public final class OperationCanceledException extends Exception {
        public OperationCanceledException(String str) {
            super(str);
        }

        public OperationCanceledException(String str, Throwable th) {
            super(str, th);
        }
    }
}
