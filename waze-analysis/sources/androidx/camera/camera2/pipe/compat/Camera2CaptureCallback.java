package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Camera2CaptureCallback {
    /* renamed from: onCaptureCompleted-rmrZIYk, reason: not valid java name */
    void mo1011onCaptureCompletedrmrZIYk(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j2);

    /* renamed from: onCaptureFailed-RuT0dZU, reason: not valid java name */
    void mo1012onCaptureFailedRuT0dZU(CaptureRequest captureRequest, long j2);

    void onCaptureProcessProgressed(CaptureRequest captureRequest, int i2);

    void onCaptureProgressed(CaptureRequest captureRequest, CaptureResult captureResult);

    void onCaptureSequenceAborted(int i2);

    void onCaptureSequenceCompleted(int i2, long j2);

    void onCaptureStarted(CaptureRequest captureRequest, long j2, long j3);
}
