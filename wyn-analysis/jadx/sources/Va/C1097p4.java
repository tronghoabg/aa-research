package Va;

import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import java.util.ArrayList;

/* renamed from: Va.p4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1097p4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MBBannerView mBBannerView = (MBBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        int i5 = C1223z4.f14834W + 23;
        C1223z4.f14835X = i5 % 128;
        int i10 = i5 % 2;
        C1223z4.a1(mBBannerView, bannerAdListener);
        if (i10 == 0) {
            throw null;
        }
        C1223z4.f14835X = (C1223z4.f14834W + 29) % 128;
        return null;
    }
}
