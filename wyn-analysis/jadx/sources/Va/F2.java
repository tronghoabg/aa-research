package Va;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class F2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        int i5 = H2.f13402S + 25;
        H2.f13403T = i5 % 128;
        int i10 = i5 % 2;
        List listI0 = H2.I0(adResponse);
        if (i10 == 0) {
            int i11 = 45 / 0;
        }
        int i12 = H2.f13403T + 1;
        H2.f13402S = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 88 / 0;
        }
        return listI0;
    }
}
