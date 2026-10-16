package com.bytedance.sdk.openadsdk.core.cq.lw.oa;

import android.content.Context;
import com.bytedance.adsdk.ugeno.moa.dj;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* loaded from: classes3.dex */
public class moa extends com.bytedance.adsdk.ugeno.moa.moa.yo {
    private boolean dj;

    public moa(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Map<String, Object> map = this.lw;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long jLongValue = ((Long) objArr[0]).longValue() / 1000;
        long jLongValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (jLongValue <= 0) {
            this.dj = false;
        }
        if (this.lw.containsKey("percent")) {
            Object obj = this.lw.get("percent");
            float fUef = obj != null ? com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), -1.0f) : -1.0f;
            if (fUef >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jLongValue >= (fUef / 100.0f) * jLongValue2 && !this.dj) {
                this.dj = true;
                dj djVar = this.uef;
                if (djVar != null) {
                    djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
            }
        } else {
            if (jLongValue >= (this.lw.get("interval") != null ? com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(r9), -1) : -1) && !this.dj) {
                this.dj = true;
                dj djVar2 = this.uef;
                if (djVar2 != null) {
                    djVar2.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
            }
        }
        return true;
    }
}
