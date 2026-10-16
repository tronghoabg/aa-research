package com.bytedance.sdk.openadsdk.core.cq.lw.oa;

import android.content.Context;
import com.bytedance.adsdk.ugeno.moa.dj;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef extends com.bytedance.adsdk.ugeno.moa.moa.yo {
    private boolean dj;

    public uef(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        Map<String, Object> map = this.lw;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(obj.toString(), -1);
                if (this.lw.containsKey("remainingSeconds")) {
                    Object obj2 = this.lw.get("remainingSeconds");
                    int iUef2 = obj2 != null ? com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj2), -1) : -1;
                    if ((iUef == 0 || (iUef2 >= 0 && iUef == iUef2)) && !this.dj) {
                        this.dj = true;
                        dj djVar = this.uef;
                        if (djVar != null) {
                            djVar.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
