package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: Va.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1081o1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        int i5 = C1196x1.f14762U + 31;
        C1196x1.f14761T = i5 % 128;
        int i10 = i5 % 2;
        Map mapI0 = C1196x1.I0(dTBAdResponse);
        if (i10 != 0) {
            int i11 = 19 / 0;
        }
        C1196x1.f14761T = (C1196x1.f14762U + 109) % 128;
        return mapI0;
    }
}
