package J6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import java.util.List;
import wa.C4398a;
import x6.C4470a;
import x6.u;

/* loaded from: classes3.dex */
public abstract class a {
    public abstract u getSDKVersionInfo();

    public abstract u getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<C4398a> list);

    public void loadAppOpenAd(g gVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.ERROR_DOMAIN, null));
    }

    public void loadBannerAd(h hVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.ERROR_DOMAIN, null));
    }

    public void loadInterstitialAd(l lVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN, null));
    }

    @Deprecated
    public void loadNativeAd(n nVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.ERROR_DOMAIN, null));
    }

    public void loadNativeAdMapper(n nVar, c cVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(q qVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.ERROR_DOMAIN, null));
    }

    public void loadRewardedInterstitialAd(q qVar, c cVar) {
        cVar.onFailure(new C4470a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.ERROR_DOMAIN, null));
    }
}
