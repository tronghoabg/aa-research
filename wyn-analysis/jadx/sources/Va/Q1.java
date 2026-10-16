package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Q1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad.Display.Banner banner = (Ad.Display.Banner) arrayList.get(0);
        C0939d2.f14094U = (C0939d2.f14093T + 91) % 128;
        List listN0 = C0939d2.N0(banner);
        int i5 = C0939d2.f14093T + 65;
        C0939d2.f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return listN0;
        }
        throw null;
    }
}
