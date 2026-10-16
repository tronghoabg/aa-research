package com.google.android.gms.ads.mediation;

import J6.e;
import J6.o;
import J6.s;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes3.dex */
public interface MediationNativeAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2);
}
