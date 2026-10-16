package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class N1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad ad2 = (Ad) arrayList.get(0);
        C0939d2.f14093T = (C0939d2.f14094U + 53) % 128;
        Ad.Display displayP0 = C0939d2.P0(ad2);
        C0939d2.f14094U = (C0939d2.f14093T + 41) % 128;
        return displayP0;
    }
}
