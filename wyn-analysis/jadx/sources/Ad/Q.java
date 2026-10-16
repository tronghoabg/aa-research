package ad;

import android.app.Activity;
import android.util.Log;

/* loaded from: classes5.dex */
public final class Q extends AbstractC1362g {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17527b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17528c;

    /* renamed from: d, reason: collision with root package name */
    public final J4.c f17529d;

    /* renamed from: e, reason: collision with root package name */
    public final C1372q f17530e;

    /* renamed from: f, reason: collision with root package name */
    public final C1367l f17531f;

    /* renamed from: g, reason: collision with root package name */
    public R6.c f17532g;

    public Q(int i5, G9.e eVar, String str, C1367l c1367l, J4.c cVar) {
        super(i5);
        this.f17527b = eVar;
        this.f17528c = str;
        this.f17531f = c1367l;
        this.f17530e = null;
        this.f17529d = cVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        this.f17532g = null;
    }

    @Override // ad.AbstractC1362g
    public final void c(boolean z2) {
        R6.c cVar = this.f17532g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z2);
        }
    }

    @Override // ad.AbstractC1362g
    public final void d() {
        R6.c cVar = this.f17532g;
        if (cVar == null) {
            Log.e("FlutterRewardedAd", "Error showing rewarded - the rewarded ad wasn't loaded yet.");
            return;
        }
        G9.e eVar = this.f17527b;
        if (((Activity) eVar.f4685b) == null) {
            Log.e("FlutterRewardedAd", "Tried to show rewarded ad before activity was bound to the plugin.");
            return;
        }
        cVar.setFullScreenContentCallback(new C1351E(this.f17586a, eVar));
        this.f17532g.setOnAdMetadataChangedListener(new O(this));
        this.f17532g.show((Activity) eVar.f4685b, new O(this));
    }

    public Q(int i5, G9.e eVar, String str, C1372q c1372q, J4.c cVar) {
        super(i5);
        this.f17527b = eVar;
        this.f17528c = str;
        this.f17530e = c1372q;
        this.f17531f = null;
        this.f17529d = cVar;
    }
}
