package Va;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: Va.l7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1048l7 implements Y0 {
    @Override // Va.Y0
    public final Object a(ArrayList arrayList, Ra ra2) {
        AdPayload.AdUnit adUnit = (AdPayload.AdUnit) arrayList.get(0);
        C1061m7.f14384S = (C1061m7.f14385T + 99) % 128;
        AdPayload.TemplateSettings templateSettingsJ0 = C1061m7.J0(adUnit);
        C1061m7.f14385T = (C1061m7.f14384S + 9) % 128;
        return templateSettingsJ0;
    }
}
