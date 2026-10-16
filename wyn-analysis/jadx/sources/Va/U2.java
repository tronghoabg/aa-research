package Va;

import com.fyber.fairbid.ads.ImpressionData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class U2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        int i5 = C0901a3.f13970T + 9;
        C0901a3.f13969S = i5 % 128;
        int i10 = i5 % 2;
        String strC0 = C0901a3.C0(impressionData);
        if (i10 != 0) {
            int i11 = 86 / 0;
        }
        C0901a3.f13969S = (C0901a3.f13970T + 7) % 128;
        return strC0;
    }
}
