package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class P1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad.Display display = (Ad.Display) arrayList.get(0);
        int i5 = C0939d2.f14094U + 95;
        C0939d2.f14093T = i5 % 128;
        if (i5 % 2 != 0) {
            C0939d2.F0(display);
            throw null;
        }
        Ad.Display.Banner bannerF0 = C0939d2.F0(display);
        int i10 = C0939d2.f14093T + 119;
        C0939d2.f14094U = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
        }
        return bannerF0;
    }
}
