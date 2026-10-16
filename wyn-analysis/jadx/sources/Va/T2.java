package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class T2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C0901a3.f13969S = (C0901a3.f13970T + 69) % 128;
        String strE0 = C0901a3.E0(impressionData);
        int i5 = C0901a3.f13970T + 29;
        C0901a3.f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 25 / 0;
        }
        return strE0;
    }
}
