package Va;

import com.qq.e.comm.managers.status.APPStatus;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class A6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        APPStatus aPPStatus = (APPStatus) arrayList.get(0);
        F6.f13333U = (F6.f13332T + 73) % 128;
        String strH0 = F6.H0(aPPStatus);
        F6.f13332T = (F6.f13333U + 63) % 128;
        return strH0;
    }
}
