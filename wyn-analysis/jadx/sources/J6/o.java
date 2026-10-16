package J6;

import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbnd;
import x6.C4470a;

/* loaded from: classes3.dex */
public interface o {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C4470a c4470a);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void zzc(MediationNativeAdapter mediationNativeAdapter, zzbnd zzbndVar);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbnd zzbndVar, String str);
}
