package rb;

import com.google.android.gms.ads.AdListener;
import com.unity3d.services.banners.BannerView;
import vb.C4336a;
import x6.C4477h;
import x6.C4481l;

/* loaded from: classes4.dex */
public final class d extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44723b;

    public /* synthetic */ d(Object obj, int i5) {
        this.f44722a = i5;
        this.f44723b = obj;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        switch (this.f44722a) {
            case 0:
                super.onAdClicked();
                ((e) this.f44723b).f44724b.onAdClicked();
                break;
            default:
                super.onAdClicked();
                ((vb.b) this.f44723b).f47143b.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        switch (this.f44722a) {
            case 0:
                super.onAdClosed();
                ((e) this.f44723b).f44724b.onAdClosed();
                break;
            default:
                super.onAdClosed();
                ((vb.b) this.f44723b).f47143b.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        C4477h c4477h;
        C4477h c4477h2;
        switch (this.f44722a) {
            case 0:
                e eVar = (e) this.f44723b;
                c cVar = eVar.f44725c;
                BannerView bannerView = cVar.f44719h;
                if (bannerView != null && (c4477h = cVar.k) != null) {
                    bannerView.removeView(c4477h);
                }
                eVar.f44724b.onAdFailedToLoad(c4481l.f47720a, c4481l.f47721b);
                break;
            default:
                vb.b bVar = (vb.b) this.f44723b;
                C4336a c4336a = bVar.f47144c;
                BannerView bannerView2 = c4336a.f47140h;
                if (bannerView2 != null && (c4477h2 = c4336a.k) != null) {
                    bannerView2.removeView(c4477h2);
                }
                bVar.f47143b.onAdFailedToLoad(c4481l.f47720a, c4481l.f47721b);
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        switch (this.f44722a) {
            case 0:
                super.onAdImpression();
                ((e) this.f44723b).f44724b.onAdImpression();
                break;
            default:
                super.onAdImpression();
                ((vb.b) this.f44723b).f47143b.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.f44722a) {
            case 0:
                super.onAdLoaded();
                ((e) this.f44723b).f44724b.onAdLoaded();
                break;
            default:
                super.onAdLoaded();
                ((vb.b) this.f44723b).f47143b.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        switch (this.f44722a) {
            case 0:
                super.onAdOpened();
                ((e) this.f44723b).f44724b.onAdOpened();
                break;
            default:
                super.onAdOpened();
                ((vb.b) this.f44723b).f47143b.onAdOpened();
                break;
        }
    }
}
