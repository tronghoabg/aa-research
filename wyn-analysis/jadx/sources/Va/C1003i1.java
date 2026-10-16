package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: Va.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1003i1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 79) % 128;
        HashMap mapF0 = C1196x1.F0(dTBAdResponse);
        int i5 = C1196x1.f14762U + 5;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 52 / 0;
        }
        return mapF0;
    }
}
