package Fc;

import A6.h;
import Jc.b;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import t6.q;
import u0.w0;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public Size f4036b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f4037c;

    /* renamed from: d, reason: collision with root package name */
    public MeteringRectangle f4038d;

    /* renamed from: e, reason: collision with root package name */
    public final b f4039e;

    public a(q qVar, b bVar) {
        super(qVar);
        this.f4039e = bVar;
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        Integer num = (Integer) ((CameraCharacteristics) this.f48474a.f45906a).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null || num.intValue() <= 0) {
            return;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
        MeteringRectangle meteringRectangle = this.f4038d;
        builder.set(key, meteringRectangle == null ? null : new MeteringRectangle[]{meteringRectangle});
    }

    public final void b() {
        Size size = this.f4036b;
        if (size == null) {
            throw new AssertionError("The cameraBoundaries should be set (using `FocusPointFeature.setCameraBoundaries(Size)`) before updating the focus point.");
        }
        w0 w0Var = this.f4037c;
        if (w0Var == null) {
            this.f4038d = null;
            return;
        }
        b bVar = this.f4039e;
        int i5 = bVar.f6006d;
        if (i5 == 0) {
            i5 = bVar.f6005c.f6002e;
        }
        this.f4038d = h.n(size, ((Double) w0Var.f46405a).doubleValue(), ((Double) this.f4037c.f46406b).doubleValue(), i5);
    }
}
