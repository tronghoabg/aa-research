package Va;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;

/* loaded from: classes4.dex */
public final class K4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        C1098p5.f14473U = (C1098p5.f14472T + 31) % 128;
        ClickThrough clickThroughW0 = C1098p5.W0(videoClicks);
        int i5 = C1098p5.f14472T + 79;
        C1098p5.f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return clickThroughW0;
        }
        throw null;
    }
}
