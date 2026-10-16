package Va;

import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class H5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastScenarioCreativeData vastScenarioCreativeData = (VastScenarioCreativeData) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 45) % 128;
        String strQ0 = C0995h6.Q0(vastScenarioCreativeData);
        int i5 = C0995h6.f14245T + 15;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return strQ0;
        }
        throw null;
    }
}
