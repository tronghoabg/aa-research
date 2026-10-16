package com.bytedance.adsdk.ugeno.ivm.oa;

import android.view.View;
import com.bytedance.adsdk.ugeno.bcc.yo;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class uef implements yo.lw {
    @Override // com.bytedance.adsdk.ugeno.bcc.yo.lw
    public void uef(View view, float f10) {
        float width = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            width = view.getWidth();
        }
        view.setPivotX(width);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f10 * 90.0f);
    }
}
