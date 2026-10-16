package Va;

import java.util.ArrayList;
import x6.C4477h;

/* loaded from: classes4.dex */
public final class L0 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        W0.f13813U = (W0.f13812T + 37) % 128;
        Object objU = AbstractC1104pb.U(arrayList, 0, C4477h.class);
        int i5 = W0.f13812T + 71;
        W0.f13813U = i5 % 128;
        if (i5 % 2 != 0) {
            return ((C4477h) objU).getVideoController();
        }
        throw null;
    }
}
