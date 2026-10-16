package com.bytedance.adsdk.ugeno.moa.moa;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public class xs extends yo {
    public xs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.moa.moa.yo
    public boolean uef(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(objArr[0]), 0);
            Map<String, Object> map = this.lw;
            if (map == null || map.isEmpty()) {
                this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
            } else {
                Object obj = this.lw.get("type");
                if (iUef == (obj != null ? com.bytedance.adsdk.ugeno.xs.yo.uef(String.valueOf(obj), 0) : 0)) {
                    this.uef.uef(this.f24741oa, this.ivm, this.yo.oa(), this.yo);
                }
            }
        }
        return false;
    }
}
