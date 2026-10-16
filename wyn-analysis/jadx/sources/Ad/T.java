package ad;

import android.app.Activity;
import android.util.Log;

/* loaded from: classes5.dex */
public final class T extends AbstractC1362g {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17534b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17535c;

    /* renamed from: d, reason: collision with root package name */
    public final J4.c f17536d;

    /* renamed from: e, reason: collision with root package name */
    public final C1372q f17537e;

    /* renamed from: f, reason: collision with root package name */
    public final C1367l f17538f;

    /* renamed from: g, reason: collision with root package name */
    public S6.a f17539g;

    public T(int i5, G9.e eVar, String str, C1367l c1367l, J4.c cVar) {
        super(i5);
        this.f17534b = eVar;
        this.f17535c = str;
        this.f17538f = c1367l;
        this.f17537e = null;
        this.f17536d = cVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        this.f17539g = null;
    }

    @Override // ad.AbstractC1362g
    public final void c(boolean z2) {
        S6.a aVar = this.f17539g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z2);
        }
    }

    @Override // ad.AbstractC1362g
    public final void d() {
        S6.a aVar = this.f17539g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
            return;
        }
        G9.e eVar = this.f17534b;
        if (((Activity) eVar.f4685b) == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
            return;
        }
        aVar.setFullScreenContentCallback(new C1351E(this.f17586a, eVar));
        this.f17539g.setOnAdMetadataChangedListener(new S(this));
        this.f17539g.show((Activity) eVar.f4685b, new S(this));
    }

    public T(int i5, G9.e eVar, String str, C1372q c1372q, J4.c cVar) {
        super(i5);
        this.f17534b = eVar;
        this.f17535c = str;
        this.f17537e = c1372q;
        this.f17538f = null;
        this.f17536d = cVar;
    }
}
