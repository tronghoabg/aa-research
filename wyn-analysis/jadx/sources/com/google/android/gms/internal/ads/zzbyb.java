package com.google.android.gms.internal.ads;

import G6.U;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p9.C3778C;

/* loaded from: classes3.dex */
public final class zzbyb implements MediationInterstitialAdapter {
    private Activity zza;
    private J6.m zzb;
    private Uri zzc;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        H6.l.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        H6.l.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        H6.l.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, J6.m mVar, Bundle bundle, J6.d dVar, Bundle bundle2) {
        this.zzb = mVar;
        if (mVar == null) {
            H6.l.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            H6.l.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        if (!zzbjy.zza(context)) {
            H6.l.f("Default browser does not support custom tabs. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            H6.l.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.zzb.onAdFailedToLoad(this, 0);
        } else {
            this.zza = (Activity) context;
            this.zzc = Uri.parse(string);
            this.zzb.onAdLoaded(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        u.k kVarB = new C3778C().b();
        Uri uri = this.zzc;
        Intent intent = kVarB.f46072a;
        intent.setData(uri);
        U.f4562l.post(new zzbya(this, new AdOverlayInfoParcel(new F6.e(intent, null), null, new zzbxz(this), null, new H6.a(0, 0, false, false), null, null, "")));
        C6.n.f1857D.f1868h.zzd();
    }

    public final /* synthetic */ Activity zza() {
        return this.zza;
    }

    public final /* synthetic */ J6.m zzb() {
        return this.zzb;
    }
}
