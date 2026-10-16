package Va;

import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: Va.r1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1119r1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(1);
        C1196x1.f14762U = (C1196x1.f14761T + 95) % 128;
        String strX0 = C1196x1.X0(dTBAdResponse, dTBAdSize);
        int i5 = C1196x1.f14761T + 45;
        C1196x1.f14762U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 43 / 0;
        }
        return strX0;
    }
}
