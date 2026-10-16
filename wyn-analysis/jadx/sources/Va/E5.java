package Va;

import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.VastScenarioResourceData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class E5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastScenarioResourceData vastScenarioResourceData = (VastScenarioResourceData) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 67) % 128;
        StaticResource staticResourceE1 = C0995h6.e1(vastScenarioResourceData);
        int i5 = C0995h6.f14245T + 39;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 77 / 0;
        }
        return staticResourceE1;
    }
}
