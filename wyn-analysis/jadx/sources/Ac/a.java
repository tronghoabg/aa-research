package Ac;

import A.AbstractC0213f;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import com.unity3d.services.UnityAdsConstants;
import t6.q;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: b, reason: collision with root package name */
    public int f1257b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1258c;

    public a(q qVar, boolean z2) {
        super(qVar);
        this.f1257b = 1;
        this.f1258c = z2;
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        if (b()) {
            int iF = AbstractC0213f.f(this.f1257b);
            if (iF == 0) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f1258c ? 3 : 4));
            } else {
                if (iF != 1) {
                    return;
                }
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
    }

    public final boolean b() {
        q qVar = this.f48474a;
        int[] iArr = (int[]) ((CameraCharacteristics) qVar.f45906a).get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        Float f10 = (Float) ((CameraCharacteristics) qVar.f45906a).get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return (f10 == null || f10.floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) ? false : true;
    }
}
