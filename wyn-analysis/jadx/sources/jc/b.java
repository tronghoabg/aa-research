package Jc;

import A7.V1;
import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import md.J;
import t6.q;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class b extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public final Integer f6004b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6005c;

    /* renamed from: d, reason: collision with root package name */
    public int f6006d;

    public b(q qVar, Activity activity, J j8) {
        super(qVar);
        this.f6004b = 0;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) qVar.f45906a;
        Integer num = (Integer) cameraCharacteristics.get(key);
        num.getClass();
        this.f6004b = num;
        a aVar = new a(activity, j8, ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0, this.f6004b.intValue());
        this.f6005c = aVar;
        if (aVar.f6003f != null) {
            return;
        }
        V1 v1 = new V1(aVar, 4);
        aVar.f6003f = v1;
        activity.registerReceiver(v1, a.f5997g);
        aVar.f6003f.onReceive(activity, null);
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
    }
}
