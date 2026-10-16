package ad;

import android.app.Activity;
import android.util.Log;

/* renamed from: ad.H, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1354H extends AbstractC1362g {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17502b;

    /* renamed from: c, reason: collision with root package name */
    public I6.a f17503c;

    public C1354H(int i5, G9.e eVar, String str, C1372q c1372q, J4.c cVar) {
        super(i5);
        this.f17502b = eVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        this.f17503c = null;
    }

    @Override // ad.AbstractC1362g
    public final void c(boolean z2) {
        I6.a aVar = this.f17503c;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z2);
        }
    }

    @Override // ad.AbstractC1362g
    public final void d() {
        I6.a aVar = this.f17503c;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
            return;
        }
        G9.e eVar = this.f17502b;
        if (((Activity) eVar.f4685b) == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            aVar.setFullScreenContentCallback(new C1351E(this.f17586a, eVar));
            this.f17503c.show((Activity) eVar.f4685b);
        }
    }
}
