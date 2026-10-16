package com.google.android.gms.ads.mediation.customevent;

import J6.d;
import K6.a;
import K6.b;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;

@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, AdSize adSize, d dVar, Bundle bundle);
}
