package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class P2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C0901a3.f13970T = (C0901a3.f13969S + 103) % 128;
        double dF0 = C0901a3.F0(impressionData);
        C0901a3.f13969S = (C0901a3.f13970T + 107) % 128;
        return Double.valueOf(dF0);
    }
}
