package Va;

import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class C5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastScenario vastScenario = (VastScenario) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 31) % 128;
        VastCompanionScenario vastCompanionScenarioL1 = C0995h6.l1(vastScenario);
        int i5 = C0995h6.f14246U + 29;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 == 0) {
            return vastCompanionScenarioL1;
        }
        throw null;
    }
}
