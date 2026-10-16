package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: Va.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1016j1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        C1196x1.f14762U = (C1196x1.f14761T + 33) % 128;
        String strN0 = C1196x1.N0(dTBAdResponse);
        int i5 = C1196x1.f14762U + 97;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 13 / 0;
        }
        return strN0;
    }
}
