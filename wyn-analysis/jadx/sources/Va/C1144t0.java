package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.t0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1144t0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13812T + 49;
        W0.f13813U = i5 % 128;
        int i10 = i5 % 2;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeContentAdView.class);
        W0.f13812T = (W0.f13813U + 5) % 128;
        return ((NativeContentAdView) objU).getImageView();
    }
}
