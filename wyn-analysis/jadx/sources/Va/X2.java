package Va;

import com.fyber.fairbid.sdk.placements.Placement;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 59) % 128;
        String strQ0 = C0901a3.Q0(placement);
        int i5 = C0901a3.f13970T + 61;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 == 0) {
            return strQ0;
        }
        throw null;
    }
}
