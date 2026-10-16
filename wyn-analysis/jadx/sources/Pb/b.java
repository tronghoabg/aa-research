package pb;

import Ca.d;
import Fe.e;
import ad.L;
import android.content.Context;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import g5.RunnableC2707d;
import rb.f;
import rb.h;
import tc.j;
import vb.C4336a;
import x6.C4477h;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43452e;

    /* renamed from: f, reason: collision with root package name */
    public Object f43453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i5) {
        super(cVar);
        this.f43452e = i5;
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void a(Context context, nb.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        switch (this.f43452e) {
            case 0:
                f fVar = new f(context, cVar, (L) this.f43453f, (c) this.f1973d, 0);
                fVar.f44717g = new h(scarInterstitialAdHandler, fVar);
                e.Q(new RunnableC3790a(this, fVar, cVar, 0));
                break;
            default:
                vb.c cVar2 = new vb.c(context, cVar, (j) this.f43453f, (c) this.f1973d, 0);
                cVar2.f44717g = new vb.d(scarInterstitialAdHandler, cVar2);
                e.Q(new RunnableC3790a(this, cVar2, cVar, 5));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void b(Context context, BannerView bannerView, nb.c cVar, int i5, int i10, ScarBannerAdHandler scarBannerAdHandler) {
        switch (this.f43452e) {
            case 0:
                rb.c cVar2 = new rb.c(context, cVar, (L) this.f43453f, (c) this.f1973d, 0);
                cVar2.f44719h = bannerView;
                cVar2.f44720i = i5;
                cVar2.f44721j = i10;
                cVar2.k = new C4477h(context);
                cVar2.f44717g = new rb.e(scarBannerAdHandler, cVar2);
                e.Q(new RunnableC2707d(cVar2, 16));
                break;
            default:
                C4336a c4336a = new C4336a(context, cVar, (j) this.f43453f, (c) this.f1973d, 1);
                c4336a.f47140h = bannerView;
                c4336a.f47141i = i5;
                c4336a.f47142j = i10;
                c4336a.k = new C4477h(context);
                c4336a.f44717g = new vb.b(scarBannerAdHandler, c4336a);
                e.Q(new RunnableC2707d(c4336a, 26));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void c(Context context, nb.c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        switch (this.f43452e) {
            case 0:
                f fVar = new f(context, cVar, (L) this.f43453f, (c) this.f1973d, 1);
                fVar.f44717g = new rb.j(scarRewardedAdHandler, fVar);
                e.Q(new RunnableC3790a(this, fVar, cVar, 1));
                break;
            default:
                vb.c cVar2 = new vb.c(context, cVar, (j) this.f43453f, (c) this.f1973d, 1);
                cVar2.f44717g = new vb.f(scarRewardedAdHandler, cVar2);
                e.Q(new RunnableC3790a(this, cVar2, cVar, 6));
                break;
        }
    }
}
