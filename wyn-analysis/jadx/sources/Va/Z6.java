package Va;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Z6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        C0957e7.f14122T = (C0957e7.f14121S + 107) % 128;
        MediaFile mediaFileD0 = C0957e7.D0(videoAd);
        int i5 = C0957e7.f14122T + 63;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 7 / 0;
        }
        return mediaFileD0;
    }
}
