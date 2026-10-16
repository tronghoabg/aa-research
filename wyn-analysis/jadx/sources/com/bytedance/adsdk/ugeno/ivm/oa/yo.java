package com.bytedance.adsdk.ugeno.ivm.oa;

import android.view.View;
import com.bytedance.adsdk.ugeno.bcc.yo;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class yo implements yo.lw {
    final float uef = 0.8f;

    /* renamed from: oa, reason: collision with root package name */
    final float f24719oa = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.bcc.yo.lw
    public void uef(View view, float f10) {
        float f11 = ((f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.19999999f : -0.19999999f) * f10) + 1.0f;
        float f12 = (f10 * (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.5f : -0.5f)) + 1.0f;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f11);
        view.setScaleY(f11);
        view.setAlpha(Math.abs(f12));
    }
}
