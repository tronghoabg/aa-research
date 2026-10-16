package Va;

import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.util.ArrayList;

/* renamed from: Va.m6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1060m6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Repository repository = (Repository) arrayList.get(0);
        String str = (String) arrayList.get(1);
        C1073n6.f14417Y = (C1073n6.f14418Z + 101) % 128;
        Placement placementF0 = C1073n6.F0(repository, str);
        int i5 = C1073n6.f14418Z + 101;
        C1073n6.f14417Y = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 35 / 0;
        }
        return placementF0;
    }
}
