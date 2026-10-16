package com.bytedance.sdk.openadsdk.core.cq.ivm;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.moa.dj;
import com.bytedance.adsdk.ugeno.moa.dz;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class yo implements dz {
    private boolean uef = false;

    @Override // com.bytedance.adsdk.ugeno.moa.dz
    public boolean uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, MotionEvent motionEvent, dj djVar, com.bytedance.adsdk.ugeno.moa.moa.yo yoVar2) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.uef = true;
        } else if ((action == 1 || action == 3) && this.uef) {
            this.uef = false;
            if (uef(yoVar.dj(), motionEvent.getX(), motionEvent.getY()) && djVar != null) {
                djVar.uef(yoVar, yoVar2.moa(), yoVar2.xs().oa(), yoVar2.xs());
            }
        }
        return true;
    }

    private boolean uef(View view, float f10, float f11) {
        return f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 < ((float) view.getWidth()) && f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < ((float) view.getHeight());
    }
}
