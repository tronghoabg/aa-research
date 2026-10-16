package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: Va.h1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0990h1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        int i5 = C1196x1.f14761T + 121;
        C1196x1.f14762U = i5 % 128;
        if (i5 % 2 != 0) {
            return C1196x1.T0(dTBAdResponse);
        }
        C1196x1.T0(dTBAdResponse);
        throw null;
    }
}
