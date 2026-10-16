package Va;

import java.util.ArrayList;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;

/* renamed from: Va.o6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1086o6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        SAAd sAAd = (SAAd) arrayList.get(0);
        C1112q6.f14521S = (C1112q6.f14522T + 51) % 128;
        JSONObject jSONObjectD0 = C1112q6.D0(sAAd);
        C1112q6.f14521S = (C1112q6.f14522T + 69) % 128;
        return jSONObjectD0;
    }
}
