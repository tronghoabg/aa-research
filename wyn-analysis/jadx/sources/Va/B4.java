package Va;

import com.my.target.ads.Reward;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class B4 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        Reward reward = (Reward) arrayList.get(0);
        int i5 = C4.f13251S + 9;
        C4.f13250R = i5 % 128;
        if (i5 % 2 == 0) {
            return C4.C0(reward);
        }
        C4.C0(reward);
        throw null;
    }
}
