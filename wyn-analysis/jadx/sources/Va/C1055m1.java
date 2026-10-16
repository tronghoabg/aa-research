package Va;

import com.amazon.device.ads.DTBAdResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Va.m1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1055m1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdResponse dTBAdResponse = (DTBAdResponse) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 115) % 128;
        List listE0 = C1196x1.E0(dTBAdResponse);
        int i5 = C1196x1.f14762U + 61;
        C1196x1.f14761T = i5 % 128;
        if (i5 % 2 == 0) {
            return listE0;
        }
        throw null;
    }
}
