package Va;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;

/* renamed from: Va.i6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1008i6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        int i5 = C1073n6.f14417Y + 85;
        C1073n6.f14418Z = i5 % 128;
        int i10 = i5 % 2;
        String strE0 = C1073n6.E0(advertisement);
        if (i10 == 0) {
            int i11 = 15 / 0;
        }
        C1073n6.f14418Z = (C1073n6.f14417Y + 3) % 128;
        return strE0;
    }
}
