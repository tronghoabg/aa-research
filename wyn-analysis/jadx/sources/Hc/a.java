package Hc;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import java.util.HashMap;
import t6.q;
import yc.AbstractC4575E;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4993b;

    public a(q qVar) {
        super(qVar);
        b bVar = b.fast;
        HashMap map = new HashMap();
        this.f4993b = map;
        map.put(b.off, 0);
        map.put(bVar, 1);
        map.put(b.highQuality, 2);
        if (AbstractC4575E.f48077a >= 23) {
            map.put(b.minimal, 3);
            map.put(b.zeroShutterLag, 4);
        }
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        int[] iArr = (int[]) ((CameraCharacteristics) this.f48474a.f45906a).get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        builder.set(CaptureRequest.NOISE_REDUCTION_MODE, (Integer) this.f4993b.get(b.fast));
    }
}
