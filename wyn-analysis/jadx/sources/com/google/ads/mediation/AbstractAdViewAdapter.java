package com.google.ads.mediation;

import D6.C0392q;
import D6.C0395s;
import D6.H;
import D6.L;
import D6.L0;
import D6.P0;
import D6.S0;
import H6.f;
import H6.l;
import J6.i;
import J6.m;
import J6.o;
import J6.s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbol;
import java.util.Iterator;
import java.util.Set;
import x6.C4474e;
import x6.C4475f;
import x6.C4476g;
import x6.C4477h;
import x6.y;

/* loaded from: classes3.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private C4475f adLoader;
    protected C4477h mAdView;
    protected I6.a mInterstitialAd;

    public C4476g buildAdRequest(Context context, J6.d dVar, Bundle bundle, Bundle bundle2) {
        AdRequest$Builder adRequest$Builder = new AdRequest$Builder(14);
        Set keywords = dVar.getKeywords();
        if (keywords != null) {
            Iterator it = keywords.iterator();
            while (it.hasNext()) {
                adRequest$Builder.w((String) it.next());
            }
        }
        boolean zIsTesting = dVar.isTesting();
        P0 p02 = (P0) adRequest$Builder.f421a;
        if (zIsTesting) {
            f fVar = C0392q.f2477g.f2478a;
            p02.f2347d.add(f.c(context));
        }
        if (dVar.taggedForChildDirectedTreatment() != -1) {
            p02.k = dVar.taggedForChildDirectedTreatment() != 1 ? 0 : 1;
        }
        p02.f2354l = dVar.isDesignedForFamilies();
        adRequest$Builder.x(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return new C4476g(adRequest$Builder);
    }

    public abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    public I6.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    public L0 getVideoController() {
        L0 l02;
        C4477h c4477h = this.mAdView;
        if (c4477h == null) {
            return null;
        }
        VideoController videoController = c4477h.f47739a.f2377c;
        synchronized (videoController.f26302a) {
            l02 = videoController.f26303b;
        }
        return l02;
    }

    public C4474e newAdLoader(Context context, String str) {
        return new C4474e(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        C4477h c4477h = this.mAdView;
        if (c4477h != null) {
            c4477h.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z2) {
        I6.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.setImmersiveMode(z2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        C4477h c4477h = this.mAdView;
        if (c4477h != null) {
            zzbix.zza(c4477h.getContext());
            if (((Boolean) zzbkv.zzg.zze()).booleanValue()) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmM)).booleanValue()) {
                    H6.c.f4936b.execute(new y(c4477h, 0));
                    return;
                }
            }
            S0 s02 = c4477h.f47739a;
            s02.getClass();
            try {
                L l10 = s02.f2383i;
                if (l10 != null) {
                    l10.zzf();
                }
            } catch (RemoteException e7) {
                l.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, J6.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        C4477h c4477h = this.mAdView;
        if (c4477h != null) {
            zzbix.zza(c4477h.getContext());
            if (((Boolean) zzbkv.zzh.zze()).booleanValue()) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmK)).booleanValue()) {
                    H6.c.f4936b.execute(new y(c4477h, 1));
                    return;
                }
            }
            S0 s02 = c4477h.f47739a;
            s02.getClass();
            try {
                L l10 = s02.f2383i;
                if (l10 != null) {
                    l10.zzg();
                }
            } catch (RemoteException e7) {
                l.i("#007 Could not call remote method.", e7);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, AdSize adSize, J6.d dVar, Bundle bundle2) {
        C4477h c4477h = new C4477h(context);
        this.mAdView = c4477h;
        c4477h.setAdSize(new AdSize(adSize.f26293a, adSize.f26294b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.b(buildAdRequest(context, dVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, m mVar, Bundle bundle, J6.d dVar, Bundle bundle2) {
        I6.a.load(context, getAdUnitId(bundle), buildAdRequest(context, dVar, bundle2, bundle), new c(this, mVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2) {
        e eVar = new e(this, oVar);
        C4474e c4474eNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        c4474eNewAdLoader.c(eVar);
        H h10 = c4474eNewAdLoader.f47733b;
        try {
            h10.zzj(new zzbma(sVar.getNativeAdOptions()));
        } catch (RemoteException e7) {
            l.g("Failed to specify native ad options", e7);
        }
        c4474eNewAdLoader.d(sVar.getNativeAdRequestOptions());
        if (sVar.isUnifiedNativeAdRequested()) {
            try {
                h10.zzm(new zzbol(eVar));
            } catch (RemoteException e10) {
                l.g("Failed to add google native ad listener", e10);
            }
        }
        if (sVar.zza()) {
            for (String str : sVar.zzb().keySet()) {
                zzboi zzboiVar = new zzboi(eVar, true != ((Boolean) sVar.zzb().get(str)).booleanValue() ? null : eVar);
                try {
                    h10.zzi(str, zzboiVar.zza(), zzboiVar.zzb());
                } catch (RemoteException e11) {
                    l.g("Failed to add custom template ad listener", e11);
                }
            }
        }
        C4475f c4475fA = c4474eNewAdLoader.a();
        this.adLoader = c4475fA;
        c4475fA.a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        I6.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.show(null);
        }
    }
}
