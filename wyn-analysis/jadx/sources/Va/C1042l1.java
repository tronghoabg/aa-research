package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: Va.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1042l1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        C1196x1.f14762U = (C1196x1.f14761T + 5) % 128;
        String strR0 = C1196x1.R0(dTBAdResponse);
        int i5 = C1196x1.f14761T + 51;
        C1196x1.f14762U = i5 % 128;
        if (i5 % 2 != 0) {
            return strR0;
        }
        throw null;
    }
}
