package Va;

import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 59;
        W0.f13812T = i5 % 128;
        return ((UnifiedNativeAdView) AbstractC1104pb.U(arrayList, i5 % 2 != 0 ? 1 : 0, UnifiedNativeAdView.class)).getImageView();
    }
}
