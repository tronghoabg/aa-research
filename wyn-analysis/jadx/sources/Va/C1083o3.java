package Va;

import com.ironsource.mediationsdk.model.Placement;
import java.util.ArrayList;

/* renamed from: Va.o3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1083o3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        int i5 = C1186w3.f14728T + 123;
        C1186w3.f14729U = i5 % 128;
        if (i5 % 2 != 0) {
            return C1186w3.F0(placement);
        }
        C1186w3.F0(placement);
        throw null;
    }
}
