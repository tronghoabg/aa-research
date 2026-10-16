package Va;

import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import java.util.ArrayList;

/* renamed from: Va.b7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0918b7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VideoController videoController = (VideoController) arrayList.get(0);
        VideoEventListener videoEventListener = (VideoEventListener) arrayList.get(1);
        int i5 = C0957e7.f14122T + 77;
        C0957e7.f14121S = i5 % 128;
        int i10 = i5 % 2;
        C0957e7.H0(videoController, videoEventListener);
        if (i10 != 0) {
            throw null;
        }
        int i11 = C0957e7.f14121S + 93;
        C0957e7.f14122T = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
