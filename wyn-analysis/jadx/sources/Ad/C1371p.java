package ad;

import android.app.Activity;
import android.util.Log;

/* renamed from: ad.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1371p extends AbstractC1362g {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17599b;

    /* renamed from: c, reason: collision with root package name */
    public y6.d f17600c;

    public C1371p(int i5, G9.e eVar, String str, C1367l c1367l, J4.c cVar) {
        super(i5);
        this.f17599b = eVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        this.f17600c = null;
    }

    @Override // ad.AbstractC1362g
    public final void c(boolean z2) {
        y6.d dVar = this.f17600c;
        if (dVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            dVar.setImmersiveMode(z2);
        }
    }

    @Override // ad.AbstractC1362g
    public final void d() {
        y6.d dVar = this.f17600c;
        if (dVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
            return;
        }
        G9.e eVar = this.f17599b;
        if (((Activity) eVar.f4685b) == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            dVar.setFullScreenContentCallback(new C1351E(this.f17586a, eVar));
            this.f17600c.show((Activity) eVar.f4685b);
        }
    }
}
