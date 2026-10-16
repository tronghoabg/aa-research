package Va;

import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: Va.k6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1034k6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Advertisement advertisement = (Advertisement) arrayList.get(0);
        int i5 = C1073n6.f14418Z + 57;
        C1073n6.f14417Y = i5 % 128;
        if (i5 % 2 != 0) {
            C1073n6.D0(advertisement);
            throw null;
        }
        Map mapD0 = C1073n6.D0(advertisement);
        C1073n6.f14418Z = (C1073n6.f14417Y + 113) % 128;
        return mapD0;
    }
}
