package Va;

import com.smaato.sdk.video.vast.model.VastBeacon;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class O5 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastBeacon vastBeacon = (VastBeacon) arrayList.get(0);
        C0995h6.f14246U = (C0995h6.f14245T + 115) % 128;
        String strV0 = C0995h6.V0(vastBeacon);
        C0995h6.f14245T = (C0995h6.f14246U + 7) % 128;
        return strV0;
    }
}
