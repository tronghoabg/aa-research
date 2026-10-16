package com.bytedance.adsdk.ugeno.moa.uef;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class uef {
    private volatile Map<String, yo> uef = new HashMap();

    public yo uef(String str) {
        if (this.uef.containsKey(str) && this.uef.get(str) != null) {
            return this.uef.get(str);
        }
        oa oaVar = new oa();
        this.uef.put(str, oaVar);
        return oaVar;
    }

    public void uef(String str, yo yoVar) {
        if (!this.uef.containsKey(str) || this.uef.get(str) == null) {
            this.uef.put(str, yoVar);
        }
    }
}
