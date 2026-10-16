package Va;

import com.unity3d.mediation.impression.LevelPlayImpressionData;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: Va.v3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1173v3 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        LevelPlayImpressionData levelPlayImpressionData = (LevelPlayImpressionData) arrayList.get(0);
        int i5 = C1186w3.f14729U + 29;
        C1186w3.f14728T = i5 % 128;
        int i10 = i5 % 2;
        JSONObject jSONObjectC0 = C1186w3.C0(levelPlayImpressionData);
        if (i10 != 0) {
            int i11 = 53 / 0;
        }
        C1186w3.f14729U = (C1186w3.f14728T + 95) % 128;
        return jSONObjectC0;
    }
}
