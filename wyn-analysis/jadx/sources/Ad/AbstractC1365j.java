package ad;

import com.google.android.gms.ads.AdListener;
import java.util.HashMap;
import x6.C4481l;

/* renamed from: ad.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1365j extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final int f17587a;

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17588b;

    public AbstractC1365j(int i5, G9.e eVar) {
        this.f17587a = i5;
        this.f17588b = eVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        G9.e eVar = this.f17588b;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17587a));
        map.put("eventName", "onAdClicked");
        eVar.w(map);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        G9.e eVar = this.f17588b;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17587a));
        map.put("eventName", "onAdClosed");
        eVar.w(map);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        this.f17588b.y(this.f17587a, new C1361f(c4481l));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        G9.e eVar = this.f17588b;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17587a));
        map.put("eventName", "onAdImpression");
        eVar.w(map);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        G9.e eVar = this.f17588b;
        eVar.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f17587a));
        map.put("eventName", "onAdOpened");
        eVar.w(map);
    }
}
