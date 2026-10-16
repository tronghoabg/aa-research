package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Q0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13813U + 111;
        W0.f13812T = i5 % 128;
        int i10 = i5 % 2;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeAppInstallAdView.class);
        int i11 = W0.f13812T + 53;
        W0.f13813U = i11 % 128;
        if (i11 % 2 != 0) {
            return ((NativeAppInstallAdView) objU).getCallToActionView();
        }
        throw null;
    }
}
