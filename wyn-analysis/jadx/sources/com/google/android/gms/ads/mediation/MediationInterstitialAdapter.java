package com.google.android.gms.ads.mediation;

import J6.d;
import J6.e;
import J6.m;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes3.dex */
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, m mVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
