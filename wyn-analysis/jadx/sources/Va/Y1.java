package Va;

import io.bidmachine.protobuf.RequestExtension;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Y1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        RequestExtension requestExtension = (RequestExtension) arrayList.get(0);
        int i5 = C0939d2.f14094U + 75;
        C0939d2.f14093T = i5 % 128;
        int i10 = i5 % 2;
        String strH0 = C0939d2.H0(requestExtension);
        if (i10 != 0) {
            int i11 = 34 / 0;
        }
        return strH0;
    }
}
