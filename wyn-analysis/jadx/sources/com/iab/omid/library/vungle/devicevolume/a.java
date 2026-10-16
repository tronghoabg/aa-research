package com.iab.omid.library.vungle.devicevolume;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public class a {
    public float a(int i5, int i10) {
        if (i10 <= 0 || i5 <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = i5 / i10;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}
