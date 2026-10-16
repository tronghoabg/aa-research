package Va;

import com.explorestack.protobuf.adcom.Ad;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class W1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Ad.Display display = (Ad.Display) arrayList.get(0);
        int i5 = C0939d2.f14094U + 41;
        C0939d2.f14093T = i5 % 128;
        if (i5 % 2 == 0) {
            return C0939d2.J0(display);
        }
        C0939d2.J0(display);
        throw null;
    }
}
