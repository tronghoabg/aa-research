package Va;

import com.yandex.mobile.ads.video.playback.model.MediaFile;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class W6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MediaFile mediaFile = (MediaFile) arrayList.get(0);
        C0957e7.f14122T = (C0957e7.f14121S + 117) % 128;
        String strL0 = C0957e7.L0(mediaFile);
        int i5 = C0957e7.f14122T + 25;
        C0957e7.f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return strL0;
        }
        throw null;
    }
}
