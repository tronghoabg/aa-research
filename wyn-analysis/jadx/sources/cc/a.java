package Cc;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public double f1982b;

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf((int) this.f1982b));
    }

    public final double b() {
        Rational rational = (Rational) ((CameraCharacteristics) this.f48474a.f45906a).get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (rational == null) {
            return 0.0d;
        }
        return rational.doubleValue();
    }
}
