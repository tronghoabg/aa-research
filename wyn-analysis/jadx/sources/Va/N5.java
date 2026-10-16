package Va;

import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class N5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        int i5 = C0995h6.f14246U + 125;
        C0995h6.f14245T = i5 % 128;
        int i10 = i5 % 2;
        List listR0 = C0995h6.R0(videoClicks);
        if (i10 != 0) {
            int i11 = 48 / 0;
        }
        int i12 = C0995h6.f14245T + 111;
        C0995h6.f14246U = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 31 / 0;
        }
        return listR0;
    }
}
