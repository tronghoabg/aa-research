package Va;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class R0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13812T = (W0.f13813U + 89) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, PublisherAdView.class);
        W0.f13812T = (W0.f13813U + 17) % 128;
        PublisherAdView publisherAdView = (PublisherAdView) objU;
        W0.f13812T = (W0.f13813U + 87) % 128;
        Object objU2 = AbstractC1104pb.U(arrayList, 1, AdListener.class);
        int i5 = W0.f13812T + 107;
        W0.f13813U = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        publisherAdView.setAdListener((AdListener) objU2);
        return null;
    }
}
