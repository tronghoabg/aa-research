package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1054m0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13812T = (W0.f13813U + 1) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, NativeContentAdView.class);
        int i5 = W0.f13813U + 103;
        W0.f13812T = i5 % 128;
        if (i5 % 2 == 0) {
            return ((NativeContentAdView) objU).getBodyView();
        }
        throw null;
    }
}
