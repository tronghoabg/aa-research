package com.bytedance.adsdk.ugeno.ivm.oa;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.bcc.yo;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class moa implements yo.lw {
    private String uef;

    public void uef(String str) {
        this.uef = str;
    }

    @Override // com.bytedance.adsdk.ugeno.bcc.yo.lw
    public void uef(View view, float f10) {
        float height = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 < -1.0f || f10 > 1.0f) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f10));
            view.setTranslationY(view.getHeight() * f10);
        }
        if (TextUtils.equals(this.uef, "cube")) {
            if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                height = view.getHeight();
            }
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f10 * (-90.0f));
        }
    }
}
