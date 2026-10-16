package Va;

import com.yandex.mobile.ads.common.ImpressionData;
import java.util.ArrayList;

/* renamed from: Va.a7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0905a7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        ImpressionData impressionData = (ImpressionData) arrayList.get(0);
        C0957e7.f14121S = (C0957e7.f14122T + 83) % 128;
        String strG0 = C0957e7.G0(impressionData);
        C0957e7.f14121S = (C0957e7.f14122T + 61) % 128;
        return strG0;
    }
}
