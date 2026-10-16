package rb;

import com.google.android.gms.ads.AdSize;
import com.unity3d.services.banners.BannerView;
import x6.C4476g;
import x6.C4477h;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: h, reason: collision with root package name */
    public BannerView f44719h;

    /* renamed from: i, reason: collision with root package name */
    public int f44720i;

    /* renamed from: j, reason: collision with root package name */
    public int f44721j;
    public C4477h k;

    @Override // rb.a
    public final void c(C4476g c4476g) {
        C4477h c4477h;
        BannerView bannerView = this.f44719h;
        if (bannerView == null || (c4477h = this.k) == null) {
            return;
        }
        bannerView.addView(c4477h);
        c4477h.setAdSize(new AdSize(this.f44720i, this.f44721j));
        c4477h.setAdUnitId(this.f44714d.f41002c);
        c4477h.setAdListener(((e) ((b) this.f44717g)).f44726d);
        c4477h.b(c4476g);
    }
}
