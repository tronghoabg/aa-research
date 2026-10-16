package Va;

import com.vungle.warren.model.Placement;
import java.util.ArrayList;

/* renamed from: Va.j6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1021j6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        int i5 = C1073n6.f14417Y + 77;
        C1073n6.f14418Z = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(C1073n6.H0(placement));
        }
        C1073n6.H0(placement);
        throw null;
    }
}
