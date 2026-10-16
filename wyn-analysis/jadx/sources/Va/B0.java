package Va;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 1) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, PublisherAdView.class);
        W0.f13813U = (W0.f13812T + 31) % 128;
        return ((PublisherAdView) objU).getAdSize();
    }
}
