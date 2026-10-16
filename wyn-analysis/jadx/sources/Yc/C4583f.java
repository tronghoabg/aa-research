package yc;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: yc.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4583f extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4584g f48111a;

    public C4583f(C4584g c4584g) {
        this.f48111a = c4584g;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
        this.f48111a.q();
    }
}
