package Va;

import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class I0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 51;
        W0.f13812T = i5 % 128;
        Object objU = i5 % 2 != 0 ? AbstractC1104pb.U(arrayList, 1, UnifiedNativeAdView.class) : AbstractC1104pb.U(arrayList, 0, UnifiedNativeAdView.class);
        int i10 = W0.f13813U + 15;
        W0.f13812T = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 44 / 0;
        }
        return ((UnifiedNativeAdView) objU).getAdvertiserView();
    }
}
