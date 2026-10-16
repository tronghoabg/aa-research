package Dc;

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
    public Size f2630b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f2631c;

    /* renamed from: d, reason: collision with root package name */
    public MeteringRectangle f2632d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2633e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2634f;

    /* renamed from: g, reason: collision with root package name */
    public MeteringRectangle[] f2635g;

    public a(q qVar, b bVar) {
        super(qVar);
        this.f2634f = false;
        this.f2633e = bVar;
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        Integer num = (Integer) ((CameraCharacteristics) this.f48474a.f45906a).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null || num.intValue() <= 0) {
            return;
        }
        if (!this.f2634f) {
            this.f2635g = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
            this.f2634f = true;
        }
        MeteringRectangle meteringRectangle = this.f2632d;
        if (meteringRectangle != null) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        } else {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.f2635g);
        }
    }

    public final void b() {
        Size size = this.f2630b;
        if (size == null) {
            throw new AssertionError("The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point.");
        }
        w0 w0Var = this.f2631c;
        if (w0Var == null) {
            this.f2632d = null;
            return;
        }
        b bVar = this.f2633e;
        int i5 = bVar.f6006d;
        if (i5 == 0) {
            i5 = bVar.f6005c.f6002e;
        }
        this.f2632d = h.n(size, ((Double) w0Var.f46405a).doubleValue(), ((Double) this.f2631c.f46406b).doubleValue(), i5);
    }
}
