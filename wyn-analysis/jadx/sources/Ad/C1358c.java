package ad;

import android.app.Activity;
import android.util.Log;
import android.widget.ScrollView;

/* renamed from: ad.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1358c extends C1369n {

    /* renamed from: h, reason: collision with root package name */
    public ScrollView f17563h;

    /* renamed from: i, reason: collision with root package name */
    public int f17564i;

    @Override // ad.C1369n, ad.AbstractC1364i
    public final void a() {
        y6.c cVar = this.f17597g;
        if (cVar != null) {
            cVar.a();
            this.f17597g = null;
        }
        ScrollView scrollView = this.f17563h;
        if (scrollView != null) {
            scrollView.removeAllViews();
            this.f17563h = null;
        }
    }

    @Override // ad.C1369n, ad.AbstractC1364i
    public final io.flutter.plugin.platform.e b() {
        ScrollView scrollView;
        if (this.f17597g != null) {
            ScrollView scrollView2 = this.f17563h;
            if (scrollView2 != null) {
                return new N(scrollView2, 0);
            }
            G9.e eVar = this.f17592b;
            if (((Activity) eVar.f4685b) == null) {
                Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
                scrollView = null;
            } else {
                scrollView = new ScrollView((Activity) eVar.f4685b);
            }
            if (scrollView != null) {
                scrollView.setClipChildren(false);
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setHorizontalScrollBarEnabled(false);
                this.f17563h = scrollView;
                scrollView.addView(this.f17597g);
                return new N(this.f17597g, 0);
            }
        }
        return null;
    }

    @Override // ad.C1369n, ad.InterfaceC1366k
    public final void onAdLoaded() {
        y6.c cVar = this.f17597g;
        if (cVar != null) {
            cVar.addOnLayoutChangeListener(new M7.a(this, 1));
            this.f17592b.z(this.f17586a, this.f17597g.getResponseInfo());
        }
    }
}
