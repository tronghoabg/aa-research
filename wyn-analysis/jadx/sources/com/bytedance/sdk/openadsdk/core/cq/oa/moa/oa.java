package com.bytedance.sdk.openadsdk.core.cq.oa.moa;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.moa.dj;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public class oa extends com.bytedance.adsdk.ugeno.moa.moa.yo {
    private float dj;
    private boolean wrv;

    public oa(Context context) {
        super(context);
        this.dj = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[1]), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                dj djVar = this.uef;
                if (djVar != null && !this.wrv) {
                    this.wrv = true;
                    djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
                return true;
            }
            if (this.lw.get("rate") != null) {
                this.dj = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(r2), 100);
            }
            float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + fUef + " mTargetProgress=" + this.dj);
            if (fUef >= this.dj) {
                dj djVar2 = this.uef;
                if (djVar2 != null && !this.wrv) {
                    this.wrv = true;
                    djVar2.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
                return true;
            }
        }
        return false;
    }
}
