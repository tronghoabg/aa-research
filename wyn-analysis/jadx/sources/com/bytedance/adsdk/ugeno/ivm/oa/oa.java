package com.bytedance.adsdk.ugeno.ivm.oa;

import android.view.View;
import com.bytedance.adsdk.ugeno.bcc.yo;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class oa implements yo.lw {
    @Override // com.bytedance.adsdk.ugeno.bcc.yo.lw
    public void uef(View view, float f10) {
        int width = view.getWidth();
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setTranslationX((-width) * f10);
        } else {
            view.setTranslationX(width);
            view.setTranslationX((-width) * f10);
        }
        view.setAlpha(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - Math.abs(f10)));
    }
}
