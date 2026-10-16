package Va;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class G2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        int i5 = H2.f13403T + 79;
        H2.f13402S = i5 % 128;
        if (i5 % 2 == 0) {
            return H2.O0(adResponse);
        }
        H2.O0(adResponse);
        throw null;
    }
}
