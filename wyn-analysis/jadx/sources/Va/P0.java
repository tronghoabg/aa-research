package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class P0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13812T = (W0.f13813U + 23) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeAppInstallAdView.class);
        W0.f13812T = (W0.f13813U + 3) % 128;
        return ((NativeAppInstallAdView) objU).getHeadlineView();
    }
}
