package Va;

import com.fyber.fairbid.mediation.config.MediationConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class W2 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        MediationConfig mediationConfig = (MediationConfig) arrayList.get(0);
        int i5 = C0901a3.f13969S + 53;
        C0901a3.f13970T = i5 % 128;
        if (i5 % 2 == 0) {
            C0901a3.R0(mediationConfig);
            throw null;
        }
        List listR0 = C0901a3.R0(mediationConfig);
        int i10 = C0901a3.f13970T + 23;
        C0901a3.f13969S = i10 % 128;
        if (i10 % 2 == 0) {
            return listR0;
        }
        throw null;
    }
}
