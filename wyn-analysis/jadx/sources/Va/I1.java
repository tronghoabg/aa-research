package Va;

import com.chartboost.sdk.InPlay.CBInPlay;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class I1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        CBInPlay cBInPlay = (CBInPlay) arrayList.get(0);
        K1.f13474T = (K1.f13473S + 105) % 128;
        String strH0 = K1.H0(cBInPlay);
        int i5 = K1.f13474T + 79;
        K1.f13473S = i5 % 128;
        if (i5 % 2 == 0) {
            return strH0;
        }
        throw null;
    }
}
