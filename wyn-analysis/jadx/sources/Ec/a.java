package Ec;

import A.AbstractC0213f;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public int f3643b;

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        Boolean bool = (Boolean) ((CameraCharacteristics) this.f48474a.f45906a).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        int iF = AbstractC0213f.f(this.f3643b);
        if (iF == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        if (iF == 1) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (iF == 2) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (iF != 3) {
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 2);
        }
    }
}
