package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        int i5 = C0901a3.f13970T + 31;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            C0901a3.D0(impressionData);
            throw null;
        }
        String strD0 = C0901a3.D0(impressionData);
        int i10 = C0901a3.f13969S + 87;
        C0901a3.f13970T = i10 % 128;
        if (i10 % 2 != 0) {
            return strD0;
        }
        throw null;
    }
}
