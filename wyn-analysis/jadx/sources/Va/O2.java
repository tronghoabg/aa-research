package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class O2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        int i5 = C0901a3.f13970T + 21;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 == 0) {
            return C0901a3.I0(impressionData);
        }
        C0901a3.I0(impressionData);
        throw null;
    }
}
