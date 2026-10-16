package Va;

import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.MTGBannerView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class S3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MTGBannerView mTGBannerView = (MTGBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        Z3.f13893W = (Z3.f13894X + 87) % 128;
        Z3.O0(mTGBannerView, bannerAdListener);
        int i5 = Z3.f13893W + 121;
        Z3.f13894X = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        int i10 = 42 / 0;
        return null;
    }
}
