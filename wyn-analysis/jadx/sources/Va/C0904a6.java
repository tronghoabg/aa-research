package Va;

import com.smaato.sdk.video.vast.model.VastBeacon;
import java.util.ArrayList;

/* renamed from: Va.a6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0904a6 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        VastBeacon vastBeacon = (VastBeacon) arrayList.get(0);
        int i5 = C0995h6.f14246U + 93;
        C0995h6.f14245T = i5 % 128;
        int i10 = i5 % 2;
        String strP0 = C0995h6.P0(vastBeacon);
        if (i10 != 0) {
            int i11 = 91 / 0;
        }
        C0995h6.f14246U = (C0995h6.f14245T + 25) % 128;
        return strP0;
    }
}
