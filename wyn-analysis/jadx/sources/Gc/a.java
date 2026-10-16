package Gc;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import t6.q;
import yc.AbstractC4589l;
import zc.AbstractC4660a;

/* loaded from: classes5.dex */
public final class a extends AbstractC4660a {

    /* renamed from: c, reason: collision with root package name */
    public static final Range f4701c = new Range(30, 30);

    /* renamed from: b, reason: collision with root package name */
    public Range f4702b;

    public a(q qVar) {
        Range range;
        super(qVar);
        String str = AbstractC4589l.f48152a;
        String str2 = AbstractC4589l.f48153b;
        if (str != null && str.equals(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE) && str2 != null && str2.equals("Pixel 4a")) {
            this.f4702b = f4701c;
            return;
        }
        Range[] rangeArr = (Range[]) ((CameraCharacteristics) qVar.f45906a).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            for (Range range2 : rangeArr) {
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                if (iIntValue >= 10 && ((range = this.f4702b) == null || iIntValue > ((Integer) range.getUpper()).intValue())) {
                    this.f4702b = range2;
                }
            }
        }
    }

    @Override // zc.AbstractC4660a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.f4702b);
    }
}
