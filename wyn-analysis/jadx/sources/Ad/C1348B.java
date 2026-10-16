package ad;

import android.app.Activity;
import android.util.Log;
import z6.AbstractC4619b;

/* renamed from: ad.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1348B extends AbstractC1362g {

    /* renamed from: b, reason: collision with root package name */
    public final G9.e f17492b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC4619b f17493c;

    public C1348B(int i5, G9.e eVar, String str, C1372q c1372q, C1367l c1367l, J4.c cVar) {
        super(i5);
        if (!((c1372q == null && c1367l == null) ? false : true)) {
            throw new IllegalStateException("One of request and adManagerAdRequest must be non-null.");
        }
        this.f17492b = eVar;
    }

    @Override // ad.AbstractC1364i
    public final void a() {
        this.f17493c = null;
    }

    @Override // ad.AbstractC1362g
    public final void c(boolean z2) {
        AbstractC4619b abstractC4619b = this.f17493c;
        if (abstractC4619b == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            abstractC4619b.setImmersiveMode(z2);
        }
    }

    @Override // ad.AbstractC1362g
    public final void d() {
        AbstractC4619b abstractC4619b = this.f17493c;
        if (abstractC4619b == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
            return;
        }
        G9.e eVar = this.f17492b;
        if (((Activity) eVar.f4685b) == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            abstractC4619b.setFullScreenContentCallback(new C1351E(this.f17586a, eVar));
            this.f17493c.show((Activity) eVar.f4685b);
        }
    }
}
