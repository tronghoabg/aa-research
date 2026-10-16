package Va;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: Va.h7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0996h7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPayload adPayload = (AdPayload) arrayList.get(0);
        int i5 = C1061m7.f14385T + 107;
        C1061m7.f14384S = i5 % 128;
        int i10 = i5 % 2;
        AdPayload.AdUnit adUnitI0 = C1061m7.I0(adPayload);
        if (i10 != 0) {
            int i11 = 53 / 0;
        }
        C1061m7.f14385T = (C1061m7.f14384S + 99) % 128;
        return adUnitI0;
    }
}
