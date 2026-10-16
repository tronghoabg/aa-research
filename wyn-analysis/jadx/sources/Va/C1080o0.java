package Va;

import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.ArrayList;

/* renamed from: Va.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1080o0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        int i5 = W0.f13812T + 43;
        W0.f13813U = i5 % 128;
        Object objU = i5 % 2 == 0 ? AbstractC1104pb.U(arrayList, 1, NativeContentAdView.class) : AbstractC1104pb.U(arrayList, 0, NativeContentAdView.class);
        int i10 = W0.f13812T + 5;
        W0.f13813U = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 50 / 0;
        }
        return ((NativeContentAdView) objU).getHeadlineView();
    }
}
