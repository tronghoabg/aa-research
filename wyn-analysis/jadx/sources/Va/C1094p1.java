package Va;

import com.amazon.device.ads.DTBAdSize;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: Va.p1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1094p1 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        DTBAdSize dTBAdSize = (DTBAdSize) arrayList.get(0);
        C1196x1.f14761T = (C1196x1.f14762U + 99) % 128;
        JSONObject jSONObjectP0 = C1196x1.P0(dTBAdSize);
        C1196x1.f14762U = (C1196x1.f14761T + 63) % 128;
        return jSONObjectP0;
    }
}
