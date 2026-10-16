package Va;

import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class P5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastMediaFileScenario vastMediaFileScenario = (VastMediaFileScenario) arrayList.get(0);
        int i5 = C0995h6.f14246U + 35;
        C0995h6.f14245T = i5 % 128;
        if (i5 % 2 != 0) {
            C0995h6.g1(vastMediaFileScenario);
            throw null;
        }
        VideoClicks videoClicksG1 = C0995h6.g1(vastMediaFileScenario);
        int i10 = C0995h6.f14245T + 105;
        C0995h6.f14246U = i10 % 128;
        if (i10 % 2 != 0) {
            return videoClicksG1;
        }
        throw null;
    }
}
