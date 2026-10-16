package Va;

import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import java.util.ArrayList;

/* renamed from: Va.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1028k0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13812T + 25;
        W0.f13813U = i5 % 128;
        Object objU = AbstractC1104pb.U(arrayList, i5 % 2 == 0 ? 1 : 0, NativeAppInstallAdView.class);
        W0.f13813U = (W0.f13812T + 23) % 128;
        return ((NativeAppInstallAdView) objU).getMediaView();
    }
}
