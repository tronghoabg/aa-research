package Va;

import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class K5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastScenarioCreativeData vastScenarioCreativeData = (VastScenarioCreativeData) arrayList.get(0);
        int i5 = C0995h6.f14245T + 1;
        C0995h6.f14246U = i5 % 128;
        int i10 = i5 % 2;
        String strB1 = C0995h6.b1(vastScenarioCreativeData);
        if (i10 == 0) {
            int i11 = 74 / 0;
        }
        int i12 = C0995h6.f14246U + 33;
        C0995h6.f14245T = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 17 / 0;
        }
        return strB1;
    }
}
