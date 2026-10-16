package com.google.android.gms.ads.mediation.customevent;

import J6.s;
import K6.a;
import K6.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes3.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, s sVar, Bundle bundle);
}
