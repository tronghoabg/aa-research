package Va;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: Va.p3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1096p3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C1186w3.f14729U = (C1186w3.f14728T + 5) % 128;
        JSONObject jSONObjectM0 = C1186w3.M0(impressionData);
        int i5 = C1186w3.f14728T + 15;
        C1186w3.f14729U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 34 / 0;
        }
        return jSONObjectM0;
    }
}
