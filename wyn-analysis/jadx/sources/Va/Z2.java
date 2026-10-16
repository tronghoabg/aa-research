package Va;

import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.sdk.placements.Placement;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Z2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Placement placement = (Placement) arrayList.get(0);
        C0901a3.f13970T = (C0901a3.f13969S + 45) % 128;
        Constants.AdType adTypeO0 = C0901a3.O0(placement);
        C0901a3.f13970T = (C0901a3.f13969S + 3) % 128;
        return adTypeO0;
    }
}
