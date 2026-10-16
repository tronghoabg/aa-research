package Va;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: Va.u1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1158u1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        int i5 = C1196x1.f14762U + 29;
        C1196x1.f14761T = i5 % 128;
        int i10 = i5 % 2;
        boolean zU0 = C1196x1.U0(dTBAdSize);
        if (i10 != 0) {
            int i11 = 90 / 0;
        }
        int i12 = C1196x1.f14761T + 63;
        C1196x1.f14762U = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 59 / 0;
        }
        return Boolean.valueOf(zU0);
    }
}
