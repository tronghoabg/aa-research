package Va;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class X6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        int i5 = C0957e7.f14122T + 105;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 != 0) {
            C0957e7.P0(videoAd);
            throw null;
        }
        String strP0 = C0957e7.P0(videoAd);
        C0957e7.f14122T = (C0957e7.f14121S + 13) % 128;
        return strP0;
    }
}
