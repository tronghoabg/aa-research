package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class M2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C0901a3.f13970T = (C0901a3.f13969S + 51) % 128;
        String strL0 = C0901a3.L0(impressionData);
        C0901a3.f13969S = (C0901a3.f13970T + 75) % 128;
        return strL0;
    }
}
