package ad;

import java.util.HashMap;
import x6.AbstractC4480k;
import x6.C4470a;

/* renamed from: ad.E, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1351E extends AbstractC4480k {

    /* renamed from: a, reason: collision with root package name */
    public final G9.e f17497a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17498b;

    public C1351E(int i5, G9.e eVar) {
        this.f17497a = eVar;
        this.f17498b = i5;
    }

    @Override // x6.AbstractC4480k
    public final void onAdClicked() {
        G9.e eVar = this.f17497a;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17498b));
        map.put("eventName", "onAdClicked");
        eVar.w(map);
    }

    @Override // x6.AbstractC4480k
    public final void onAdDismissedFullScreenContent() {
        G9.e eVar = this.f17497a;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17498b));
        map.put("eventName", "onAdDismissedFullScreenContent");
        eVar.w(map);
    }

    @Override // x6.AbstractC4480k
    public final void onAdFailedToShowFullScreenContent(C4470a c4470a) {
        G9.e eVar = this.f17497a;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17498b));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put("error", new C1359d(c4470a));
        eVar.w(map);
    }

    @Override // x6.AbstractC4480k
    public final void onAdImpression() {
        G9.e eVar = this.f17497a;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17498b));
        map.put("eventName", "onAdImpression");
        eVar.w(map);
    }

    @Override // x6.AbstractC4480k
    public final void onAdShowedFullScreenContent() {
        G9.e eVar = this.f17497a;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17498b));
        map.put("eventName", "onAdShowedFullScreenContent");
        eVar.w(map);
    }
}
