package Va;

import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;

/* renamed from: Va.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1029k1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        int i5 = C1196x1.f14761T + 69;
        C1196x1.f14762U = i5 % 128;
        if (i5 % 2 == 0) {
            C1196x1.M0(dTBAdSize);
            throw null;
        }
        AdType adTypeM0 = C1196x1.M0(dTBAdSize);
        int i10 = C1196x1.f14761T + 85;
        C1196x1.f14762U = i10 % 128;
        if (i10 % 2 != 0) {
            return adTypeM0;
        }
        throw null;
    }
}
