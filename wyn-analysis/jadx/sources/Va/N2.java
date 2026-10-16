package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class N2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 67) % 128;
        String strG0 = C0901a3.G0(impressionData);
        int i5 = C0901a3.f13969S + 49;
        C0901a3.f13970T = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 92 / 0;
        }
        return strG0;
    }
}
