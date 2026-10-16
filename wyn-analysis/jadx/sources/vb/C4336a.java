package vb;

import com.google.android.gms.ads.AdSize;
import com.unity3d.services.banners.BannerView;
import x6.C4476g;
import x6.C4477h;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4336a extends rb.a {

    /* renamed from: h, reason: collision with root package name */
    public BannerView f47140h;

    /* renamed from: i, reason: collision with root package name */
    public int f47141i;

    /* renamed from: j, reason: collision with root package name */
    public int f47142j;
    public C4477h k;

    @Override // rb.a
    public final void c(C4476g c4476g) {
        C4477h c4477h;
        BannerView bannerView = this.f47140h;
        if (bannerView == null || (c4477h = this.k) == null) {
            return;
        }
        bannerView.addView(c4477h);
        c4477h.setAdSize(new AdSize(this.f47141i, this.f47142j));
        c4477h.setAdUnitId(this.f44714d.f41002c);
        c4477h.setAdListener(((b) ((rb.b) this.f44717g)).f47145d);
        c4477h.b(c4476g);
    }
}
