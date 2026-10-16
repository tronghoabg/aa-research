package Va;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VastScenarioCreativeData;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class I5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastMediaFileScenario vastMediaFileScenario = (VastMediaFileScenario) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 9) % 128;
        VastScenarioCreativeData vastScenarioCreativeDataN0 = C0995h6.N0(vastMediaFileScenario);
        C0995h6.f14246U = (C0995h6.f14245T + 37) % 128;
        return vastScenarioCreativeDataN0;
    }
}
