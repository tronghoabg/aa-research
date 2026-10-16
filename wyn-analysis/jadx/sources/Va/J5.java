package Va;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class J5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastScenario vastScenario = (VastScenario) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 33) % 128;
        VastMediaFileScenario vastMediaFileScenarioL0 = C0995h6.L0(vastScenario);
        C0995h6.f14245T = (C0995h6.f14246U + 117) % 128;
        return vastMediaFileScenarioL0;
    }
}
