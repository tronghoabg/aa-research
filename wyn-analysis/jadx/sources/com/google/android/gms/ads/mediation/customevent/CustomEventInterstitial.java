package com.google.android.gms.ads.mediation.customevent;

import J6.d;
import K6.a;
import K6.c;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, d dVar, Bundle bundle);

    void showInterstitial();
}
