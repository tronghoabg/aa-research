package Va;

import android.os.Bundle;
import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;

/* renamed from: Va.n1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1068n1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        int i5 = C1196x1.f14761T + 69;
        C1196x1.f14762U = i5 % 128;
        int i10 = i5 % 2;
        Bundle bundleK0 = C1196x1.K0(dTBAdResponse);
        if (i10 == 0) {
            int i11 = 11 / 0;
        }
        C1196x1.f14762U = (C1196x1.f14761T + 11) % 128;
        return bundleK0;
    }
}
