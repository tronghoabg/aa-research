package Va;

import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Y5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastCompanionScenario vastCompanionScenario = (VastCompanionScenario) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 27) % 128;
        String strA1 = C0995h6.a1(vastCompanionScenario);
        int i5 = C0995h6.f14245T + 101;
        C0995h6.f14246U = i5 % 128;
        if (i5 % 2 != 0) {
            return strA1;
        }
        throw null;
    }
}
