package yc;

import A.AbstractC0213f;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;

/* renamed from: yc.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4585h extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final C4584g f48137a;

    /* renamed from: c, reason: collision with root package name */
    public final S3.s f48139c;

    /* renamed from: d, reason: collision with root package name */
    public final b7.k f48140d;

    /* renamed from: e, reason: collision with root package name */
    public final CaptureResult.Key f48141e = CaptureResult.CONTROL_AE_STATE;

    /* renamed from: f, reason: collision with root package name */
    public final CaptureResult.Key f48142f = CaptureResult.CONTROL_AF_STATE;

    /* renamed from: b, reason: collision with root package name */
    public int f48138b = 1;

    public C4585h(C4584g c4584g, S3.s sVar, b7.k kVar) {
        this.f48137a = c4584g;
        this.f48139c = sVar;
        this.f48140d = kVar;
    }

    public final void a(CaptureResult captureResult) throws CameraAccessException {
        Integer num = (Integer) captureResult.get(this.f48141e);
        Integer num2 = (Integer) captureResult.get(this.f48142f);
        if (captureResult instanceof TotalCaptureResult) {
            Float f10 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
            Long l10 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
            Integer num3 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
            b7.k kVar = this.f48140d;
            kVar.f19396b = f10;
            kVar.f19397c = l10;
            kVar.f19398d = num3;
        }
        if (this.f48138b != 1) {
            StringBuilder sb2 = new StringBuilder("CameraCaptureCallback | state: ");
            int i5 = this.f48138b;
            sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? "null" : "STATE_CAPTURING" : "STATE_WAITING_PRECAPTURE_DONE" : "STATE_WAITING_PRECAPTURE_START" : "STATE_WAITING_FOCUS" : "STATE_PREVIEW");
            sb2.append(" | afState: ");
            sb2.append(num2);
            sb2.append(" | aeState: ");
            sb2.append(num);
            Log.d("CameraCaptureCallback", sb2.toString());
        }
        int iF = AbstractC0213f.f(this.f48138b);
        C4584g c4584g = this.f48137a;
        S3.s sVar = this.f48139c;
        if (iF == 1) {
            if (num2 == null) {
                return;
            }
            if (num2.intValue() == 4 || num2.intValue() == 5) {
                if (num == null || num.intValue() == 2) {
                    c4584g.e();
                    return;
                } else {
                    c4584g.i();
                    return;
                }
            }
            if (((J5.n) sVar.f11009b).b()) {
                Log.w("CameraCaptureCallback", "Focus timeout, moving on with capture");
                if (num == null || num.intValue() == 2) {
                    c4584g.e();
                    return;
                } else {
                    c4584g.i();
                    return;
                }
            }
            return;
        }
        if (iF != 2) {
            if (iF != 3) {
                return;
            }
            if (num == null || num.intValue() != 5) {
                c4584g.e();
                return;
            } else {
                if (((J5.n) sVar.f11010c).b()) {
                    Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to finish, moving on with capture");
                    c4584g.e();
                    return;
                }
                return;
            }
        }
        if (num == null || num.intValue() == 2 || num.intValue() == 5 || num.intValue() == 4) {
            this.f48138b = 4;
        } else if (((J5.n) sVar.f11010c).b()) {
            Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to start, moving on with capture");
            this.f48138b = 4;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) throws CameraAccessException {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) throws CameraAccessException {
        a(captureResult);
    }
}
