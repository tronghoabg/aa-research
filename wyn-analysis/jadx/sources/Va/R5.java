package Va;

import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        C0995h6.f14245T = (C0995h6.f14246U + 43) % 128;
        VastBeacon vastBeaconY0 = C0995h6.Y0(videoClicks);
        C0995h6.f14246U = (C0995h6.f14245T + 91) % 128;
        return vastBeaconY0;
    }
}
